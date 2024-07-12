
package tiendainformatica;


public class computadora extends Producto {
    
    protected String modelo;
    protected int memRam;
    protected int almacenamiento;

    public computadora(String modelo, int memRam, int almacenamiento, double precio, String marca) {
        super(precio, marca);
        this.modelo = modelo;
        this.memRam = memRam;
        this.almacenamiento = almacenamiento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemRam() {
        return memRam;
    }

    public void setMemRam(int memRam) {
        this.memRam = memRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

     
    
}
