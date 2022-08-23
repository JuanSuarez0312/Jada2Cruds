package com.jada2webaplication.bean;

import com.jada2webaplication.entity.Usuario;
import com.jada2webaplication.facateImp.UsuarioImp;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("usuarioBean")
@ViewScoped
public class UsuarioBean implements Serializable {

    private List<Usuario> usuarios;

    @Inject
    private UsuarioImp usuarioImp;

    @PostConstruct
    public void init() {
        try {
            this.usuarios = this.usuarioImp.findAll();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    

}
