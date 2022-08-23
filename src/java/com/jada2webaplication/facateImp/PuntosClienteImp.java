package com.jada2webaplication.facateImp;

import com.jada2webaplication.entity.PuntosCliente;
import com.jada2webaplication.facade.IPuntosCliente;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Named
@ApplicationScoped
public class PuntosClienteImp implements IPuntosCliente {

    private List<PuntosCliente> listPuntosClientes = new ArrayList<PuntosCliente>();
    @PersistenceContext(unitName = "Jada2webaplicationPU")
    private EntityManager em;
    
    private Query q;

    @Override
    public List<PuntosCliente> findAll() throws Exception {
        this.q = this.em.createQuery("SELECT pu FROM puntos_cliente pu");
        this.listPuntosClientes = q.getResultList();
        return this.listPuntosClientes;
    }

    @Override
    public PuntosCliente findById(int id) throws Exception {
        PuntosCliente puntosCliente = new PuntosCliente();
        puntosCliente = this.em.find(PuntosCliente.class, id);
        return puntosCliente;
    }

    @Override
    public void add(PuntosCliente puntosCliente) throws Exception {
        this.em.persist(puntosCliente);
    }

    @Override
    public void update(PuntosCliente puntosCliente) throws Exception {
        this.em.merge(puntosCliente);
    }

    @Override
    public void delete(PuntosCliente puntosCliente) throws Exception {
        PuntosCliente pc = new PuntosCliente();
        pc = this.em.find(PuntosCliente.class, puntosCliente.getIdUsuario());
        if (pc != null) {
            this.em.remove(pc);
        }
    }

}
