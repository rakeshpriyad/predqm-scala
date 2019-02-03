package com.nwm.actors
import scala.concurrent.duration._
import akka.actor.Actor
import com.nwm.dto.JobParam;
import akka.actor._
import akka.actor.{ActorSystem, Props}

class DataProcessorActor extends Actor{
  def receive = {
    case param:JobParam =>
      var fileProcessorActor =  context.actorOf(Props[FileProcessorActor],"fileProcessorActor");
      process(param, fileProcessorActor)
    case _ => println("Unkown message")
  }

  def process (param: JobParam, fileProcessorActor : ActorRef): Unit = {
    fileProcessorActor ! param
  }
}

object DataProcessorActor{
  def main(args:Array[String]){
    var actorSystem = ActorSystem("ActorSystem");                       // Creating ActorSystem
    var actor = actorSystem.actorOf(Props[DataProcessorActor],"DataProcessorActor")        //Creating actor
    val cancellable =
      actorSystem.scheduler.schedule(
        0 milliseconds,
        50 milliseconds,
        actor,
        "")

  }
}


