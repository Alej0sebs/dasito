/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicarprueba;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sebs
 */
public class Practicarprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Prueba de MiTabla");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            mitabla tabla = new mitabla();
            JScrollPane scroll = new JScrollPane(tabla);
            frame.add(scroll);
            frame.setLocationRelativeTo(null); 
            frame.setVisible(true);
        });
    }
    
}
