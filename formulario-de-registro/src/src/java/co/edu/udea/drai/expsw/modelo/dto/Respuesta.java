package co.edu.udea.drai.expsw.modelo.dto;
 
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andres Felipe Arrubla Z. <ax.fx.ax@gmail.com>
 */
@XmlRootElement
public class Respuesta {

    public static final String ERROR = "Error";
    public static final String LOGIN = "Login";
    public static final String INFO = "Info";
    /**
     * Mensaje que se va a enviar de objeto genérico adaptable para cualquier
     */
    private String mensaje;
    /**
     * Tipo de mensaje que se va a enviar
     */
    private String tipo;
   
    public Respuesta(){}

    public Respuesta(String mensaje) {
        this.mensaje = mensaje;
    }

    public Respuesta(String mensaje, String tipo) {
        this.mensaje = mensaje;
        this.tipo = tipo;
    }
   
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
}
