package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.TarefaSprint;


@Repository
public interface TarefaSprintRepository extends JpaRepository<TarefaSprint, Integer>{

   
}
