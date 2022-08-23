package com.jada2webaplication.facateImp;

import com.jada2webaplication.entity.Rol;
import com.jada2webaplication.facade.IRol;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Named
@ApplicationScoped
public class RolImp implements IRol {

    private List<Rol> listRoles = new ArrayList<Rol>();
    @PersistenceContext(unitName = "Jada2webaplicationPU")
    private EntityManager em;

    private Query q;

    @Override
    public List<Rol> findAll() throws Exception{
//        this.em.getTransaction().begin();
        this.q = this.em.createQuery("SELECT r FROM Rol r");
        this.listRoles = q.getResultList();
//        this.em.getTransaction().commit();
        return this.listRoles;
    }

    @Override
    public Rol findById(int id) throws Exception{
        Rol rol = new Rol();
        rol = this.em.find(Rol.class, id);
//        this.em.getTransaction().commit();
        return rol;
    }

    @Override
    public void add(Rol rol) throws Exception{
//        this.em.getTransaction().begin();
        this.em.persist(rol);
//        this.em.getTransaction().commit();
    }

    @Override
    public void update(Rol rol){
//        this.em.getTransaction().begin();
        this.em.merge(rol);
//        this.em.getTransaction().commit();
    }

    @Override
    public void delete(Rol rol) throws Exception{
        Rol r = new Rol();
        r = this.em.find(Rol.class, rol.getId_Rol());
        if (r != null) {
//        this.em.getTransaction().begin();
            this.em.remove(r);
//        this.em.getTransaction().commit();
        }
    }

}
