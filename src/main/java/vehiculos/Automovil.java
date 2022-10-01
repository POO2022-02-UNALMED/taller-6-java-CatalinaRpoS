package vehiculos;

public class Automovil extends Vehiculo{
	
	private int puestos;
	private static int cantidadAutomoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(nombre, 4, peso, placa, precio, 100, "FWD", fabricante);
		this.puestos = puestos;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}

	public static void setCantidadAutomoviles(int cantidadAutomoviles) {
		Automovil.cantidadAutomoviles = cantidadAutomoviles;
	}
}
