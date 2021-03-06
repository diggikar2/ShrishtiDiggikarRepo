/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Item;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author SHRISHTI
 */
public class AdminManageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminManageOrderJPanel
     */
    
    private JPanel container;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    
    public AdminManageOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();
        this.container = userProcessContainer;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
        jPanelOrderSummary.setVisible(false);
        jPanelDM.setVisible(false);
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        logoutButton1 = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        btnAcceptOrder = new javax.swing.JButton();
        btnRejectOrder = new javax.swing.JButton();
        btnAssignDeliveryMan = new javax.swing.JButton();
        jPanelOrderSummary = new javax.swing.JPanel();
        jLabelOrderId2 = new javax.swing.JLabel();
        jLabelOrderID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelOrderId = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelOrderId4 = new javax.swing.JLabel();
        jLabelOrderDate = new javax.swing.JLabel();
        jLabelCustId = new javax.swing.JLabel();
        jLabelCustomerID = new javax.swing.JLabel();
        jLabelOrderId3 = new javax.swing.JLabel();
        jLabelNote = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableItems = new javax.swing.JTable();
        jLabelOrderId5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelDM = new javax.swing.JPanel();
        assignButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboDeliveryMan = new javax.swing.JComboBox<>();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Date & Time", "CustomerID", "OrderID", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });

        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        btnAcceptOrder.setText("Accept Order");
        btnAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrderActionPerformed(evt);
            }
        });

        btnRejectOrder.setText("Reject Order");
        btnRejectOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectOrderActionPerformed(evt);
            }
        });

        btnAssignDeliveryMan.setText("Assign Delivery Man");
        btnAssignDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryManActionPerformed(evt);
            }
        });

        jPanelOrderSummary.setOpaque(false);
        jPanelOrderSummary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOrderId2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelOrderId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderId2.setText("Total Price:");
        jPanelOrderSummary.add(jLabelOrderId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 89, 99, -1));

        jLabelOrderID.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jLabelOrderID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOrderSummary.add(jLabelOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 67, 181, 16));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel4.setText("Order Summary");
        jPanelOrderSummary.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 30));

        jLabelOrderId.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelOrderId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderId.setText("OrderID:");
        jPanelOrderSummary.add(jLabelOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 67, 99, -1));

        jLabelPrice.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jLabelPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOrderSummary.add(jLabelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 89, 181, 16));

        jLabelOrderId4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelOrderId4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderId4.setText("Date and Time:");
        jPanelOrderSummary.add(jLabelOrderId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 10, 99, -1));

        jLabelOrderDate.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jLabelOrderDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOrderSummary.add(jLabelOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 11, 111, 16));

        jLabelCustId.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelCustId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCustId.setText("CustomerID:");
        jPanelOrderSummary.add(jLabelCustId, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 45, 99, -1));

        jLabelCustomerID.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jLabelCustomerID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOrderSummary.add(jLabelCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 45, 180, 16));

        jLabelOrderId3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelOrderId3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderId3.setText("Order Note:");
        jPanelOrderSummary.add(jLabelOrderId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 111, 99, -1));

        jLabelNote.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jLabelNote.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOrderSummary.add(jLabelNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 111, 279, 16));

        jTableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableItems);

        jPanelOrderSummary.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 133, 279, 84));

        jLabelOrderId5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabelOrderId5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderId5.setText("Order Items:");
        jPanelOrderSummary.add(jLabelOrderId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 133, 99, -1));
        jPanelOrderSummary.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jLabel1.setText("Order List");

        assignButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        assignButton.setText("Assign");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Assign Delivery Man");

        jComboDeliveryMan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelDMLayout = new javax.swing.GroupLayout(jPanelDM);
        jPanelDM.setLayout(jPanelDMLayout);
        jPanelDMLayout.setHorizontalGroup(
            jPanelDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDMLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanelDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jComboDeliveryMan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(jPanelDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDMLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelDMLayout.setVerticalGroup(
            jPanelDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDMLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jComboDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(jPanelDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDMLayout.createSequentialGroup()
                    .addGap(0, 122, Short.MAX_VALUE)
                    .addComponent(assignButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton1)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnViewOrder)
                                .addGap(18, 18, 18)
                                .addComponent(btnRejectOrder)
                                .addGap(18, 18, 18)
                                .addComponent(btnAcceptOrder)
                                .addGap(18, 18, 18)
                                .addComponent(btnAssignDeliveryMan))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanelOrderSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jPanelDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(logoutButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewOrder)
                    .addComponent(btnRejectOrder)
                    .addComponent(btnAcceptOrder)
                    .addComponent(btnAssignDeliveryMan))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jPanelOrderSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanelDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_workRequestJTableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        int rowNumber = workRequestJTable.getSelectedRow();
        Order o = this.userAccount.getOrders().getOrderDirectory().get(dtm.getValueAt(rowNumber, 2));
        o.setStatus("Assigned");
        if(jComboDeliveryMan.getSelectedItem().toString().equals("Select Delivery Man"))
        JOptionPane.showMessageDialog(null, "Please select delivery man to be assigned");
        else{
            StringBuilder s= new StringBuilder(jComboDeliveryMan.getSelectedItem().toString());
            String [] split=s.toString().split(" - ");
            DeliveryMan dm= this.ecosystem.getDeliveryManDirectory().findDeliveryMan(split[1]);
            o.setDeliveryManName(dm.getFirstName()+" "+dm.getLastName());
            dm.getDeliveryManAccount().getOrders().newOrder(o);
            JOptionPane.showMessageDialog(null, "Order Assigned.");
            dtm.removeRow(rowNumber);
            populateRequestTable();
            jPanelDM.setVisible(false);
        }

    }//GEN-LAST:event_assignButtonActionPerformed

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        LoginPageJPanel lpp= new LoginPageJPanel(container, ecosystem, dB4OUtil);
        container.add("LoginPageJPanel", lpp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        int rowNumber = workRequestJTable.getSelectedRow();
        if (rowNumber != -1) {
            jPanelOrderSummary.setVisible(true);
            Order o = this.userAccount.getOrders().getOrderDirectory().get(dtm.getValueAt(rowNumber, 2).toString());
            jLabelOrderID.setText(o.getOrderId());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
            jLabelOrderDate.setText(o.getOrderDateTime().format(formatter));
            jLabelPrice.setText(String.valueOf(o.getOrderTotal()));
            jLabelCustomerID.setText(o.getCustomerId());
            jLabelNote.setText(o.getCustomerNotes());
            DefaultTableModel dtmItems = (DefaultTableModel) jTableItems.getModel();
            dtmItems.setRowCount(0);
            for (Item i : o.getItemList().keySet()) {
                Object[] row = new Object[2];
                row[0] = i.getItemName();
                row[1] = o.getItemList().get(i);
                dtmItems.addRow(row);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select an order.");
        }

    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrderActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        int rowNumber = workRequestJTable.getSelectedRow();
        if (rowNumber != -1) {
            String status = dtm.getValueAt(rowNumber, 4).toString();
            if (status.equals("Cancelled") | status.equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Order already cancelled or rejected");
            } else if (status.equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Order already accepted");
            } else {
                Order o = this.userAccount.getOrders().getOrderDirectory().get(dtm.getValueAt(rowNumber, 2));
                int result = JOptionPane.showConfirmDialog(null, "Are you sure?");
                if (result == JOptionPane.YES_OPTION) {
                    o.setStatus("Accepted");
                    o.setDeliveryManName("To be Assigned");
                    JOptionPane.showMessageDialog(null, "Order Accepted.");
                    dtm.removeRow(rowNumber);
                    populateRequestTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select an order to cancel.");
        }
        
    }//GEN-LAST:event_btnAcceptOrderActionPerformed

    private void btnRejectOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectOrderActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        int rowNumber = workRequestJTable.getSelectedRow();
        if (rowNumber != -1) {
            String status = dtm.getValueAt(rowNumber, 4).toString();
            if (status.equals("Cancelled") | status.equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Order already cancelled or rejected");
            } else {
                Order o = this.userAccount.getOrders().getOrderDirectory().get(dtm.getValueAt(rowNumber, 2));
                int result = JOptionPane.showConfirmDialog(null, "Are you sure?");
                if (result == JOptionPane.YES_OPTION) {
                    o.setStatus("Rejected");
                    o.setDeliveryManName("-NA-");
                    JOptionPane.showMessageDialog(null, "Order Rejected.");
                    dtm.removeRow(rowNumber);
                    populateRequestTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select an order to cancel.");
        }
    }//GEN-LAST:event_btnRejectOrderActionPerformed

    private void btnAssignDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryManActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        int rowNumber = workRequestJTable.getSelectedRow();
        if (rowNumber != -1) {
            String status = dtm.getValueAt(rowNumber, 4).toString();
            if (status.equals("Cancelled") | status.equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Order already cancelled or rejected");
            } else if (status.equals("Ordered")) {
                JOptionPane.showMessageDialog(null, "Accept order to assign delivery man.");
            } else if (status.equals("Assigned")) {
                JOptionPane.showMessageDialog(null, "Delivery man already assigned.");
            } else {
                jPanelDM.setVisible(true);
                displayCombo();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select an order to cancel.");
        }
    }//GEN-LAST:event_btnAssignDeliveryManActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnAcceptOrder;
    private javax.swing.JButton btnAssignDeliveryMan;
    private javax.swing.JButton btnRejectOrder;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JComboBox<String> jComboDeliveryMan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCustId;
    private javax.swing.JLabel jLabelCustomerID;
    private javax.swing.JLabel jLabelNote;
    private javax.swing.JLabel jLabelOrderDate;
    private javax.swing.JLabel jLabelOrderID;
    private javax.swing.JLabel jLabelOrderId;
    private javax.swing.JLabel jLabelOrderId2;
    private javax.swing.JLabel jLabelOrderId3;
    private javax.swing.JLabel jLabelOrderId4;
    private javax.swing.JLabel jLabelOrderId5;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JPanel jPanelDM;
    private javax.swing.JPanel jPanelOrderSummary;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableItems;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
        for (String s : this.userAccount.getOrders().getOrderDirectory().keySet()) {
            Object row[] = new Object[5];
            row[0] = this.userAccount.getOrders().getOrderDirectory().get(s).getOrderDateTime().format(formatter);
            row[1] = this.userAccount.getOrders().getOrderDirectory().get(s).getCustomerId();
            row[2] = this.userAccount.getOrders().getOrderDirectory().get(s).getOrderId();
            row[3] = this.userAccount.getOrders().getOrderDirectory().get(s).getDeliveryManName();
            row[4] = this.userAccount.getOrders().getOrderDirectory().get(s).getStatus();
            dtm.addRow(row);
        }
    }

    private void displayCombo() {
        jComboDeliveryMan.removeAllItems();
        jComboDeliveryMan.addItem("Select Delivery Man");
        for (String s : this.ecosystem.getDeliveryManDirectory().getDeliveryManList().keySet()) {
            jComboDeliveryMan.addItem(this.ecosystem.getDeliveryManDirectory().findDeliveryMan(s).toString()+
                    " - "+this.ecosystem.getDeliveryManDirectory().findDeliveryMan(s).getDelId());
        }
    }
}
