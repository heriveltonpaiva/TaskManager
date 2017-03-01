package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.arquitetura.dominio.Modulo;


@RepositoryRestResource(collectionResourceRel="modulo", path="modulo")
public interface ModuloRepository extends JpaRepository<Modulo, Integer>{

   
}
