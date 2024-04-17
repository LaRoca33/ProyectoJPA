package org.aroca.proyecto_jpa.Embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Embeddable
@Data @NoArgsConstructor
@AllArgsConstructor
public class Direccion {
    private String tipoV;
    private  String via;
    private int num;
    private int piso;
    private String puerta;
    private String localidad;
    private BigInteger CP;
    private String region;
    private String pais;
}
