package NEGOCIO;

/**
 *
 * @author Cesar Luis
 */
import GUI.*;


public class Questao {

    public Triangulo T;
    public double auxLadoCA, auxAreaA, auxPerim, auxAnguloC;

    public void setAuxLadoCA(double auxLadoCA) {
        this.auxLadoCA = auxLadoCA;
    }

    public void setAuxAreaA(double auxAreaA) {
        this.auxAreaA = auxAreaA;
    }

    public void setAuxPerim(double auxPerim) {
        this.auxPerim = auxPerim;
    }

    public void setAuxAnguloC(double auxAnguloC) {
        this.auxAnguloC = auxAnguloC;
    }

    public double getAuxLadoCA() {
        return auxLadoCA;
    }

    public double getAuxAreaA() {
        return auxAreaA;
    }

    public double getAuxPerim() {
        return auxPerim;
    }

    public double getAuxAnguloC() {
        return auxAnguloC;
    }
        
        
    public Questao() {
        T = new Triangulo();
        auxLadoCA = 0;
        auxAreaA = 0;
        auxPerim = 0;
        auxAnguloC = 0;
    }
}
