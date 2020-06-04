/**
 * @author Pablo Emilio
 * @version 1.0
 * @created 04-dic.-2019 16:18:42
 */
public class ChocolateDecorator extends CafeDecorator {

    public ChocolateDecorator(Cafe cafeDecorator){
        super(cafeDecorator);
        this.precio = 600;
    }

    @Override
    public String prepararCafe(){
        this.cafeDecorator.calcularPrecio(this.precio);
        return this.cafeDecorator.prepararCafe();
    }

    @Override
    public void calcularPrecio(double precio) {}
}//end ChocolateDecorator