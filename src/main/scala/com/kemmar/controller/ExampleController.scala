package com.kemmar.controller

import com.kemmar.endpoints.Endpoint
import org.scalatra.ScalatraServlet

import scala.concurrent.Future

case class Error(error: String)


class ExampleController extends ScalatraServlet with ControllerBase {
  val service = new Endpoint()

  get("/fish/test/?") {
    complete {
      for {
        in1 <- service.country
      } yield in1
    }
  }

  get("""^/fish/([0-9]{1,24})/?$""".r) {
    complete {
      Future {
        multiParams("captures").headOption.map(_.toLong)
      }
    }
  }

}