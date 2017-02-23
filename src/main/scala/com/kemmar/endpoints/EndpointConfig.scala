package com.kemmar.endpoints

import dispatch.url

trait EndpointConfig {

  lazy val configValue = "https://data.police.uk"

  lazy val commonRequest =
    url(s"$configValue/api/stops-street") // Get from config
      .<<?(Map("param1" -> "param", "param2" -> "param"))
      .<:<(Map("header1" -> "header", "header2" -> "header"))
      .addParameter("param3", "param")
      .addHeader("header3", "header")
}