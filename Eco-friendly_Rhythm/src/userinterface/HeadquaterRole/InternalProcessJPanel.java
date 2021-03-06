/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HeadquaterRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Supplier;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InternalWorkRequest;

import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class InternalProcessJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private InternalWorkRequest request;
    SupplierOrganization business;
    Enterprise enterprise;
    Organization org;
    Network network;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form InternalProcessJPanel
     */

    InternalProcessJPanel(JPanel userProcessContainer, Organization org, Network network, Enterprise enterprise, InternalWorkRequest request, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.system = system;
        this.enterprise = enterprise;
        this.org = org;
        this.network = network;
        txtFunds.setText(String.valueOf(network.getFunds()));
        txtRequested.setText(request.getEmployee().getName());
        txtTotal.setText(String.valueOf(request.getTotalBill()));
        populateComboBox();
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
        txtTotal = new javax.swing.JTextField();
        txtRequested = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFunds = new javax.swing.JTextField();
        btnDecline = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbSupplier = new javax.swing.JComboBox<String>();
        btnAssign = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Requested  By:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Bill:");

        txtTotal.setEnabled(false);

        txtRequested.setEnabled(false);
        txtRequested.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRequestedActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Funds:");

        txtFunds.setEnabled(false);

        btnDecline.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Supplier :");

        cbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSupplierActionPerformed(evt);
            }
        });

        btnAssign.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAssign)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnDecline))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel1)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtRequested, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtFunds)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(257, 257, 257))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(txtRequested, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(52, 52, 52)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(txtFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbSupplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAssign)
                                        .addComponent(btnDecline))
                                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRequestedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRequestedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRequestedActionPerformed

    private void cbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSupplierActionPerformed

    public void populateComboBox() {
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        System.out.println(org.getName());
        for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
            System.out.println(ua.getUsername());
            if (ua.getRole() instanceof Supplier) {
                System.out.println("Found");
                Employee e = ua.getEmployee();
                dm.addElement(e);
            }
        }
        cbSupplier.setModel(dm);
    }

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:

        Employee selectedItem = (Employee) cbSupplier.getSelectedItem();
        if (selectedItem == null) {
            return;
        }

        //update Logistics, Investors
        System.out.println("IP: " + request.getEmployee());
        System.out.println(request.getStatus());
        request.setStatus("assigned to Supplier");
        request.setSupplierAssigned(selectedItem);
        System.out.println(request.getStatus());
        selectedItem.addEmployeeRequest(request);
        JOptionPane.showMessageDialog(null, "Supplier assigned successfully");
        network.setFunds((int) (network.getFunds() - request.getTotalBill()));

        //back to page
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);

        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        // TODO add your handling code here:

        request.setStatus("Declined");
        JOptionPane.showMessageDialog(null, "Declined Successfully!");

        //back to page
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);

        dB4OUtil.storeSystem(system);

    }//GEN-LAST:event_btnDeclineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnDecline;
    private javax.swing.JComboBox<String> cbSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtFunds;
    private javax.swing.JTextField txtRequested;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
