package com.nwm.controller
import com.nwm.dto.JobParam

class BasePerBook (controller: com.nwm.controller.Controller) extends Controller {
  override def execute(param: JobParam): Unit = {
    controller.execute(param)
  }
}
