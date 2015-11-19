/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triviagame;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author User1
 */
public class Countdown {
    private TimerCallback mCallback;
    
    public Countdown(TimerCallback callback){
        mCallback = callback;
    }
    
    public void start(){
        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 60; //10 seconds
            
            @Override
            public void run() {
                System.out.println(i--);
                if (i < 1){
                    timer.cancel();
                    mCallback.lockUI();
                }
            }
        }, 0, 1000);
    }
}
