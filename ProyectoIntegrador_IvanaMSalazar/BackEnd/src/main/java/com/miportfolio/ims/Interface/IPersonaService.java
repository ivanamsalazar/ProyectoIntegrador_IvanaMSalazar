package com.miportfolio.ims.Interface;

import com.miportfolio.ims.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Obtengo lista de personas
    public List<Persona> getPersona();
    
    //Guardar una persona
    public void savePersona(Persona persona);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
            
    //Eliminar una persona por ID
    public void deletePersona(Long id);
}
