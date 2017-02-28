package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.Modulo;


@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Integer>{

   
}
