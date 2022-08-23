package com.jada2webaplication.bean;

import com.jada2webaplication.entity.PuntosCliente;
import com.jada2webaplication.facateImp.PuntosClienteImp;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("puntosClienteBean")
@ViewScoped
public class PuntosClienteBean implements Serializable{
    private List<PuntosCliente> puntosCliente;
    
    @Inject
    private PuntosClienteImp puntosImp;
    
    @PostConstruct
    public void init(){
        try {
            this.puntosCliente = this.puntosImp.findAll();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public List<PuntosCliente> getPuntosCliente() {
        return puntosCliente;
    }

    public void setPuntosCliente(List<PuntosCliente> puntosCliente) {
        this.puntosCliente = puntosCliente;
    }
    
    
    
}
