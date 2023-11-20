package com.example.regcont.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cuenta")
public class CuentaModel {
    @Id
    @Column(name = "nro_cuenta")
    private long nroCuenta;
    private String rubro;
    private String descripcion;
    private long codigoInicial;
    @ManyToMany(mappedBy = "cuentas")
    private List<AsientoModel> asientos;
    @OneToMany(mappedBy = "cuenta")
    private List<MayorModel> mayores;
}
