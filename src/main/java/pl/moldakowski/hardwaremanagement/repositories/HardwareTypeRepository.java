package pl.moldakowski.hardwaremanagement.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.moldakowski.hardwaremanagement.entities.HardwareType;

import java.util.List;
@Repository
public interface HardwareTypeRepository extends CrudRepository<HardwareType, Long> {

    @Override
    public List<HardwareType> findAll();
}
