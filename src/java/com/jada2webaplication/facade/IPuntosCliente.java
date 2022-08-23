package com.jada2webaplication.facade;

import com.jada2webaplication.entity.PuntosCliente;
import java.util.List;

public interface IPuntosCliente {
    
    public List<PuntosCliente> findAll() throws Exception;
    public PuntosCliente findById(int id) throws Exception;
    public void add(PuntosCliente rol) throws Exception;
    public void update(PuntosCliente rol) throws Exception;
    public void delete(PuntosCliente rol) throws Exception;
}
