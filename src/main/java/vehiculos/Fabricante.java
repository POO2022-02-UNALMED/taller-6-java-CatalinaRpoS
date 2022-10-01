package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int ventas;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Pais getPais() {
		return this.pais;
	}

	public int getVentas() {
		return ventas;
	}

	public void aumentarVentas(){
		this.ventas += 1;
	}
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public static Fabricante fabricaMayorVentas(){

		ArrayList<Vehiculo> listado = Vehiculo.getListado();
		int tam = listado.size();
		ArrayList<Integer> ventas = new ArrayList<>();
		int mayor;
		Fabricante masVendedor = null;

		for (Vehiculo vehiculo : listado) {
			ventas.add(vehiculo.getFabricante().getVentas());
		}

		Collections.sort(ventas);
		mayor = ventas.get(tam - 1);

		for (Vehiculo vehiculo: listado) {
			if (vehiculo.getFabricante().getVentas() == mayor){
				masVendedor = vehiculo.getFabricante();
			}
		}
		return masVendedor;
	}
}
