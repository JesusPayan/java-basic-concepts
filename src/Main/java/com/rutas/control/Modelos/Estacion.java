package com.rutas.control.Modelos;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Estacion")
public class Estacion {

         @Id
         @Column(name="nombre",unique = true, nullable = false)
         private String nombre;

         @Column(name="direccion", nullable = false)
         private String direccion;

         @OneToMany(mappedBy = "estacion")
         private Set<Camion> camion;
         
}
