/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador;

import java.io.File;

/**
 *
 * @author manny
 */
public class main {
    public static void main(String[] args) {
        String ruta = System.getProperty("user.dir")+"/src/analizador/lex.flex";
        generarLex(ruta);
        System.out.print(ruta);
    }
    public static void generarLex(String ruta){
        File file = new File(ruta);
        JFlex.Main.generate(file);
    }
}
