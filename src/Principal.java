
import javax.swing.JOptionPane;

public class Principal {
    
     public static void main(String[] args) {
        try {
            int i, n, resp;
            int m = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el numero de alumnos que desea insertar"));
         
            Has[] h = new Has[m];
            for (i = 0; i < m; i++) {
                h[i] = new Has(); 
                h[i].estado = 0;
            }
            do { 
                
                resp = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Menú Principal "
                        + "\n1.Insertar \n2.Buscar  \n3. Eliminar \n4.Salir "));
                switch (resp) {
                    
                    case 1:
                      
                  String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                 int prom =  Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el promedio"));
         
                   n=  Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el N.control del estudiante"));
         
         
                     Has.insertaHas(h, m, n, nombre, prom);
                        break;
                        
                    case 2:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el Numero de control a ser buscado:"));
                       i = Has.buscaHas(h, m, n); 
                        if (i== -1) { 
                            javax.swing.JOptionPane.showMessageDialog(null, "Numero no encontrado");
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(null, "Numero encontrado"); 
                         
                        }
                             break; 
                        
                        
                    case 3:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el número a ser eliminado de la tabla:"));
                       i = Has.eliminaHas(h, m, n); 
                     
                        if (i == -1) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número de control no eliminado");
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número de control eliminado  ");
                        }
                        break;
                    case 4:
                        System.exit(0);
                    
                    default:
                        
                    
                        break ;
                }
            } while (resp != 4);
        } catch (NumberFormatException nfe) {
            javax.swing.JOptionPane.showMessageDialog(null, "Está Saliendo del Programa");
        } catch (OutOfMemoryError ome) {
            javax.swing.JOptionPane.showMessageDialog(null, "No Hay Espacio");
        }
    }
}


    

