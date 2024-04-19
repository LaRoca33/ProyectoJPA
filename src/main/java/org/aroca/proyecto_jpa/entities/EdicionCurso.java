package org.aroca.proyecto_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class EdicionCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private int nota;

    @ManyToOne
    @JoinColumn(
            name = "id_empleado",
            foreignKey = @ForeignKey(name = "FK_edicionCurso_empleado_idEmpleado")
    )
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(
            name = "curso",
            foreignKey = @ForeignKey(name = "FK_edicionCurso_curso_idCurso")
    )
    private Edicion edicion;
}
