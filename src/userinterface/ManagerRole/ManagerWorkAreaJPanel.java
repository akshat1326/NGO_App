/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManagerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.EmployeeOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.NgoAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationEventWorkRequest;
import Business.WorkQueue.HodApprovalWorkRequest;
import Business.WorkQueue.ManagerApprovalWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshat Gupta
 */
public class ManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ManagerOrganization managerOrganization;
    
    public ManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.managerOrganization = (ManagerOrganization)organization;
        populateTable();
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
        workRequestJTable = new javax.swing.JTable();
        rejectedJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        approvedJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Team Volunteering Activity Request");

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Event Date", "Event Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(workRequestJTable);

        rejectedJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rejectedJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/reject.png"))); // NOI18N
        rejectedJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rejectedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectedJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/refresh.png"))); // NOI18N
        refreshJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        approvedJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        approvedJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/approve.png"))); // NOI18N
        approvedJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        approvedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(refreshJButton)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(approvedJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rejectedJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectedJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approvedJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof EmployeeOrganization){
                        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                            if(request instanceof ManagerApprovalWorkRequest){
                                ManagerApprovalWorkRequest req = (ManagerApprovalWorkRequest)request;
                                if(request.getReceiver() == userAccount & request.getStatus().equals("Pending with Manager")){
                                    Object[] row = new Object[3];
                        //            row[0] = request;
                        //            row[1] = request.getSender().getEmployee().getName();
                        //            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                        //            row[3] = request.getStatus();
                                    row[0] = request;
                                    row[1] = req.getNgoEventReq().getDate();
                                    row[2] = req.getNgoEventReq().getDuration();
    //                                row[3] = request.getVenue();

                                    model.addRow(row);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    
    private void rejectedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectedJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        HodApprovalWorkRequest request = (HodApprovalWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
//
        request.setStatus("Rejected");    
        
        JOptionPane.showMessageDialog(null, "Rejected!");
        
        populateTable();
//
//        EmployeeEventRegistrationJPanel empEventRegistrationJPanel = new EmployeeEventRegistrationJPanel(userProcessContainer, request);
//        userProcessContainer.add("empEventRegistrationJPanel", empEventRegistrationJPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_rejectedJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();        //        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void approvedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }
        
        
        ManagerApprovalWorkRequest request = (ManagerApprovalWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        EducationEventWorkRequest ngoEventReq = request.getNgoEventReq();
        if(ngoEventReq.getEmployeeList().size() < Integer.parseInt(ngoEventReq.getInstructorRequired())){
            request.setStatus("Registered");
            UserAccount senderOfrequest = request.getSender();
            Employee senderEmp = senderOfrequest.getEmployee();
            ngoEventReq.getEmployeeList().add(senderEmp);
            senderOfrequest.getWorkQueue().getWorkRequestList().add(ngoEventReq);;
        }
        else{
            request.setStatus("Waitlisted");
            UserAccount senderOfrequest = request.getSender();
            Employee senderEmp = senderOfrequest.getEmployee();
            ngoEventReq.getEmployeeWaitList().add(senderEmp);
        }
        
        JOptionPane.showMessageDialog(null, "Approved!");
        populateTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_approvedJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approvedJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton rejectedJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
