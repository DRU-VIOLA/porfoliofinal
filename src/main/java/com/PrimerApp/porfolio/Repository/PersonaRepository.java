
package com.PrimerApp.porfolio.Repository;

import com.PrimerApp.porfolio.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
     public void save(Long id);
    
}
