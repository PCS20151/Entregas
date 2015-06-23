package NEGOCIO;

/**
 *
 * @author Bernardo Gouvêa, Cesar Luis e Lucas Guilhon
 */
import GUI.*;

public class Avaliacao {

    public static double Aproveitamento;
    public static String nome;

    public Avaliacao() {
        nome = getNome();
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Avaliacao.nome = nome;
    }

    public static boolean verificaAvaliador() {
        return ((GuiInicial.auxLoginProfessor.equals("professor")) && (GuiInicial.auxSenhaProfessor.equals("admin")));
    }

    public static int getResult() {
        return (Resultado.getResultadoAn() + Resultado.getResultadoLa() + Resultado.getResultadoPe() + Resultado.getResultadoAr());
    }

    public static double getAproveitamento() {
        return (100.0 * (getResult() / (4.0 * GuiInicial.getMAXIMOQUESTOES())));
    }

}
