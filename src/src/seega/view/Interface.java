
package src.seega.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import src.seega.model.JogadorLocal;
import src.seega.model.Posicao;
import src.seega.model.Tabuleiro;


public class Interface extends javax.swing.JFrame {

    protected AtorJogador jogo;
    protected JLabel[][] mapaVPosicao = new JLabel[5][5];
    
    public Interface() {
        initComponents();
        botaoDesconectar.setEnabled(false);
        this.setTitle("Seega");
        
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(0, 0);
                }
         });
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(0, 1);
                }
         });
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(0, 2);
                }
         });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(0, 3);
                }
         });
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(0, 4);
                }
         });
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(1, 0);
                }
         });
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(1, 1);
                }
         });
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(1, 2);
                }
         });
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(1, 3);
                }
         });
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(1, 4);
                }
         });
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(2, 0);
                }
         });
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(2, 1);
                }
         });
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(2, 2);
                }
         });
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(2, 3);
                }
         });
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(2, 4);
                }
         });
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(3, 0);
                }
         });
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(3, 1);
                }
         });
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(3, 2);
                }
         });
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(3, 3);
                }
         });
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(3, 4);
                }
         });
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(4, 0);
                }
         });
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(4, 1);
                }
         });
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(4, 2);
                }
         });
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(4, 3);
                }
         });
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    click(4, 4);
                }
         });
       
        
        botaoConectar.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   conectar();
               }
           });
        
        botaoDesconectar.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 desconectar();
                 
             }
         });
        
        botaoIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             iniciarPartida();
            }
        });
        
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
        
        jogo = new AtorJogador(this);
        
        pecas.setText("x 12");
        comidas.setText("x 0");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        botaoConectar = new javax.swing.JButton();
        botaoDesconectar = new javax.swing.JButton();
        botaoIniciar = new javax.swing.JButton();
        pecas = new javax.swing.JLabel();
        comidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/central.png"))); // NOI18N

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/semPedra.png"))); // NOI18N

        botaoConectar.setText("Conectar");
        botaoConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConectarActionPerformed(evt);
            }
        });

        botaoDesconectar.setText("Desconectar");

        botaoIniciar.setText("Iniciar Jogo");

        pecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/pecas.png"))); // NOI18N
        pecas.setText("jLabel1");

        comidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/comidas.png"))); // NOI18N
        comidas.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(botaoDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comidas)
                                        .addComponent(pecas)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41)
                            .addComponent(jLabel44)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel52)
                        .addComponent(jLabel55)
                        .addComponent(jLabel53)
                        .addComponent(jLabel54))
                    .addComponent(jLabel51))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoConectar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoDesconectar))
                    .addComponent(pecas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoIniciar)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comidas)
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConectarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoConectarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConectar;
    private javax.swing.JButton botaoDesconectar;
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JLabel comidas;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pecas;
    // End of variables declaration//GEN-END:variables


public void conectar() {
        int resultado = jogo.conectar();
        if (resultado==0)  {
            botaoConectar.setEnabled(false);
            botaoDesconectar.setEnabled(true);
        }
        this.notificarResultado(resultado);
    }

    public void desconectar() {
        int resultado = jogo.desconectar();
        if (resultado==3)  {
            botaoConectar.setEnabled(true);
            botaoDesconectar.setEnabled(false);
        }
        this.notificarResultado(resultado);
    }

    public void iniciarPartida() {
        int resultado = jogo.iniciarPartida();
        this.notificarResultado(resultado);
        
    }

    public String obterIdJogador() {
        String idJogador = ("jogador");
        idJogador = JOptionPane.showInputDialog(this, ("Insira o nome do jogador"));
        return idJogador;
    }

    public String obterIdServidor() {
        String idServidor = ("localhost"); //venus.inf.ufsc.br
        idServidor = JOptionPane.showInputDialog(this, ("Insira o endereço do servidor"), idServidor);
        return idServidor;
    }

    public void click(int linha, int coluna) {
        int resultado = 0;
        resultado = jogo.click(linha, coluna);
        switch (resultado) {
            case 1:
                JOptionPane.showMessageDialog(null, "Pedra colocada com sucesso!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Posição já ocupada!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Posição central não pode ser ocupada nesta etapa!");
                break;    
            case 4:
                JOptionPane.showMessageDialog(null, "Pedra selecionada. Selecione a posição desejada para movê-la!");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Selecione uma pedra sua!");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Pedra movida com sucesso");
                break;                       
            case 7:
                JOptionPane.showMessageDialog(null, "Jogo não está em andamento");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Jogo acabou!");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Não é a sua vez!");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Você está bloqueado. Clique na peça do rival que você deseja remover!");
                break;   
            case 11:
                JOptionPane.showMessageDialog(null, "Primeira fase encerrada.");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Remova uma pedra do adversário.");
                break;  
            case 13:
                JOptionPane.showMessageDialog(null, "Primeira fase encerrada e você está bloqueado. Clique na peça do rival que você deseja remover para iniciar a segunda fase!.");
                break;    
        }
    }
    
    public void atualizarTabuleiro(Tabuleiro tabuleiro) {
       Icon pedraCentral = new ImageIcon(getClass().getResource("/resources/images/central.png"));
       Icon pedraLocal = new ImageIcon(getClass().getResource("/resources/images/pedraLocal.png"));
       Icon pedraRemoto = new ImageIcon(getClass().getResource("/resources/images/pedraRemoto.png"));
       Icon semPedra = new ImageIcon(getClass().getResource("/resources/images/semPedra.png"));
       for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                Posicao posicao = tabuleiro.informarPosicao(linha, coluna);     
                    if (posicao.informarJogadorOcupante() == null) { 
                        mapaVPosicao[(linha)][(coluna)].setIcon(semPedra);
                    } else if (posicao.informarJogadorOcupante() instanceof JogadorLocal) {
                        mapaVPosicao[(linha)][(coluna)].setIcon(pedraLocal);
                    } else {
                        mapaVPosicao[(linha)][(coluna)].setIcon(pedraRemoto);               
                    }           
            };
        };
        
        if (tabuleiro.informarFaseInicial()) {
            mapaVPosicao[2][2].setIcon(pedraCentral);   
        }
    }
    
    public void notificarResultado(int codigo) {
        switch (codigo) {
            case 0:
                JOptionPane.showMessageDialog(this, "Conexão efetuada com exito");
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "Tentativa de conexão com conexão previamente estabelecida", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Tentativa de conexao falhou");
                break;
            case 3:
                JOptionPane.showMessageDialog(this, "Desconexão efetuada com exito");
                break;
            case 4:
                JOptionPane.showMessageDialog(this, "Tentativa de desconexao sem conexao previamente estabelecida");
                break;
            case 5:
                JOptionPane.showMessageDialog(this, "Tentativa de desconexao falhou");
                break;
            case 6:
                JOptionPane.showMessageDialog(this, "Solicitação de inicio procedida com êxito");
                break;
            case 7:
                JOptionPane.showMessageDialog(this, "Tentativa de inicio sem conexão previamente estabelecida");
                break;    
            case 8:
                JOptionPane.showMessageDialog(this, "Operação inválida! Não existe uma partida em andamento!");
                break;
            case 9:
                JOptionPane.showMessageDialog(this, "Partida corrente não interrompida");
                break;
      
        };
    }

    public JLabel getComidas() {
        return comidas;
    }

    public void setComidas(JLabel comidas) {
        this.comidas = comidas;
    }

    public JLabel getPecas() {
        return pecas;
    }

    public void setPecas(JLabel pecas) {
        this.pecas = pecas;
    }
    
    

}
