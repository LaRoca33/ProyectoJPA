package org.aroca.proyecto_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aroca.proyecto_jpa.Embedded.Periodo;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Nomina {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private  String nombre;
    private int anio;
    private double liquido;
    private String mes;

}
