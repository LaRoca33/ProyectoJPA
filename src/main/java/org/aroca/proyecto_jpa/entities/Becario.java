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

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "tipoV", column = @Column(name = "tipo_viaP")),
            @AttributeOverride(name = "via", column = @Column(name = "viaP")),
            @AttributeOverride(name = "num", column = @Column(name = "numeroP")),
            @AttributeOverride(name = "piso", column = @Column(name = "pisoP")),
            @AttributeOverride(name = "puerta", column = @Column(name = "puertaP")),
            @AttributeOverride(name = "localidad", column = @Column(name = "localidadP")),
            @AttributeOverride(name = "CP", column = @Column(name = "cpP")),
            @AttributeOverride(name = "region", column = @Column(name = "regionP")),
            @AttributeOverride(name = "pais", column = @Column(name = "paisP"))
    })
    private Direccion direccionP;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "tipoV", column = @Column(name = "tipo_viaCE")),
            @AttributeOverride(name = "via", column = @Column(name = "viaCE")),
            @AttributeOverride(name = "num", column = @Column(name = "numeroCE")),
            @AttributeOverride(name = "piso", column = @Column(name = "pisoCE")),
            @AttributeOverride(name = "puerta", column = @Column(name = "puertaCE")),
            @AttributeOverride(name = "localidad", column = @Column(name = "localidadCE")),
            @AttributeOverride(name = "CP", column = @Column(name = "cpCE")),
            @AttributeOverride(name = "region", column = @Column(name = "regionCE")),
            @AttributeOverride(name = "pais", column = @Column(name = "paisCE"))
    })
    private Direccion direccionCE;

    @OneToOne
    @JoinColumn(
            name = "id_encargado",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_becario_emp_encargado")
    )
    private Empleado encargado;
}
