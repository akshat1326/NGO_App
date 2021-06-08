/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NgoAdminRole;

import Business.Enterprise.Enterprise;
import Business.Organization.HrOrganization;
import Business.Organization.NgoAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationEventWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Akshat Gupta
 */
public class CreateEducationWorkshopJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateEducationWorkshopJPanel
     */
    
    private JPanel userProcessContainer;
    UserAccount userAccount;
    Enterprise enterprise;
    //private EcoSystem system;
    
    
    public CreateEducationWorkshopJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        //this.system = system;
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        instructorNumberTextBox = new javax.swing.JTextField();
        venueTextBox = new javax.swing.JTextField();
        dateTextBox = new javax.swing.JTextField();
        backJButton3 = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        durationTextBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        topicsTextBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        workshopNameTextBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        deadlineDateTextBox = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create Educational Workshop");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Instructors required :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Venue :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Date of Event :");

        instructorNumberTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructorNumberTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorNumberTextBoxActionPerformed(evt);
            }
        });

        venueTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        dateTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        backJButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/back.png"))); // NOI18N
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });

        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/submit.png"))); // NOI18N
        submitJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Duration of workshop :");

        durationTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Topics to be taught:");

        topicsTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Workshop Name:");

        workshopNameTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        workshopNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workshopNameTextBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Registration Deadline:");

        deadlineDateTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(workshopNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deadlineDateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(topicsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backJButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitJButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(venueTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addComponent(dateTextBox, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(instructorNumberTextBox, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(durationTextBox)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(workshopNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(instructorNumberTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(venueTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durationTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(topicsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(deadlineDateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton3)
                    .addComponent(submitJButton))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        if(workshopNameTextBox.getText().equals("") || instructorNumberTextBox.getText().equals("") || dateTextBox.getText().equals("") || venueTextBox.getText().equals("") || topicsTextBox.getText().equals("")|| durationTextBox.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"One or more fields are empty");
                return;
            }
        int instructorNum;
        try{
            instructorNum = Integer.parseInt(instructorNumberTextBox.getText());
            String workshopName = workshopNameTextBox.getText();
        String instructorNumber = instructorNumberTextBox.getText();
        String date = dateTextBox.getText();
        String venue = venueTextBox.getText();
        String topics = topicsTextBox.getText();
        String duration = durationTextBox.getText();
        String deadline = deadlineDateTextBox.getText();
//        Date date1 = (Date) datePicker.getDate();
        
        EducationEventWorkRequest request = new EducationEventWorkRequest();
        request.setVenue(venue);
        request.setDate(date);
        request.setInstructorRequired(instructorNumber);
        request.setSender(userAccount);
        request.setStatus("Sent to Corporates");
        request.setNgoName(enterprise.getName());
        request.setDuration(duration);
        request.setTopics(topics);
        request.setWorkshopName(workshopName);
        request.setDeadline(deadline);
//        request.setEventDate(date1);
        
        Organization org = null;
        //Enterprise enterprise = 
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof NgoAdminOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
//            System.out.println(org.getWorkQueue().getWorkRequestList());
        }
        JOptionPane.showMessageDialog(null, "Education Workshop Created Successfully. Corporates notified!");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Enter a valid number for Instructor Required!");
        }
        
        instructorNumberTextBox.setText("");
        workshopNameTextBox.setText("");
        dateTextBox.setText("");
        venueTextBox.setText("");
        topicsTextBox.setText("");
        durationTextBox.setText("");
        deadlineDateTextBox.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void instructorNumberTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorNumberTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instructorNumberTextBoxActionPerformed

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        Component[] comps = userProcessContainer.getComponents();
        for(Component c: comps) {
            if(c instanceof educationEventJPanel) {
                educationEventJPanel panel = (educationEventJPanel) c;
                panel.populateTable();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed

    private void workshopNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workshopNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workshopNameTextBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton3;
    private javax.swing.JTextField dateTextBox;
    private javax.swing.JTextField deadlineDateTextBox;
    private javax.swing.JTextField durationTextBox;
    private javax.swing.JTextField instructorNumberTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField topicsTextBox;
    private javax.swing.JTextField venueTextBox;
    private javax.swing.JTextField workshopNameTextBox;
    // End of variables declaration//GEN-END:variables
}
