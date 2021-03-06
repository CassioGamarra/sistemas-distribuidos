
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonatan
 */
public class CalculadoraFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraFrame
     */
    public CalculadoraFrame() {
        initComponents();
    }
    
    
    //Valor dos números
    String numero = "";
    public String resultado = "";
    public String resultadoFinal;

    public JTextField getFieldNumeros() {
        return fieldNumeros;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCalculadora = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        fieldNumeros = new javax.swing.JTextField();
        btnTrocaSinal = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panelCalculadora.setFocusable(false);

        lblResultado.setBackground(new java.awt.Color(204, 204, 204));
        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        fieldNumeros.setEditable(false);
        fieldNumeros.setBackground(new java.awt.Color(255, 255, 255));
        fieldNumeros.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        fieldNumeros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldNumeros.setText("0");

        btnTrocaSinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTrocaSinal.setText("+/-");
        btnTrocaSinal.setFocusable(false);
        btnTrocaSinal.setMaximumSize(new java.awt.Dimension(50, 50));
        btnTrocaSinal.setMinimumSize(new java.awt.Dimension(50, 50));
        btnTrocaSinal.setPreferredSize(new java.awt.Dimension(50, 50));
        btnTrocaSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocaSinalActionPerformed(evt);
            }
        });

        btnNum7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNum7.setText("7");
        btnNum7.setFocusable(false);
        btnNum7.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNum7.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNum7.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnNum4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNum4.setText("4");
        btnNum4.setFocusable(false);
        btnNum4.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNum4.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNum4.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNum1.setText("1");
        btnNum1.setFocusable(false);
        btnNum1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNum1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNum1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNum8.setText("8");
        btnNum8.setFocusable(false);
        btnNum8.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNum8.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNum8.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNum5.setText("5");
        btnNum5.setFocusable(false);
        btnNum5.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNum5.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNum5.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnNum2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNum2.setText("2");
        btnNum2.setFocusable(false);
        btnNum2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNum2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNum2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnNum0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNum0.setText("0");
        btnNum0.setFocusable(false);
        btnNum0.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNum0.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNum0.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        btnNum9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNum9.setText("9");
        btnNum9.setFocusable(false);
        btnNum9.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNum9.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNum9.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnNum6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNum6.setText("6");
        btnNum6.setFocusable(false);
        btnNum6.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNum6.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNum6.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnNum3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNum3.setText("3");
        btnNum3.setFocusable(false);
        btnNum3.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNum3.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNum3.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnPonto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPonto.setText(".");
        btnPonto.setFocusable(false);
        btnPonto.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPonto.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPonto.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDividir.setText("/");
        btnDividir.setFocusable(false);
        btnDividir.setMaximumSize(new java.awt.Dimension(50, 50));
        btnDividir.setMinimumSize(new java.awt.Dimension(50, 50));
        btnDividir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMultiplicar.setText("x");
        btnMultiplicar.setFocusable(false);
        btnMultiplicar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnMultiplicar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnMenos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMenos.setText("-");
        btnMenos.setFocusable(false);
        btnMenos.setMaximumSize(new java.awt.Dimension(50, 50));
        btnMenos.setMinimumSize(new java.awt.Dimension(50, 50));
        btnMenos.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnMais.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMais.setText("+");
        btnMais.setFocusable(false);
        btnMais.setMaximumSize(new java.awt.Dimension(50, 50));
        btnMais.setMinimumSize(new java.awt.Dimension(50, 50));
        btnMais.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setFocusable(false);
        btnIgual.setMaximumSize(new java.awt.Dimension(50, 50));
        btnIgual.setMinimumSize(new java.awt.Dimension(50, 50));
        btnIgual.setPreferredSize(new java.awt.Dimension(50, 50));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCalculadoraLayout = new javax.swing.GroupLayout(panelCalculadora);
        panelCalculadora.setLayout(panelCalculadoraLayout);
        panelCalculadoraLayout.setHorizontalGroup(
            panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldNumeros)
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrocaSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelCalculadoraLayout.setVerticalGroup(
            panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrocaSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                                .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPonto, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        // TODO add your handling code here:
        numZero();
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        // TODO add your handling code here:
        numUm();
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        // TODO add your handling code here:
        numDois();
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        // TODO add your handling code here:
        numTres();
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        // TODO add your handling code here:
        numQuatro();
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        // TODO add your handling code here:
        numCinco();
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        // TODO add your handling code here:
        numSeis();
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        // TODO add your handling code here:
        numSete();
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        // TODO add your handling code here:
        numOito();
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        // TODO add your handling code here:
        numNove();
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        // TODO add your handling code here:
        ponto();
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnTrocaSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocaSinalActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Não implementado");
    }//GEN-LAST:event_btnTrocaSinalActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
        dividir();
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
        multiplicar();
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // TODO add your handling code here:
        subtrair();
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        // TODO add your handling code here:
        somar();
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        // TODO add your handling code here:
        igual();
    }//GEN-LAST:event_btnIgualActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        
        //Numeros
        if(evt.getKeyCode() == KeyEvent.VK_0 || evt.getKeyCode() == KeyEvent.VK_NUMPAD0){
            numZero();
        }
        if(evt.getKeyCode() == KeyEvent.VK_1 || evt.getKeyCode() == KeyEvent.VK_NUMPAD1){
            numUm();
        }
        if(evt.getKeyCode() == KeyEvent.VK_2 || evt.getKeyCode() == KeyEvent.VK_NUMPAD2){
            numDois();
        }
        if(evt.getKeyCode() == KeyEvent.VK_3 || evt.getKeyCode() == KeyEvent.VK_NUMPAD3){
            numTres();
        }
        if(evt.getKeyCode() == KeyEvent.VK_4 || evt.getKeyCode() == KeyEvent.VK_NUMPAD4){
            numQuatro();
        }
        if(evt.getKeyCode() == KeyEvent.VK_5 || evt.getKeyCode() == KeyEvent.VK_NUMPAD5){
            numCinco();
        }
        if(evt.getKeyCode() == KeyEvent.VK_6 || evt.getKeyCode() == KeyEvent.VK_NUMPAD6){
            numSeis();
        }
        if(evt.getKeyCode() == KeyEvent.VK_7 || evt.getKeyCode() == KeyEvent.VK_NUMPAD7){
            numSete();
        }
        if(evt.getKeyCode() == KeyEvent.VK_8 || evt.getKeyCode() == KeyEvent.VK_NUMPAD8){
            numOito();
        }
        if(evt.getKeyCode() == KeyEvent.VK_9 || evt.getKeyCode() == KeyEvent.VK_NUMPAD9){
            numNove();
        }
        
        //teclas
        if(evt.getKeyCode() == KeyEvent.VK_ADD){
            somar();
        }
        if(evt.getKeyCode() == KeyEvent.VK_SUBTRACT){
            subtrair();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DIVIDE){
            dividir();
        }
        if(evt.getKeyCode() == KeyEvent.VK_MULTIPLY){
            multiplicar();
        }
        if(evt.getKeyCode() == KeyEvent.VK_PERIOD || evt.getKeyCode() == 0x00){
            ponto();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            igual();
        }
        
    }//GEN-LAST:event_formKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalculadoraFrame view = new CalculadoraFrame();
                view.setLocationRelativeTo(null);
                view.setFocusable(true);
                view.setVisible(true);
            }
        });
        
    }   
    
    //MÉTODOS 
    private void numUm(){
        if(!resultado.equals("0")){
            fieldNumeros.setText("");
        }
        numero += "1";
        fieldNumeros.setText(numero);
    }
    private void numDois(){
        if(!resultado.equals("0")){
            fieldNumeros.setText("");
        }
        numero += "2";
        fieldNumeros.setText(numero);
    }
    private void numTres(){
        if(!resultado.equals("0")){
            fieldNumeros.setText("");
        }
        numero += "3";
        fieldNumeros.setText(numero);
    }
    private void numQuatro(){
        if(!resultado.equals("0")){
            fieldNumeros.setText("");
        }
        numero += "4";
        fieldNumeros.setText(numero);
    }
    private void numCinco(){
        if(!resultado.equals("0")){
            fieldNumeros.setText("");
        }
        numero += "5";
        fieldNumeros.setText(numero);
    }
    private void numSeis(){
        if(!resultado.equals("0")){
            fieldNumeros.setText("");
        }
        numero += "6";
        fieldNumeros.setText(numero);
    }
    private void numSete(){
        if(!resultado.equals("0")){
            fieldNumeros.setText("");
        }
        numero += "7";
        fieldNumeros.setText(numero);
    }
    private void numOito(){
        if(!resultado.equals("0")){
            fieldNumeros.setText("");
        }
        numero += "8";
        fieldNumeros.setText(numero);
    }
    private void numNove(){
        if(!resultado.equals("0")){
            fieldNumeros.setText("");
        }
        numero += "9";
        fieldNumeros.setText(numero);
    }
    private void numZero(){
        if(!resultado.equals("0")){
            fieldNumeros.setText("");
        }
        numero += "0";
        fieldNumeros.setText(numero);
    }
    private void ponto(){
        JOptionPane.showMessageDialog(null, "Não implementado");
    }
    private void somar(){
        lblResultado.setText(numero+"+");
        numero = "";
        fieldNumeros.setText("0");
    }
    private void subtrair(){
        lblResultado.setText(numero+"-");
        numero = "";
        fieldNumeros.setText("0");
    }
    private void multiplicar(){
        lblResultado.setText(numero+"x");
        numero = "";
        fieldNumeros.setText("0");
    }
    private void dividir(){
        lblResultado.setText(numero+"/");
        numero = "";
        fieldNumeros.setText(numero);
    }
    private void igual(){
        lblResultado.setText(lblResultado.getText()+numero);
        resultado = lblResultado.getText();
        numero = "";
        Cliente c = new Cliente();
        c.calcular(this, resultado);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnTrocaSinal;
    private javax.swing.JTextField fieldNumeros;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel panelCalculadora;
    // End of variables declaration//GEN-END:variables
}
