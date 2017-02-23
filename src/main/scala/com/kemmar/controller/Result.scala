package com.kemmar.controller

import org.scalatra.{AsyncResult, FutureSupport}

import scala.concurrent.{ExecutionContext, Future}

trait Result extends FutureSupport {
  override protected implicit def executor: ExecutionContext = scala.concurrent.ExecutionContext.Implicits.global

  def complete[T](result: => Future[T]) = new AsyncResult {
    val is =  result
  }
}