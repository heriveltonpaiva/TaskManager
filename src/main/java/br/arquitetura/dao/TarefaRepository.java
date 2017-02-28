package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.Tarefa;


@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

   
}
