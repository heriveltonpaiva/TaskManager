package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.arquitetura.dominio.Sistema;


@RepositoryRestResource(collectionResourceRel="sistema", path="sistema")
public interface SistemaRepository extends JpaRepository<Sistema, Integer>{

   
}
