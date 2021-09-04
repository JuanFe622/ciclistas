/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import views_pkg.FrameRegistro;

/**
 *
 * @author juanf.herrerac
 */
public class Ciclistas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion inst_con = new conexion();
        FrameRegistro inst_frame = new FrameRegistro();
        inst_con.getConnection();
        inst_frame.setVisible(true);
    }
    
}
