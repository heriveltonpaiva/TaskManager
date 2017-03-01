package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.arquitetura.dominio.Sprint;


@RepositoryRestResource(collectionResourceRel="sprint", path="sprint")
public interface SprintRepository extends JpaRepository<Sprint, Integer>{

   
}
