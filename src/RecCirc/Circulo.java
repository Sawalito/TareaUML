/*
 * Rojas Vazquez Saul Ubaldo}
 * 213927
 * 21/09/20223
 */

package RecCirc;

public class Circulo {
	private double radio;
	private static double pi= Math.PI;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public Circulo() {
		// TODO Auto-generated constructor stub
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double CalcularArea() {
		return pi*radio*radio;
	}
	
	public double CalcularPerimetro()
	{
		return 2*pi*radio;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("El radio del circulo es : " + radio);
		return sb.toString();
	}
	
	public boolean equals(Circulo circulo) {
		if(circulo.getRadio()==radio)
			return true;
		else
			return false;
	}
	
	
}
