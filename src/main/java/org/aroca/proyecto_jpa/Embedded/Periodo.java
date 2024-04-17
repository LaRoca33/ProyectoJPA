package org.aroca.proyecto_jpa.Embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Embeddable
@Data @AllArgsConstructor
@NoArgsConstructor
public class Periodo {
    private LocalDate fechaIn;
    private LocalDate fechaFin;
}
