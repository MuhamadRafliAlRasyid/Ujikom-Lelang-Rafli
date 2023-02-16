/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lelang;

/**
 *
 * @author Muhamad Rafl Al Rasyid
 */
public class UserSession {
    private static int id;
    private static String username,password,name,level;
    
    public static void setId(int id){
        UserSession.id = id;
    }

    public static void setUsername(String username){
        UserSession.username = username;
    }
    
    public static void setPassword(String password){
        UserSession.password = password;
    }
    
    public static void setName(String name){
        UserSession.name = name;
    }
    
    public static void setLevel(String level){
        UserSession.level = level;
    }
    
    public int getId(){
        return id;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLevel(){
        return level;
    }
    
}