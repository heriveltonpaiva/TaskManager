package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.Sprint;


@Repository
public interface SprintRepository extends JpaRepository<Sprint, Integer>{

   
}
