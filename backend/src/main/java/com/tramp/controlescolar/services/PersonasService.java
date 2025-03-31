package com.tramp.controlescolar.services;

import com.tramp.controlescolar.dto.PersonaUsuarioRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tramp.controlescolar.models.tablas.Personas;
import com.tramp.controlescolar.repositories.PersonasRepository;
import java.util.List;

@Service
public class PersonasService{
    @Autowired
    private PersonasRepository  personasRepository;


    public List<Personas> ListarPersonas(){

        return personasRepository.findAll();
    }

    @Transactional
    public void insertarAdministrador(PersonaUsuarioRequest request){
        personasRepository.insertaPersonaAdministrador(
                request.getCnombre(),
                request.getCapellidos(),
                request.getBsexo(),
                request.getNedad(),
                request.getDfecha_nacimiento(),
                request.getcCURP(),
                request.getcRFC(),
                request.getCnumero_celular(),
                request.getNid_carrera(),
                request.getContrasenia()
        );

    }
    @Transactional
    public void insertarProfesor(PersonaUsuarioRequest request) {
        personasRepository.insertaPersonaProfesor(
                request.getCnombre(),
                request.getCapellidos(),
                request.getBsexo(),
                request.getNedad(),
                request.getDfecha_nacimiento(),
                request.getcCURP(),
                request.getcRFC(),
                request.getCnumero_celular(),
                request.getNid_carrera(),
                request.getContrasenia()
        );
    }

    @Transactional
    public void insertarAlumno(PersonaUsuarioRequest request) {
        personasRepository.insertaPersonaAlumno(
                request.getCnombre(),
                request.getCapellidos(),
                request.getBsexo(),
                request.getNedad(),
                request.getDfecha_nacimiento(),
                request.getcCURP(),
                request.getcRFC(),
                request.getCnumero_celular(),
                request.getNid_carrera(),
                request.getContrasenia()
        );
    }
}
