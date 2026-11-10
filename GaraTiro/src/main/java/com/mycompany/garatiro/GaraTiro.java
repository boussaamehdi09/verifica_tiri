/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.garatiro;

/**
 *
 * @author boussaa.mehdi
 */
public class GaraTiro {

    public static void main(String[] args) {
        Arciere a1 = new Arciere("mehdi");
        Arciere a2 = new Arciere("mario");
        
        for (int i = 0; i < 5 ; i++){
            a1.eseguiTiri();
            a2.eseguiTiri();
        }
    }
}
