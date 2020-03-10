package com.dpj.chainOfResponsability;

public class ChainMain {
    public static void main(String[] args){
        // authenticator -> logger -> compressor
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));

    }
}