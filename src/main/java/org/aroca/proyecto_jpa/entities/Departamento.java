package org.aroca.proyecto_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(
        name = "uk_departamento_jefe",
        columnNames = "id_jefe"
))
@Data
@AllArgsConstructor @NoArgsConstructor
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nombre;
    private String codigo;
    private BigDecimal presupuesto;
    @ManyToOne
    @JoinColumn(
            name = "id_emp",
            foreignKey = @ForeignKey(name = "FK_departamento_empleado_empleado")
    )
    private Empleado empleados;

    @OneToOne
    @JoinColumn(
            name = "id_jefe",
            foreignKey = @ForeignKey(name = "FK_departamento_empledo-Jefe")
    )
    private Empleado jefe;
}
