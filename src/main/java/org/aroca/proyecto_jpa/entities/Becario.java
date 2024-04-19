package org.aroca.proyecto_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.aroca.proyecto_jpa.Embedded.*;
import java.util.UUID;
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(uniqueConstraints = @UniqueConstraint(
        columnNames = "id_encargado",
         name = "UQ_becario_encargado"
))
@Data
@AllArgsConstructor @NoArgsConstructor
public class Becario extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idBecario;
    private String centroEducativo;



    @OneToOne
    @JoinColumn(
            name = "id_direccionPersonal",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_becario_emp_direccion")
    )
   private Direccion direccion;
    @OneToOne
    @JoinColumn(
            name = "id_encargado",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_becario_emp_encargado")
    )
    private Empleado encargado;
}
