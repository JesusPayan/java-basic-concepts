package com.rutas.control.Modelos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Autobus")
public class Camion {

         @Id
         @Column(name="noSerie",unique = true, nullable = false)
         private String noSerie;

         @Column(name="modelo", nullable = false)
         private String modelo;

         @Column(name="capacidad", nullable = false)
         private int capacidad;

         @Column(name="marca", nullable = false)
         private String marca;

         @ManyToOne(fetch=FetchType.EAGER)
         @JoinColumn(name="Estacion_nombre", referencedColumnName = "nombre")
         private Estacion estacion;

         @OneToOne(mappedBy = "camion")
         private Conductor conductor;
         
}
