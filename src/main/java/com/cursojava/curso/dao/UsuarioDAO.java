package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;

public interface UsuarioDAO {

    List<Usuario> getUsuarios();
    void deleteUser(Long id);


}
