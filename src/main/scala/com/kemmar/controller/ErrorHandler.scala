package com.kemmar.controller

import org.scalatra.servlet.ServletBase

trait ErrorHandler extends ServletBase {

  notFound {
    Error("page not found")
  }

  errorHandler = {
    case t => {
      halt(422, Error(t.toString))
    }
  }
}