/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haha;

import java.util.ArrayList;

/**
 *
 * @author vit
 */
public class main {
    public static void main(String[] args) {
        ArrayList<model> list = new ArrayList<>();
        ArrayList<model> temp = new ArrayList<>();
        repositories2 rp = new repositories2();
        
        exData(rp.getAll());
        
//        for(model x : list) {
//            x.exData();
//        }
    }
    
    public static void exData(ArrayList<model> list) {
        for(model x : list) {
            System.out.println(x.getMaSV() + " " + x.getHoTen() + "\n");
        }
    }
    
}
