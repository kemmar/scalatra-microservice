package com.kemmar.domains.cbs

case class EvaluationProduct(id: String,
                             name: String,
                             billName: Option[String],
                             prices: Seq[LocalisedPrice],
                             attributes: Option[EvaluationAttributes],
                             resourceIdentifier: Option[String] = None)




