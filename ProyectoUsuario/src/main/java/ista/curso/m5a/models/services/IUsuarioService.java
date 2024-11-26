package ista.curso.m5a.models.services;

import java.util.List;

import ista.curso.m5a.models.entity.Usuario;

public interface IUsuarioService {
	public List<Usuario> findAll();
	public Usuario save(Usuario usuario);
	public Usuario findById(Long Id);
	public void delete(Long id);
	
}
