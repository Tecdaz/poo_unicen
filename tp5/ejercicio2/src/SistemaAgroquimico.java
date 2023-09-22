import java.util.ArrayList;
import java.util.List;

public class SistemaAgroquimico{
    private List<ProductoQuimico> productosQuimicos;
    private List<Cultivo> cultivos;
    private List<Enfermedad> enfermedades;

    public SistemaAgroquimico(ArrayList<ProductoQuimico> productosQuimicos, ArrayList<Cultivo> cultivos, ArrayList<Enfermedad> enfermedades){
        this.productosQuimicos = productosQuimicos;
        this.cultivos = cultivos;
        this.enfermedades = enfermedades;
    }

    public ArrayList<ProductoQuimico> getProductosQuimicos() {
        return new ArrayList<ProductoQuimico>(productosQuimicos);
    }

    public ArrayList<Cultivo> getCultivos() {
        return new ArrayList<Cultivo>(cultivos);
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return new ArrayList<Enfermedad>(enfermedades);
    }

    public void addProductoQuimico(ProductoQuimico nuevo){
        this.productosQuimicos.add(nuevo);
    }

    public void addCultivo(Cultivo nuevo){
        this.cultivos.add(nuevo);
    }

    public void addEnfermedad(Enfermedad nuevo){
        this.enfermedades.add(nuevo);
    }

    public ArrayList<ProductoQuimico> quimicosCapacitadosPorEnfermedad(Enfermedad enfermedad){
        ArrayList<ProductoQuimico> resultado = new ArrayList<ProductoQuimico>();
        for(ProductoQuimico quimico: productosQuimicos){
            if (quimico.puedeTratarEnfermedad(enfermedad)){
                resultado.add(quimico);
            }
        }
        return resultado;
    }
}