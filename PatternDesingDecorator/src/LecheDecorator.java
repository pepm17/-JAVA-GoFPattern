/**
 * @author Pablo Emilio
 * @version 1.0
 * @created 04-dic.-2019 16:18:44
 */
public class LecheDecorator extends CafeDecorator {
    public LecheDecorator(Cafe cafeDecorator){        
        super(cafeDecorator);
        this.precio = 900;
    }

    @Override
    public String prepararCafe(){
        this.cafeDecorator.calcularPrecio(this.precio);
        return this.cafeDecorator.prepararCafe();        
    }

    @Override
    public void calcularPrecio(double precio) {}
}//end LecheDecorator