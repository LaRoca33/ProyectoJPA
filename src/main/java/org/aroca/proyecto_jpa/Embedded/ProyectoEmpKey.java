package org.aroca.proyecto_jpa.Embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Embeddable
@Data
@AllArgsConstructor @NoArgsConstructor
public class ProyectoEmpKey {
    private UUID idProy;
    private UUID idEmp;

}
