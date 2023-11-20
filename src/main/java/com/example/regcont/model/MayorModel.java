package com.example.regcont.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "mayor")
public class MayorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int anio;
    private int mes;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nro_cuenta")
    private CuentaModel cuenta;
    private double totalDebe;
    private double totalHaber;
    private double saldo;
}
