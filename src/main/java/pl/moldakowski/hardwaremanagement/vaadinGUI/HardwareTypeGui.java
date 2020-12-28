package pl.moldakowski.hardwaremanagement.vaadinGUI;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.moldakowski.hardwaremanagement.entities.Hardware;
import pl.moldakowski.hardwaremanagement.entities.HardwareType;
import pl.moldakowski.hardwaremanagement.repositories.HardwareRepository;
import pl.moldakowski.hardwaremanagement.repositories.HardwareTypeRepository;
import pl.moldakowski.hardwaremanagement.services.HardwareTypeService;

import java.util.List;

@Route("hardwareType")
public class HardwareTypeGui extends VerticalLayout {
    @Autowired
    private HardwareTypeService hardwareTypeService = new HardwareTypeService();
    private Grid<HardwareType> hardwareTypeGrid = new Grid<HardwareType>(HardwareType.class);

    @Autowired
    HardwareTypeGui() {
        List<HardwareType> hardwareTypeList = hardwareTypeService.findAll();
        hardwareTypeGrid.setItems(hardwareTypeList);
        add(hardwareTypeGrid);
        setSizeFull();
    }
}
