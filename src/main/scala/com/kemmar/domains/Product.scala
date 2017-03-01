package com.kemmar.domains

import com.kemmar.domains.cbs.LocalisedPrice

case class Product(id: String,
                   name: String,
                   displayName: Option[String],
                   prices: Seq[LocalisedPrice] = Nil,
                   attributes: Attributes,
                   category: String,
                   resourceIdentifier: Option[String] = None)


