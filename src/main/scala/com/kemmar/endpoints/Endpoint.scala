package com.kemmar.endpoints

import com.kemmar.domains.cbs.EvaluationCatalogue
import dispatch._
import org.json4s._
import org.json4s.jackson.JsonMethods._

import scala.concurrent.duration._
import scalacache._
import java.util.concurrent.TimeUnit

import com.google.common.cache.CacheBuilder
import com.google.common.cache
import com.kemmar.domains.ProductCatalogue

import scalacache.memoization._
import scalacache.guava._
import scala.concurrent.ExecutionContext.Implicits.global
class Endpoint extends EndpointConfig with Cached{
  protected implicit val jsonFormats: Formats = DefaultFormats.withBigDecimal

  val underlyingGuavaCache: cache.Cache[String, Object] = CacheBuilder.newBuilder()
    .concurrencyLevel(4)
    .softValues()
    .expireAfterWrite(1, TimeUnit.HOURS)
    .build[String, Object]

  implicit val scalaCache = ScalaCache(GuavaCache(underlyingGuavaCache))

  def buildRequest = commonRequest.GET

  def getCatalogueCBS: Future[ProductCatalogue] =  memoize(1.hour){ Http(buildRequest OK as.String) map (marshall(_)) }


  def marshall(str: String) = parse(str).extract[EvaluationCatalogue].transform
}

trait Cached {

}



