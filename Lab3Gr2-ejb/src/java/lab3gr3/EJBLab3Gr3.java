/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3gr3;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 *
 * @author Admin
 */
@Stateful
public class EJBLab3Gr3 implements EJBLab3Gr3Local,
                            StandardValues {
    private boolean registered;
    private int countMsg;
    
    @PostConstruct
    void init() {
        registered = false;
        countMsg = 0;
    }
    
    @Override
    public boolean login(String login, String psw) {
        registered = LOGIN.equals(login) &&
                PSW.equals(psw);
        return registered;
    }

    @Override
    public String getMessage(String login) {
        
        return "Тестовое сообщение";
    }

    
    
}
