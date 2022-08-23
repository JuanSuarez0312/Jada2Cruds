//package com.jada2webaplication.entity;
//
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//@Entity
//@Table(name = "pqrs")
//public class Pqr implements Serializable{
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int Id_Pqrs;
//    @Column(name = "Tipo_Pqrs")
//    private String Tipo;
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "Fecha_Inicial")
//    private Date fechaInicial;
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "Fecha_Maxima_Respuesta")
//    private Date fechaMaxRespuesta;
//    @Column(name = "Descripcion_Pqrs")
//    private String descPqrs;
//    @Column(name = "Estado")
//    private String estado;
//    @Column(name = "Soporte")
//    private String soporte;
//    
//    @ManyToOne
//    @JoinColumn(name = "Id_UsuarioFk", referencedColumnName = "Id_Usuario")
//    private Usuario Id_Usuario;
//    
//    @ManyToOne
//    @JoinColumn(name = "Id_VentaFk", referencedColumnName = "Id_Venta")
//    private Venta Id_Venta;
//
//    public Pqr() {
//    }
//
//    public Pqr(int Id_Pqrs, String Tipo, Date fechaInicial, Date fechaMaxRespuesta, String descPqrs, String estado, String soporte, Usuario Id_Usuario, Venta Id_Venta) {
//        this.Id_Pqrs = Id_Pqrs;
//        this.Tipo = Tipo;
//        this.fechaInicial = fechaInicial;
//        this.fechaMaxRespuesta = fechaMaxRespuesta;
//        this.descPqrs = descPqrs;
//        this.estado = estado;
//        this.soporte = soporte;
//        this.Id_Usuario = Id_Usuario;
//        this.Id_Venta = Id_Venta;
//    }
//
//    public int getId_Pqrs() {
//        return Id_Pqrs;
//    }
//
//    public void setId_Pqrs(int Id_Pqrs) {
//        this.Id_Pqrs = Id_Pqrs;
//    }
//
//    public String getTipo() {
//        return Tipo;
//    }
//
//    public void setTipo(String Tipo) {
//        this.Tipo = Tipo;
//    }
//
//    public Date getFechaInicial() {
//        return fechaInicial;
//    }
//
//    public void setFechaInicial(Date fechaInicial) {
//        this.fechaInicial = fechaInicial;
//    }
//
//    public Date getFechaMaxRespuesta() {
//        return fechaMaxRespuesta;
//    }
//
//    public void setFechaMaxRespuesta(Date fechaMaxRespuesta) {
//        this.fechaMaxRespuesta = fechaMaxRespuesta;
//    }
//
//    public String getDescPqrs() {
//        return descPqrs;
//    }
//
//    public void setDescPqrs(String descPqrs) {
//        this.descPqrs = descPqrs;
//    }
//
//    public String getEstado() {
//        return estado;
//    }
//
//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
//
//    public String getSoporte() {
//        return soporte;
//    }
//
//    public void setSoporte(String soporte) {
//        this.soporte = soporte;
//    }
//
//    public Usuario getId_Usuario() {
//        return Id_Usuario;
//    }
//
//    public void setId_Usuario(Usuario Id_Usuario) {
//        this.Id_Usuario = Id_Usuario;
//    }
//
//    public Venta getId_Venta() {
//        return Id_Venta;
//    }
//
//    public void setId_Venta(Venta Id_Venta) {
//        this.Id_Venta = Id_Venta;
//    }
//    
//    
//    
//    
//}
