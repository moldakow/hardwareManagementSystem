package pl.moldakowski.hardwaremanagement.vaadinGUI;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.moldakowski.hardwaremanagement.entities.Hardware;
import pl.moldakowski.hardwaremanagement.services.HardwareService;

import java.util.List;

@Route("hardware")
public class HardwareGUI extends VerticalLayout {
    @Autowired
    HardwareService hardwareService;

    HardwareGUI() {
        List<Hardware> hardwareList = hardwareService.findAll();
        Grid<Hardware> hardwareGrid = new Grid<>(Hardware.class);
        hardwareGrid.setColumns("id", "hardwareType", "name", "serialNo"/*,"description"*/);
        add(hardwareGrid);
        setSizeFull();

    }
}
