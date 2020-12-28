package pl.moldakowski.hardwaremanagement.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "HardwareType", uniqueConstraints =
@UniqueConstraint(columnNames = "ID"))
public class HardwareType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
   @Column(name="type", unique = false, nullable = false)
    String type;

    public HardwareType() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HardwareType(String id, String type) {
        this.id = id;
        this.type = type;
    }

    @OneToMany (mappedBy = "hardwareType")
    private List<Hardware> hardwareList = new ArrayList<Hardware>();

}
