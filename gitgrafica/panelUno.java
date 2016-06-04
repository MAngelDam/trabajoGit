/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitgrafica;

import javax.swing.JLabel;


public class panelUno extends javax.swing.JPanel
{

    
    public panelUno()
    {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        labelCabecera = new javax.swing.JLabel();
        butBotonaco = new javax.swing.JButton();
        labelDni = new javax.swing.JLabel();
        labelNombrea = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();

        labelCabecera.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCabecera.setText("PANEL PRIMER PASO");

        butBotonaco.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        butBotonaco.setText("PETARDAZO");
        butBotonaco.setToolTipText("");
        butBotonaco.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                butBotonacoActionPerformed(evt);
            }
        });

        labelDni.setText("Dni");

        labelNombrea.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelNombrea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelDni)
                                .addGap(27, 27, 27)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(butBotonaco))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(labelCabecera)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(labelCabecera)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDni)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombrea)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butBotonaco, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butBotonacoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_butBotonacoActionPerformed
    {//GEN-HEADEREND:event_butBotonacoActionPerformed
        
    }//GEN-LAST:event_butBotonacoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBotonaco;
    private javax.swing.JLabel labelCabecera;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelNombrea;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
