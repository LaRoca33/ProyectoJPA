package org.aroca.proyecto_jpa.Embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aroca.proyecto_jpa.ClasesEnum.Genero;

import java.time.LocalDate;

@Embeddable
@Data
@AllArgsConstructor @NoArgsConstructor
public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;
    private Genero genero;
}
