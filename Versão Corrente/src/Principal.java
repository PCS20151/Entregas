//criado por Cesar Luis Barbosa
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static boolean a = true; 

public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        Scanner Scanner = new Scanner(System.in);
        int codigo;
        int opcao;
        String nome;
        boolean verifica = true;
        
        
       
        Arquivo A = new Arquivo();
       
        System.out.printf("**** Menu de Acesso *****\n");
        System.out.printf("[ 1 ] Área do Aluno\n");
        System.out.printf("[ 2 ] Área do Professor\n");
        System.out.printf("[ 0 ] Encerrar o Programa\n");
        
        codigo = ler.nextInt();
        
        if (codigo == 2){ 
        verifica = Avaliacao.verificaAvaliador();
            while (verifica == false){
          System.out.printf("Erro na validação do usuário 'Avaliador'");
           verifica = Avaliacao.verificaAvaliador();
            }
        }
        
        while(codigo == 1){
                System.out.printf("**** Menu Principal Aluno *****\n");

                //
                System.out.printf("[ 1 ] Iniciar Quiz de Trigonometria\n");
                System.out.printf("[ 2 ] Exibir Tutorial\n");
                System.out.printf("[ 0 ] Encerrar o Programa\n");
                System.out.printf("\nOpção Desejada: ");

                opcao = ler.nextInt();

                switch (opcao){
                   case 1: 
                       Avaliacao.incluirNome();
                       Quiz Qz = new Quiz();
                      break;
                              
                   case 2: Tutorial.exibirTutorialJogo();
//                        break;
                    case 0: System.exit(1);
                }
            System.out.printf("\n\n");
        }do{
                System.out.printf("**** Menu Principal Professor *****\n");
                System.out.printf("[ 1 ] Exibir Resultado\n");
                System.out.printf("[ 2 ] Exportar Resultado\n");
                System.out.printf("[ 0 ] Encerrar o Programa\n");
                System.out.printf("\nOpção Desejada: ");

                opcao = ler.nextInt();

                switch (opcao){
                    case 1: Avaliacao.exibirResultado(resultado);
                        break;
                    case 2: Avaliacao.exportarResultado(resultado);
                }
            System.out.printf("\n\n");
            }while(opcao != 0);
    

}}