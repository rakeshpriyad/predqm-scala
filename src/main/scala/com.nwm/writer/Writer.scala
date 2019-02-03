package com.nwm.writer

import java.nio.file.{Files, OpenOption, Paths}

object Writer {
  def write(contents: List[String], fileName: String, filePath: String): Boolean = {
    val c = contents.mkString("\n")
    val outputPath = Paths.get(filePath + "/" + fileName)
    try {
      Files.write(outputPath, c.getBytes)
      true
    } catch {
      case e: Exception =>
        e.printStackTrace()
        false
    }
    false
  }
}
