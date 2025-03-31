package com.tramp.controlescolar.repositories;

import com.tramp.controlescolar.models.tablas.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
}
