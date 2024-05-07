//package com.example.toureregion.controller;
//
//import com.example.toureregion.config.ConfigClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.ObjectInputFilter;
//import java.util.Map;
//
//@RestController
//public class ConfigTestController {
//    @Value("${global.params.a}")
//    private int p1;
//    @Autowired
//    private ConfigClient configClient;
//    @GetMapping("/test")
//    public Map<String, Integer> config(){
//        return Map.of("p1",p1);
//    }
//
//    @GetMapping("/test1")
//    public ConfigClient configRed(){
//        return configClient;
//    }
//}
