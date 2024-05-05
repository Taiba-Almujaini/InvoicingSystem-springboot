package com.TRA.tra24springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  @GetMapping("invoice")
    public String handleRequest(){
      return "Invoicing System";
  }



}
