package pl.moldakowski.hardwaremanagement.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.moldakowski.hardwaremanagement.entities.Hardware;

import java.util.List;

@Repository
public interface HardwareRepository extends CrudRepository<Hardware, Long> {


    @Override
    public List<Hardware> findAll();
}
