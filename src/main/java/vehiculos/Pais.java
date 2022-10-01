package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	
	private String nombre;
	private int ventas;
	
	public Pais(String nombre){
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public void aumentarVentas(){
		this.ventas += 1;
	}

	public static Pais paisMasVendedor(){

		ArrayList<Vehiculo> listado = Vehiculo.getListado();
		int tam = listado.size();
		ArrayList<Integer> ventas = new ArrayList<>();
		int mayor;
		Pais masVendedor = null;

		for (Vehiculo vehiculo : listado) {
			ventas.add(vehiculo.getFabricante().getPais().getVentas());
		}

		Collections.sort(ventas);
		mayor = ventas.get(tam - 1);

		for (Vehiculo vehiculo: listado) {
			if (vehiculo.getFabricante().getPais().getVentas() == mayor){
				masVendedor = vehiculo.getFabricante().getPais();
			}
		}
		return masVendedor;
	}
}
