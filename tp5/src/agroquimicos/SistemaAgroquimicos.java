package agroquimicos;

import java.util.ArrayList;
import java.util.List;

public class SistemaAgroquimicos {
    private List<Enfermedad> enfermedades;
    private List<ProductoQuimico> quimicos;
    private List<Cultivo> cultivos;

    public SistemaAgroquimicos(List<Enfermedad> enfermedades, List<ProductoQuimico> quimicos, List<Cultivo> cultivos) {
        this.enfermedades = enfermedades;
        this.quimicos = quimicos;
        this.cultivos = cultivos;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public List<ProductoQuimico> getQuimicos() {
        return quimicos;
    }

    public List<Cultivo> getCultivos() {
        return cultivos;
    }
    
    public void addEnfermedad(Enfermedad enfermedad){
        enfermedades.add(enfermedad);
    }
    
    public void addQuimico(ProductoQuimico quimico){
        quimicos.add(quimico);
    }
    
    public void addCultivo(Cultivo cultivo){
        cultivos.add(cultivo);
    }

    public List<ProductoQuimico> quimicosDisponibles(Enfermedad enfermedad){
        List<ProductoQuimico> resultados = new ArrayList<>();
        for(ProductoQuimico quimico: quimicos){
            if (quimico.trataEnfermedad(enfermedad)){
                resultados.add(quimico);
            }
        }
        return resultados;
    }

    public List<ProductoQuimico> quimicosDisponibles(Cultivo cultivo, Enfermedad enfermedad){
        List<ProductoQuimico> resultados = new ArrayList<>();
        for(ProductoQuimico quimico: quimicos){
            if(quimico.getCultivosDesaconsejados().contains(cultivo)){
                if(quimico.trataEnfermedad(enfermedad)){
                    resultados.add(quimico);
                }
            }
        }
        return resultados;
    }
}

