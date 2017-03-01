package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.arquitetura.dominio.TarefaSprint;


@RepositoryRestResource(collectionResourceRel="tarefaSprint", path="tarefaSprint")
public interface TarefaSprintRepository extends JpaRepository<TarefaSprint, Integer>{

   
}
