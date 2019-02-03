package com.nwm.processor

trait Processor {
    def process(lines : List[String]) :List[String]
}

class BaseProcessor  extends Processor {
  def process(lines : List[String]) :List[String] = {
    lines
  }
}