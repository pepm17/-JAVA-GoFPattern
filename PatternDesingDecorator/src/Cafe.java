/**
 * @author Pablo Emilio
 * @version 1.0
 * @created 04-dic.-2019 16:18:49
 */
public abstract class Cafe {
    
    protected double precio;

    public Cafe() {
        this.precio = 0;
    }
    
    public abstract String prepararCafe();
    public abstract void calcularPrecio(double precio);
}