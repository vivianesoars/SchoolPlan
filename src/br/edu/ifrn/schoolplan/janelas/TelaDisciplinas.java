/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.schoolplan.janelas;

import br.edu.ifrn.schoolplan.classes.Disciplina;
import br.edu.ifrn.schoolplan.classes.SchoolPlan;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class TelaDisciplinas extends javax.swing.JFrame {

    SchoolPlan plan;
    private DefaultListModel<String> model;
    
    
    public TelaDisciplinas() {
        initComponents();
        plan = new SchoolPlan();
        model = new DefaultListModel<>();
        listaDisciplinas.setModel(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MyDisciplinas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDisciplinas = new javax.swing.JList<>();
        jSeparator2 = new javax.swing.JSeparator();
        professorRotulo = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        nomeProfessor = new javax.swing.JLabel();
        discipRotulo = new javax.swing.JLabel();
        addDisciplina = new javax.swing.JButton();
        corRotulo = new javax.swing.JLabel();
        cor = new javax.swing.JPanel();
        gerNotas = new javax.swing.JButton();
        removeDisciplina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Disciplinas");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setToolTipText("");

        MyDisciplinas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MyDisciplinas.setText("Minhas disciplinas");

        listaDisciplinas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaDisciplinas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detalhar(evt);
            }
        });
        jScrollPane1.setViewportView(listaDisciplinas);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        professorRotulo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        professorRotulo.setText("Professor(a)");

        status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        status.setText("Status");

        nomeProfessor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        discipRotulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        discipRotulo.setText("Disciplina");

        addDisciplina.setText("Adicionar disciplina");
        addDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDisciplinaActionPerformed(evt);
            }
        });

        corRotulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        corRotulo.setText("Cor");

        javax.swing.GroupLayout corLayout = new javax.swing.GroupLayout(cor);
        cor.setLayout(corLayout);
        corLayout.setHorizontalGroup(
            corLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        corLayout.setVerticalGroup(
            corLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        gerNotas.setText("Gerenciar notas");
        gerNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerNotasActionPerformed(evt);
            }
        });

        removeDisciplina.setText("Remover disciplina");
        removeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MyDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDisciplina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeDisciplina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(nomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(discipRotulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(status)
                            .addComponent(professorRotulo)
                            .addComponent(corRotulo)
                            .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 125, Short.MAX_VALUE)
                        .addComponent(gerNotas)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(status)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(discipRotulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(professorRotulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(corRotulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MyDisciplinas)
                                .addGap(14, 14, 14)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(addDisciplina))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gerNotas)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeDisciplina)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDisciplinaActionPerformed
        NovaDisciplina nd = new NovaDisciplina(plan);
        nd.setVisible(true);
    }//GEN-LAST:event_addDisciplinaActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        carregarLista();
    }//GEN-LAST:event_formWindowGainedFocus

    private void removeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDisciplinaActionPerformed
        if(!listaDisciplinas.isSelectionEmpty()){
            int opcao = JOptionPane.showConfirmDialog(this, "Deseja excluir a disciplina?");
            if(opcao == JOptionPane.YES_OPTION){
                Disciplina d = plan.getDisciplinas().get(listaDisciplinas.getSelectedIndex());
                plan.removerDisciplina(d);
                carregarLista();
            }
        }
    }//GEN-LAST:event_removeDisciplinaActionPerformed

    private void detalhar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detalhar
       discipRotulo.setText(plan.getDisciplinas().get(listaDisciplinas.getSelectedIndex()).toString());
       nomeProfessor.setText(plan.getDisciplinas().get(listaDisciplinas.getSelectedIndex()).getProfessor());
       cor.setBackground(plan.getDisciplinas().get(listaDisciplinas.getSelectedIndex()).getCor());
    }//GEN-LAST:event_detalhar

    private void gerNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerNotasActionPerformed
        GereNotas gn = new GereNotas(plan.getDisciplinas().get(listaDisciplinas.getSelectedIndex()));
        gn.setVisible(true);
        dispose();
    }//GEN-LAST:event_gerNotasActionPerformed

    
    public void carregarLista(){
        model.clear();
        for(Disciplina d : plan.getDisciplinas()){
            model.addElement(d.toString());
        }
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MyDisciplinas;
    private javax.swing.JButton addDisciplina;
    private javax.swing.JPanel cor;
    private javax.swing.JLabel corRotulo;
    private javax.swing.JLabel discipRotulo;
    private javax.swing.JButton gerNotas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JList<String> listaDisciplinas;
    private javax.swing.JLabel nomeProfessor;
    private javax.swing.JLabel professorRotulo;
    private javax.swing.JButton removeDisciplina;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
