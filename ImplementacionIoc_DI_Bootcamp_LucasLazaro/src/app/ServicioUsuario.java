package app;

public class ServicioUsuario implements BaseDeDatos {
    @Override
    public void conectar() {
        System.out.println("Conectando a la base de datos de usuarios.");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando de la base de datos de usuarios.");
    }
}
