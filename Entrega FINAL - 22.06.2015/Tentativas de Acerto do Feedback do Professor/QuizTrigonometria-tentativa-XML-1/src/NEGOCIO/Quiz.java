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
    public static ArrayList<Questao> Q;
  
//public ArrayList<Questao> QA;

    public Questao Questao;
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

    public Resultado getR() {
        return R;
    }

    public void setR(Resultado R) {
        this.R = R;
    }

    public Quiz() {
        if (GuiInicial.getContador() == 0){
            Q = new ArrayList(GuiInicial.getMAXIMOQUESTOES());
            adicionaQuestao(GuiInicial.getContador());
        }
        
        else adicionaQuestao(GuiInicial.getContador());
    }
    
    public void adicionaQuestao(int contador){
       Questao = new Questao();
       Q.add(contador, Questao);
   }
}
