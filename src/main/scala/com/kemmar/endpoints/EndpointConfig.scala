package com.kemmar.endpoints

import dispatch.url


trait EndpointConfig {

  val endpointURL: String = "https://lwscese02.gss.bskyb.com"
  private lazy val endpointPath: String = "/cbs-catalogue-evaluation-service/v1/catalogues/NOW_TV"

  private lazy val getCatalogue = endpointURL + endpointPath


  lazy val commonRequest =
    url(getCatalogue).as_!("**********", "**********")
}