package com.rutas.control.Modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Conductor")
public class Conductor {
         
         @Id
         @Column(name="noPersonal",unique = true, nullable = false)
         private String noPersonal;

         @Column(name="nombre", nullable = false)
         private String nombre;

         @OneToOne(cascade = CascadeType.ALL)
         @JoinColumn(name="Autobus_noSerie", referencedColumnName = "noSerie")
         private Camion camion;
}
