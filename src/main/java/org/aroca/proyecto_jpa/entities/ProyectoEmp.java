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
public class ProyectoEmp {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String rol;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "fechaInicio", column = @Column(name = "fecha_comienzo")),
            @AttributeOverride(name = "fechaFin", column = @Column(name = "fecha_fin"))
    })
    private Periodo periodo;
    @ManyToOne
    @JoinColumn(
            name = "id_proyecto",
            foreignKey = @ForeignKey(name = "FK_proyecto_empleado_proyecto_proyecto")
    )
    private Proyecto proyecto;
    @ManyToOne
    @JoinColumn(
            name = "id_empleado",
            foreignKey = @ForeignKey(name = "FK_proyecto_empleado_empleado_empleado")
    )
    private Empleado empleado;
}
