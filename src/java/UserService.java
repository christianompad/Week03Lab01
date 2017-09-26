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
    
    public boolean login(String username,String password){
        boolean result=false;
        
        String uname = username;
        String pass= password;
        
        if(uname.equals("adam")==true||uname.equals("betty")==true){
            if(pass.equals("password")==true){
                result=true;
            }
        }
        
        return result;
    }
}
