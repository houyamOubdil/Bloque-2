/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leerimagen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeerImagen {

    public static void main(String[] args) {

        try {
            // Leer la imagen a traves de escribir su ruta:
            BufferedImage imagen = ImageIO.read(new File("C:\\Users\\liberadosecretaria1\\Downloads\\Android Studio fotos\\disney1.jpg"));

            // Crear un JFrame para mostrar la imagen
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(250, 250);

            // Crear un JLabel con la imagen
            JLabel label = new JLabel(new ImageIcon(imagen));
            JPanel panel = new JPanel();
            panel.add(label);
            frame.add(panel);

            // Hacer visible el JFrame
            frame.setVisible(true);

            System.out.println("Imagen leída y mostrada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se pudo leer la imagen.");
        }
    }
}
    
