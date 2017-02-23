package com.kemmar.controller

import org.scalatra._
import org.scalatra.servlet.ServletBase

import scala.concurrent.{ExecutionContext, Future}

trait ControllerBase extends ServletBase with FutureSupport {
  override protected implicit def executor: ExecutionContext = scala.concurrent.ExecutionContext.Implicits.global

  type Result[T] = Either[String, T]

  def complete[T](result: => Future[T]) = new AsyncResult {
    val is =  result
  }
}
