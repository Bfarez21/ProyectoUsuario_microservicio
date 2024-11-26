package ista.curso.m5a.models.dao;

import org.springframework.data.repository.CrudRepository;

import ista.curso.m5a.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
