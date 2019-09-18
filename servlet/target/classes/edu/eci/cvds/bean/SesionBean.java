/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.bean;

import java.util.Random;
import javax.faces.bean.*;

@ManagedBean(name = "guessBean")
@ApplicationScoped

public class SesionBean {
    
    //Atributos
    
    private int numero;
    private int intentos;
    private int acumulado;
    private String estado;
    
    public SesionBean(){
        restart();
    }
    
    public void guess(int adivinanza){
        if(adivinanza == numero){
            intentos++;
            estado="gano";
        }else{
            acumulado-=10000;
            intentos--;
            estado="fallo";
        }
    }
    
    public void restart(){
        Random rand = new Random();
        numero = rand.nextInt(50);
        intentos = 0;
        acumulado = 100000;
        estado = "";
        
    }
    
    public int getNumero(){
        return numero;
    }
    
    public int getIntentos(){
        return intentos;
    }
    
    public int getAcumulado(){
        return acumulado;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setNumero(int numero){
        this.numero=numero;
    }
    
    public void setIntentos(int intentos){
        this.intentos=intentos;
    }
    
    public void setAcumulado(int acumulado){
        this.acumulado=acumulado;
    }
    
    public void setEstado(String estado){
        this.estado=estado;
    }
    
    
}
