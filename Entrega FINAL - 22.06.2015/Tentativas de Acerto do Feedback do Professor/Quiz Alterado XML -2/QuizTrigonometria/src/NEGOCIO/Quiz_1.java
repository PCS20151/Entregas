package NEGOCIO;

import GUI.GuiInicial;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Bernardo Gouvêa, Cesar Luis e Lucas Guilhon
 */
public class Quiz {

     //public  ArrayList<Questao> Q;
     
    public static ArrayList<Questao> Q = new ArrayList();
    int cont  = 0;

    public Questao Qa;
    public Avaliacao Av;
    public Resultado R;

    public static ArrayList<Questao> getQ() {
        return Q;
    }

    public static void setQ(ArrayList<Questao> Q) {
        Quiz.Q = Q;
    }

    public Avaliacao getAv() {
        return Av;
    }

    public void setAv(Avaliacao Av) {
        this.Av = Av;
    }

    public int getCont() {
        return cont;
    }

    public void setCont() {
        cont++;
    }

    public Resultado getR() {
        return R;
    }

    public void setR(Resultado R) {
        this.R = R;
    }

    public Quiz() {
        Qa = new Questao();
       Q.add(Qa);
       Av = new Avaliacao();
    }
}
