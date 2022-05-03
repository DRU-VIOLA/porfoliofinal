
package com.PrimerApp.porfolio.Controller;

import com.PrimerApp.porfolio.Model.Persona;
import com.PrimerApp.porfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPersona {
     
        @Autowired
        private IPersonaService persoServ;
           
        @PostMapping ("/new/persona")
        public void agregarPersona (@RequestBody Persona pers){
          persoServ.crearPersona(pers);
        }
        
        @GetMapping ("/ver/personas")
        @ResponseBody
        public List<Persona> verPersonas () {
        return persoServ.verPersonas();
        }
        
        @DeleteMapping ("/delete/{id}")
        public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);}
        
        @PutMapping ("/editar/{id}")
        public void editarPersona(@PathVariable ("id") Long id, @RequestBody Persona pers){
                Persona persona = persoServ.buscarPersona(id);
        	persona.setNombre(pers.getNombre());
        	persona.setApellido(pers.getApellido());
                persona.setTelefono(pers.getTelefono());
                persona.setEmail(pers.getEmail());
                persona.setSobre_mi(pers.getSobre_mi());
                persona.setUrl_foto(pers.getUrl_foto());
                                
        	persoServ.editarPersona(pers);
              
        }
    
}
