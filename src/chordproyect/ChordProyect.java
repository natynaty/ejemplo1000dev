package chordproyect;

import Vista.VistaChords;
import Controlador.Controlador;

public class ChordProyect {
    
    public static void main(String[] args) {
        VistaChords frm = new VistaChords();
        Controlador con = new Controlador(frm);
        
       
        con.iniciar();
        con.fuentes();
        frm.setVisible(true);
    }
   
}
