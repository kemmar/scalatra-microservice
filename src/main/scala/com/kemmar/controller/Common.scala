package com.kemmar.controller

import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json.JacksonJsonSupport

trait Common extends JacksonJsonSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats.withBigDecimal

  before() {
    contentType = formats("json")
  }
}