/**
 * @author Pablo Emilio
 * @version 1.0
 * @created 04-dic.-2019 16:18:45
 */
public abstract class CafeDecorator extends Cafe {

	protected Cafe cafeDecorator;

	public CafeDecorator(Cafe cafeDecorator){
            this.cafeDecorator = cafeDecorator;
	}

        @Override
	public String prepararCafe(){
            return this.cafeDecorator.prepararCafe();
	}
}//end CafeDecorator