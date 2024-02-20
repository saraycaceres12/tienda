public class Importado extends Producto {
    String licenciaImportacion;

    public Importado(String nombre, int codigo, String licenciaImportacion) {
        super(nombre, codigo);
        this.licenciaImportacion = licenciaImportacion;
    }
}
