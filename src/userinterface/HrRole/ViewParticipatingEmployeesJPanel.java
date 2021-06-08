/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HrRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshat Gupta
 */
public class ViewParticipatingEmployeesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewParticipatingEmployeesJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    
    public ViewParticipatingEmployeesJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateTable();
    }
    
     public void populateTable(){
         
        DefaultTableModel model = (DefaultTableModel)participatedEmployeeJTable.getModel();
        
        model.setRowCount(0);
         
        for(Network network : business.getNetworkList()){
             for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                     for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                         if(request.getStatus().equals("Event Completed")){
                            Object[] row = new Object[1];
                            row[0] = request.getSender().getEmployee();
                        
                            model.addRow(row);
                         }
                     }
                 }
             }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        participatedEmployeeJTable = new javax.swing.JTable();
        backJButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Participating Employees");

        participatedEmployeeJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        participatedEmployeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Participating Employees"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(participatedEmployeeJTable);

        backJButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/back.png"))); // NOI18N
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(backJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backJButton3)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable participatedEmployeeJTable;
    // End of variables declaration//GEN-END:variables
}
