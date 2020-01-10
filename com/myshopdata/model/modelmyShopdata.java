package com.myshopdata.model;

import com.myshopdata.event.MSDListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class modelmyShopdata {
    
    private String username;
    private String password;
    
    private MSDListener listenermsd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        fireOnchange();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        fireOnchange();
    }

    public MSDListener getListenermsd() {
        return listenermsd;
    }

    public void setListenermsd(MSDListener listenermsd) {
        this.listenermsd = listenermsd;
    }
    
    protected void fireOnchange(){
       if(listenermsd!=null){
           listenermsd.onChange(this);
       }
    }
    public void Login(){
        setUsername("");
        setPassword("");
 
 }   
}
