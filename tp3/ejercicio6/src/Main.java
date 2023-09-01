import productos.ProductoFresco;
import productos.ProductoRefrigerado;
import productosCongelados.ProductoCongeladoAgua;
import productosCongelados.ProductoCongeladoAire;
import productosCongelados.ProductoCongeladoNitrogeno;

public class Main {
    public static void main(String[] args) {
        ProductoFresco productoFresco = new ProductoFresco("Huevos", "20/12/2000", 34678, "20/04/1999", "Pepito");
        System.out.println(productoFresco.etiqueta());

        ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("Huevos refrigerados", "20/12/2000", 34678, "20/04/1999", "Pepito", 49843, 3f);
        System.out.println(productoRefrigerado.etiqueta());

        ProductoCongeladoAire productoCongeladoAire = new ProductoCongeladoAire("Huevos congelados", "20/12/2000", 34678, "20/04/1999", "Pepito", 49843, 3f,
                70f, 3f, 50f, 4);
        System.out.println(productoCongeladoAire.etiqueta());

        ProductoCongeladoAgua productoCongeladoAgua = new ProductoCongeladoAgua("Huevos congelados con agua", "20/12/2000", 34678, "20/04/1999", "Pepito", 49843, 3f,
                3);
        System.out.println(productoCongeladoAgua.etiqueta());

        ProductoCongeladoNitrogeno productoCongeladoNitrogeno = new ProductoCongeladoNitrogeno("Huevos congelados con nitrogeno", "20/12/2000", 34678, "20/04/1999", "Pepito", 49843, 3f,
                "Suprecion", 5);
        System.out.println(productoCongeladoNitrogeno.etiqueta());
    }
}
