package com.tramp.controlescolar.services;

import com.tramp.controlescolar.models.catalogos.Carreras;
import com.tramp.controlescolar.models.catalogos.Categorias;
import com.tramp.controlescolar.repositories.CarrerasRepository;
import com.tramp.controlescolar.repositories.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoPersonaService {
    @Autowired
    private CategoriasRepository categoriasRepository;

    @Autowired
    private CarrerasRepository carrerasRepository;

    public List<Categorias> obtenerCategorias() {
        return categoriasRepository.findAll();
    }

    public List<Carreras> obtenerCarreras() {
        return carrerasRepository.findAll();
    }
}
