package app;

public class ServicioProducto implements BaseDeDatos {
    @Override
    public void conectar() {
        System.out.println("Conectando a la base de datos de productos.");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando de la base de datos de productos.");
    }
}
