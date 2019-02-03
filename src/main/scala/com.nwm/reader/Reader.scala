package com.nwm.reader

import java.io.File

import scala.io.Source

object Reader {
  def read (fileName: String, filePath: String): List[String] = {
    val source = Source.fromFile(filePath + "/" + fileName)
    try {
      source.getLines().toList
    }catch {
      case e: Exception =>
    } finally {
      if (source !=null ) source.close()
    }
    Nil
  }
}

