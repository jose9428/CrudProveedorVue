package com.example.proveedores.controller;

import com.example.proveedores.domain.Proveedor;
import com.example.proveedores.service.IProveedorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/proveedor")
public class ProveedorController {

    @Autowired
    private IProveedorService proveedorService;

    @GetMapping("/list")
    public List<Proveedor> findAll(){
        return proveedorService.findAll();
    }
    @PostMapping("/save")
    public Proveedor save(@RequestBody Proveedor obj){
        return proveedorService.save(obj);
    }

    @DeleteMapping("/delete/{id}")
    public Proveedor delete(@PathVariable("id") int id){
        return proveedorService.deleteById(id);
    }
    @GetMapping("/find/{id}")
    public Proveedor findById(@PathVariable("id") int id){
        return proveedorService.findById(id);
    }

}
