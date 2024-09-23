/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crearficherobloque2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CrearFicheroBloque2 {

    public static void main(String[] args) {
       File file=new File("C:\\Users\\liberadosecretaria1\\Documents\\NetBeansProjects\\CrearFicheroBloque2\\PruebaDeTexto.txt");
try {
FileWriter fileWriter= new FileWriter(file);
fileWriter.write("Esto es un texto de prueba, Estamos creando nuestro primer fichero de texto https://codigonline.com ");
System.out.println("Fichero creado y contenido escrito exitosamente");
fileWriter.close();
} catch (IOException e) {
System.err.println("Error de apertura/escritura" + file.getName());
}
    }
}
