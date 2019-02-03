package com.nwm.config

import com.typesafe.config.ConfigFactory

case class ConfigParam(inputLocation: String, outputLocation: String,processedLocation: String,
                       rejectedLocation: String,stagingLocation: String, fileExtention: String) {

}

object ConfigParam {
  var param: ConfigParam = _

  def load(): ConfigParam = {
    if (param != null) {
      val config = ConfigFactory.load("application.conf")
      val inputLocation = config.getString("predqm.input_path")
      val outputLocation = config.getString("predqm.input_path")
      val processedLocation = config.getString("predqm.input_path")
      val rejectedLocation = config.getString("predqm.input_path")
      val staginglocation = config.getString("predqm.input_path")
      param = new ConfigParam(inputLocation , outputLocation, processedLocation, rejectedLocation,staginglocation, "")
      param
    } else {
      param
    }
  }
}