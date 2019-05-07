//GIO - IA
//O Foco desse projeto é desenvolver uma IA que conversa, como se fosse um chat bot, de inicio
//Irei desenvolver conversas, frases, para que seja possível conversar com esse robo, "vamos tc?"
//Com o tempo, desejo adicionar funções emotivas, no qual o robo pode ficar feliz ou não com o rumo da conversa (salvar em um arquivo)
//Futuramente, adicionar sistema de voz, reconhecimento, para poder conversar com o robo e ele responder
//Incrementar essa IA numa board, como um Arduino, sim, vamos conversar com uma placa

package gio;

import java.io.*;
import java.util.*;

public class Gio {

    public static void main(String[] args) throws IOException {
    
        //Atributos
        
        String frase;
        Scanner sc = new Scanner(System.in);
        
        //Frase
        
        System.out.print("Digite a frase: ");
        frase = sc.nextLine();
        String[] token = frase.split(" ");
        
        //Arquivo
        
        File arquivo = new File("C:\\Users\\Victor\\Desktop\\BomDia.txt");
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        ArrayList<String> ph = new ArrayList();
        String linha = "";
        while (true) {
            if (linha != null) {
                ph.add(linha);
                //System.out.println("Frase Original: " + linha); //Porque a primeira string fica vazia?
            } 
            else {
                break;
            }
            linha = br.readLine();
        }
        br.close();
        
        //Instâncias
        
        Interações i1 = new Interações();
        
        //i1.testeFeatures(frase, token, ph);
        i1.conversa(frase, token, ph);
        
    }
    
}
