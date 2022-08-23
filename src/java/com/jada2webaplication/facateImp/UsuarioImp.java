package com.jada2webaplication.facateImp;

import com.jada2webaplication.entity.Usuario;
import com.jada2webaplication.facade.IUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Named
@ApplicationScoped
public class UsuarioImp implements IUsuario {

    private List<Usuario> listUsuarios = new ArrayList<Usuario>();
    @PersistenceContext(unitName = "Jada2webaplicationPU")
    private EntityManager em;

    private Query q;

    @Override
    public List<Usuario> findAll() throws Exception {
        this.q = this.em.createQuery("SELECT u FROM Usuario u");
        this.listUsuarios = q.getResultList();
        return this.listUsuarios;

    }

    @Override
    public Usuario findById(int id) throws Exception {
        Usuario usuario = new Usuario();
        usuario = this.em.find(Usuario.class, id);
        return usuario;
    }

    @Override
    public void add(Usuario user) throws Exception {
        this.em.persist(user);
    }

    @Override
    public void update(Usuario user) throws Exception {
        this.em.merge(user);

    }

    @Override
    public void delete(Usuario user) throws Exception {
        Usuario u = new Usuario();
        u = this.em.find(Usuario.class, user.getId());
        if (u != null) {
            this.em.remove(u);
        }
    }

}
