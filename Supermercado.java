public package supermercado;
import javax.swing.JOptionPane;
public class Supermercado {
    public static void main(String[] args){
        ClsSupermercado aurrera = new ClsSupermercado();
        aurrera.tamanoVectores();
        int RepetirMenu = 0;
        while(RepetirMenu <= 0 || RepetirMenu >4){
             int opc = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción del menú:\n"
            + "1.- Agregr producto.\n"
            + "2.- Mostrar carrito.\n"
            + "3.- Total.\n"
            + "4.- Eliminar cantidad de producto.\n"
            + "5.- Salir."));
            switch(opc){
                case 1:
                    aurrera.llenarDatos();
                    RepetirMenu = 0;
                    break;
                case 2:
                    aurrera.carrito();
                    RepetirMenu = 0;
                    break;
                case 3:
                    aurrera.Total();
                    RepetirMenu = 0;
                    break;
                case 4:
                    aurrera.EliminarCantidad();
                    RepetirMenu = 0;
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "De nada vuelva pronto...");
                    RepetirMenu = 1;
                    break;
                }
            }
    }
}



//CLASE

package supermercado;
import javax.swing.JOptionPane;
public class ClsSupermercado {  
    public String[] menu;
    public int np;
    public String nombreproducto[];
    public int cantidadproducto[];
    public float precioproducto[];
    public void tamanoVectores(){
        np = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos quieres comprar?"));
        nombreproducto = new String[np];
        cantidadproducto = new int [np];
        precioproducto = new float[np];
    }
    public void llenarDatos(){
        for(int i=0;i<np;i++){
            nombreproducto[i] = JOptionPane.showInputDialog("Digita el nombre del producto #"+"["+(i+1)+"]:" );
            cantidadproducto[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de "+nombreproducto[i]+":"));
            precioproducto[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita el precio de "+nombreproducto[i]+" $:"));
        }
        String mostrarMatriz = "";
            for(int i=0;i<np;i++){
                mostrarMatriz += "Prod:  Cant:  Prec:";
                mostrarMatriz += "\n";
                mostrarMatriz += nombreproducto[i];
                mostrarMatriz += "     ";
                mostrarMatriz += cantidadproducto[i];
                mostrarMatriz += "      ";
                mostrarMatriz += precioproducto[i];
                mostrarMatriz += "       ";
                mostrarMatriz += "\n";
                mostrarMatriz += "\n";
            }
            JOptionPane.showMessageDialog(null, "PRODUCTO'S AGREGADOS AL CARRITO:\n"+"\n"+mostrarMatriz);
    }
    public float Total(){
        float total=0;
        for(int i=0;i<np;i++){
            total = cantidadproducto[i] * precioproducto[i];
            JOptionPane.showMessageDialog(null, "El total de '"+nombreproducto[i]+"'"+" es de: $"+total);
        }
        return total;
    }
    public void EliminarCantidad(){
        int d=0;
        for(int t=0;t<np;t++){
         d=cantidadproducto[t];
         if(d==0){
             JOptionPane.showMessageDialog(null, "No hay productos para eliminar cantidad");
         }else{
             String productoAbuscar = JOptionPane.showInputDialog("¿De que producto quieres eliminar cantidad?");
        String aux = "";
        int x=0;
        for(int i=0;i<np;i++){
            if(nombreproducto[i].equals(productoAbuscar)){
                aux = nombreproducto[i];
                x=i;
              }
        }
        if(aux.equals(productoAbuscar)){
            int Cantidadeliminar = Integer.parseInt(JOptionPane.showInputDialog("Indica la cantidad a eliminar:"));
            
            
            if(Cantidadeliminar > cantidadproducto[x]){
                JOptionPane.showMessageDialog(null, "No puedes eliminar mas cantidaes de las que actualmente no llevas");
            }
            else{
                cantidadproducto[x] = cantidadproducto[x] - Cantidadeliminar;
                JOptionPane.showMessageDialog(null, "Cantidad ("+Cantidadeliminar+")"+" retirada con éxito!");
                
                String mostrarMatriz = "";
                for(int i=0;i<np;i++){
                    mostrarMatriz += "Prod:  Cant:  Prec:";
                    mostrarMatriz += "\n";
                    mostrarMatriz += nombreproducto[i];
                    mostrarMatriz += "     ";
                    mostrarMatriz += cantidadproducto[i];
                    mostrarMatriz += "      ";
                    mostrarMatriz += precioproducto[i];
                    mostrarMatriz += "       ";
                    mostrarMatriz += "\n";
                    mostrarMatriz += "\n";
                }
                JOptionPane.showMessageDialog(null, "PRODUCTO'S AGREGADOS AL CARRITO:\n"+"\n"+mostrarMatriz);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "EL PRODUCTO INGRESADO NO EXISTE EN EL CARRITO!");
        }
         }
        }
    }
    public void carrito(){
        String mostrarMatriz = "";
        for(int i=0;i<np;i++){
            mostrarMatriz += "Prod:  Cant:  Prec:";
            mostrarMatriz += "\n";
            mostrarMatriz += nombreproducto[i];
            mostrarMatriz += "     ";
            mostrarMatriz += cantidadproducto[i];
            mostrarMatriz += "      ";
            mostrarMatriz += precioproducto[i];
            mostrarMatriz += "       ";
            mostrarMatriz += "\n";
            mostrarMatriz += "\n";
        }
        JOptionPane.showMessageDialog(null, "PRODUCTO'S AGREGADOS AL CARRITO:\n"+"\n"+mostrarMatriz);
    }
} Supermercado {
    
}
