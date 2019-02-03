package com.nwm.enricher

class BaseEnricher extends Enricher {
  override def enrich(lines: List[String]): List[String] = {
    lines
  }
}
