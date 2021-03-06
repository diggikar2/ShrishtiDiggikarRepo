

package userinterface.RestaurantAdminRole;


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel container,UserAccount userAccount, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = userAccount;
        jLabel3.setText("Welcome, "+this.ecosystem.getEmployeeDirectory().findEmployeeByUserName(this.userAccount.getUsername()).getName());
        displayRestName();
      
        //valueLabel.setText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnManageOrganization = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnRestaurantInfo = new javax.swing.JButton();
        lblRestaurantName = new javax.swing.JLabel();

        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Welcome <user first name>");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });

        btnRestaurantInfo.setText("Restaurant Information");
        btnRestaurantInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantInfoActionPerformed(evt);
            }
        });

        lblRestaurantName.setText("Restaurant Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(logoutButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRestaurantInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton1))
                .addGap(51, 51, 51)
                .addComponent(lblRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnManageOrganization)
                .addGap(18, 18, 18)
                .addComponent(btnManageEmployee)
                .addGap(18, 18, 18)
                .addComponent(btnRestaurantInfo)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        LoginPageJPanel lpp= new LoginPageJPanel(container, ecosystem, dB4OUtil);
        container.add("LoginPageJPanel", lpp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:
        AdminManageOrderJPanel amop= new AdminManageOrderJPanel(container, userAccount, ecosystem, dB4OUtil);
        container.add("AdminManageOrderJPanel",amop);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        // TODO add your handling code here:
        AdminManageMenuJPanel ammp = new AdminManageMenuJPanel(container, userAccount, ecosystem, dB4OUtil);
        container.add("AdminManageMenuJPanel",ammp);
        CardLayout layout= (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnRestaurantInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantInfoActionPerformed
        // TODO add your handling code here:
        AdminManageRestInfoJPanel amrip = new AdminManageRestInfoJPanel(container, userAccount, ecosystem, dB4OUtil);
        container.add("AdminManageRestInfoJPanel",amrip);
        CardLayout layout= (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnRestaurantInfoActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnRestaurantInfo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JButton logoutButton1;
    // End of variables declaration//GEN-END:variables

    private void displayRestName() {
        Restaurant r=this.ecosystem.getRestaurantDirectory().findResttaurantByUserName(userAccount.getUsername());
        if(r==null){
            JOptionPane.showMessageDialog(null, "You are not the admin of any restaurant. Logging you out.");
            container.removeAll();
            LoginPageJPanel lpp= new LoginPageJPanel(container, ecosystem, dB4OUtil);
            container.add("LoginPageJPanel", lpp);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.next(container);
            dB4OUtil.storeSystem(ecosystem);
        }
        else   
            lblRestaurantName.setText(r.getRestName());
    }
    
}
