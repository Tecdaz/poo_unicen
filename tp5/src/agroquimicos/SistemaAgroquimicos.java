package agroquimicos;

import java.util.ArrayList;
import java.util.Arrays;
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
            if(!quimico.getCultivosDesaconsejados().contains(cultivo)){
                if(quimico.trataEnfermedad(enfermedad)){
                    resultados.add(quimico);
                }
            }
        }
        return resultados;
    }
    public static void main(String[] args) {
        //genera info para testear la clase
        List<Enfermedad> enfermedades = new ArrayList<>();
        List<ProductoQuimico> quimicos = new ArrayList<>();
        List<Cultivo> cultivos = new ArrayList<>();

        Enfermedad e1 = new Enfermedad("e1", new ArrayList<>(Arrays.asList("sintoma1", "sintoma2")));
        Enfermedad e2 = new Enfermedad("e2", new ArrayList<>(Arrays.asList("sintoma3", "sintoma4")));
        Enfermedad e3 = new Enfermedad("e3", new ArrayList<>(Arrays.asList("sintoma5", "sintoma6")));

        enfermedades.add(e1);
        enfermedades.add(e2);
        enfermedades.add(e3);

        Cultivo c1 = new Cultivo("c1", new ArrayList<>(Arrays.asList(e1, e2)));
        Cultivo c2 = new Cultivo("c2", new ArrayList<>(Arrays.asList(e2, e3)));
        Cultivo c3 = new Cultivo("c3", new ArrayList<>(Arrays.asList(e1, e3)));

        cultivos.add(c1);
        cultivos.add(c2);
        cultivos.add(c3);

        ProductoQuimico p1 = new ProductoQuimico("p1", new ArrayList<>(Arrays.asList(c1, c2)), new ArrayList<>(Arrays.asList("sintoma1", "sintoma2")));
        ProductoQuimico p2 = new ProductoQuimico("p2", new ArrayList<>(Arrays.asList(c2, c3)), new ArrayList<>(Arrays.asList("sintoma3", "sintoma4")));
        ProductoQuimico p3 = new ProductoQuimico("p3", new ArrayList<>(Arrays.asList(c1, c3)), new ArrayList<>(Arrays.asList("sintoma5", "sintoma6")));

        quimicos.add(p1);
        quimicos.add(p2);
        quimicos.add(p3);

        SistemaAgroquimicos sistema = new SistemaAgroquimicos(enfermedades, quimicos, cultivos);

        //testea los metodos
        System.out.println("Quimicos disponibles para e1: " + sistema.quimicosDisponibles(e1));
        System.out.println("Quimicos disponibles para e2: " + sistema.quimicosDisponibles(e2));
        System.out.println("Quimicos disponibles para e3: " + sistema.quimicosDisponibles(e3));
        System.out.println("Quimicos disponibles para c1 y e1: " + sistema.quimicosDisponibles(c1, e1));
        System.out.println("Quimicos disponibles para c2 y e1: " + sistema.quimicosDisponibles(c2, e1));
        System.out.println("Quimicos disponibles para c3 y e1: " + sistema.quimicosDisponibles(c3, e1));
        System.out.println("Quimicos disponibles para c1 y e2: " + sistema.quimicosDisponibles(c1, e2));
        System.out.println("Quimicos disponibles para c2 y e2: " + sistema.quimicosDisponibles(c2, e2));
        System.out.println("Quimicos disponibles para c3 y e2: " + sistema.quimicosDisponibles(c3, e2));
        System.out.println("Quimicos disponibles para c1 y e3: " + sistema.quimicosDisponibles(c1, e3));
        System.out.println("Quimicos disponibles para c2 y e3: " + sistema.quimicosDisponibles(c2, e3));
        System.out.println("Quimicos disponibles para c3 y e3: " + sistema.quimicosDisponibles(c3, e3));

    }
}

