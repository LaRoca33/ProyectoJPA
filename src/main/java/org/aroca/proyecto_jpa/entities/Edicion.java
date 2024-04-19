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
public class Edicion {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int duracion;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "fechaIn", column = @Column(name = "fecha_inicio")),

            @AttributeOverride(name = "fechaFin", column = @Column(name = "fecha_fin"))
    })
    private Periodo periodo;

    @ManyToOne
    @JoinColumn(
            foreignKey = @ForeignKey(name = "FK_edicion_empleado_ponente")
    )
    private Empleado ponente;

    @ManyToOne
    @JoinColumn(
            foreignKey = @ForeignKey(name = "FK_edicion_curso")
    )
    private Curso formacion;
}
