public class Quiz {
    static int numeroQuestoes = 10;
    static int ResultadoAn = 0;
    static int ResultadoLa = 0;
    static int ResultadoPe = 0;
    static int ResultadoAr = 0;

    public void setNumeroQuestoes(int numeroQuestoes) {
        numeroQuestoes = numeroQuestoes;
    }

     
    public static void setResultadoAn() {
        ResultadoAn = ResultadoAn++;
    }

    public static  void setResultadoLa() {
        ResultadoLa = ResultadoLa++;
    }

    public static void setResultadoPe() {
        ResultadoPe = ResultadoPe++;
    }

    public static void setResultadoAr() {
        ResultadoAr = ResultadoAr++;
    }
    
    public Quiz() {
        for ( int i=0; i< numeroQuestoes; i++){
            Questao Q = new Questao();
        }
        Avaliacao Av = new Avaliacao();
        
    }
   
//     public  void iniciarQuiz() throws IOException{ 
//
//     Scanner ler = new Scanner(System.in);
//                
//        System.out.println("Olá aluno " + Avaliacao.nome+"! Comece a sua saga pelo aprendizado!1"
//                + " ");
//        
//        
//          }

     
//        System.out.printf("\n%f\n",resul);
//                exportarResultado();
//                Tutorial.exibirTutorialAluno();
//                
//        System.out.printf("\nVocê deseja sair do Quiz? Digite S para sair ou N para retornar ao menu do Aluno.\n");
//        String sair =null;
//        sair = ler.nextLine();
//        if (sair== "S") System.exit(1);
//    }
        
}
