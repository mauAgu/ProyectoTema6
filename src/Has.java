    
public class Has { 
    int dato;
    int estado;  
    String nombre; 
    int nc; 
    int prom; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNc() {
        return nc;
    }

    public void setNc(int Nc) {
        this.nc = Nc;
        
    }

    public int getProm() {
        return prom;
    }

    public void setProm(int prom) {
        this.prom = prom;
    }
   

    static int funcion(int n, int m) {
  
        return ((n + 1) % m);
    }
    

   public static void insertaHas(Has[] h, int m, int n, String nombre, int prom) {
        boolean i = false;
        int j = funcion(n, m);
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                h[j].dato = n;
                h[j].nombre=nombre;   
                h[j].prom=prom; 
                h[j].estado = 2;
                
                
                i = true;
            } else {
                j++;
            }
        } while (j < m && !i);
        if (i) {
            javax.swing.JOptionPane.showMessageDialog(null, "¡Elemento insertado con éxito!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "¡Tabla llena!");
        }
    }

 public static int buscaHas(Has[] h, int m, int n) {
        int j = funcion(n, m);
        while (j < m) {
            if (h[j].estado == 0) {
                return -1;
            } else if (h[j].dato == n) {
                if (h[j].estado == 1) {
                    return -1;
                } else {
                    return j;
                }
            } else {
                j++;
            }
        }
        return -1;
    }
 
   static int eliminaHas(Has[] h, int m, int n) {
        int i = buscaHas(h, m, n);
        if (i == -1) {
            return -1;
        } else {
            h[i].estado = 1;
            return 1;
        }
    }

    
}
