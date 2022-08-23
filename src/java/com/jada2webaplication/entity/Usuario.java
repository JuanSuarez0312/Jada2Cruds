package com.jada2webaplication.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Usuario;
    @Column(name = "Contraseña")
    private String contraseña;
    @Column(name = "Nombre")
    private String nomUsuario;
    @Column(name = "Apellido")
    private String apeUsuario;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Direccion")
    private String direccion;
    
    @ManyToOne
    @JoinColumn(name = "Id_Rol", referencedColumnName = "Id_Rol")
    private Rol IdRolFk;
    
    @OneToOne(mappedBy = "IdUsuarioFk")
    private List<PuntosCliente> listPuntosCliente;
   

    public Usuario() {
    }

    public Usuario(int Id_Usuario, String contraseña, String nomUsuario, String apeUsuario, String correo, String telefono, String direccion, Rol IdRolFk, List<PuntosCliente> listPuntos) {
        this.Id_Usuario = Id_Usuario;
        this.contraseña = contraseña;
        this.nomUsuario = nomUsuario;
        this.apeUsuario = apeUsuario;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.IdRolFk = IdRolFk;
        this.listPuntosCliente = listPuntos;
    }
    

    public List<PuntosCliente> getListPuntosCliente() {
        return listPuntosCliente;
    }

    public void setListPuntosCliente(List<PuntosCliente> listPuntosCliente) {
        this.listPuntosCliente = listPuntosCliente;
    }



    public int getId() {
        return Id_Usuario;
    }

    public void setId(int id) {
        this.Id_Usuario = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getApeUsuario() {
        return apeUsuario;
    }

    public void setApeUsuario(String apeUsuario) {
        this.apeUsuario = apeUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Rol getIdRolFk() {
        return IdRolFk;
    }

    public void setIdRolFk(Rol idRolFk) {
        this.IdRolFk = idRolFk;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }   
    
}
