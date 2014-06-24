package co.edu.udea.drai.expsw.ws;

import co.edu.udea.drai.expsw.bl.RegistroBL;
import co.edu.udea.drai.expsw.modelo.dto.Respuesta;
import co.edu.udea.drai.expsw.modelo.dto.Usuario;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Usuario
 */
@Path("Usuario")
public class UsuarioWS {
    
      @POST
      @Produces(MediaType.APPLICATION_JSON)
      @Consumes(MediaType.APPLICATION_JSON)
      public Object registrarUsuario(Usuario usuario){
          return new RegistroBL().registrar(usuario);
      }
      
      
      @GET
      @Produces(MediaType.APPLICATION_JSON)
      @Consumes(MediaType.APPLICATION_JSON)
      public Object hello(){
          return new Respuesta("Hello WS", Respuesta.INFO);
      }
    
          
                    
}
