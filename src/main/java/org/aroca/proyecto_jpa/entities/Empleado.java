package org.aroca.proyecto_jpa.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="emp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empno")
    Integer codigo;
    @Column(name = "ename")
    String nombre;
    @Column(name = "job")
    String trabajo;
    @Column(name = "mgr")
    Integer jefe;
    @Column(name = "date")
    LocalDate hiredate;
    @Column(name = "sal")
    String salario;
    @Column(name = "comm")
    String comm;
    @Column(name = "deptno")
    Integer departamento;
}


