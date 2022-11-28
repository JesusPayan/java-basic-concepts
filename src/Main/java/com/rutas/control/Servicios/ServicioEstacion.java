package com.rutas.control.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rutas.control.Modelos.Estacion;
import com.rutas.control.Repositorios.RepositorioEstacion;

@Service
public class ServicioEstacion {

         @Autowired
         RepositorioEstacion repositorioEstacion;

         public Estacion registrarEstacion(Estacion estacion){

                  return repositorioEstacion.save(estacion);
         }
         
}
