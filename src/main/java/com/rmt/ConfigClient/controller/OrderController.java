package com.rmt.ConfigClient.controller;

import com.rmt.ConfigClient.model.OrderConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** OrderController */
@RestController
public class OrderController {

  @Autowired OrderConfiguration orderConfiguration;

  @RequestMapping(value = "/order/config")
  public String getOrderConfig() {
    return orderConfiguration.getEnv();
  }
}
