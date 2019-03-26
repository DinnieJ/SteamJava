/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steam.entity;

/**
 *
 * @author MemeLord
 */
public class Account {
    private String username;
    private String password;
    private String guestName;
    private String dateOfBirth;
    private String email;
    private String gender;
    

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public Object[] toObject()
    {
        return new Object[]{
            username,password
        };
    }
}
