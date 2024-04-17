package org.aroca.proyecto_jpa.Embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aroca.proyecto_jpa.ClasesEnum.Motivo;

import java.time.LocalDate;

@Embeddable
@Data
@AllArgsConstructor @NoArgsConstructor
public class PeriodoEntrada {
    private LocalDate fechaIn;
    private LocalDate fechaFin;
    private Motivo motivo;
}
