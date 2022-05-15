package beans.configuration;

//Configuracion de JSF para la construccion de beans 

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

//Agregar anotaciones

@FacesConfig(
    //Activa CDI build-in beans
    version = JSF_2_3
)
@ApplicationScoped
public class ConfigurationJSF {
    
}
