/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package allclass;

/**
 *
 * @author SDF-ITD
 */
public class User {
    private String username;
    private String email;
    private String pwd;
    public User(String u,String e,String p){
        u = username;
        e = email;
        p = pwd;
    }
    public void setUserName(String username){this.username = username;}
    public String getUserName(){return username;}
    
    public void setEmail(String email){this.email = email;}
    public String getEmail(){return email;}
    
    public void setPwd(String pwd){this.pwd = pwd;}
    public String getPwd(){return pwd;}
    
    public String toString() {
    return "User Info : "+getUserName()+","+getEmail()+","+getPwd().toString();
}
}
