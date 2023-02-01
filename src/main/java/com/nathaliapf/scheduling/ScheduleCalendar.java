package com.nathaliapf.scheduling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleCalendar {

  @GetMapping("/schedule")
  public String showSchedulePage() {
    return "schedule";
  }
}
