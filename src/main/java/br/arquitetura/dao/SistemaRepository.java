package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.Sistema;


@Repository
public interface SistemaRepository extends JpaRepository<Sistema, Integer>{

   
}
