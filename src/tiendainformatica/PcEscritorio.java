/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendainformatica;

/**
 *
 * @author Familia
 */
public class PcEscritorio extends computadora {
    
    private String marcaGabinete;
    private boolean pantalla;

    public PcEscritorio(String marcaGabinete, boolean pantalla, String modelo, int memRam, int almacenamiento, double precio, String marca) {
        super(modelo, memRam, almacenamiento, precio, marca);
        this.marcaGabinete = marcaGabinete;
        this.pantalla = pantalla;
    }

    public String getMarcaGabinete() {
        return marcaGabinete;
    }

    public void setMarcaGabinete(String marcaGabinete) {
        this.marcaGabinete = marcaGabinete;
    }

    public boolean isPantalla() {
        return pantalla;
    }

    public void setPantalla(boolean pantalla) {
        this.pantalla = pantalla;
    }
    
    @Override
    public double calcularPrecio(int stock){
        if (pantalla) {
            precio=(precio+(precio*0.2));
        } 
        if (stock>10) {
            
            precio=(precio-(precio*0.1));
            
        }
        return precio;
        
    }
    
    
}
