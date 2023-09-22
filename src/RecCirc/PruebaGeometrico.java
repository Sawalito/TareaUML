/*
 * Rojas Vazquez Saul Ubaldo}
 * 213927
 * 21/09/20223
 */

package RecCirc;

public class PruebaGeometrico {

	public static void main(String[] args) {
		
		//Con constructor y parametros
		Rectangulo rectangulo = new Rectangulo(12,14);
		Circulo circulo = new Circulo(1);
		
		
		System.out.println(rectangulo.CalcularArea());
		System.out.println(rectangulo.CalcularPerimetro());
		
		System.out.println(circulo.CalcularArea());
		System.out.println(circulo.CalcularPerimetro());
		
		//Con constructir sin parametros
		
		Rectangulo rectangulo1 = new Rectangulo();
		Circulo circulo1 = new Circulo();
		
		rectangulo1.setAltura(12);
		rectangulo1.setBase(14);
		
		circulo1.setRadio(1);
		
		System.out.println(rectangulo1.CalcularArea());
		System.out.println(rectangulo1.CalcularPerimetro());
		
		System.out.println(circulo1.CalcularArea());
		System.out.println(circulo1.CalcularPerimetro());
		
		System.out.println(rectangulo.toString());
		System.out.println(circulo.toString());
		
		System.out.println(rectangulo.equals(rectangulo1));
		System.out.println(circulo.equals(circulo1));
		
	}
}
