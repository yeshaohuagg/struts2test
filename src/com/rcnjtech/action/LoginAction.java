package com.rcnjtech.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    @Override
    public String execute() throws Exception {
        String ret = ERROR;
        Connection connection = null;
        try {
            String URL = "jdbc:mysql://localhost/struts_tutorial";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,"root","xufenfen5201314");
            String sql = "SELECT name FROM login WHERE";
            sql+=" user = ? AND password = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                username = resultSet.getString(1);
                ret = SUCCESS;
            }
        }catch (Exception e){
            ret = ERROR;
        } finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (Exception e){

                }
            }
        }
        return ret;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
