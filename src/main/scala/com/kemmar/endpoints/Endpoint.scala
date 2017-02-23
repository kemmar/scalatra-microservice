package com.kemmar.endpoints

import dispatch.Defaults._
import dispatch._

class Endpoint extends EndpointConfig {



  def buildRequest = {
    commonRequest
      .<<?(Map("poly" -> "52.268,0.543:52.794,0.238:52.130,0.478", "date" -> "2015-01"))
      .GET
  }

  def country =
    Http(buildRequest OK as.String)
}



