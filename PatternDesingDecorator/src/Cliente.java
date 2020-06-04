
import javax.swing.JOptionPane;

/**
 * @author Pablo Emilio
 * @version 1.0
 * @created 04-dic.-2019 16:18:49
 */
public class Cliente {

    public static void main(String[] args) {
        Cafe cafe;
        Cafe adicional;
        String tipoCafe = "";
        String tipo = "";
        String adicion = "";
        
        while(!"3".equals(tipo)){
            tipo = JOptionPane.showInputDialog(null, "¿Qué tipo de café desea pedir?"
                    + "\n1. Late"
                    + "\n2. Expreso"
                    + "\n3. Salir");
            if("1".equals(tipo) || "2".equals(tipo)){
                adicion = JOptionPane.showInputDialog(null, "¿Desea un adicional?"
                    + "\n1. Leche"
                    + "\n2. Chocolate"
                    + "\n3. Ambos"
                    + "\n4. Ninguno");                
            }           
            switch(tipo){
                case "1":{
                    cafe = new Late();                    
                    if("1".equals(adicion)){
                        adicional = new LecheDecorator(cafe);
                        tipoCafe = adicional.prepararCafe() + "\nAdicional de leche";
                    }
                    else if("2".equals(adicion)){
                        adicional = new ChocolateDecorator(cafe);
                        tipoCafe = adicional.prepararCafe() + "\nAdicional de chocolate";
                    }
                    else if("3".equals(adicion)){
                        adicional = new ChocolateDecorator(cafe);
                        adicional.prepararCafe();
                        adicional = new LecheDecorator(cafe);
                        tipoCafe = adicional.prepararCafe() + "\nAdicional de leche y chocolate";
                    }
                    else if("4".equals(adicion)) tipoCafe = cafe.prepararCafe();
                    JOptionPane.showMessageDialog(null, tipoCafe);
                    break;
                }
                case "2":{
                    cafe = new Expreso();                    
                    if("1".equals(adicion)){
                        adicional = new LecheDecorator(cafe);
                        tipoCafe = adicional.prepararCafe() + "\nAdicional de leche";
                    }
                    else if("2".equals(adicion)){
                        adicional = new ChocolateDecorator(cafe);
                        tipoCafe = adicional.prepararCafe() + "\nAdicional de chocolate";
                    }
                    else if("3".equals(adicion)){
                        adicional = new ChocolateDecorator(cafe);
                        adicional.prepararCafe();
                        adicional = new LecheDecorator(cafe);
                        tipoCafe = adicional.prepararCafe() + "\nAdicional de leche y chocolate";
                    }
                    else if("4".equals(adicion)) tipoCafe = cafe.prepararCafe();
                    JOptionPane.showMessageDialog(null, tipoCafe);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }
        }
    }
}