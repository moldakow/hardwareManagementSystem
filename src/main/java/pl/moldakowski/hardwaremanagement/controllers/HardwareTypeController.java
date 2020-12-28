package pl.moldakowski.hardwaremanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.moldakowski.hardwaremanagement.entities.HardwareType;
import pl.moldakowski.hardwaremanagement.services.HardwareTypeService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thymeleaf/hwt")
public class HardwareTypeController {
    @Autowired
    HardwareTypeService hardwareTypeService;

    @GetMapping("/list")
    public String listHardware(Model model) {

      List<HardwareType> hardwareTypeList = hardwareTypeService.findAll();
      model.addAttribute("hardwaretype", hardwareTypeList);
        return "thymeleaf/hardwaretype/list";
    }

}
