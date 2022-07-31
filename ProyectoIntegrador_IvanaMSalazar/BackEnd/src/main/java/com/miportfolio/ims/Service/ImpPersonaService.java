package com.miportfolio.ims.Service;

import com.miportfolio.ims.Entity.Persona;
import com.miportfolio.ims.Interface.IPersonaService;
import com.miportfolio.ims.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
            
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id); }
    
}
