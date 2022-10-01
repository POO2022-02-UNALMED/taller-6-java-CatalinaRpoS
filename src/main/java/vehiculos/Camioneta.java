package vehiculos;

public class Camioneta extends Vehiculo{

    private boolean volco;
    private static int cantidadCamionetas;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(nombre, puertas, peso, placa, precio, 90, "4X4", fabricante);
        this.volco = volco;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }

    public static void setCantidadCamionetas(int cantidadCamionetas) {
        Camioneta.cantidadCamionetas = cantidadCamionetas;
    }
}
