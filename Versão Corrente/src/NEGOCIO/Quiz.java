package NEGOCIO;

public class Quiz {

    static int ResultadoAn = 0;
    static int ResultadoLa = 0;
    static int ResultadoPe = 0;
    static int ResultadoAr = 0;

    

    public static void setResultadoAn() {
        ResultadoAn = ResultadoAn++;
    }

    public static void setResultadoLa() {
        ResultadoLa = ResultadoLa++;
    }

    public static void setResultadoPe() {
        ResultadoPe = ResultadoPe++;
    }

    public static void setResultadoAr() {
        ResultadoAr = ResultadoAr++;
    }

    public Quiz() {
            Questao Q = new Questao();
         //   Avaliacao Av = new Avaliacao();

    }
}
