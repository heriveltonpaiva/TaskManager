package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.Erro;


@Repository
public interface ErroRepository extends JpaRepository<Erro, Integer>{

   
}
