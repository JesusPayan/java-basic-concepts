package com.rutas.control.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rutas.control.Modelos.Estacion;

@Repository
public interface RepositorioEstacion extends JpaRepository<Estacion,String>{
         
}
