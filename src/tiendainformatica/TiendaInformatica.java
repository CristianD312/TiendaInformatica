
package tiendainformatica;


public class TiendaInformatica {

    
    public static void main(String[] args) {
        
        computadora compu1 = new computadora("gamer", 8, 512, 5000, "Lenovo");
        
        System.out.println("el costo del producto es: $"+compu1.calcularPrecio(4)); 
        
        PcEscritorio pc1 = new PcEscritorio("Sentey", true, "comun", 4, 254, 2500, "generico");
        
        System.out.println("el precio del producto es"+pc1.calcularPrecio(4));   
  
        
    }
    
}
