/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingexa.console;

/**
 *
 * @author MyPC
 */
public class LoginController {
    private LoginView myview;

    public LoginController() {
    }

    public LoginController(LoginView myview) {
        this.myview = myview;
    }
    
    public void dang_nhap(){
        UserModel user = myview.login_information();
        if (user.getUsername().equals("peter") &&
                user.getPassword().equals("12345")){
            myview.thong_bao_ket_qua("Ban da dang nhap thanh cong");
        } else{
            myview.thong_bao_ket_qua("USername hoac Password nhap sai");
        }
    }
}
