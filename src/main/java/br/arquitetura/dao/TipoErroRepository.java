package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.arquitetura.dominio.TipoErro;

@RepositoryRestResource(collectionResourceRel="tipoErro", path="tipoErro")
public interface TipoErroRepository extends JpaRepository<TipoErro, Integer>{

}
