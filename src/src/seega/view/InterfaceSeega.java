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

public class InterfaceSeega extends javax.swing.JPanel {

    protected AtorJogador jogo;
    protected JLabel mapaVPosicao[][] = new JLabel[5][5];

    
    public InterfaceSeega() {
        super();
        initComponents();
        
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
        
        inicioDeJogo();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoConectar = new javax.swing.JButton();
        botaoDesconectar = new javax.swing.JButton();
        botaoIniciar = new javax.swing.JButton();
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

        botaoConectar.setText("Conectar");

        botaoDesconectar.setText("Desconectar");

        botaoIniciar.setText("Iniciar Jogo");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconVazio.png"))); // NOI18N
        jLabel11.setText("jLabel1");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconVazio.png"))); // NOI18N
        jLabel12.setText("jLabel2");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconVazio.png"))); // NOI18N
        jLabel13.setText("jLabel3");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconVazio.png"))); // NOI18N
        jLabel14.setText("jLabel4");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconVazio.png"))); // NOI18N
        jLabel15.setText("jLabel5");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconVazio.png"))); // NOI18N
        jLabel21.setText("jLabel6");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconVazio.png"))); // NOI18N
        jLabel22.setText("jLabel7");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconVazio.png"))); // NOI18N
        jLabel23.setText("jLabel8");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconVazio.png"))); // NOI18N
        jLabel24.setText("jLabel9");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconVazio.png"))); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(botaoConectar)
                        .addGap(55, 55, 55)
                        .addComponent(botaoDesconectar)
                        .addGap(43, 43, 43)
                        .addComponent(botaoIniciar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel51)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel52))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel42))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel32)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel53)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 264, Short.MAX_VALUE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jLabel35))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel45))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel55)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoConectar)
                            .addComponent(botaoDesconectar)
                            .addComponent(botaoIniciar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConectar;
    private javax.swing.JButton botaoDesconectar;
    private javax.swing.JButton botaoIniciar;
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

 public void conectar() {
        int resultado = jogo.conectar();
        this.notificarResultado(resultado);
    }

    public void desconectar() {
        int resultado = jogo.desconectar();
        this.notificarResultado(resultado);
    }

    public void iniciarPartida() {
        int resultado = jogo.iniciarPartida();
        this.notificarResultado(resultado);
        
        if (resultado == 6) {
            this.setVisible(false);
        }
        
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

    public void inicioDeJogo() {
       Icon posicaoVazia = new ImageIcon("/resources/images/vazio.jpg");
        for (int linha = 1; linha <= 5; linha++) {
            for (int coluna = 1; coluna <= 5; coluna++) {        
                        mapaVPosicao[(linha - 1)][(coluna - 1)].setIcon(posicaoVazia);
                }
            };
    }
    
    public void atualizarWidgets(Tabuleiro tabuleiro) {
       Icon possuiPedraLocal = new ImageIcon("/resources/images/preto.jpg");
       Icon possuiPedraRemoto = new ImageIcon("/resources/images/vermelho.jpg");
       Icon posicaoVazia = new ImageIcon("/resources/images/iconVazio.jpg");
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
                JOptionPane.showMessageDialog(this, "Não é a sua vez");
                break;
            case 9:
                JOptionPane.showMessageDialog(this, "Partida encerrada");
                break;
            case 10:
                JOptionPane.showMessageDialog(this, "Lance OK");
                break;
            case 11:
                JOptionPane.showMessageDialog(this, "Operação inválida! Não existe uma partida em andamento!");
                break;
            case 13:
                JOptionPane.showMessageDialog(this, "Partida corrente não interrompida");
                break;
            case 14:
                JOptionPane.showMessageDialog(this, "Posição não pode ser alocada, posição já ocupada ou desativada!");
                break;
            case 15:
                JOptionPane.showMessageDialog(this, "Desativação não permitida, posição já desativada, ocupada ou posição inicial!");
                break;
            
            
        };
    }

}
