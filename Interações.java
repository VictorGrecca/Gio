package gio;

import java.util.*;
import java.io.*;

public class Interações{
    
    Scanner sc = new Scanner(System.in);
    
    public void testeFeatures(String fr, String[] to, ArrayList<String> ph) {
        
        System.out.println("Testando frase inicial: " + fr);
        
        System.out.println("Testando tokens da frase inicial: ");
        for(int i = 0; i < to.length; i++){
            System.out.println("Palavra " + i + ":" + to[i]);
        }
        
        System.out.println("Testanto frases do arquivo txt: ");
        for(int i = 0; i < ph.size(); i++){
            System.out.println("Frase " + i + ":" + ph.get(i));
        }
    }
    
    public void conversa(String fr, String[] to, ArrayList<String> ph) {
        
        String conv;
        
        if(fr.contains(ph.get(1))){
            System.out.println("OK!");
            System.out.print("Proxima fala(1): "); conv = sc.nextLine();
            while(!conv.contains("tchau")){
                System.out.println("OK!");
                System.out.print("Proxima fala(2): "); conv = sc.nextLine();
            }
        }
        else{
            System.out.println("NOT OK!");
        }
        
        System.out.println("Finalizando");
        
    }
}