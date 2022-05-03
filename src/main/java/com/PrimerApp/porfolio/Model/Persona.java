
package com.PrimerApp.porfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
       
        private String nombre;
        private String apellido;
        private int telefono;
        private String email;
        private String sobre_mi;
        private String url_foto;
        
        
        
        public Persona (){
        }
        
       public Persona(Long id, String nombre, String apellido, int telefono, String email, String sobre_mi, String url_foto) {
           this.id = id;
           this.nombre = nombre;
           this.apellido= apellido;
           this.telefono= telefono;
           this.email= email;
           this.sobre_mi= sobre_mi;
           this.url_foto= url_foto;
       }
       
}
