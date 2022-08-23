package com.jada2webaplication.bean;

import com.jada2webaplication.entity.Rol;
import com.jada2webaplication.facateImp.RolImp;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("rolBean")
@ViewScoped
public class RolBean implements Serializable{
    private List<Rol> roles;

    @Inject
    private RolImp rolImp;
    
    @PostConstruct
    public void init(){
        try {
        this.roles = this.rolImp.findAll();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
    
    
}
