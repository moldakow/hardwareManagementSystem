package pl.moldakowski.hardwaremanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.moldakowski.hardwaremanagement.entities.HardwareType;
import pl.moldakowski.hardwaremanagement.repositories.HardwareTypeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class HardwareTypeService {
    @Autowired
    HardwareTypeRepository hardwareTypeRepository;

    public List<HardwareType> findAll(){
        return (List<HardwareType>) hardwareTypeRepository.findAll();
    }

}
