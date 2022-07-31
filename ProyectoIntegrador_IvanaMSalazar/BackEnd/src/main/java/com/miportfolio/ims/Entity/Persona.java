package com.miportfolio.ims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 40, message="El nombre es demasiado largo")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 40, message="El apellido es demasiado largo")    
    private String apellido;
    
    @Size(min = 1, max = 40, message="Es demasiado largo")    
    private String img;
    
}
