package com.nwm.filter

trait Filter {
  def doFilter(lines : List[String]) : List[String]
}

