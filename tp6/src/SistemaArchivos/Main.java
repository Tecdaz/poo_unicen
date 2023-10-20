package SistemaArchivos;

import SistemaArchivos.Modelos.Elemento;
import SistemaArchivos.utils.Data;

import java.util.List;

//Un Sistema de Archivos debe organizar y manipular los siguientes elementos: archivos,
//directorios, links y archivos comprimidos. Los archivos se definen por un nombre, una
//fecha de creación, una fecha de última modificación y un tamaño. Los directorios tienen
//un nombre, una fecha de creación y además contienen un conjunto de archivos y un
//conjunto de sub-directorios. El tamaño de un directorio está dado por el tamaño de sus
//sub-directorios, sus archivos, sus links y sus archivos comprimidos. Los links son
//vínculos a otro archivo o directorio y tienen un nombre, una fecha de creación y su
//tamaño en disco es siempre igual a 1Kb. Los archivos comprimidos son un tipo
//particular de archivo que contienen otros archivos y/o directorios en formato
//comprimido según una tasa de compresión dada, tienen un nombre y una fecha de
//creación.
//Implementar una solución orientada a objetos para este problema que permita
//determinar
// 1) la cantidad de elementos que posee un directorio particular
// 2) el tamaño total de un directorio particular.
public class Main {
    public static void main(String[] args) {
        List<Elemento> elementos = Data.generate();

        for(Elemento elemento: elementos){
            System.out.println(elemento);
        }
    }
}
