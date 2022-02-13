package com.cursojava.curso.controllers;


import com.cursojava.curso.dao.UsuarioDAO;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UsuarioController {

    @Autowired //Esta notacion automaticamente hace que la clase UsuarioDAOImpl se cree un objeto y la guarda en esta var
    private UsuarioDAO usuarioDAO;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUser(@PathVariable Long id) {
        Usuario user = new Usuario();
        user.setId(id);
        user.setNombre("Juan Jose");
        user.setApellido("Zarragoicoechea");
        user.setEmail("juanjozarra4896@gmail.com");
        user.setTelefono("2344506141");
        user.setPassword("admin");
        return user;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsers() {
        return usuarioDAO.getUsuarios();
    }

    @RequestMapping(value = "edit/user/{id}")
    public Usuario editUser(Long id) {
        Usuario user = new Usuario();
        user.setNombre("Juan Jose");
        user.setApellido("Zarragoicoechea");
        user.setEmail("juanjozarra4896@gmail.com");
        user.setTelefono("2344506141");
        user.setPassword("admin");
        return user;
    }

    @RequestMapping(value = "api/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id) {
        usuarioDAO.deleteUser(id);
    }

    @RequestMapping(value = "search/user/{id}")
    public Usuario searchUser(Long id) {
        Usuario user = new Usuario();
        user.setNombre("Juan Jose");
        user.setApellido("Zarragoicoechea");
        user.setEmail("juanjozarra4896@gmail.com");
        user.setTelefono("2344506141");
        user.setPassword("admin");
        return user;
    }


}
