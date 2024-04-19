package org.aroca.proyecto_jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
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
