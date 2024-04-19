package org.aroca.proyecto_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aroca.proyecto_jpa.Embedded.TarjetaCredito;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class CuentaBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Double sal;
    private Double comision;

    @Embedded
    private TarjetaCredito tarjetaCredito;

}
