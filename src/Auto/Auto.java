//Rojas Vazquez Saul Ubaldo
//213927
//23/09/2023

package Auto;

public class Auto {
	private static int clave=0;
	private String marca;
	private int anio;
	private int km;
	private String nombre;
	private String licencia;
	
	public Auto(String marca, int anio, int km) {
		super();
		clave++;
		this.marca = marca;
		this.anio = anio;
		this.km = km;
	}

	public int getClave() {
		return clave;
	}

	public String getMarca() {
		return marca;
	}

	public int getAnio() {
		return anio;
	}

	public int getKm() {
		return km;
	}

	public String getNombre() {
		return nombre;
	}

	public String getLicencia() {
		return licencia;
	}

	public boolean equals(Auto auto) {
		if(auto.getClave()== clave)
			return true;
		else
			return false;
	}
	
	public int CompareTo(Auto auto) {
		if(auto.getClave()>clave)
			return 1;
		else
			if(auto.getClave()<clave)
				return-1;
			else
				return 0;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("La clave es :"+ clave + "\n");
		sb.append("El arrendador es :"+ nombre + "\n");
		sb.append("La licencia del arrendador es :"+ licencia + "\n");
		sb.append("La marca es :"+ marca + "\n");
		sb.append("El anio es  :"+ anio + "\n");
		sb.append("Los km son :"+ km + "\n");
		return sb.toString();
	}
	
	public double RentaAuto(String nombre, String licencia,int dias) {
		double costo=0;
		if(anio<2005)
			costo=dias*200;
		else
			costo=dias*300;
		if(km<20000)
			costo += dias*20;
		return costo;
	}
	
	public void DevuelveAuto(int km) {
		this.km+= km;
		nombre=null;
		licencia = null;
	}
	
	
}
