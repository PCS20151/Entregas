package NEGOCIO;

/**
 *
 * @author Bernardo Gouvêa, Cesar Luis e Lucas Guilhon
 */
import GUI.*;
import static GUI.GuiQuiz.auxAnguloC;
import static GUI.GuiQuiz.auxAreaA;
import static GUI.GuiQuiz.auxLadoCA;
import static GUI.GuiQuiz.auxPerim;

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

    public static void setResultado(Double auxLadoCA, Double auxAreaA, Double auxPerim, Double auxAnguloC) {
        if (auxLadoCA == GuiQuiz.Qz.Q.T.getLado3()) {
            setResultadoGeralLa();
        }

        int areaaux = (int) GuiQuiz.auxAreaA;
        if ((((GuiQuiz.Qz.Q.T.getArea())) == (areaaux))) {
            setResultadoGeralAr();
        }

        if (auxPerim == GuiQuiz.Qz.Q.T.getPerimetro()) {
            setResultadoGeralPe();
        }

        int angaux = (int) GuiQuiz.auxAnguloC;
        if ((((int) ((GuiQuiz.Qz.Q.T.getAngulo3()) - 3)) <= (angaux)) && ((angaux) <= ((int) ((GuiQuiz.Qz.Q.T.getAngulo3()) + 3)))) {
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
