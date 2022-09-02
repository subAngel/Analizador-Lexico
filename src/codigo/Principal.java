
package codigo;

import java.io.File;

/**
 *
 * @author angel
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = "D:/7° Semestre/AUTOMATAS II/AnalizadorLexico/src/codigo/lexer.flex";
        generarLexer(ruta);
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
        
    }
}
