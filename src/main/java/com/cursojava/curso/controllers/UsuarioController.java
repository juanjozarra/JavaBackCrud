package com.cursojava.curso.controllers;


import com.cursojava.curso.dao.UsuarioDAO;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UsuarioController {

    @Autowired //Esta notacion automaticamente hace que la clase UsuarioDAOImpl se cree un objeto y la guarda en esta var
    private UsuarioDAO usuarioDAO;


    @RequestMapping(value = "api/users", method = RequestMethod.GET)
    public List<Usuario> getUsers() {
        return usuarioDAO.getUsers();
    }

    @RequestMapping(value = "api/edit/user", method = RequestMethod.PATCH)
    public void editUser(@RequestBody Usuario usuario) {
        usuarioDAO.editUser(usuario);
    }

    @RequestMapping(value = "api/delete/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id) {
        usuarioDAO.deleteUser(id);
    }

    @RequestMapping(value = "api/add/user",method = RequestMethod.POST)
    public void addUser(@RequestBody Usuario usuario) {
        usuarioDAO.addUser(usuario);
    }


}
