package DAO;

/**
 *
 * @author Bernardo Gouvêa, Cesar Luis e Lucas Guilhon
 */
import GUI.GuiInicial;
import GUI.GuiQuiz;
import java.io.BufferedReader;
import NEGOCIO.Avaliacao;
import NEGOCIO.Quiz;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Arquivo {

    private static ArrayList<String> resultado = new ArrayList();
    private static final String QuizTrigonometria = "QuizTrigonometria.xml";

    public Arquivo() {
        importar(resultado);
    }

    public void importar(ArrayList<String> resultado) {
        try {
            FileReader arq = new FileReader("resultado.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                resultado.add(linha);
                linha = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            //System.err.printf("Erro na abertura do arquivo: %s.", e.getMessage());
        }
    }

    public static void exportarResultado() throws IOException {
        Arquivo Ar = new Arquivo();
        ArrayList<String> As = Arquivo.getAvaliacao();
        int n = As.size();
        FileWriter arq = new FileWriter("resultado.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        int i;
        for (i = 0; i < n; i++) {
            gravarArq.printf("%s%n", resultado.get(i));
        }
        gravarArq.printf("Nome:" + Avaliacao.nome + "   Aproveitamento: " + Avaliacao.getAproveitamento());// + "%" + "   Acertos: " + ((GuiInicial.getMAXIMOQUESTOES()) * 4) + "/" + Avaliacao.getResult());
        gravarArq.close();
//        FileWriter arq = new FileWriter("resultado.txt");
//        PrintWriter gravarArq = new PrintWriter(arq);
//        int i, n = resultado.size();
//        for (i = 0; i < n; i++) {
//            gravarArq.printf("%s%n", resultado.get(i));
//        }
//        gravarArq.printf("Nome:" + Avaliacao.nome + "   Pontuação: " + Avaliacao.Aproveitamento);
//        gravarArq.close();
    }

    public static void salvarQuestão(Quiz Qz) throws IOException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(QuizTrigonometria))) {
            xmlEncoder.writeObject(GuiQuiz.Qz.Q.T);
            xmlEncoder.writeObject(GuiQuiz.Qz.Q);

        }
    }

    public static void salvarQuiz(Quiz Qz) throws IOException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(QuizTrigonometria))) {
            xmlEncoder.writeObject(GuiQuiz.Qz.R);
            xmlEncoder.writeObject(GuiQuiz.Qz.Av);
        }
    }

    public static ArrayList<String> getAvaliacao() {
        ArrayList<String> Av = new ArrayList<String>();
        Av = resultado;
        return Av;
    }

}
