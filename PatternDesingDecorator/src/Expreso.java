/**
 * @author Pablo Emilio
 * @version 1.0
 * @created 04-dic.-2019 16:18:48
 */
public class Expreso extends Cafe {

    public Expreso(){
        this.precio = 1500;
    }

    @Override
    public String prepararCafe(){
        return "Café expreso"
                + "\nCosto: " + this.precio;
    }

    @Override
    public void calcularPrecio(double precio) {
        this.precio += precio;
    }
}//end Expreso