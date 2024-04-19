package org.aroca.proyecto_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "grupo_emp",
            joinColumns = @JoinColumn(
                    name = "id_grupo_",
                    foreignKey = @ForeignKey(name = "FK_grupo_desarrollo_emp_grupo")
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "id_empleados",
                    foreignKey = @ForeignKey(name = "FK_grupo_desarrollo_emp_emp")
            )
    )
    private Set<Empleado> empleados;

}
