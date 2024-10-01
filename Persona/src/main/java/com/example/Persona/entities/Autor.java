package com.example.Persona.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
@Table(name= "autor")
public class Autor extends Base {;

	@Column(name="nombre")
    private String nombre;
	
	@Column(name="apellido")
    private String apellido;
    
	@Column(name="biogradia", length = 1500)
    private String biografia;
}
