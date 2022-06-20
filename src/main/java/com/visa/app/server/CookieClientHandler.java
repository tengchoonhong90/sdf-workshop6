package com.visa.app.server;

import java.net.Socket;

public class CookieClientHandler implements Runnable{

    private Socket sock;

    public CookieClientHandler(Socket s) {
        this.sock = s;
    }

    @Override
    public void run(){
        System.out.println("Starting a Client Threat");
        NetworkIO netIO = new NetworkIO(sock);
        String req = "";
        while (!req.equals("exit")) {

        }
        
    }
    
}
