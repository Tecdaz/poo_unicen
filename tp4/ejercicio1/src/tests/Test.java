package tests;

import clases.Lote;
import clases.cereales.CosechaFina;
import clases.cereales.CosechaGruesa;
import clases.cereales.Pastura;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public Test() {
    }

    public void tests(){
        Set<String> minerales1 = new HashSet<String>();
        minerales1.add("m3");
        minerales1.add("m8");
        minerales1.add("m9");
        minerales1.add("m6");

        Set<String> minerales2 = new HashSet<String>();
        minerales2.add("m2");
        minerales2.add("m6");

        Set<String> minerales3 = new HashSet<String>();
        minerales3.add("m3");
        minerales3.add("m6");

        Set<String> minerales6 = new HashSet<String>();
        minerales6.add("m3");
        minerales6.add("m7");
        minerales6.add("m4");
        minerales6.add("m2");
        minerales6.add("m6");
        minerales6.add("m10");

        Set<String> minerales4 = new HashSet<String>();
        minerales4.add("m8");
        minerales4.add("m4");
        minerales4.add("m5");
        minerales4.add("m9");
        minerales4.add("m6");



        Set<String> minerales5 = new HashSet<String>();
        // agregar 5 minerales con valores entre 1 y 10
        minerales5.add("m7");
        minerales5.add("m9");
        minerales5.add("m10");
        minerales5.add("m2");


        CosechaGruesa girasol = new CosechaGruesa("girasol",minerales1);
        CosechaFina trigo = new CosechaFina("trigo", minerales2);
        Pastura alfalfa = new Pastura("alfalfa", minerales3);

        Lote lote2 = new Lote(40, minerales5);
        Lote lote1 = new Lote(30, minerales4);
        Lote lote3 = new Lote(50, minerales6);

        if(girasol.cumpleRequisitos(lote1) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }

        if(girasol.cumpleRequisitos(lote2) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }

        if(girasol.cumpleRequisitos(lote3) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }

        if(trigo.cumpleRequisitos(lote1) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }

        if(trigo.cumpleRequisitos(lote2) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }

        if(trigo.cumpleRequisitos(lote3) == true){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }

        if(alfalfa.cumpleRequisitos(lote1) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }

        if(alfalfa.cumpleRequisitos(lote2) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }

        if(lote1.esEspecial(minerales1) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote1.esEspecial(minerales2) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote1.esEspecial(minerales3) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote1.esEspecial(minerales4) == true){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote1.esEspecial(minerales5) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote1.esEspecial(minerales6) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote2.esEspecial(minerales1) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote2.esEspecial(minerales2) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote2.esEspecial(minerales3) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote2.esEspecial(minerales4) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote2.esEspecial(minerales5) == true){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote2.esEspecial(minerales6) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote3.esEspecial(minerales1) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote3.esEspecial(minerales2) == true){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote3.esEspecial(minerales3) == true){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote3.esEspecial(minerales4) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote3.esEspecial(minerales5) == false){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
        
        if(lote3.esEspecial(minerales6) == true){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
    }
}
