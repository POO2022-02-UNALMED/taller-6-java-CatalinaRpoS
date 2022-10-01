package vehiculos;

public class Camion extends Vehiculo{

    private int ejes;
    private static int cantidadCamiones;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        super(nombre, 2, peso, placa, precio, 80, "4X2", fabricante);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getCantidadCamiones() {
        return cantidadCamiones;
    }

    public static void setCantidadCamiones(int cantidadCamiones) {
        Camion.cantidadCamiones = cantidadCamiones;
    }
}
