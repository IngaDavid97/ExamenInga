/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examenpracticoM5B.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author HP
 */
@Entity
@Data
public class Empleado {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private int id_empleado;
     
    @Size(min = 10, max = 45, message = "El apellido debe tener entre 10 y 45 caracteres")
    @NotBlank(message = "El apellido no puede estar en blanco")
    @Column(name = "apellido")
     private String apellido;
    
    @Size(min = 10, max = 45, message = "El nombre debe tener entre 10 y 45 caracteres")
    @NotBlank(message = "El nombre no puede estar en blanco")
    @Column(name = "nombre",nullable = false )
     private String nombre;
     
    
     @Column(name = "telefono", length = 15, nullable = false)
     private int telefono;
     
    @Size(min = 10, max = 45, message = "La direccion debe tener entre 10 y 45 caracteres")
    @NotBlank(message = "La direccion no puede estar en blanco")
    @Column(name = "direccion", nullable = false)
     private String direccion;
     
     @Column(name = "fecha_nacimiento", nullable = false)
     private Date fecha_nacimiento; 
     
     
     @Size(min = 10, max = 45, message = "La observacion debe tener entre 10 y 45 caracteres")
    @NotBlank(message = "La observacion no puede estar en blanco")
    @Column(name = "observacion", nullable = false)
     private String observacion;
     
     
     @Column(name = "sueldo", nullable = false, precision = 8, scale = 2)
    private BigDecimal sueldo;
     
    
     
     

}
