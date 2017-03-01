package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.Tarefa;


@RepositoryRestResource(collectionResourceRel="tarefa", path="tarefa")
public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

   
}
