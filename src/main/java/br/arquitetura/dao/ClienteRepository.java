package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.arquitetura.dominio.Cliente;


@RepositoryRestResource(collectionResourceRel="cliente", path="cliente")
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
