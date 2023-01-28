package com.nathaliapf.agendamento;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgendamentoController {
    

  @GetMapping("/schedule")
  public String showSchedulePage() {
    return "schedule";
  }

}
