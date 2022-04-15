package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository //El tag repository significa que va a tener la funcionalidad de poder acceder al repositorio de la base de datos
@Transactional //Hace referencia a la forma en que tratar las consultas de sql, como las arma y como las ejectua.
public class UsuarioDAOImp implements UsuarioDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsers() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteUser(Long id){
        Usuario userToDelete = entityManager.find(Usuario.class, id);
        entityManager.remove(userToDelete);
    }

    @Override
    public void addUser(Usuario usuario){
        entityManager.merge(usuario);
    }

    @Override
    public void editUser(Usuario usuario){
        entityManager.merge(usuario);
    }
}
