package NEGOCIO;

/**
 *
 * @author Bernardo Gouvêa, Cesar Luis e Lucas Guilhon
 */
import GUI.*;


/**
 *
 * @author cesar
 */
public class Resultado {

    public static int getResultadoLa() {
        return ResultadoLa;
    }

    public static int getResultadoAn() {
        return ResultadoAn;
    }

    public static int getResultadoPe() {
        return ResultadoPe;
    }

    public static int getResultadoAr() {
        return ResultadoAr;
    }

    public Resultado() {
        ResultadoAn = 0;
        ResultadoLa = 0;
        ResultadoPe = 0;
        ResultadoAr = 0;
    }

    static int ResultadoAn;
    static int ResultadoLa;
    static int ResultadoPe;
    static int ResultadoAr;

    public static void setResultado() {
        
        int auxLadoCA = (int) GuiQuiz.Qz.Q.get(GuiInicial.getContador()).getAuxLadoCA();
        if (auxLadoCA == GuiQuiz.Qz.Q.get(GuiInicial.getContador()).T.getLado3()) {
            setResultadoGeralLa();
        }

        int areaaux = (int) GuiQuiz.Qz.Q.get(GuiInicial.getContador()).getAuxAreaA();
        if ((((GuiQuiz.Qz.Q.get(GuiInicial.getContador()).T.getArea())) == (areaaux))) {
            setResultadoGeralAr();
        }
        
        int auxPerim = (int) GuiQuiz.Qz.Q.get(GuiInicial.getContador()).getAuxPerim();
        if (auxPerim == GuiQuiz.Qz.Q.get(GuiInicial.getContador()).T.getPerimetro()) {
            setResultadoGeralPe();
        }

        int angaux = (int) GuiQuiz.Qz.Q.get(GuiInicial.getContador()).getAuxAnguloC();
        if ((((int) ((GuiQuiz.Qz.Q.get(GuiInicial.getContador()).T.getAngulo3()) - 3)) <= (angaux)) && ((angaux) <= ((int) ((GuiQuiz.Qz.Q.get(GuiInicial.getContador()).T.getAngulo3()) + 3)))) {
            setResultadoGeralAn();

        }

    }

    public static void setResultadoGeralAn() {
        ResultadoAn++;
    }

    public static void setResultadoGeralLa() {
        ResultadoLa++;
    }

    public static void setResultadoGeralPe() {
        ResultadoPe++;
    }

    public static void setResultadoGeralAr() {
        ResultadoAr++;
    }
}
