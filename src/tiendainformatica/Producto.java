
package tiendainformatica;


public class Producto {
    
    protected double precio;
    protected String marca;

    public Producto(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    protected double calcularPrecio(int stock){
    
        if (stock >10) {
            precio=(precio*stock);
            return (precio-(precio*0.1));
            
        } else {
            return (precio*stock);
        }
    }
    
            
    
}
