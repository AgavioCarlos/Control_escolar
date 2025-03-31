package com.tramp.controlescolar.repositories;

import com.tramp.controlescolar.models.catalogos.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepository  extends JpaRepository<Categorias, Integer> {

}
