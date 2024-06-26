package org.aroca.proyecto_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class LineaNomina {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(
            name = "id_nomina",
            foreignKey = @ForeignKey(name = "FK_linea_nomina_nomina_nomina")
    )
    private Nomina nomina;
    private String concepto;
    private double importe;
}
