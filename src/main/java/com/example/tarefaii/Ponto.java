package com.example.tarefaii;

public class Ponto {
    private double latitude;
    private double longitude;
    private double altitude;

    Ponto(){
        this.latitude = 0.0;
        this.longitude = 0.0;
        this.altitude = 0.0;
    }

    Ponto(double latitude, double longitude){
        this();
        this.latitude = latitude;
        this.longitude = longitude;
    }
    Ponto(double latitude, double longitude, double altitude){
        this();
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public  String imprimir(){
        String aux = "Lat: "+this.latitude + ", "+
                     "Long: "+this.longitude +", "+
                     "Alt: "+ this.altitude;
        return aux;
    }

    public  String imprimir2(){
        String aux = "*************************************\n"+
                "Lat: "+this.latitude + "\n"+
                "Long: "+this.longitude +"\n"+
                "Alt: "+ this.altitude+"\n"+
                "*****************************************\n";
        return aux;
    }
    public  String imprimirHtml(){
        String aux = "<html>"+
                "Lat: "+this.latitude + "<br>"+
                "Long: "+this.longitude +"<br>"+
                "Alt: "+ this.altitude+"<br>"+
                "</html>";
        return aux;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
