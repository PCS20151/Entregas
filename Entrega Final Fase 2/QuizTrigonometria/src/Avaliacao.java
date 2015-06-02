//criado por Bernardo Gouvea
import java.io.*;
import java.util.*;

public class Avaliacao {
static String nome;

    public static void importar(ArrayList<String> resultado){
        try{
            FileReader arq = new FileReader("resultado.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null){
                resultado.add(linha);
                linha = lerArq.readLine();
            } 
            
            arq.close();
        } catch (IOException e){
            System.err.printf("Erro na abertura do arquivo: %s.", e.getMessage());
        } 
    } 
    public static void exportarResultado(ArrayList<String> resultado) throws IOException{
        FileWriter arq = new FileWriter("resultado3.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        int i, n = resultado.size();
        for (i=0; i<n; i++){
            gravarArq.printf("%s%n", resultado.get(i));
        }
        gravarArq.close();
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
    
}
