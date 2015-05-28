package NEGOCIO;
import GUI.GuiQuiz;

public class Questao {

    int RespLado;
    double RespAngulo;
    int RespPerimetro;
    double RespArea;
    int cont = 1;
    double zerar = 0.0;

    public Questao() {
        Triangulo T = new Triangulo();
        if (GuiQuiz.auxLadoCA == T.getLado(3)) {
            Quiz.setResultadoLa();
        }
        if (GuiQuiz.auxAnguloC == T.getAngulo(3)) {
            Quiz.setResultadoAn();
        }
        if (GuiQuiz.auxPerim == T.getPerimetro()) {
            Quiz.setResultadoPe();
        }
        if (GuiQuiz.auxAreaA == T.getArea()) {
            Quiz.setResultadoAr();
        }
    }
}
