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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nombreM;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "fechaIn", column = @Column(name = "fechaInicio")),
            @AttributeOverride(name = "fechaFin", column = @Column(name = "fechaFin"))
    })
   private Periodo periodo;
}
