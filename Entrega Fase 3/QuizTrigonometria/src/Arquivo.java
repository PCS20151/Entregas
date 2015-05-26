import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Arquivo {
    ArrayList<String> resultado;
    
 
    public Arquivo() {
        ArrayList<String> resultado = new ArrayList();
        importar(resultado);
    }
    
     public void importar(ArrayList<String> resultado){
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
    public void exportarResultado(ArrayList<String> resultado) throws IOException{
        FileWriter arq = new FileWriter("resultado.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        int i, n = resultado.size();
        for (i=0; i<n; i++){
            gravarArq.printf("%s%n", resultado.get(i));
        }
        gravarArq.printf("Nome:"+Avaliacao.nome+"   Pontuação: " + Avaliacao.Aproveitamento);
        gravarArq.close();
    }
    
}

