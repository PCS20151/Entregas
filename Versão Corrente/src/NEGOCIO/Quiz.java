package NEGOCIO;

/**
 *
 * @author Bernardo Gouvêa, Cesar Luis e Lucas Guilhon
 */

public class Quiz {

    public Questao Q;
    public Avaliacao Av;
    public Resultado R;

    public Quiz() {
        Q = new Questao();
        Av = new Avaliacao();

    }
}
