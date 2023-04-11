/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.youtubeex.Observer;

/**
 *
 * @author SG701-17
 */
public class ObserverEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear observadores
        Observer ob1 = new Observer();
        Observer ob2 = new Observer();
        Subject subj = new Subject();
        //Registrar observador
        System.out.println("Registrando un observador...");
        subj.register(ob1);
        
        //Cambiar estado de flag
        System.out.println("Estado de flag: " + subj.getFlag());
        subj.setFlag(1);
        System.out.println("Estado de flag: " + subj.getFlag());
        //Registrar otro  observador
        System.out.println("Registrando observador 2...");
        subj.register(ob2);
        //Cambiar estado de flag
        System.out.println("Estado de flag: " + subj.getFlag());
        subj.setFlag(2);
        System.out.println("Estado de flag: " + subj.getFlag());
        //Dessuscribirse
        subj.unregister(ob1);
        
        //Cambiar estado de flag
        System.out.println("Estado de flag: " + subj.getFlag());
        subj.setFlag(3);
        System.out.println("Estado de flag: " + subj.getFlag());
        
    }
    
}
