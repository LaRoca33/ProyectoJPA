package org.aroca.proyecto_jpa.entities;


import jakarta.persistence.*;
import lombok.*;
import org.aroca.proyecto_jpa.ClasesEnum.Motivo;
import org.aroca.proyecto_jpa.Embedded.Persona;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="emp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Motivo motivo;

    @ManyToOne
    @JoinColumn(
            name = "id_jefe",
            foreignKey = @ForeignKey(name = "FK_emp_emp_idEmp")

    )
    private Empleado jefe;

    @OneToOne
    @JoinColumn(
            name = "id_usuario",
            foreignKey = @ForeignKey(name = "FK_emp_usuario_usuarioId")
    )
    private Usuario usuario;



}


