package pl.moldakowski.hardwaremanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.moldakowski.hardwaremanagement.entities.HardwareType;
import pl.moldakowski.hardwaremanagement.services.HardwareService;
import pl.moldakowski.hardwaremanagement.services.HardwareTypeService;

@SpringBootApplication
public class HardwaremanagementApplication {
    @Autowired
    HardwareService hardwareService;
@Autowired
HardwareTypeService hardwareTypeService;
    public static void main(String[] args) {
        SpringApplication.run(HardwaremanagementApplication.class, args);
    }

  }

