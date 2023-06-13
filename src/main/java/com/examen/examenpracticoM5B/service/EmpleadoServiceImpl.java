/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examenpracticoM5B.service;


import com.examen.examenpracticoM5B.model.Empleado;
import com.examen.examenpracticoM5B.repository.EmpleadoRepository;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author 59398
 */
@Service
public class EmpleadoServiceImpl extends GenericServiceImpl<Empleado, Integer> implements GenericService<Empleado, Integer> {

    @Autowired
    EmpleadoRepository empleadoRepository;
    

    @Override
    public CrudRepository<Empleado, Integer> getDao() {
        return empleadoRepository;
    }
    
    
//     public void calcularSueldo(int diasTrabajados) {
//        BigDecimal sueldoBase = new BigDecimal(diasTrabajados * 15); // Día de trabajo cuesta $15
//        BigDecimal bono = BigDecimal.ZERO;
//
//        if (diasTrabajados >= 20) {
//            bono = sueldoBase.multiply(new BigDecimal("0.02")); // Bono del 2%
//        }
//
//        if (diasTrabajados >= 30) {
//            bono = sueldoBase.multiply(new BigDecimal("0.05")); // Bono del 5%
//        }
//
//      //  this.sueldo = sueldoBase.add(bono);
//    }
     


}
