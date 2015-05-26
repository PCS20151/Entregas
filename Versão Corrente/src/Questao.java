import java.util.*;

public class Questao {
    int RespLado;
    double RespAngulo;
    int RespPerimetro;
    double RespArea;
    int cont = 1;
    double zerar = 0.0;
    
    public Questao() {
        Triangulo T = new Triangulo();
        
        Scanner respostas = new Scanner(System.in);
            
        

                
        //System.out.println("Dado o triangulo ABC a seguir temos:\n"+ " lado AB = "+T.getLado(1)+"\nlados BC = "+T.getLado(2)+
//"\n e o angulo B = "+T.getAngulo(1)+"\n e o angulo C = "+T.getAngulo(2) + "\nResponda:\n") ;
        
        //System.out.println("Qual o comprimento do lado que falta?");
        
        RespLado = respostas.nextInt();
         
        //System.out.println("Qual o tamanho do ângulo que falta?");   
        RespAngulo = respostas.nextDouble();

         
 //     System.out.println("Qual o comprimento do perímetro do triângulo?");

        RespPerimetro = respostas.nextInt();
     
   //   System.out.println("Qual a área total do triângulo?");
        
        RespArea = respostas.nextDouble();
        
        
        

        if (RespLado == T.getLado(3)){
            Quiz.setResultadoLa();
        }
        
        if (RespAngulo == T.getAngulo(3)){
            Quiz.setResultadoAn();
        }
        
        if (RespPerimetro == T.getPerimetro()){
            Quiz.setResultadoPe();
        }
        
        if (RespArea == T.getArea()){
            Quiz.setResultadoAr();
        }
    }
 }
    

