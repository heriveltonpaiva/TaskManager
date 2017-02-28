package br.arquitetura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.arquitetura.dominio.Os;

@Repository
public interface OsRepository extends JpaRepository<Os, Integer>{

}
