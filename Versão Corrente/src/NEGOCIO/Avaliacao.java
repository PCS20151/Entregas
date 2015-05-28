package NEGOCIO;
import GUI.*;

import java.io.*;
import java.util.*;

public class Avaliacao {

    public static double Aproveitamento;
    public static String nome;

    public Avaliacao() {
        //TODO
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

    public double getAproveitamento() {
        return ((Quiz.ResultadoAn + Quiz.ResultadoLa + Quiz.ResultadoPe + Quiz.ResultadoAr) / (4 * 10));
    }

}
