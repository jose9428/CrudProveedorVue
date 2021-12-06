package com.example.proveedores.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "Proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Proveedor;
    private String nombre;
    private String actividades;
    private String ciudad;
    private String direccion_Web;
    private String direccion;
    private String tipo_Moneda;
    private String telefono;
    private String email;
    private String password;
}