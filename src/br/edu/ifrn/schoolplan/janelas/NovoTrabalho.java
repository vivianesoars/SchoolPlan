/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.schoolplan.janelas;

import br.edu.ifrn.schoolplan.classes.SchoolPlan;
import br.edu.ifrn.schoolplan.classes.Trabalhos;
import java.util.Calendar;

/**
 *
 * @author ferna
 */
public class NovoTrabalho extends javax.swing.JFrame {

    private SchoolPlan plan;

    /**
     * Creates new form NovoTrabalho
     */
    public NovoTrabalho(SchoolPlan plan) {
        initComponents();
        this.plan = plan;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tituloRotulo = new javax.swing.JLabel();
        dataRotulo = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        data = new javax.swing.JFormattedTextField();
        descricao = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoEditor = new javax.swing.JEditorPane();
        dificuldadeRotulo = new javax.swing.JLabel();
        tipoRotulo = new javax.swing.JLabel();
        trabalhoJBT = new javax.swing.JRadioButton();
        provaJBT = new javax.swing.JRadioButton();
        dificuldade = new javax.swing.JSlider();
        adicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Novo trabalho/prova");

        tituloRotulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tituloRotulo.setText("Título");

        dataRotulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        dataRotulo.setText("Data de entrega");

        titulo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        data.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        descricao.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        descricao.setText("Descrição");

        jScrollPane1.setViewportView(descricaoEditor);

        dificuldadeRotulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        dificuldadeRotulo.setText("Dificuldade");

        tipoRotulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tipoRotulo.setText("Tipo");

        buttonGroup1.add(trabalhoJBT);
        trabalhoJBT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        trabalhoJBT.setText("Trabalho");

        buttonGroup1.add(provaJBT);
        provaJBT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        provaJBT.setText("Prova");

        dificuldade.setMaximum(10);
        dificuldade.setMinimum(1);
        dificuldade.setMajorTickSpacing(1);

        dificuldade.setPaintTicks(true);

        dificuldade.setSnapToTicks(true);
        dificuldade.setPaintLabels(true);
        dificuldade.setPaintTicks(true);
        dificuldade.setSnapToTicks(true);

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dificuldade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dataRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(data))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(descricao)
                            .addComponent(dificuldadeRotulo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tipoRotulo)
                                .addGap(59, 59, 59)
                                .addComponent(trabalhoJBT)
                                .addGap(18, 18, 18)
                                .addComponent(provaJBT)))
                        .addGap(0, 113, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(adicionar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloRotulo)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataRotulo)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoRotulo)
                    .addComponent(trabalhoJBT)
                    .addComponent(provaJBT))
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dificuldadeRotulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adicionar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed

      
        String data = data.getText();
        String[] textoSeparado = data.split("\\s");
        int day = Integer.parseInt(textoSeparado[0]);
        int month = Integer.parseInt(textoSeparado[1]);
        int year = Integer.parseInt(textoSeparado[2]);
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.YEAR, year);
        Trabalhos tb = new Trabalhos(c, titulo.getText(), dificuldade.getValue());
        plan.adicionarTrabalho(tb);
        dispose();
    }//GEN-LAST:event_adicionarActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JLabel dataRotulo;
    private javax.swing.JLabel descricao;
    private javax.swing.JEditorPane descricaoEditor;
    private javax.swing.JSlider dificuldade;
    private javax.swing.JLabel dificuldadeRotulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton provaJBT;
    private javax.swing.JLabel tipoRotulo;
    private javax.swing.JTextField titulo;
    private javax.swing.JLabel tituloRotulo;
    private javax.swing.JRadioButton trabalhoJBT;
    // End of variables declaration//GEN-END:variables
}
