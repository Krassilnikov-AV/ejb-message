/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3gr3;

import javax.ejb.Local;

/**
 *
 * @author Admin
 */
@Local
public interface EJBLab3Gr3Local {

    boolean login(String login, String psw);

    String getMessage(String login);
    
}
