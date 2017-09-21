/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 718205
 */
public class UserService {
    String username;
    String password;
    
    public UserService(String username,String password){
        this.username=username;
        this.password=password;
    }
    
    public boolean login(){
        boolean result=false;
        
        String uname = this.username;
        String pass= this.password;
        
        if(uname.equals("adam")==true||uname.equals("betty")==true){
            if(pass.equals("password")==true){
                result=true;
            }
        }
        
        return result;
    }
}
