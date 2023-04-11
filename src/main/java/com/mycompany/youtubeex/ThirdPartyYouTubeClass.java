/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtubeex;

/**
 *
 * @author SG701-17
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{
    
    
    //debe implementar los metodos definidos en la interfaz
    @Override
    public void listVideo() {
        System.out.println("Listando los videos");
    }

    
    @Override
    public String getInfo(int ID) {
        return "Video de prueba" + ID;
    }

    
    @Override
    public void downloadVideo(int ID) {
        System.out.println("Descargando el video: " + ID);
    }
    
}
