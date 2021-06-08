/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ChildOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshat Gupta
 */
public class DoctorPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPrescriptionJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private EcoSystem business;
    private HealthEventWorkRequest request;
    private Enterprise enterprise;
    
    public DoctorPrescriptionJPanel(JPanel userProcessContainer, HealthEventWorkRequest ngoEvtReq, Organization doctorOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.organization = (DoctorOrganization)doctorOrganization;
        this.request = ngoEvtReq;
        this.enterprise = enterprise;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)childJTable.getModel();
        
        model.setRowCount(0);
        for(Network network : business.getNetworkList()){
            for(Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization org : enterprise1.getOrganizationDirectory().getOrganizationList()){
                    if(org instanceof ChildOrganization){
                        for(Employee child : org.getEmployeeDirectory().getEmployeeList()){
                            if(!request.getPrescribedChildList().contains(child)){
                                Object[] row = new Object[1];
                    //            row[0] = request;
                    //            row[1] = request.getSender().getEmployee().getName();
                    //            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                    //            row[3] = request.getStatus();
                                row[0] = child;

                                model.addRow(row);
                            }   
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
        childJTable = new javax.swing.JTable();
        backJButton3 = new javax.swing.JButton();
        createPrescriptionJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create Prescription for Children");

        childJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        childJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child Name"
            }
        ));
        jScrollPane1.setViewportView(childJTable);

        backJButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/back.png"))); // NOI18N
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });

        createPrescriptionJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createPrescriptionJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/create prescription.png"))); // NOI18N
        createPrescriptionJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        createPrescriptionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPrescriptionJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createPrescriptionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton3)
                    .addComponent(createPrescriptionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed

    private void createPrescriptionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPrescriptionJButtonActionPerformed
        int selectedRow = childJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        Employee child = (Employee)childJTable.getValueAt(selectedRow, 0);

        //        request.setStatus("Processing");

        CreatePrescriptionJPanel createPrescriptionJPanel = new CreatePrescriptionJPanel(userProcessContainer, request, organization, child);
        userProcessContainer.add("createPrescriptionJPanel", createPrescriptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_createPrescriptionJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton3;
    private javax.swing.JTable childJTable;
    private javax.swing.JButton createPrescriptionJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
