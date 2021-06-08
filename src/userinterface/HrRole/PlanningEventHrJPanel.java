/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HrRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationEventWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshat Gupta
 */
public class PlanningEventHrJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlanningEventHrJPanel
     */
    JPanel userProcessContainer;
    EducationEventWorkRequest request;
    UserAccount account;
    Enterprise enterprise;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public PlanningEventHrJPanel(JPanel userProcessContainer, EducationEventWorkRequest request, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.account=account;
        this.enterprise = enterprise;
        ngoTextBox.setText(request.getNgoName());
        workshopTextBox.setText(request.getWorkshopName());
        instructorsRequiredTextBox.setText(request.getInstructorRequired());
        dateTextBox.setText(request.getDate());
        venueTextBox.setText(request.getVenue());
        subjectTextBox.setText(request.getTopics());
        durationTextBox.setText(request.getDuration());
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ngoTextBox = new javax.swing.JTextField();
        instructorsRequiredTextBox = new javax.swing.JTextField();
        dateTextBox = new javax.swing.JTextField();
        venueTextBox = new javax.swing.JTextField();
        subjectTextBox = new javax.swing.JTextField();
        durationTextBox = new javax.swing.JTextField();
        commentsTextBox = new javax.swing.JTextField();
        notifyJButton = new javax.swing.JButton();
        backJButton3 = new javax.swing.JButton();
        workshopTextBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Education Workshop Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NGO :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Instructors Required :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Date :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Venue:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Subject to be taught:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Event duration:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Comments :");

        ngoTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        instructorsRequiredTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructorsRequiredTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorsRequiredTextBoxActionPerformed(evt);
            }
        });

        dateTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        venueTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        subjectTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subjectTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectTextBoxActionPerformed(evt);
            }
        });

        durationTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        commentsTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        commentsTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentsTextBoxActionPerformed(evt);
            }
        });

        notifyJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        notifyJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/notify employees.png"))); // NOI18N
        notifyJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        notifyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyJButtonActionPerformed(evt);
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

        workshopTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Workshop Name :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(instructorsRequiredTextBox))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(workshopTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(subjectTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(venueTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(dateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(backJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(durationTextBox)
                                .addComponent(commentsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(notifyJButton))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(workshopTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ngoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(instructorsRequiredTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(venueTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(subjectTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(durationTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8))
                    .addComponent(commentsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton3)
                    .addComponent(notifyJButton))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void commentsTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentsTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentsTextBoxActionPerformed

    private void notifyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyJButtonActionPerformed
        
        request.setComments(commentsTextBox.getText());
//        request.setReceiver(account);
        request.setStatus("Processing");
        request.getEnterpriseList().add(enterprise.getName());
        JOptionPane.showMessageDialog(null, "Employees Notified");
        ngoTextBox.setText("");
        instructorsRequiredTextBox.setText("");
        dateTextBox.setText("");
        venueTextBox.setText("");
        subjectTextBox.setText("");
        durationTextBox.setText("");
        workshopTextBox.setText("");
        commentsTextBox.setText("");
//        Email email = EmailBuilder.startingBlank()
//        .from("lollypop", "lolly.pop@pretzelfun.com")
//        .to("C. Cane", "candycane@candyshop.org")
//        .cc("C. Bo <chocobo@candyshop.org>")
//        .withSubject("hey")
//        .withPlainText("We should meet up! ;)")
//        .buildEmail();
//
//        mailer.sendMail(email);
        // TODO add your handling code here:
    }//GEN-LAST:event_notifyJButtonActionPerformed

    private void instructorsRequiredTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorsRequiredTextBoxActionPerformed
        
            // TODO add your handling code here:
    }//GEN-LAST:event_instructorsRequiredTextBoxActionPerformed

    private void subjectTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectTextBoxActionPerformed

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        Component[] comps = userProcessContainer.getComponents();
        for(Component c: comps) {
            if(c instanceof EducationalEventCorporateDashboardJPanel) {
                EducationalEventCorporateDashboardJPanel panel = (EducationalEventCorporateDashboardJPanel) c;
                panel.populateTable();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton3;
    private javax.swing.JTextField commentsTextBox;
    private javax.swing.JTextField dateTextBox;
    private javax.swing.JTextField durationTextBox;
    private javax.swing.JTextField instructorsRequiredTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField ngoTextBox;
    private javax.swing.JButton notifyJButton;
    private javax.swing.JTextField subjectTextBox;
    private javax.swing.JTextField venueTextBox;
    private javax.swing.JTextField workshopTextBox;
    // End of variables declaration//GEN-END:variables
}
