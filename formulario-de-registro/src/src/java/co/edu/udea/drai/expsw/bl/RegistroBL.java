package co.edu.udea.drai.expsw.bl;

import co.edu.udea.drai.expsw.modelo.dao.impl.UsuarioDAO;
import co.edu.udea.drai.expsw.modelo.dto.Respuesta;
import co.edu.udea.drai.expsw.modelo.dto.Usuario;

/**
 *
 * @author Usuario
 */
public class RegistroBL {
    
    private UsuarioDAO usuarioDAO;
    
    public Object registrar(Usuario usuario){
        
        if (usuario == null)
            return new Respuesta("Usuario Null", Respuesta.ERROR);
        
        usuarioDAO = new UsuarioDAO();
        usuarioDAO.registrarUsuario(usuario);
        
        return new Respuesta("Usuario successfully saved", Respuesta.INFO);
    }
    
}
