/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, DB4OUtil dB4OUtil) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, account, system, dB4OUtil);
    }
    
}
