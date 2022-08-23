package com.jada2webaplication.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "puntoscliente")
public class PuntosCliente implements Serializable {

    private static final long SerialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Usuario;
    @Column(name = "Cantidad_Puntos")
    private int cantidadPuntos;
    
    @OneToOne
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    private Usuario IdUsuarioFk;

    public PuntosCliente() {
    }

    public PuntosCliente(int Id_Usuario, int cantidadPuntos, Usuario IdUsuarioFk) {
        this.Id_Usuario = Id_Usuario;
        this.cantidadPuntos = cantidadPuntos;
        this.IdUsuarioFk = IdUsuarioFk;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    public Usuario getIdUsuario() {
        return IdUsuarioFk;
    }

    public void setIdUsuario(Usuario IdUsuarioFk) {
        this.IdUsuarioFk = IdUsuarioFk;
    }
    
    
}
