package com.example.regcont.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "asiento")
public class AsientoModel {
    @Id
    @Column(name = "nro_asiento")
    private long nroAsiento;
    private Date fecha;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ASIENTO_CUENTA",
    joinColumns = @JoinColumn(name = "nro_asiento"),
    inverseJoinColumns = @JoinColumn(name = "nro_cuenta"))
    private List<CuentaModel> cuentas;
    private double debe;
    private double haber;
}
