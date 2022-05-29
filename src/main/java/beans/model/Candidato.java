//*** MANAGED BEAN *** -> modelo para almacenara la informacion de la pagina HTML

package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named // indica que es es un bean CDI
@RequestScoped // alcance de la informacion
public class Candidato {
    private String nombre = "Introduce tu nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
