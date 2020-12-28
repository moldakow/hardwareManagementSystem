package pl.moldakowski.hardwaremanagement.entities;

import ch.qos.logback.classic.db.names.ColumnName;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Hardware", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = "Hardware_Type_ID")})
public class Hardware {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private long id;

    @Column(name = "NAME", nullable = false, unique = false)
    private String name;

    @Column(name = "SERIAL_NO", nullable = false, unique = false)
    private String serialNo;

    @Column(name = "DESCRIPTION", nullable = true, unique = false)
    private String description; //description

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HARDWARE_TYPE_ID")
    @Autowired
    HardwareType hardwareType;

    public Hardware() {
    }

    public Hardware(long id, String name, String serialNo, String description, HardwareType hardwareType) {
        this.id = id;//                                           description
        this.name = name;
        this.serialNo = serialNo;
        this.description = description;
        this.hardwareType = hardwareType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HardwareType getHardwareType() {
        return hardwareType;
    }

    public void setHardwareType(HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getDescripion() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }


}
