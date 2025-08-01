/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author CETAH
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
        setLocationRelativeTo(null);





  jPanel1.setBackground(new Color(240,248,255));
getContentPane().setBackground(new java.awt.Color(204, 255, 255)); 


jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); 
jLabel1.setForeground(new java.awt.Color(0, 102, 204)); 

  Color btnBg = new Color(30, 144, 255); // Dodger Blue
    Color btnText = Color.WHITE;
// Common style for buttons

java.awt.Font btnFont = new java.awt.Font("Arial", java.awt.Font.BOLD, 10);



viewDonor.setBackground(btnBg);
viewDonor.setForeground(btnText);
viewDonor.setFont(btnFont);


manageRequest.setBackground(btnBg); // Green
manageRequest.setForeground(btnText);
manageRequest.setFont(btnFont);

generateReport.setBackground(btnBg); // Orange
generateReport.setForeground(btnText);
generateReport.setFont(btnFont);

audiotLogButton.setBackground(btnBg); // Red-orange
audiotLogButton.setForeground(btnText);
audiotLogButton.setFont(btnFont);

sendNotification.setBackground(btnBg); // Teal green
sendNotification.setForeground(btnText);
sendNotification.setFont(btnFont);

manageStaff.setBackground(btnBg); // Sky blue
manageStaff.setForeground(btnText);
manageStaff.setFont(btnFont);

logout.setBackground(btnBg); // Red
logout.setForeground(java.awt.Color.WHITE);
logout.setFont(btnFont);


    viewDonor.setFocusPainted(false);
    manageRequest.setFocusPainted(false);
    generateReport.setFocusPainted(false);
    audiotLogButton.setFocusPainted(false);
    sendNotification.setFocusPainted(false);
    manageStaff.setFocusPainted(false);
    logout.setFocusPainted(false);
  


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
        logout = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        audiotLogButton = new javax.swing.JButton();
        viewDonor = new javax.swing.JButton();
        manageRequest = new javax.swing.JButton();
        generateReport = new javax.swing.JButton();
        sendNotification = new javax.swing.JButton();
        manageStaff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Welcome,Boss!");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 40));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-log-out-34.png"))); // NOI18N
        logout.setText("Logout");
        logout.setToolTipText("");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(51, 255, 255));

        audiotLogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-audit-64.png"))); // NOI18N
        audiotLogButton.setText("View Audit Log");
        audiotLogButton.setMaximumSize(new java.awt.Dimension(170, 70));
        audiotLogButton.setMinimumSize(new java.awt.Dimension(170, 70));
        audiotLogButton.setPreferredSize(new java.awt.Dimension(150, 40));
        audiotLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audiotLogButtonActionPerformed(evt);
            }
        });

        viewDonor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewDonor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-view-64.png"))); // NOI18N
        viewDonor.setText("View Donor");
        viewDonor.setMaximumSize(new java.awt.Dimension(170, 70));
        viewDonor.setMinimumSize(new java.awt.Dimension(170, 70));
        viewDonor.setPreferredSize(new java.awt.Dimension(150, 40));
        viewDonor.setRolloverEnabled(false);
        viewDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDonorActionPerformed(evt);
            }
        });

        manageRequest.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        manageRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-manage-64.png"))); // NOI18N
        manageRequest.setText("Manage Request");
        manageRequest.setMaximumSize(new java.awt.Dimension(170, 70));
        manageRequest.setMinimumSize(new java.awt.Dimension(170, 70));
        manageRequest.setPreferredSize(new java.awt.Dimension(150, 40));
        manageRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRequestActionPerformed(evt);
            }
        });

        generateReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-generate-income-64.png"))); // NOI18N
        generateReport.setText("Generate Report");
        generateReport.setMaximumSize(new java.awt.Dimension(170, 70));
        generateReport.setMinimumSize(new java.awt.Dimension(170, 70));
        generateReport.setPreferredSize(new java.awt.Dimension(150, 40));
        generateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportActionPerformed(evt);
            }
        });

        sendNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-send-64.png"))); // NOI18N
        sendNotification.setText("Send Notification");
        sendNotification.setMaximumSize(new java.awt.Dimension(170, 70));
        sendNotification.setMinimumSize(new java.awt.Dimension(170, 70));
        sendNotification.setPreferredSize(new java.awt.Dimension(150, 40));
        sendNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendNotificationActionPerformed(evt);
            }
        });

        manageStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-staff-64.png"))); // NOI18N
        manageStaff.setText("Manage Staff");
        manageStaff.setMaximumSize(new java.awt.Dimension(170, 70));
        manageStaff.setMinimumSize(new java.awt.Dimension(170, 70));
        manageStaff.setPreferredSize(new java.awt.Dimension(150, 40));
        manageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStaffActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(audiotLogButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(viewDonor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(manageRequest, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(generateReport, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(sendNotification, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(manageStaff, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(viewDonor, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addComponent(generateReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(sendNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageStaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(audiotLogButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(audiotLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(logout))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLayeredPane1)
                .addGap(129, 129, 129)
                .addComponent(logout)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDonorActionPerformed
        new ViewDonorsForm().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_viewDonorActionPerformed

    private void manageRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRequestActionPerformed
       new ManageRequestForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_manageRequestActionPerformed

    private void generateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportActionPerformed
       new GenerateReportForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_generateReportActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       new LoginForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void sendNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendNotificationActionPerformed
       new SendNotificationForm().setVisible(true);
    }//GEN-LAST:event_sendNotificationActionPerformed

    private void manageStaffActionPerformed(java.awt.event.ActionEvent evt) {                                            
        new ManageStaffForm().setVisible(true);
        this.dispose();
        
       
    }

    private void audiotLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audiotLogButtonActionPerformed
        new AuditLogForm().setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(this,"Coming Soon!");
    }//GEN-LAST:event_audiotLogButtonActionPerformed

  
    public static void main(String args[]) {
       

  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton audiotLogButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton generateReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton manageRequest;
    private javax.swing.JButton manageStaff;
    private javax.swing.JButton sendNotification;
    private javax.swing.JButton viewDonor;
    // End of variables declaration//GEN-END:variables
}
