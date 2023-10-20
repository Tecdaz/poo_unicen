package SistemaArchivos.utils;

import SistemaArchivos.Modelos.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    public static List<Elemento> generate(){
        Elemento arch1 = new Archivo("santi.txt", 24);
        Elemento link1 = new Link("linkAr1", arch1);
        Elemento arch2 = new Archivo("joaco.txt", 24);
        Elemento link2 = new Link("linkAr2", arch2);
        Elemento arch3 = new Archivo("juani.txt", 21);
        Elemento archcomp = new ArchivoComprimido("juani.txt", 0.3f, new ArrayList<>(Arrays.asList(arch1, arch2)));
        Elemento directorio3 = new Directorio("raiz3", new ArrayList<>(Arrays.asList(archcomp, arch3)));
        Elemento directorio2 = new Directorio("raiz2", new ArrayList<>(Arrays.asList(arch2, link2, directorio3)));
        Elemento directorio1 = new Directorio("raiz", new ArrayList<>(Arrays.asList(arch1, link1, directorio2)));

        return new ArrayList<>(Arrays.asList(arch1,link2,arch2,link1,arch3,archcomp, directorio3, directorio1, directorio2));
    }
}
