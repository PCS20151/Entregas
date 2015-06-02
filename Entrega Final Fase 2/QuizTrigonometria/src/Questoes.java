//criado por Lucas Guilhon

import java.util.*;
import java.io.*;

public class Questoes {
    static double Aproveitamento;
    static double ResultadoAn;
    static double ResultadoLa;
    static double ResultadoPe;
    static double ResultadoAr;
    
    
    
    static boolean AcertoLado;
    static boolean AcertoAngulo;
    static boolean AcertoPerimetro;
    static boolean AcertoArea;
    static int cont = 1;
    static double zerar = 0.0;
    
    public static void gerarQuestao() {
        int RespLado;
        double RespAngulo;
        int RespPerimetro;
        double RespArea;
        boolean a = true;
          
        AcertoLado=false;
        AcertoAngulo=false;
        AcertoPerimetro=false;
        AcertoArea=false;
      
        Scanner respostas = new Scanner(System.in);

        while (a == true){
		Triangulo.gerarTriangulo(Triangulo.lado1,Triangulo.lado2,Triangulo.lado3);
		Triangulo.gerarAngulos();
		a = Triangulo.verificaGabErr();
	}
              
        int perimetro = Triangulo.perimetro(Triangulo.lado1, Triangulo.lado2, Triangulo.lado3);
	double area = Triangulo.Area(Triangulo.lado1, Triangulo.lado2, Triangulo.lado3);
                System.out.printf("Print para prova de conceito");
		System.out.printf("Os lados são:\n / %d cm \n / %d cm \n / %d cm \n", Triangulo.lado1, Triangulo.lado2, Triangulo.lado3);
		System.out.printf("O perimetro é: %d cm \n",perimetro);
		System.out.printf("A área é: %.1f cm²\n",area);
		System.out.printf("Os angulos são:\n / %.1f  \n / %.1f  \n / %.1f  \n", Triangulo.angulo1, Triangulo.angulo2, Triangulo.angulo3);
                System.out.printf("Final de print para prova de conceito");
                
        System.out.println("Dado o triangulo ABC a seguir temos:\n"+ " lado AB = "+Triangulo.lado1+"\nlados BC = "+Triangulo.lado2+
"\n e o angulo B = "+Triangulo.angulo1+"\n e o angulo C = "+Triangulo.angulo2 + "\nResponda:\n") ;
        
        System.out.println("Qual o comprimento do lado que falta?");
        RespLado = respostas.nextInt();
         if (RespLado==Triangulo.lado3){System.out.println("Acertou Lado 3"); ResultadoLa++;}
        System.out.println("Qual o tamanho do ângulo que falta?");
        RespAngulo = respostas.nextDouble();
         if (RespAngulo == Triangulo.angulo3);{System.out.println("acertou angulo"); ResultadoAn++;}
        System.out.println("Qual o comprimento do perímetro do triângulo?");
        RespPerimetro = respostas.nextInt();
     if (RespPerimetro==Triangulo.perimetro(Triangulo.lado1,Triangulo.lado2,Triangulo.lado3)){System.out.println("acertou perimetro");ResultadoPe++;}
        System.out.println("Qual a área total do triângulo?");
        RespArea = respostas.nextDouble();
         if (RespArea==Triangulo.Area(Triangulo.lado1,Triangulo.lado2,Triangulo.lado3)){System.out.println("acerto uarea");ResultadoAr++;}
    }
    
    public static void iniciarQuiz() throws IOException{ 
     ResultadoAn = 0;
     ResultadoLa = 0;
     ResultadoPe = 0;
     ResultadoAr = 0;
     Scanner ler = new Scanner(System.in);
                
        System.out.println("Olá aluno " + Avaliacao.nome+"! Comece a sua saga pelo aprendizado!1"
                + " ");
        
        while (cont<3){
            System.out.println("Questão " + cont);
         gerarQuestao();
            cont++;
          }
        double resul = Questoes.calculaAproveitamento(ResultadoAn,ResultadoLa,ResultadoPe,ResultadoAr);
      
        System.out.printf("\n%f\n",resul);
                exportarResultado();
                Tutorial.exibirTutorialAluno();
                
        System.out.printf("\nVocê deseja sair do Quiz? Digite S para sair ou N para retornar ao menu do Aluno.\n");
        String sair =null;
        sair = ler.nextLine();
        if (sair== "S") System.exit(1);
    }
    
    public static void submeterRespostas(double ResultadoAn,double ResultadoLa,double ResultadoPe,double ResultadoAr, boolean AcertoLado, boolean AcertoAngulo, boolean AcertoPerimetro, boolean AcertoArea){
        if (AcertoLado){
             ResultadoLa++;
        }
        if (AcertoAngulo){
            ResultadoAn++;
        }
        if (AcertoPerimetro){
            ResultadoPe++;
        }
        if (AcertoArea){
            ResultadoAr++;
        }
    }
    
    public static double calculaAproveitamento(double ResultadoAn,double ResultadoLa,double ResultadoPe,double ResultadoAr) throws IOException{
        return (ResultadoAn+ResultadoLa+ResultadoPe+ResultadoAr);     
    }
    

public static void exportarResultado() throws IOException{
        double pontuacao = calculaAproveitamento(ResultadoAn,ResultadoLa,ResultadoPe,ResultadoAr);
        FileWriter arq = new FileWriter("resultado.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("Nome:"+Avaliacao.nome+"   Pontuação: " + pontuacao);
        gravarArq.close();
    }
}