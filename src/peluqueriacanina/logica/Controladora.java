
package peluqueriacanina.logica;

import peluqueriacanina.persistencia.ControladoraPersistencia;


public class Controladora {
     ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String nombredueno, String celDueno, String alergico, String atencion) {
               
        // creamos el dueño y asignamos sus valores 
        
        Dueno dueno = new Dueno();
        dueno.setNombre(nombredueno);
        dueno.setCelDueno(celDueno);
       
        // creamos la mascota y asignamos sus valores
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencion);
        masco.setAtencion_especial(atencion);
        
        masco.setUnDueno(dueno); 
        
        //se llama a la persistencia desde la logica para que cree ambos en la base de datos (obj dueno y masco)
        
        controlPersis.guardar(dueno, masco);
        
    }
}
