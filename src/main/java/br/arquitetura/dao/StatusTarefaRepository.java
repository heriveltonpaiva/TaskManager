package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.arquitetura.dominio.StatusTarefa;

@RepositoryRestResource(collectionResourceRel="statusTarefa", path="statusTarefa")
public interface StatusTarefaRepository extends JpaRepository<StatusTarefa, Integer>{

}
