import java.io.*;
import java.util.*;

public class Avaliacao {
    static String nome;
    static double Aproveitamento;
    
    
    public Avaliacao() {
        
    }
    
     public static boolean verificaAvaliador(){
        Scanner ler = new Scanner(System.in);
        String nome, senha;
        String tnome = "professor";
        String tsenha = "admin";

        System.out.printf("\nInforme o usuário Avaliador:\n");
        nome = ler.nextLine();
         
        
        System.out.printf("\nInforme a senha do Avaliador:\n");
        senha = ler.nextLine(); 
       
        if ((nome.equals(tnome))&& (senha.equals(tsenha))) { 
            return true;
        }  
        else return false;
     }

    public static void incluirNome(){
        Scanner ler = new Scanner(System.in);
        System.out.printf("\nInforme o nome do aluno:\n");
        nome = ler.nextLine();
    }
    
    public static void exibirResultado(ArrayList<String> resultado){
        System.out.printf("-------------------------------------------------");
        System.out.printf("\nListadando os resultados dos Alunos:\n");
        int i, n = resultado.size();
        for (i=0; i<n; i++){
            System.out.printf("Posição %d- %s\n", i, resultado.get(i));
        }
        System.out.printf("-------------------------------------------------");
    }

    
    public  double getAproveitamento(){
        return ((Quiz.ResultadoAn+Quiz.ResultadoLa+Quiz.ResultadoPe+Quiz.ResultadoAr)/(4*Quiz.numeroQuestoes));     
    }

}
