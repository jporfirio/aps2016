package src.seega.view;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import src.seega.model.JogadorLocal;
import src.seega.model.Posicao;
import src.seega.model.Tabuleiro;

/**
 *
 * @author Felipe
 */
public class InterfaceSeega extends javax.swing.JFrame {
 
    protected JLabel mapaVPosicao[][] = new JLabel[5][5];
    private JPanel painelPrincipal = null;
    Icon possuiPedraLocal, possuiPedraRemoto, posicaoVazia;

    public InterfaceSeega() {

    possuiPedraLocal = new ImageIcon("/resources/images/preto.jpg");
    possuiPedraRemoto = new ImageIcon("/resources/images/vermelho.jpg");
    posicaoVazia = new ImageIcon("/resources/images/vazio.jpg");

        
        initComponents();
  
        
         jLabel11.setIcon(posicaoVazia);
         jLabel11.setBounds(new Rectangle(20, 40, 70, 70));
         
         jLabel12.setIcon(posicaoVazia);
         jLabel12.setBounds(new Rectangle(20, 110, 70, 70));
         
         jLabel13.setIcon(posicaoVazia);
         jLabel13.setBounds(new Rectangle(20, 180, 70, 70));
         
         jLabel14.setIcon(posicaoVazia);
         jLabel14.setBounds(new Rectangle(20, 250, 70, 70));
         
         jLabel15.setIcon(posicaoVazia);
         jLabel15.setBounds(new Rectangle(20, 320, 70, 70));
         
         jLabel21.setIcon(posicaoVazia);
         jLabel21.setBounds(new Rectangle(90, 40, 70, 70));
         
         jLabel22.setIcon(posicaoVazia);
         jLabel22.setBounds(new Rectangle(90, 110, 70, 70));
         
         jLabel23.setIcon(posicaoVazia);
         jLabel23.setBounds(new Rectangle(90, 180, 70, 70));
         
         jLabel24.setIcon(posicaoVazia);
         jLabel24.setBounds(new Rectangle(90, 250, 70, 70));
         
         jLabel25.setIcon(posicaoVazia);
         jLabel25.setBounds(new Rectangle(90, 320, 70, 70));
         
         jLabel31.setIcon(posicaoVazia);
         jLabel31.setBounds(new Rectangle(160, 40, 70, 70));
         
         jLabel32.setIcon(posicaoVazia);
         jLabel32.setBounds(new Rectangle(160, 110, 70, 70));
         
         jLabel33.setIcon(posicaoVazia);
         jLabel33.setBounds(new Rectangle(160, 180, 70, 70));
         
         jLabel34.setIcon(posicaoVazia);
         jLabel34.setBounds(new Rectangle(160, 250, 70, 70));
         
         jLabel35.setIcon(posicaoVazia);
         jLabel35.setBounds(new Rectangle(160, 320, 70, 70));
         
         jLabel41.setIcon(posicaoVazia);
         jLabel41.setBounds(new Rectangle(230, 40, 70, 70));
         
         jLabel42.setIcon(posicaoVazia);
         jLabel42.setBounds(new Rectangle(230, 110, 70, 70));
        
         jLabel43.setIcon(posicaoVazia);
         jLabel43.setBounds(new Rectangle(230, 180, 70, 70));
         
         jLabel44.setIcon(posicaoVazia);
         jLabel44.setBounds(new Rectangle(230, 250, 70, 70));
         
         jLabel45.setIcon(posicaoVazia);
         jLabel45.setBounds(new Rectangle(230, 320, 70, 70));
         
         jLabel51.setIcon(posicaoVazia);
         jLabel51.setBounds(new Rectangle(300, 40, 70, 70));
         
         jLabel52.setIcon(posicaoVazia);
         jLabel52.setBounds(new Rectangle(300, 100, 70, 70));
         
         jLabel53.setIcon(posicaoVazia);
         jLabel53.setBounds(new Rectangle(300, 180, 70, 70));
         
         jLabel54.setIcon(posicaoVazia);
         jLabel54.setBounds(new Rectangle(300, 250, 70, 70));
         
         jLabel55.setIcon(posicaoVazia);
         jLabel55.setBounds(new Rectangle(300, 320, 70, 70));
         
           painelPrincipal = new JPanel();
            painelPrincipal.setBackground(Color.WHITE);
            painelPrincipal.setLayout(null);
            painelPrincipal.add(jLabel11, null);
            painelPrincipal.add(jLabel12, null);
            painelPrincipal.add(jLabel13, null);
            painelPrincipal.add(jLabel14, null);
            painelPrincipal.add(jLabel15, null);
            
            painelPrincipal.add(jLabel21, null);
            painelPrincipal.add(jLabel22, null);
            painelPrincipal.add(jLabel23, null);
            painelPrincipal.add(jLabel24, null);
            painelPrincipal.add(jLabel25, null);
            
            painelPrincipal.add(jLabel31, null);
            painelPrincipal.add(jLabel32, null);
            painelPrincipal.add(jLabel32, null);
            painelPrincipal.add(jLabel32, null);
            painelPrincipal.add(jLabel32, null);
            
            painelPrincipal.add(jLabel41, null);
            painelPrincipal.add(jLabel42, null);
            painelPrincipal.add(jLabel43, null);
            painelPrincipal.add(jLabel44, null);
            painelPrincipal.add(jLabel45, null);
           
            painelPrincipal.add(jLabel51, null);
            painelPrincipal.add(jLabel52, null);
            painelPrincipal.add(jLabel53, null);
            painelPrincipal.add(jLabel54, null);
            painelPrincipal.add(jLabel55, null);
            
            mapaVPosicao[0][0] = jLabel11;
            mapaVPosicao[0][1] = jLabel12;
            mapaVPosicao[0][2] = jLabel13;
            mapaVPosicao[0][3] = jLabel14;
            mapaVPosicao[0][4] = jLabel15;
           
            mapaVPosicao[1][0] = jLabel21;
            mapaVPosicao[1][1] = jLabel22;
            mapaVPosicao[1][2] = jLabel23;
            mapaVPosicao[1][3] = jLabel24;
            mapaVPosicao[1][4] = jLabel25;
           
            mapaVPosicao[2][0] = jLabel31;
            mapaVPosicao[2][1] = jLabel32;
            mapaVPosicao[2][2] = jLabel33;
            mapaVPosicao[2][3] = jLabel34;
            mapaVPosicao[2][4] = jLabel35;
           
            mapaVPosicao[3][0] = jLabel41;
            mapaVPosicao[3][1] = jLabel42;
            mapaVPosicao[3][2] = jLabel43;
            mapaVPosicao[3][3] = jLabel44;
            mapaVPosicao[3][4] = jLabel45;
           
            mapaVPosicao[4][0] = jLabel51;
            mapaVPosicao[4][1] = jLabel52;
            mapaVPosicao[4][2] = jLabel53;
            mapaVPosicao[4][3] = jLabel54;
            mapaVPosicao[4][4] = jLabel55;
            
            inicioDeJogo();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setText("jLabel1");

        jLabel12.setText("jLabel2");

        jLabel13.setText("jLabel3");

        jLabel14.setText("jLabel4");

        jLabel15.setText("jLabel5");

        jLabel21.setText("jLabel6");

        jLabel22.setText("jLabel7");

        jLabel23.setText("jLabel8");

        jLabel24.setText("jLabel9");

        jLabel25.setText("jLabel10");

        jLabel31.setText("jLabel11");

        jLabel32.setText("jLabel12");

        jLabel33.setText("jLabel13");

        jLabel34.setText("jLabel14");

        jLabel35.setText("jLabel15");

        jLabel41.setText("jLabel16");

        jLabel42.setText("jLabel17");

        jLabel43.setText("jLabel18");

        jLabel44.setText("jLabel19");

        jLabel45.setText("jLabel20");

        jLabel51.setText("jLabel21");

        jLabel52.setText("jLabel22");

        jLabel53.setText("jLabel23");

        jLabel54.setText("jLabel24");

        jLabel55.setText("jLabel25");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel21)
                                .addComponent(jLabel31)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel41))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel12))
                            .addComponent(jLabel42)
                            .addComponent(jLabel52))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel23))
                            .addComponent(jLabel33)
                            .addComponent(jLabel43))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel24)
                        .addComponent(jLabel34))
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel15)
                    .addComponent(jLabel35)
                    .addComponent(jLabel45)
                    .addComponent(jLabel55))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    // End of variables declaration//GEN-END:variables


@SuppressWarnings("empty-statement")
    public void inicioDeJogo() {

        for (int linha = 1; linha <= 5; linha++) {
            for (int coluna = 1; coluna <= 5; coluna++) {        
                        mapaVPosicao[(linha - 1)][(coluna - 1)].setIcon(posicaoVazia);
                }
            };
    }
    
    public void atualizarWidgets(Tabuleiro tabuleiro) {
        for (int linha = 1; linha <= 5; linha++) {
            for (int coluna = 1; coluna <= 5; coluna++) {
                Posicao posicao = tabuleiro.getPosicao(linha, coluna);     
                    if (posicao.informarJogadorOcupante() == null) { 
                        mapaVPosicao[(linha - 1)][(coluna - 1)].setIcon(posicaoVazia);
                    } else if (posicao.informarJogadorOcupante() instanceof JogadorLocal) {
                        mapaVPosicao[(linha - 1)][(coluna - 1)].setIcon(possuiPedraLocal);
                    } else {
                        mapaVPosicao[(linha - 1)][(coluna - 1)].setIcon(possuiPedraRemoto);               
                    }
            };
        };
    }
    

}
