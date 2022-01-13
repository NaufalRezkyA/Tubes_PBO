/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


public class Administrator {
    private String username;
    private String password;
    
    // constructor kelas administrator
    public Administrator(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    // Method verify login administrator
    public boolean verify_Login(String username, String password){
        if (username==username && password==password){
            return true;
        } else {
            return false;
        }
    }
    
}
