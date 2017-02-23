package com.kemmar.controller

import com.kemmar.endpoints.Endpoint
import org.scalatra.ScalatraFilter

class Application extends ScalatraFilter with ControllerBase {


  val service = new Endpoint()
  get("/test/:number") {
    complete {
      for {
        in1 <- service.country
      } yield in1
    }
  }
}