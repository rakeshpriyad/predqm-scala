package com.nwm.enricher

trait Enricher {
  def enrich(lines : List [String]) : List[String]
}
