package com.example.proveedores.service;

import com.example.proveedores.domain.Proveedor;
import com.example.proveedores.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProveedorServiceImpl implements IProveedorService {
    @Autowired
    private ProveedorRepository repo;
    @Override
    public Proveedor save(Proveedor obj) {
        return repo.save(obj);
    }

    @Override
    public List<Proveedor> findAll() {
       return repo.findAll();
    }

    @Override
    public Proveedor deleteById(Integer id) {
        Proveedor obj = repo.findById(id).orElse(null);

        if(obj !=null){
            repo.deleteById(id);
        }
        return obj;
    }

    @Override
    public Proveedor findById(Integer id) {
        return  repo.findById(id).orElse(null);
    }
}
