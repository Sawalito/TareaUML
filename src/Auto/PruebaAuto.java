package Auto;
import java.util.*;
public class PruebaAuto {
	public static void main(String[] args) {
		double p1;
		int dias;
		String licencia,nombre;
		Scanner scan = new Scanner(System.in);
		
		Auto a1,a2,a3,a4,a5;
		a1 = new Auto("BMW",2005,200);
		a2 = new Auto("Mercedes",2008,300);
		a3 = new Auto("Lamborghini",2010,400);
		a4 = new Auto("BurgerMovil",2025,200);
		a5 = new Auto("ItamMovil",2000,10000);
		
		System.out.println("Ingrese el numero de días que quiere rentar el auto");
		dias = scan.nextInt();
		System.out.println("Ingrese su licencia");
		licencia = scan.next();
		System.out.println("Ingrese su nombre");
		nombre = scan.next();
		p1 = a1.RentaAuto(nombre, licencia, dias);
		System.out.println("El precio de la renta del primer auto es: "+p1);
		
		System.out.println("Ingrese el numero de días que quiere rentar el auto");
		dias = scan.nextInt();
		System.out.println("Ingrese su licencia");
		licencia = scan.next();
		System.out.println("Ingrese su nombre");
		nombre = scan.next();
		p1 = a2.RentaAuto(nombre, licencia, dias);
		System.out.println("El precio de la renta del segundo auto es: "+p1);
		
		
		a2.DevuelveAuto(12345);
		System.out.println(a2.toString());
		
		
		
		
			
	}
}
