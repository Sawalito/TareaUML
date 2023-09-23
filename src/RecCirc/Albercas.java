//Rojas Vázquez Saul Ubaldo
//213927
//21/09/2023

package RecCirc;
import java.util.*;

public class Albercas {

	public static void main(String[] args) {
		
		Circulo circulo= new Circulo();
		Rectangulo rectangulo= new Rectangulo();
		Scanner scan = new Scanner(System.in);
		
		double radio,altura,cilindro;
		
		System.out.println("De que radio sera su alberca?");
		radio= scan.nextDouble();
		System.out.println("Que altura tednra su alberca?");
		altura= scan.nextDouble();
		
		circulo.setRadio(radio);
		rectangulo.setAltura(altura);
		rectangulo.setBase(circulo.CalcularPerimetro());
		cilindro = rectangulo.CalcularArea();
		System.out.println(cilindro);
	}

}
