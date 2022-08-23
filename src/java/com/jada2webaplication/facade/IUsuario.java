package com.jada2webaplication.facade;

import com.jada2webaplication.entity.Usuario;
import java.util.List;

public interface IUsuario {
    public List<Usuario> findAll() throws Exception;
    public Usuario findById(int id) throws Exception;
    public void add(Usuario user) throws Exception;
    public void update(Usuario user) throws Exception;
    public void delete(Usuario user) throws Exception;
}
