/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NEGOCIO.*;

/**
 *
 * @author Bernardo Gouvêa
 */
public class GuiTutorialEnsino extends javax.swing.JFrame {

    /**
     * Creates new form GuiTutorial
     */
    public GuiTutorialEnsino() {
        initComponents();
        labelNomeAlunoTutorial.setText(Avaliacao.getNome());
        if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Meus Parabéns meu caro Padawan, você sabe tudo sobre Trigonometria!!!");
            labelApoioTudo2.setText(" ");
        } else if ((Resultado.getResultadoLa() < 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, você quase acertou tudo!");
            labelApoioTudo2.setText("Mas agora você precisa aprender mais como calcular lados de triângulos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() < 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, você quase acertou tudo!");
            labelApoioTudo2.setText("Mas agora você precisa aprender mais como calcular ângulos de triângulos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() < 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, você quase acertou tudo!");
            labelApoioTudo2.setText("Mas agora você precisa aprender mais como perímetro lados de triângulos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Parabéns, você quase acertou tudo!");
            labelApoioTudo2.setText("Mas agora você precisa aprender mais como calcular área de triângulos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() < 5) && (Resultado.getResultadoPe() < 5) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Parabéns, você tudo de lados, mas o resto deixou a desejar!");
            labelApoioTudo2.setText("Mas agora você precisa aprender mais como calcular o ângulo, perímetro e área de triângulos.");
        } else if ((Resultado.getResultadoLa() < 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() < 5) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Parabéns, você tudo de ângulos, mas o resto deixou a desejar");
            labelApoioTudo2.setText("Mas agora você precisa aprender mais como calcular o lados, perímetro e área de triângulos.");
        } else if ((Resultado.getResultadoLa() < 5) && (Resultado.getResultadoAn() < 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Parabéns, você tudo de perímetro, mas o resto deixou a desejar");
            labelApoioTudo2.setText("Mas agora você precisa aprender mais como calcular o lados, ângulos e área de triângulos.");
        } else if ((Resultado.getResultadoLa() < 5) && (Resultado.getResultadoAn() < 5) && (Resultado.getResultadoPe() < 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, você tudo de área, mas o resto deixou a desejar");
            labelApoioTudo2.setText("Mas agora você precisa aprender mais como calcular o lados, ângulos e perímetro de triângulos.");
        } else if ((Resultado.getResultadoLa() > 0) && (Resultado.getResultadoLa() < 5) && (Resultado.getResultadoAn() > 0) && (Resultado.getResultadoAn() < 5) && (Resultado.getResultadoPe() > 0) && (Resultado.getResultadoPe() < 5) && (Resultado.getResultadoAr() > 0) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Parabéns, você quase acertou tudo!");
            labelApoioTudo2.setText("Mas não conseguiu êxito completo em nenhum item, agora você precisa prestar mais atenção em alguns casos.");
        } else if ((Resultado.getResultadoLa() > 0) && (Resultado.getResultadoLa() < 5) && (Resultado.getResultadoAn() < 1) && (Resultado.getResultadoPe() < 1) && (Resultado.getResultadoAr() < 1)) {
            labelApoioTudo1.setText("Fon Fon Fon, você errou quase tudo!");
            labelApoioTudo2.setText("Só conseguiu êxito em lado, agora você precisa prestar mais atenção em todos outros casos.");
        } else if ((Resultado.getResultadoLa() < 1) && (Resultado.getResultadoAn() > 0) && (Resultado.getResultadoAn() < 5) && (Resultado.getResultadoPe() < 1) && (Resultado.getResultadoAr() < 1)) {
            labelApoioTudo1.setText("Fon Fon Fon, você errou quase tudo!");
            labelApoioTudo2.setText("Só conseguiu êxito em ângulo, agora você precisa prestar mais atenção em todos outros casos.");
        } else if ((Resultado.getResultadoLa() < 1) && (Resultado.getResultadoAn() < 1) && (Resultado.getResultadoPe() > 0) && (Resultado.getResultadoPe() < 5) && (Resultado.getResultadoAr() < 1)) {
            labelApoioTudo1.setText("Fon Fon Fon, você errou quase tudo!");
            labelApoioTudo2.setText("Só conseguiu êxito em perímetro, agora você precisa prestar mais atenção em todos outros casos.");
        } else if ((Resultado.getResultadoLa() < 1) && (Resultado.getResultadoAn() < 1) && (Resultado.getResultadoPe() < 1) && (Resultado.getResultadoAr() > 0) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Fon Fon Fon, você errou quase tudo!");
            labelApoioTudo2.setText("Só conseguiu êxito em área, agora você precisa prestar mais atenção em todos outros casos.");
        } else if ((Resultado.getResultadoLa() < 1) && (Resultado.getResultadoAn() < 1) && (Resultado.getResultadoPe() < 1) && (Resultado.getResultadoAr() > 0) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Fon Fon Fon, você errou quase tudo!");
            labelApoioTudo2.setText("Só conseguiu êxito em área, agora você precisa prestar mais atenção em todos outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() < 1) && (Resultado.getResultadoAr() < 1)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados e ângulos e errou tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() < 1) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() < 1)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados e perímetro e errou tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() < 1) && (Resultado.getResultadoPe() < 1) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados e área e errou tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() < 1) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() < 1) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de ângulos e área e errou tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() < 1) && (Resultado.getResultadoAn() < 1) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de perímetro e área e errou tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() < 1) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() < 1)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de ângulos e perímetro e errou tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() > 0) && (Resultado.getResultadoPe() < 5) && (Resultado.getResultadoAr() > 0) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados e ângulos e errou quase tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() > 0) && (Resultado.getResultadoAn() < 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() > 0) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados e perímetro e errou quase tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() > 0) && (Resultado.getResultadoAn() < 5) && (Resultado.getResultadoPe() > 0) && (Resultado.getResultadoPe() < 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados e área e errou quase tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() > 0) && (Resultado.getResultadoLa() < 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() > 0) && (Resultado.getResultadoPe() < 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de ângulos e área e errou quase tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() > 0) && (Resultado.getResultadoLa() < 5) && (Resultado.getResultadoAn() > 0) && (Resultado.getResultadoAn() < 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de perímetro e área e errou quase tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() > 0) && (Resultado.getResultadoLa() < 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() > 0) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Parabéns, porém, Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de ângulos e perímetro e errou quase tudo do resto, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() < 1)) {
            labelApoioTudo1.setText("Parabéns, porém, quase Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados, ângulos e perímetro e errou tudo de área, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() < 1) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, quase Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados, ângulos e área e errou tudo de perímetro, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() < 1) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, quase Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados, perímetro e área e errou tudo de ângulos, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() < 1) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, quase Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de ângulos, perímetro e área e errou tudo de lados, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() > 0) && (Resultado.getResultadoAr() < 5)) {
            labelApoioTudo1.setText("Parabéns, porém, quase Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados, ângulos e perímetro e errou quase tudo de área, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() > 0) && (Resultado.getResultadoPe() < 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, quase Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados, ângulos e área e errou quase tudo de perímetro, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() == 5) && (Resultado.getResultadoAn() > 0) && (Resultado.getResultadoAn() < 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, quase Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de lados, perímetro e área e errou quase tudo de ângulos, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() > 0) && (Resultado.getResultadoLa() < 5) && (Resultado.getResultadoAn() == 5) && (Resultado.getResultadoPe() == 5) && (Resultado.getResultadoAr() == 5)) {
            labelApoioTudo1.setText("Parabéns, porém, quase Fon Fon Fon!");
            labelApoioTudo2.setText("Você acertou tudo de ângulos, perímetro e área e errou quase tudo de lados, agora você precisa prestar mais atenção nestes outros casos.");
        } else if ((Resultado.getResultadoLa() < 1) && (Resultado.getResultadoAn() < 1) && (Resultado.getResultadoPe() < 1) && (Resultado.getResultadoAr() < 1)) {
            labelApoioTudo1.setText("Meu querido, você errou tudo!!!");
            labelApoioTudo2.setText("Mas não desanime, você conseguirá da próxima vez, agora você precisa prestar mais atenção ao estudar.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTutorial = new javax.swing.JPanel();
        labelAlunoTutorial = new javax.swing.JLabel();
        botaoSairTutorial = new javax.swing.JButton();
        labelNomeAlunoTutorial = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelApoioTudo1 = new javax.swing.JLabel();
        labelApoioTudo2 = new javax.swing.JLabel();
        labelApoioDicas = new javax.swing.JLabel();
        labelCalculoLado = new javax.swing.JLabel();
        labelCalculoAngulo = new javax.swing.JLabel();
        labelCalculoPerimetro = new javax.swing.JLabel();
        labelCalculoArea = new javax.swing.JLabel();
        labelRespostaCalculoLado = new javax.swing.JLabel();
        labelRespostaCalculoAngulo = new javax.swing.JLabel();
        labelRespostaCalculoPerimetro = new javax.swing.JLabel();
        labelRespostaCalculoArea = new javax.swing.JLabel();
        labelJogoFeitoPorEnsino = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTutorial.setBackground(java.awt.Color.white);
        panelTutorial.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 0)));
        panelTutorial.setPreferredSize(new java.awt.Dimension(700, 500));

        labelAlunoTutorial.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        labelAlunoTutorial.setText("Aluno:");

        botaoSairTutorial.setText("Encerrar Jogo");
        botaoSairTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairTutorialActionPerformed(evt);
            }
        });

        labelNomeAlunoTutorial.setText("NomeAluno");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tutorial de Apoio ao Ensino");

        labelApoioTudo1.setText("jLabel2");

        labelApoioTudo2.setText("jLabel2");

        labelApoioDicas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelApoioDicas.setText("Veja abaixo agora algumas dicas de estudos de Trigonometria:");

        labelCalculoLado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCalculoLado.setText("Como achar o 3º lado do Triângulo:");

        labelCalculoAngulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCalculoAngulo.setText("Como achar o 3º ângulo do Triângulo:");

        labelCalculoPerimetro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCalculoPerimetro.setText("Como achar o perímetro do Triângulo:");

        labelCalculoArea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCalculoArea.setText("Como achar a área do Triângulo:");

        labelRespostaCalculoLado.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelRespostaCalculoLado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/CalculoLadoTriangulo.png"))); // NOI18N

        labelRespostaCalculoAngulo.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelRespostaCalculoAngulo.setText("180º = angulo1 + angulo2 + angulo3");

        labelRespostaCalculoPerimetro.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelRespostaCalculoPerimetro.setText("2p = lado1 * lado2 * lado3");

        labelRespostaCalculoArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/CalculoAreaTeoremaHerao.png"))); // NOI18N

        labelJogoFeitoPorEnsino.setText("Um jogo feito por: Bernardo Gouvêa, César Barbosa, Lucas Guilhon");

        javax.swing.GroupLayout panelTutorialLayout = new javax.swing.GroupLayout(panelTutorial);
        panelTutorial.setLayout(panelTutorialLayout);
        panelTutorialLayout.setHorizontalGroup(
            panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTutorialLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(labelJogoFeitoPorEnsino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSairTutorial)
                .addGap(20, 20, 20))
            .addGroup(panelTutorialLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTutorialLayout.createSequentialGroup()
                        .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelTutorialLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelAlunoTutorial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNomeAlunoTutorial))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTutorialLayout.createSequentialGroup()
                                .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelCalculoArea, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTutorialLayout.createSequentialGroup()
                                        .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelCalculoLado)
                                            .addComponent(labelCalculoAngulo))
                                        .addGap(48, 48, 48)
                                        .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelRespostaCalculoLado)
                                            .addComponent(labelRespostaCalculoArea)
                                            .addComponent(labelRespostaCalculoAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelRespostaCalculoPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelTutorialLayout.createSequentialGroup()
                        .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCalculoPerimetro)
                            .addComponent(labelApoioDicas)
                            .addComponent(labelApoioTudo2)
                            .addComponent(labelApoioTudo1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelTutorialLayout.setVerticalGroup(
            panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTutorialLayout.createSequentialGroup()
                .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTutorialLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(panelTutorialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNomeAlunoTutorial)
                            .addComponent(labelAlunoTutorial))))
                .addGap(34, 34, 34)
                .addComponent(labelApoioTudo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelApoioTudo2)
                .addGap(18, 18, 18)
                .addComponent(labelApoioDicas)
                .addGap(35, 35, 35)
                .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRespostaCalculoLado)
                    .addGroup(panelTutorialLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelCalculoLado)))
                .addGap(18, 18, 18)
                .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCalculoAngulo)
                    .addComponent(labelRespostaCalculoAngulo))
                .addGap(30, 30, 30)
                .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRespostaCalculoPerimetro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCalculoPerimetro))
                .addGap(18, 18, 18)
                .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCalculoArea, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelRespostaCalculoArea, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(panelTutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSairTutorial)
                    .addComponent(labelJogoFeitoPorEnsino))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTutorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTutorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairTutorialActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoSairTutorialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiTutorialEnsino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiTutorialEnsino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiTutorialEnsino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiTutorialEnsino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiTutorialEnsino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSairTutorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAlunoTutorial;
    private javax.swing.JLabel labelApoioDicas;
    private javax.swing.JLabel labelApoioTudo1;
    private javax.swing.JLabel labelApoioTudo2;
    private javax.swing.JLabel labelCalculoAngulo;
    private javax.swing.JLabel labelCalculoArea;
    private javax.swing.JLabel labelCalculoLado;
    private javax.swing.JLabel labelCalculoPerimetro;
    private javax.swing.JLabel labelJogoFeitoPorEnsino;
    private javax.swing.JLabel labelNomeAlunoTutorial;
    private javax.swing.JLabel labelRespostaCalculoAngulo;
    private javax.swing.JLabel labelRespostaCalculoArea;
    private javax.swing.JLabel labelRespostaCalculoLado;
    private javax.swing.JLabel labelRespostaCalculoPerimetro;
    private javax.swing.JPanel panelTutorial;
    // End of variables declaration//GEN-END:variables
}
