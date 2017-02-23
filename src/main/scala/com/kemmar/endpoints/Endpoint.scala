package com.kemmar.endpoints

import dispatch.Defaults._
import dispatch._

class Endpoint {

  lazy val svc = url("https://data.police.uk/api/stops-street?poly=52.268,0.543:52.794,0.238:52.130,0.478&date=2015-01").GET

  def country =
    Http(svc OK as.String).either
}
