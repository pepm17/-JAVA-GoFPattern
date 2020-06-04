/**
 * @author Pablo Emilio
 * @version 1.0
 * @created 04-dic.-2019 16:18:47
 */
public class Late extends Cafe {

    public Late(){
        this.precio = 1000;
    }

    @Override
    public String prepararCafe(){        
        return "Café late"
                + "\nCosto: " + this.precio;
    }

    @Override
    public void calcularPrecio(double precio) {
        this.precio += precio;
    }
}