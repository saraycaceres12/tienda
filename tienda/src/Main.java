import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int opcion;
        int tam = 2;
        Nacional[] listaProductosNal = new Nacional[tam];
        Importado[] listaProductosImp = new Importado[tam];

        do {
            System.out.println("Menú:");
            System.out.println("1 - Registrar productos nacionales");
            System.out.println("2 - Registrar productos importados");
            System.out.println("3 - Listar productos nacionales");
            System.out.println("4 - Listar productos importados");
            System.out.println("5 - Buscar producto nacional");
            System.out.println("6 - Buscar producto importado");
            System.out.println("7 - Salir");
            System.out.println("Seleccione una opción:");

            opcion = snc.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < listaProductosNal.length; i++) {
                        System.out.println("Digite código producto " + (i + 1));
                        int codigo = snc.nextInt();
                        System.out.println("Digite el nombre producto " + (i + 1));
                        String nombre = snc.next();
                        System.out.println("Digite registro DIAN producto " + (i + 1));
                        String registroDIAN = snc.next();
                        listaProductosNal[i] = new Nacional(nombre, codigo, registroDIAN);
                    }
                    System.out.println("Productos nacionales registrados");
                    break;
                case 2:
                    for (int i = 0; i < listaProductosImp.length; i++) {
                        System.out.println("Digite código producto importado " + (i + 1));
                        int codigo = snc.nextInt();
                        System.out.println("Digite el nombre producto importado " + (i + 1));
                        String nombre = snc.next();
                        System.out.println("Digite licencia de importación " + (i + 1));
                        String licenciaImportacion = snc.next();
                        listaProductosImp[i] = new Importado(nombre, codigo, licenciaImportacion);
                    }
                    System.out.println("Productos importados registrados");
                    break;
                case 3:
                    System.out.println("Listado de productos nacionales:");
                    for (Nacional producto : listaProductosNal) {
                        if (producto != null) {
                            System.out.println("Código: " + producto.getCodigo() + ", Nombre: " + producto.nombre + ", Registro DIAN: " + producto.registroDIAN);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Listado de productos importados:");
                    for (Importado producto : listaProductosImp) {
                        if (producto != null) {
                            System.out.println("Código: " + producto.getCodigo() + ", Nombre: " + producto.nombre + ", Licencia de importación: " + producto.licenciaImportacion);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el código del producto nacional a buscar:");
                    int codigoNacional = snc.nextInt();
                    boolean encontradoNacional = false;
                    for (Nacional producto : listaProductosNal) {
                        if (producto != null && producto.getCodigo() == codigoNacional) {
                            encontradoNacional = true;
                            System.out.println("Producto nacional encontrado - Código: " + producto.getCodigo() + ", Nombre: " + producto.nombre + ", Registro DIAN: " + producto.registroDIAN);
                            break;
                        }
                    }
                    if (!encontradoNacional) {
                        System.out.println("Producto nacional no encontrado");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el código del producto importado a buscar:");
                    int codigoImportado = snc.nextInt();
                    boolean encontradoImportado = false;
                    for (Importado producto : listaProductosImp) {
                        if (producto != null && producto.getCodigo() == codigoImportado) {
                            encontradoImportado = true;
                            System.out.println("Producto importado encontrado - Código: " + producto.getCodigo() + ", Nombre: " + producto.nombre + ", Licencia de importación: " + producto.licenciaImportacion);
                            break;
                        }
                    }
                    if (!encontradoImportado) {
                        System.out.println("Producto importado no encontrado");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 7);
    }
}

