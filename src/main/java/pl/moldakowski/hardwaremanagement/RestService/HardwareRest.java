package pl.moldakowski.hardwaremanagement.RestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.moldakowski.hardwaremanagement.entities.Hardware;
import pl.moldakowski.hardwaremanagement.services.HardwareService;

import java.util.List;

@RestController
@RequestMapping("/rest/hd")
public class HardwareRest {
    @Autowired
    HardwareService hardwareService;

    @GetMapping("/list")
    public List<Hardware> findHardware() {
        return hardwareService.findAll();
    }
}
