package com.nwm.dto

import com.nwm.enricher.BaseEnricher
import com.nwm.filter.BaseFilter
import com.nwm.processor.BaseProcessor

case class JobParam (processor: BaseProcessor, filter : BaseFilter, enricher : BaseEnricher) {

}
