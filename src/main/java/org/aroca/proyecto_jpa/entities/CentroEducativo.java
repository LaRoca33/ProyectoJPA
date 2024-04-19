package org.aroca.proyecto_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class CentroEducativo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(
            name = "id_direccion",
            foreignKey = @ForeignKey(name = "FK_centro_direccion_direccionCentro")
    )
    private Direccion direccionCentro;

    @OneToOne
    @JoinColumn(
            name = "id_becario",
            foreignKey = @ForeignKey(name = "FK_centro_becario_becarioId")
    )
    private Becario becarios;
}
