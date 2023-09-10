package com.mydeveloperplanet.myostaraplanet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    Logger logger = LoggerFactory.getLogger(MetricsController.class);

    @RequestMapping("/endPoint1")
    public String endPoint1() {
        logger.debug("This is DEBUG message");
        logger.trace("This is a TRACE message");
        return "Metrics for endPoint1";
    }

    @RequestMapping("/endPoint2")
    public String endPoint2() {
        return "Metrics for endPoint2";
    }

}
