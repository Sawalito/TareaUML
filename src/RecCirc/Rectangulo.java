/*
 * Rojas Vazquez Saul Ubaldo}
 * 213927
 * 21/09/20223
 */

package RecCirc;

public class Rectangulo {
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double CalcularArea() {
		return base*altura;
	}
	
	public double CalcularPerimetro() {
		return 2*(base+altura);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("La base del rectangulo es : " + base + "\n");
		sb.append("La altura del rectangulo es : " + altura + "\n");
		return sb.toString();
	}
	
	public boolean equals(Rectangulo rectangulo) {
		if(rectangulo.getAltura()==altura && rectangulo.getBase()==base)
			return true;
		else
			return false;
	}
	
}
