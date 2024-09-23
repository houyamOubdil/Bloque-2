/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloque2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author liberadosecretaria1
 */
public class Person {

    // declarar los atributos: 
        private int id; 
        private String name;
        private int age;
        private String dni;
        
    //Constructor: 
public Person(int id, String name, int age, String dni){
    this.id = id;
    this.name = name;
    this.age = age;
    this.dni = dni;
}

    // Getters and setters:
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDni() {
        return dni;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

public String toString(){
    return "Persona:"+ "id = " + id + "Nombre = " + name + "Edad = " + age + "Dni = " + dni;
}

    // Función para guardar objeto person en fichero Persona1: 
public static void guardarPersona(Person persona, String fileName) {
    try (FileOutputStream fileOut = new FileOutputStream(fileName);
         ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
        out.writeObject(persona);
        System.out.println("Persona guardada en " + fileName);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    // Función para recuperar objeto oPerson del fichero Persona1:
public static Person recuperarPersona(String fileName) {
    Person persona = null;
    try (FileInputStream fileIn = new FileInputStream(fileName);
         ObjectInputStream in = new ObjectInputStream(fileIn)) {
        persona = (Person) in.readObject();
        System.out.println("Persona recuperada de " + fileName);
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    return persona;
}

    
    
   
}

    



