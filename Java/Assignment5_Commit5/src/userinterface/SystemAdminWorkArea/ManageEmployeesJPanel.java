/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHRISHTI
 */
public class ManageEmployeesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeesJPanel
     */
    
    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    
    public ManageEmployeesJPanel(JPanel container, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        populateTable();
        jPanel1.setVisible(false);
        jPanelAssignAdmin.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeJTable = new javax.swing.JTable();
        addEmployeeButton = new javax.swing.JButton();
        removeEmployeeButton = new javax.swing.JButton();
        assignAdminButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelPassword = new javax.swing.JLabel();
        labelFirstName = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        labelusername = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        addEmpButton = new javax.swing.JButton();
        jPanelAssignAdmin = new javax.swing.JPanel();
        assignButton1 = new javax.swing.JButton();
        jComboRestaurant1 = new javax.swing.JComboBox<>();

        logoutButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Employees ");

        employeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Admin"
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
        employeeJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeJTable);

        addEmployeeButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        addEmployeeButton.setText("Add Employee");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        removeEmployeeButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        removeEmployeeButton.setText("Remove Employee");
        removeEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmployeeButtonActionPerformed(evt);
            }
        });

        assignAdminButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        assignAdminButton.setText("Assign as Admin");
        assignAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignAdminButtonActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        labelPassword.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPassword.setText("Password:");

        labelFirstName.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFirstName.setText("Employee Name:");

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        labelusername.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelusername.setText("User Name:");

        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });

        addEmpButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        addEmpButton.setText("Add");
        addEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelusername, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelusername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addEmpButton)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanelAssignAdmin.setOpaque(false);

        assignButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        assignButton1.setText("Assign");
        assignButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButton1ActionPerformed(evt);
            }
        });

        jComboRestaurant1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboRestaurant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRestaurant1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAssignAdminLayout = new javax.swing.GroupLayout(jPanelAssignAdmin);
        jPanelAssignAdmin.setLayout(jPanelAssignAdminLayout);
        jPanelAssignAdminLayout.setHorizontalGroup(
            jPanelAssignAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAssignAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboRestaurant1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelAssignAdminLayout.setVerticalGroup(
            jPanelAssignAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAssignAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAssignAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboRestaurant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignButton1))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(removeEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelAssignAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(assignAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(229, 229, 229))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(logoutButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addEmployeeButton)
                    .addComponent(removeEmployeeButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignAdminButton)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelAssignAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void employeeJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeJTableMouseClicked

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(true);
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void removeEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmployeeButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) employeeJTable.getModel();
        int rowNumber = employeeJTable.getSelectedRow();
        if (rowNumber != -1) {
            int result = JOptionPane.showConfirmDialog(null, "Confirm?");
            if (result == JOptionPane.YES_OPTION) {
                DeliveryMan d = this.ecosystem.getDeliveryManDirectory().findDeliveryMan(dtm.getValueAt(rowNumber, 0).toString());
                this.ecosystem.getUserAccountDirectory().removeUserAccount(d.getDeliveryManAccount().getUsername());
                this.ecosystem.getDeliveryManDirectory().removeDeliveryMan(dtm.getValueAt(rowNumber, 0).toString());
                dtm.removeRow(rowNumber);
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select employee to remove.");
        }
    }//GEN-LAST:event_removeEmployeeButtonActionPerformed

    private void assignAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignAdminButtonActionPerformed
        // TODO add your handling code here:

        assignAdminButton.setVisible(false);
        jComboRestaurant1.removeAllItems();
        DefaultTableModel dtm = (DefaultTableModel) employeeJTable.getModel();
        int rowNumber = employeeJTable.getSelectedRow();
        if (rowNumber != -1) {
            if(!dtm.getValueAt(rowNumber, 2).equals("--NA--")){
                JOptionPane.showMessageDialog(null, "Cannot assign as employee is already an admin.");
                dtm.removeRow(rowNumber);
                jPanelAssignAdmin.setVisible(false);
                assignAdminButton.setVisible(true);
                populateTable();
            }
            else{
                jPanelAssignAdmin.setVisible(true);
                jComboRestaurant1.addItem("Select Restaurant");
                for (String s : this.ecosystem.getRestaurantDirectory().getRestDirectory().keySet()) {
                    jComboRestaurant1.addItem(this.ecosystem.getRestaurantDirectory().findRestaurant(s).toString());
                }
            }
            dtm.removeRow(rowNumber);
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select employee to assign.");
            jPanelAssignAdmin.setVisible(false);
            assignAdminButton.setVisible(true);
        }

    }//GEN-LAST:event_assignAdminButtonActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void addEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpButtonActionPerformed
        // TODO add your handling code here:
        if(jTextFieldFirstName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "First Name cannot be empty.");
        }else if(jTextFieldUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "User Name cannot be empty.");
        }else if(jTextFieldPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password cannot be empty.");
        }
        else if(this.ecosystem.getUserAccountDirectory().authenticateUser(jTextFieldUserName.getText(), jTextFieldPassword.getText())!=null){
            JOptionPane.showMessageDialog(null, "Username alreay taken.");
        }
        else{
            Employee e= this.ecosystem.getEmployeeDirectory().createEmployee(jTextFieldFirstName.getText());
            UserAccount user=this.ecosystem.getUserAccountDirectory().createUserAccount(jTextFieldUserName.getText(), jTextFieldPassword.getText(), new AdminRole());
            e.setUserAccount(user);
            JOptionPane.showMessageDialog(null, "Employee Added");
            jPanel1.setVisible(false);
            populateTable();
        }

    }//GEN-LAST:event_addEmpButtonActionPerformed

    private void assignButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButton1ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) employeeJTable.getModel();
        int rowNumber = employeeJTable.getSelectedRow();
        if (jComboRestaurant1.getSelectedItem().toString().equals("Select Restaurant")) {
            JOptionPane.showMessageDialog(null, "Please select restaurant to be assigned");
        } else {
            Restaurant r = this.ecosystem.getRestaurantDirectory().findResttaurantByName(jComboRestaurant1.getSelectedItem().toString());
            Employee e = this.ecosystem.getEmployeeDirectory().findEmployee(dtm.getValueAt(rowNumber, 0).toString());
            r.setRestAdmin(e.getUserAccount());
            JOptionPane.showMessageDialog(null, "Admin Assigned.");
            dtm.removeRow(rowNumber);
            populateTable();
            jPanelAssignAdmin.setVisible(false);
        }
    }//GEN-LAST:event_assignButton1ActionPerformed

    private void jComboRestaurant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRestaurant1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboRestaurant1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmpButton;
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JButton assignAdminButton;
    private javax.swing.JButton assignButton1;
    private javax.swing.JButton backButton;
    private javax.swing.JTable employeeJTable;
    private javax.swing.JComboBox<String> jComboRestaurant1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAssignAdmin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelusername;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JButton removeEmployeeButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) employeeJTable.getModel();
        dtm.setRowCount(0);
        for (String s : this.ecosystem.getEmployeeDirectory().getEmployeeList().keySet()) {
            Employee e = this.ecosystem.getEmployeeDirectory().getEmployeeList().get(s);
            Object row[] = new Object[3];
            row[0] = e.getEmpId();
            row[1] = e.getName();
            row[2] = "--NA--";
            for (String st : this.ecosystem.getRestaurantDirectory().getRestDirectory().keySet()) {
                if (this.ecosystem.getRestaurantDirectory().getRestDirectory().get(st).getRestAdmin().getUsername().equals(e.getUserAccount().getUsername())) {
                    row[2] = this.ecosystem.getRestaurantDirectory().getRestDirectory().get(st).getRestName();
                }
            }
            dtm.addRow(row);
        }

    }
}
