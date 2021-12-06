package com.example.proveedores.service;

import com.example.proveedores.domain.Proveedor;

import java.util.List;

public interface IProveedorService {
    Proveedor save(Proveedor obj);
    List<Proveedor> findAll();
    Proveedor deleteById(Integer id);
    Proveedor findById(Integer id);
}
