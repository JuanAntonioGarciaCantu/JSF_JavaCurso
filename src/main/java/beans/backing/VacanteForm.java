// Backing bean -> realiza las funciones parecidas a un controlador 
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named //indica que es un bean CDI
@RequestScoped //alcance de la información
public class VacanteForm {
    
    @Inject //injecta el bean de Candidato para poder usarlo
    private Candidato candidato;
    
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    //realiza el redireccionamiento a otra pagina de acuerdo al nombre
    //del candidato
    public String enviar() {
        if(this.candidato.getNombre().equals("Juan")) {
            return "exito";
        }else {
            return "fallo";
        }
    }
    
}
