/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garatiro;
import java.util.Random;
/**
 *
 * @author boussaa.mehdi
 */
public class Arciere { /* Classe Arciere *\
    */
    private String nome;
    private int [] tiri = new int [5];
    /* custrutore della classe Arciere *\
    
    */
    public Arciere(String n ){ /* custrutore della classe Arciere *\
        
        */
        this.nome = n;
        
    }

    public String getNome() {
        return nome;
    }

    public int[] getTiri() {
        return tiri;
    }
    public int punteggioFinale(){
        int pFinale = 0;
        for(int i = 0; i < tiri.length-1 ; i++){
            for(int j = 0 ;j<tiri.length-1-i;j++){
                if(tiri[j] > tiri[j+i]){
                    int n = tiri[j];
                    tiri[j+i] = n;
                    n = tiri[j+i];
                }
            }
        }
        pFinale = tiri[tiri.length -1] + tiri[tiri.length -2] + tiri[tiri.length -3];
        return pFinale;
    }
    
    public void eseguiTiri(){
        Random r = new Random();
        for(int i = 0; i < 5 ; i++){
            tiri[i] = r.nextInt(11);
        }
    }
    public void punteggioToString(){
        System.out.println("nome" + nome);
    }
    
    
    
    
}

