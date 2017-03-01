package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.arquitetura.dominio.Erro;


@RepositoryRestResource(collectionResourceRel="erro", path="erro")
public interface ErroRepository extends JpaRepository<Erro, Integer>{

   
}
