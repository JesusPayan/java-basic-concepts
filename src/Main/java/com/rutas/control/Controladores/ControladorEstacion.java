package com.rutas.control.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rutas.control.Modelos.Estacion;
import com.rutas.control.Servicios.ServicioEstacion;

@RestController
@RequestMapping("/estacion")
public class ControladorEstacion {
         
         @Autowired
         ServicioEstacion servicioEstacion;

         @PostMapping("/registrarEstacion")
         public Estacion registrarEstacion(@RequestBody Estacion estacion){
                  return servicioEstacion.registrarEstacion(estacion);
         }
}
