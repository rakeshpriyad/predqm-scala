package com.nwm.actors

import akka.actor.Actor
import com.nwm.dto.JobParam

class FileProcessorActor extends Actor{
    def receive = {
      case param:JobParam => println(param +" " +self.path.name);
    }
}
