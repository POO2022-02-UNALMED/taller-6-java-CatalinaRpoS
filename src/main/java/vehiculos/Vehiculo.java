package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	protected static int CantidadVehiculos;
	protected static ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();

	public Vehiculo(String nombre, int puertas, int peso, String placa, int precio, int velocidadMaxima, String traccion, Fabricante fabricante){
		this.nombre = nombre;
		this.puertas = puertas;
		this.peso = peso;
		this.placa = placa;
		this.precio = precio;
		this.velocidadMaxima = velocidadMaxima;
		this.traccion = traccion;
		this.fabricante = fabricante;


		// Acciones adicionales
		CantidadVehiculos += 1;
		listado.add(this);
		fabricante.getPais().aumentarVentas();
		fabricante.aumentarVentas();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}

	public static String vehiculosPorTipo(){
		return  "Automoviles: " + Automovil.getCantidadAutomoviles() + "\n" +
				"Camionetas: " + Camioneta.getCantidadCamionetas() + "\n" +
				"Camiones: " + Camion.getCantidadCamiones();
	}

	public static ArrayList<Vehiculo> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Vehiculo> listado) {
		Vehiculo.listado = listado;
	}
}
