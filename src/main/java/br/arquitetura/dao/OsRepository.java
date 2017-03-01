package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.arquitetura.dominio.Os;

@RepositoryRestResource(collectionResourceRel="os", path="os")
public interface OsRepository extends JpaRepository<Os, Integer>{

}
