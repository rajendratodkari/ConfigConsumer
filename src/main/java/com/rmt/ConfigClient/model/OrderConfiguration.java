package com.rmt.ConfigClient.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/** OrderConfiguration */
@Component
public class OrderConfiguration {

  @Autowired Environment environment;

  public String getEnv() {
    return environment.getProperty("order.env");
  }
}
