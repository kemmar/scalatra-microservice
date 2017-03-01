package com.kemmar.domains.cbs

case class EvaluationCategory(id: String,
                              name: String,
                              categories: List[EvaluationCategory],
                              products: List[EvaluationProduct])


