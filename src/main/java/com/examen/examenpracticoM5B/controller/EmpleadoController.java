/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examenpracticoM5B.controller;

import com.examen.examenpracticoM5B.model.Empleado;
import com.examen.examenpracticoM5B.service.EmpleadoServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoServiceImpl empleadoService;

    @Operation(summary = "Se obtiene la lista de Empleados")
    @GetMapping("/listar")
    public ResponseEntity<List<Empleado>> listaEmpleados() {
        return new ResponseEntity<>(empleadoService.findByAll(), HttpStatus.OK);
    }

    @Operation(summary = "Debe enviar los campos del Empleado")
    @PostMapping("/crear")
    public ResponseEntity<Empleado> crearEmpleado(@RequestBody Empleado u) {
        
        return new ResponseEntity<>(empleadoService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Integer id, @RequestBody Empleado u) {
        Empleado empleado = empleadoService.findById(id);
        if (empleado != null) {
            try {
                
              // persona.setNombre_per(u.getNombre_per());
               
              
                empleado.setApellido(u.getApellido());
                
                empleado.setNombre(u.getNombre());
                
                empleado.setObservacion(u.getObservacion());
                
                empleado.setTelefono(u.getTelefono());
                
                empleado.setDireccion(u.getDireccion());
                
                empleado.setSueldo(u.getSueldo());
                
                empleado.setFecha_nacimiento(u.getFecha_nacimiento());
                
                
                
                return new ResponseEntity<>(empleadoService.save(empleado), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Empleado> elimiarEmpleado(@PathVariable Integer id) {
        empleadoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
