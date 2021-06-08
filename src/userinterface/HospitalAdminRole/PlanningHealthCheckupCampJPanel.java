/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshat Gupta
 */
public class PlanningHealthCheckupCampJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlanningHealthCheckupCampJPanel
     */
    private JPanel userProcessContainer;
    private HealthEventWorkRequest request;
    private UserAccount account;
    private Enterprise enterprise;
    
    public PlanningHealthCheckupCampJPanel(JPanel userProcessContainer, HealthEventWorkRequest request, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.account = account;
        this.enterprise = enterprise;
        ngoTextBox.setText(request.getNgoName());
        DoctorsRequiredTextBox.setText(request.getDoctorRequired());
        dateTextBox.setText(request.getDate());
        venueTextBox.setText(request.getVenue());
        eventTextBox.setText(request.getHealthWorkshopName());
    }
    
//    public void populateApprovedTable(){
//        DefaultTableModel model = (DefaultTableModel)approvedEmployeeJTable.getModel();
//        
//        model.setRowCount(0);
//        
//        for(Employee emp : request.getDoctorList()){
//            Object[] row = new Object[1];
//            row[0] = emp;
//             model.addRow(row);
//        }
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        venueTextBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        notifyJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ngoTextBox = new javax.swing.JTextField();
        DoctorsRequiredTextBox = new javax.swing.JTextField();
        eventTextBox = new javax.swing.JTextField();
        dateTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        commentsTextBox = new javax.swing.JTextField();
        backJButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        venueTextBox.setEditable(false);
        venueTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Venue:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NGO :");

        notifyJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        notifyJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/notify doctors.png"))); // NOI18N
        notifyJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        notifyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Doctors Required :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Comments :");

        ngoTextBox.setEditable(false);
        ngoTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        DoctorsRequiredTextBox.setEditable(false);
        DoctorsRequiredTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DoctorsRequiredTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorsRequiredTextBoxActionPerformed(evt);
            }
        });

        eventTextBox.setEditable(false);
        eventTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        dateTextBox.setEditable(false);
        dateTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Date :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Health Camp Event Details");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Event duration:");

        commentsTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        commentsTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentsTextBoxActionPerformed(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(backJButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(commentsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eventTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(venueTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorsRequiredTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notifyJButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel1))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ngoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DoctorsRequiredTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(dateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(venueTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eventTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(commentsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notifyJButton)
                    .addComponent(backJButton3))
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void notifyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyJButtonActionPerformed
        
        ngoTextBox.setText("");
        DoctorsRequiredTextBox.setText("");
        dateTextBox.setText("");
        venueTextBox.setText("");
        eventTextBox.setText("");
        commentsTextBox.setText("");
        request.setStatus("Processing");
        request.getEnterpriseList().add(enterprise.getName());
        
        request.setComments(commentsTextBox.getText());
        request.setReceiver(account);
        request.setStatus("Processing");
        JOptionPane.showMessageDialog(null, "Doctors Notified");

        // TODO add your handling code here:
    }//GEN-LAST:event_notifyJButtonActionPerformed

    private void DoctorsRequiredTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorsRequiredTextBoxActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorsRequiredTextBoxActionPerformed

    private void commentsTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentsTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentsTextBoxActionPerformed

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        Component[] comps = userProcessContainer.getComponents();
        for(Component c: comps) {
            if(c instanceof HospitalAdminWorkAreaJPanel) {
                HospitalAdminWorkAreaJPanel panel = (HospitalAdminWorkAreaJPanel) c;
                panel.populateTable();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DoctorsRequiredTextBox;
    private javax.swing.JButton backJButton3;
    private javax.swing.JTextField commentsTextBox;
    private javax.swing.JTextField dateTextBox;
    private javax.swing.JTextField eventTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField ngoTextBox;
    private javax.swing.JButton notifyJButton;
    private javax.swing.JTextField venueTextBox;
    // End of variables declaration//GEN-END:variables
}
