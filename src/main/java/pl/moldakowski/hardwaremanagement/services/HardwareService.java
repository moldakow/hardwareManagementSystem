package pl.moldakowski.hardwaremanagement.services;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.moldakowski.hardwaremanagement.entities.Hardware;
import pl.moldakowski.hardwaremanagement.repositories.HardwareRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class HardwareService {
    @Autowired
    HardwareRepository hardwareRepository;
    @Autowired
    @JsonIgnoreProperties({"hibernateLazyInitializer", "Hardware_Type_ID"})
    HardwareTypeService hardwareTypeService;


    public List<Hardware> findAll() {
        return (ArrayList<Hardware>) hardwareRepository.findAll();
    }
}
