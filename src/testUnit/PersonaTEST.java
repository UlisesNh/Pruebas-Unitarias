package testUnit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonaTEST {
	
	private Persona persona1 = new Persona("Griselo","Philip");
	private Persona persona2 = new Persona("Mausa","Araña");
	
     @Test
     void pruebasIndividuales() {
    	 assertEquals("Griselo", persona1.getNombre());
    	 assertEquals("Araña", persona2.getNombre());
     }
     
     @Test
 	void pruebasGrupales() {
 		assertAll("persona1",
 			() -> assertEquals("Griselo", persona1.getNombre()),
 			() -> assertEquals("Philip", persona1.getApellido())
 		);
 	}

     @Test
 	void pruebasFuncionLambda() {
 		assertAll("Persona",
 			() -> {
 				assertEquals("Griselo", persona1.getNombre());
 				assertEquals("Philip", persona1.getApellido());
 			},
 			() -> {
 				assertEquals("Mussa", persona2.getNombre());
 				assertEquals("Araña", persona2.getApellido());
 			}
 		);
 	}

}
