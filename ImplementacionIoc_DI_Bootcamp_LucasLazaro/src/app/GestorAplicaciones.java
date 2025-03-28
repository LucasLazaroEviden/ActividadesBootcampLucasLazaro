package app;

public class GestorAplicaciones {
    private BaseDeDatos baseDeDatos;

    public GestorAplicaciones(BaseDeDatos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public void gestionar() {
        baseDeDatos.conectar();
        System.out.println("Gestionando la aplicación...");
        baseDeDatos.desconectar();
    }
}
