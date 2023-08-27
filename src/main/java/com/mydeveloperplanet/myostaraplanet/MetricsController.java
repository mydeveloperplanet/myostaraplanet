package com.mydeveloperplanet.myostaraplanet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    @RequestMapping("/endPoint1")
    public String endPoint1() {
        return "Metrics for endPoint1";
    }

    @RequestMapping("/endPoint2")
    public String endPoint2() {
        return "Metrics for endPoint2";
    }

}
