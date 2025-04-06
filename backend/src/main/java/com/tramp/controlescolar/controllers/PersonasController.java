package com.tramp.controlescolar.controllers;

import java.util.List;

import com.tramp.controlescolar.dto.PersonaUsuarioRequest;
import com.tramp.controlescolar.models.catalogos.Carreras;
import com.tramp.controlescolar.models.catalogos.Categorias;
import com.tramp.controlescolar.repositories.CarrerasRepository;
import com.tramp.controlescolar.repositories.CategoriasRepository;
import com.tramp.controlescolar.repositories.PersonasRepository;
import com.tramp.controlescolar.services.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tramp.controlescolar.models.tablas.Personas;
import java.util.Date;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("registrar")
public class PersonasController {
    @Autowired
    private  PersonasRepository personasRepository;

    @Autowired
    private CategoriasRepository categoriasRepository;

    @Autowired
    private CarrerasRepository carrerasRepository;

    @Autowired
    private PersonasService personasService;

    @PostMapping("/persona")
    public ResponseEntity<Personas> registrarUsuario(@RequestBody Personas persona) {

        // Asignar fecha de alta al momento de creación
        persona.setDfecha_alta(new Date());
        Personas nuevaPersona = personasRepository.save(persona);
        return ResponseEntity.ok(nuevaPersona);
    }


    //Ingresa al procedimiento almacenado SPD_INSERTA_PERSONA_ADMIN mediante insertaPersonaAdmin
    @PostMapping("administrador")
    public ResponseEntity<String> crearAdministrador(@RequestBody PersonaUsuarioRequest request){
        try {
            personasService.insertarAdministrador(request);
            return ResponseEntity.ok("Admnistrador registrado correctamente");
        } catch (Exception e) {
            return  ResponseEntity.status(500).body("Error al registrar administrador: " + e.getMessage());

        }
    }

    //Ingresa al procedimiento almacenado SPD_INSERTA_PERSONA_ALUMNO mediante insertaPersonaProfesor
    @PostMapping("profesor")
    public ResponseEntity<String> crearProfesor(@RequestBody PersonaUsuarioRequest request){
        try {
            personasService.insertarProfesor(request);
            return ResponseEntity.ok("Profesor registrado correctamente");
        } catch (Exception e) {
            return  ResponseEntity.status(500).body("Error al registrar profesor: " + e.getMessage());

        }
    }

    @PostMapping("alumno")
    public ResponseEntity<String> crearAlumno(@RequestBody PersonaUsuarioRequest request){
        try {
            personasService.insertarAlumno(request);
            return ResponseEntity.ok("Alumno registrado correctamente");
        } catch (Exception e) {
            return  ResponseEntity.status(500).body("Error al registrar alumno: " + e.getMessage());

        }
    }

    @GetMapping("/categorias")
    public List<Categorias> mostrarCategorias() {
        List<Categorias> listaCategorias = categoriasRepository.findAll();
        return listaCategorias;
    }

    @GetMapping("/carreras")
    public List<Carreras> mostrarCarreras() {
        List<Carreras> listaCarreras = carrerasRepository.findAll();
        return listaCarreras;
    }

    @GetMapping("/personas")
    public List<Personas> mostrarPersonas() {
        List<Personas> listaPersonas = personasRepository.findAll();
        return listaPersonas;
    }


    
}
