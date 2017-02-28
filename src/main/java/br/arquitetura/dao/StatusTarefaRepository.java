package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.StatusTarefa;

@Repository
public interface StatusTarefaRepository extends JpaRepository<StatusTarefa, Integer>{

}
