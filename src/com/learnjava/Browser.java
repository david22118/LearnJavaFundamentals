package com.learnjava;

public class Browser {
    public void navigate(String address) {
        String ip =findApiAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return"<html></html>";
    }

    private String findApiAddress(String address) {
        return "127.0.0.1";
    }
}
