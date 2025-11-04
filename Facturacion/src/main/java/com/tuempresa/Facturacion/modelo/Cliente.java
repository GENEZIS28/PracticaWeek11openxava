package com.tuempresa.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class Cliente {
     @Id


     @Column(length = 6)
     int numero;

    @Column(length=50)
    @Required
    String nombre;

    @Embedded // Así para referenciar a una clase incrustable
    Direccion direccion; // Una referencia Java convencional

}
