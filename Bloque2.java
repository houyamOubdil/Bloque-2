/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bloque2;

//import static com.mycompany.bloque2.Person.Person.guardarPersona;
//import static com.mycompany.bloque2.Person.Person.recuperarPersona;
import java.io.File;

/**
 *
 * @author liberadosecretaria1
 */
public class Bloque2 {

    public static void main(String[] args) {
    
    // Crear una nueva Persona y asiggnarle valores a sus atributos:
    Person persona = new Person(1, "Soultan", 29, "98712356X");

    // Crear un nuevo fichero Persona1 y guardar en ello el objeto person:
        File fichero = new File("C:\\Users\\liberadosecretaria1\\Documents\\Bloque 2\\Persona1");
        Person.guardarPersona(persona, "Persona1");

    // Recuperar el objeto Persona del fichero
    Person personaRecuperada = Person.recuperarPersona("Persona1");
    System.out.println("Antes de modificar: " + personaRecuperada);

    // Modificar las propiedades de la Persona
    if (personaRecuperada != null) {
        personaRecuperada.setName("Soultan Modificado");
        personaRecuperada.setAge(20);

    // Volver a guardar el objeto modificado en el fichero
        Person.guardarPersona(personaRecuperada, "Persona1");

    // Recuperar y mostrar el objeto modificado
        Person personaModificada = Person.recuperarPersona("Persona1");
        System.out.println("Después de modificar: " + personaModificada);
    }
    }
}
