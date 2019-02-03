package com.nwm.controller
import com.nwm.dto.JobParam
import com.nwm.enricher.BaseEnricher
import com.nwm.reader.Reader.read
import com.nwm.writer.Writer.write
import com.nwm.filter.BaseFilter
import com.nwm.processor.BaseProcessor

trait Controller {

  def execute (param: JobParam)  : Unit = {
    val filter: BaseFilter = param.filter
    val enricher: BaseEnricher = param.enricher
    val processor: BaseProcessor = param.processor

    val lines: List[String] = read("", "")
    if (processor != null && filter != null && enricher != null) {
      write(processor.process(enricher.enrich(filter.doFilter(lines))),"","")
    }else if(processor != null && enricher != null){
      write(processor.process(enricher.enrich(lines)),"","")
    }else if(processor != null && filter != null){
      write(processor.process(filter.doFilter(lines)),"","")
    }else if(processor != null && enricher != null){
      write(processor.process(enricher.enrich(lines)),"","")
    }else if(filter != null && enricher != null){
      write(enricher.enrich(filter.doFilter(lines)),"","")
    } else if(enricher != null){
      write(enricher.enrich(lines),"","")
    }
  }

}