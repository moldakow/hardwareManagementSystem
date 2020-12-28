package pl.moldakowski.hardwaremanagement.RestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.moldakowski.hardwaremanagement.entities.HardwareType;
import pl.moldakowski.hardwaremanagement.services.HardwareTypeService;

import java.util.List;

@RestController
@RequestMapping("/rest/ht")
public class HardewareTypeRest {
    @Autowired
    HardwareTypeService hardwareTypeService;

    @GetMapping("/list")
    public List<HardwareType> findHardwareType() {
        return hardwareTypeService.findAll();
    }
}