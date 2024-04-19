package org.aroca.proyecto_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    private String nombre;
    private int horas;



    @ManyToOne
    @JoinColumn(
            name = "id_edicionCurso",
            foreignKey = @ForeignKey(name = "FK_curso_edicionCurso_idEdicionCurso")
    )
    private EdicionCurso edicionCurso;

}
