package co.edu.udea.drai.expsw.modelo.dto;
// Generated 11-jun-2014 8:26:52 by Hibernate Tools 3.6.0

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Usuario generated by hbm2java
 */
@XmlRootElement
public class Usuario  implements java.io.Serializable {


     private String cedula;
     private String nombres;
     private String apellidos;
     private String correo;
     private String programa;

    public Usuario() {
    }

    public Usuario(String cedula, String nombres, String apellidos, String correo, String programa) {
       this.cedula = cedula;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.correo = correo;
       this.programa = programa;
    }
   
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getPrograma() {
        return this.programa;
    }
    
    public void setPrograma(String programa) {
        this.programa = programa;
    }




}


