/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ChildRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NgoAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationEventWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshat Gupta
 */
public class ChildWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChildWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    EcoSystem business;
    
    public ChildWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)QuizJTable.getModel();
        
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof NgoAdminOrganization){
                        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                            if(request instanceof EducationEventWorkRequest){
                                if(!(account.getEmployee().getQuizTakenEdEventWorkReq().size()>0 & account.getEmployee().getQuizTakenEdEventWorkReq().contains(request))){
                                EducationEventWorkRequest req = (EducationEventWorkRequest) request;
                                if(req.getQuiz() != null){
                                Object[] row = new Object[3];
                    //            row[0] = request;
                    //            row[1] = request.getSender().getEmployee().getName();
                    //            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                    //            row[3] = request.getStatus();
                                row[0] = req;
                                row[1] = req.getWorkshopName();
                                row[2] = req.getQuiz().getQuizName();

                                model.addRow(row);
                                }
                                }
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
        takeQuizJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        QuizJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quiz Area !!");

        takeQuizJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        takeQuizJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/take quiz.png"))); // NOI18N
        takeQuizJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        takeQuizJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeQuizJButtonActionPerformed(evt);
            }
        });

        QuizJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        QuizJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NGO", "Workshop", "Quiz Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(QuizJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(takeQuizJButton)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(takeQuizJButton)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void takeQuizJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeQuizJButtonActionPerformed
        int selectedRow = QuizJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        EducationEventWorkRequest request = (EducationEventWorkRequest)QuizJTable.getValueAt(selectedRow, 0);
        
        ChildQuizJPanel childQuizJPanel = new ChildQuizJPanel(userProcessContainer, request, account);
        userProcessContainer.add("childQuizJPanel", childQuizJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_takeQuizJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable QuizJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton takeQuizJButton;
    // End of variables declaration//GEN-END:variables
}