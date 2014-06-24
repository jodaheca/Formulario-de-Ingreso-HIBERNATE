/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.drai.expsw.modelo.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author Usuario
 */
@XmlRootElement
@XmlSeeAlso({Usuario.class})
public class UsuarioList extends ArrayList<Usuario>{
    
    @XmlElement(name = "usuarios")
    public List<Usuario> getUsuarios() {
        return this;
    }
}
