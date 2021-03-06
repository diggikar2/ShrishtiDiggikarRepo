/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author SHRISHTI
 */
public class CustomerOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerOrderJPanel
     */
    private JPanel container;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    
    public CustomerOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();
        initComponents();
        this.container = userProcessContainer;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = account;
        displayCombo();
        jPanelCheckout.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewMenuButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        addToCartButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        changeQtyButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        jPanelCheckout = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTotalQuantity = new javax.swing.JLabel();
        jLabelTotalPrice = new javax.swing.JLabel();
        jTextAreaOrderMessage = new javax.swing.JTextField();
        confirmOrderButton = new javax.swing.JButton();
        jComboRestaurants = new javax.swing.JComboBox<>();

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome to Order Panel!");

        viewMenuButton.setText("View Menu");
        viewMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMenuButtonActionPerformed(evt);
            }
        });

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Item Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTable);
        if (menuTable.getColumnModel().getColumnCount() > 0) {
            menuTable.getColumnModel().getColumn(0).setResizable(false);
            menuTable.getColumnModel().getColumn(1).setResizable(false);
            menuTable.getColumnModel().getColumn(2).setResizable(false);
        }

        addToCartButton.setText("Add to Cart");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Cart Preview");

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Total Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cartTable);
        if (cartTable.getColumnModel().getColumnCount() > 0) {
            cartTable.getColumnModel().getColumn(0).setResizable(false);
            cartTable.getColumnModel().getColumn(1).setResizable(false);
            cartTable.getColumnModel().getColumn(2).setResizable(false);
        }

        changeQtyButton.setText("Change Quantity");
        changeQtyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeQtyButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove Item");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        checkoutButton.setText("Checkout");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Items in Cart");

        jLabel5.setText("Total Price :");

        jLabel6.setText("Order Message :");

        jLabel3.setText("Order Summary");

        confirmOrderButton.setText("Confirm Order");
        confirmOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCheckoutLayout = new javax.swing.GroupLayout(jPanelCheckout);
        jPanelCheckout.setLayout(jPanelCheckoutLayout);
        jPanelCheckoutLayout.setHorizontalGroup(
            jPanelCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckoutLayout.createSequentialGroup()
                .addGroup(jPanelCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCheckoutLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanelCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextAreaOrderMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTotalPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTotalQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmOrderButton, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel3))
                .addGap(0, 111, Short.MAX_VALUE))
        );

        jPanelCheckoutLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelTotalPrice, jLabelTotalQuantity, jTextAreaOrderMessage});

        jPanelCheckoutLayout.setVerticalGroup(
            jPanelCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckoutLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(jPanelCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelTotalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelTotalPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextAreaOrderMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmOrderButton)
                .addContainerGap())
        );

        jPanelCheckoutLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelTotalPrice, jLabelTotalQuantity});

        jComboRestaurants.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRestaurantsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jComboRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(59, 59, 59)
                            .addComponent(viewMenuButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(addToCartButton)))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changeQtyButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeButton)
                        .addGap(18, 18, 18)
                        .addComponent(checkoutButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addGap(413, 413, 413))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewMenuButton)
                            .addComponent(jComboRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addToCartButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeQtyButton)
                    .addComponent(removeButton)
                    .addComponent(checkoutButton))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMenuButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) menuTable.getModel();
        if(viewMenuButton.getText().equals("View Menu")){
            dtm.setRowCount(0);
            Object[] row = new Object[3];
            if(jComboRestaurants.getSelectedItem().toString().equals("Select Restaurant")){
                JOptionPane.showMessageDialog(null, "Please select restaurant.");
            }
            else{
                jComboRestaurants.setEnabled(false);
                viewMenuButton.setText("Change");
                for (String s : this.ecosystem.getRestaurantDirectory().getRestDirectory().keySet()) {
                    if (this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getRestName().equals(jComboRestaurants.getSelectedItem().toString())) {
                        for (String i : this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getItemList().getItemList().keySet()) {
                            row[0] = this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getItemList().getItemList().get(i).getItemId();
                            row[1] = this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getItemList().getItemList().get(i).getItemName();
                            row[2] = this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getItemList().getItemList().get(i).getItemPrice();
                            dtm.addRow(row);
                        }
                    }
                }
            }
        }
        else if(viewMenuButton.getText().equals("Change")){
            DefaultTableModel dtmCart = (DefaultTableModel)cartTable.getModel();
            int result=JOptionPane.showConfirmDialog(null, "All cart items will be removed.");
            if(result==JOptionPane.YES_OPTION){
                dtm.setRowCount(0);
                dtmCart.setRowCount(0);
                jComboRestaurants.setEnabled(true);
                viewMenuButton.setText("View Menu");
            }
        }
    }//GEN-LAST:event_viewMenuButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Please enter quantity");
        Restaurant r = this.ecosystem.getRestaurantDirectory().findResttaurantByName(String.valueOf(jComboRestaurants.getSelectedItem()));
        DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
        DefaultTableModel menuModel = (DefaultTableModel) menuTable.getModel();
        Object[] row = new Object[3];
        int rowNumber = menuTable.getSelectedRow();
        if (rowNumber == -1) {
            JOptionPane.showMessageDialog(null, "Please select an item to add.");
        } else {
            int qty = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter quantity"));
            if (qty <= 0) {
                JOptionPane.showMessageDialog(null, "Quantity cannot be empty or negative.");
            } else {
                double totalPrice = Double.parseDouble(menuModel.getValueAt(rowNumber, 2).toString())
                        * qty;
                row[0] = r.getItemList().getItemList().get(menuModel.getValueAt(rowNumber, 0).toString());
                row[1] = totalPrice;
                row[2] = qty;

                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void changeQtyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeQtyButtonActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Please enter new quantity");
        DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
        int rowNumber = cartTable.getSelectedRow();
        if (rowNumber != -1) {
            int qty = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter new quantity"));
            if (qty <= 0) {
                JOptionPane.showMessageDialog(null, "Quantity cannot be empty or negative.");
            } else {
                double price = Double.parseDouble(dtm.getValueAt(rowNumber, 1).toString())
                        / Double.parseDouble(dtm.getValueAt(rowNumber, 2).toString());
                dtm.setValueAt(price*qty, rowNumber, 1);
                dtm.setValueAt(qty, rowNumber, 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select item from cart before changing quantity.");
        }
    }//GEN-LAST:event_changeQtyButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
        dtm.removeRow(cartTable.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Item removed");
    }//GEN-LAST:event_removeButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        // TODO add your handling code here:
        if (cartTable.getRowCount() != 0) {
            double totalPrice = 0;
            int totalQty = 0;
            DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
            for (int count = 0; count < dtm.getRowCount(); count++) {
                totalPrice += Double.parseDouble(dtm.getValueAt(count, 1).toString());
                totalQty += Integer.parseInt(dtm.getValueAt(count, 2).toString());
            }

            jPanelCheckout.setVisible(true);
            jLabelTotalQuantity.setText(String.valueOf(totalQty));
            jLabelTotalPrice.setText(String.valueOf(totalPrice));
        } else {
            JOptionPane.showMessageDialog(null, "Add items to cart before checking out.");
        }
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void confirmOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderButtonActionPerformed
        // TODO add your handling code here:
        Restaurant r = this.ecosystem.getRestaurantDirectory().findResttaurantByName(String.valueOf(jComboRestaurants.getSelectedItem()));
        Order no = r.getRestAdmin().getOrders().newOrder();
        Customer c = this.ecosystem.getCustomerDirectory().findCustomerByUserName(userAccount.getUsername());
        no.setCustomerId(c.getCustId());
        no.setCustomerName(c.getFirstName());
        no.setCustomerNotes(jTextAreaOrderMessage.getText());
        no.setRestaurantName(String.valueOf(jComboRestaurants.getSelectedItem()));
        no.setDeliveryManName("Yet to be assigned");
        HashMap<Item,Integer> orderItems = new HashMap();

        DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
        double total=0;
        for (int count = 0; count < dtm.getRowCount(); count++) {
            orderItems.put(r.getItemList().findItemByName(dtm.getValueAt(count, 0).toString()),Integer.parseInt(dtm.getValueAt(count, 2).toString()));
            total+=Double.parseDouble(dtm.getValueAt(count, 1).toString());
        }
        no.setItemList(orderItems);
        no.setOrderTotal(total);
        no.setStatus("Ordered");
        this.userAccount.getOrders().newOrder(no);
        this.ecosystem.getOrderDirectory().newOrder(no);
        JOptionPane.showMessageDialog(null, "Your order has been placed. Wait for the restaurant to confirm it.");
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_confirmOrderButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        LoginPageJPanel lpp= new LoginPageJPanel(container, ecosystem, dB4OUtil);
        container.add("LoginPageJPanel", lpp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRestaurantsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboRestaurantsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton changeQtyButton;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton confirmOrderButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboRestaurants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTotalPrice;
    private javax.swing.JLabel jLabelTotalQuantity;
    private javax.swing.JPanel jPanelCheckout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextAreaOrderMessage;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton viewMenuButton;
    // End of variables declaration//GEN-END:variables

    private void displayCombo() {
        jComboRestaurants.removeAllItems();
        jComboRestaurants.addItem("Select Restaurant");
        for (String s : this.ecosystem.getRestaurantDirectory().getRestDirectory().keySet()) {
            jComboRestaurants.addItem(this.ecosystem.getRestaurantDirectory().findRestaurant(s).toString());
        }

    }
}
