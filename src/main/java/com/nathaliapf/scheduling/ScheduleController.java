package com.nathaliapf.scheduling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {
    

  @GetMapping("/scheduling")
  public String showSchedulePage() {
    return "scheduling";
  }

}
