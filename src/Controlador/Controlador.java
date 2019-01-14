
package Controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

//importar clases
import Vista.VistaChords;

public class Controlador {
    Font fuente, fuenteMenu;
    private VistaChords frm;
    
    public Controlador(VistaChords frm) {
        this.frm = frm;
        
        try {
            fuente = Font.createFont(Font.TRUETYPE_FONT, new File("PixelSansSerif.ttf")).deriveFont(12f);
            fuenteMenu = Font.createFont(Font.TRUETYPE_FONT, new File("PixelSansSerif.ttf")).deriveFont(10f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PixelSansSerif.ttf")));

        } catch (IOException | FontFormatException e) {
            fuente = new Font("Arial", Font.PLAIN, 14);
        }
    }
    
    public void iniciar (){
        frm.setTitle("Acordes de guitarra");
        frm.setLocationRelativeTo(null);
        //frm.tonalidad.setVisible(true);
        
        
    }
    
    public void fuentes(){
        //setting font
        frm.tonLabel.setFont(fuente);
        frm.domLabel.setFont(fuente);
        frm.subLabel.setFont(fuente);
        frm.chordLabel.setFont(fuente);
        frm.nameLabel.setFont(fuente);
        frm.menu.setFont(fuenteMenu);
        frm.tonList.setFont(fuente);
        frm.domList.setFont(fuente);
        frm.subList.setFont(fuente);
    }
    
}
