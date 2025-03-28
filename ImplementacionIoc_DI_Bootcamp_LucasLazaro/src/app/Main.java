package app;

public class Main {
    public static void main(String[] args) {
    	
        BaseDeDatos servicioUsuario = new ServicioUsuario();
        BaseDeDatos servicioProducto = new ServicioProducto();

        GestorAplicaciones gestorUsuario = new GestorAplicaciones(servicioUsuario);
        GestorAplicaciones gestorProducto = new GestorAplicaciones(servicioProducto);

        gestorUsuario.gestionar();
        gestorProducto.gestionar();
    }
}
