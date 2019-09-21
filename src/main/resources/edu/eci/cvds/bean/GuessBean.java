/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.bean;

import java.util.ArrayList;
import java.util.Random;
import javax.faces.bean.*;

@ManagedBean(name = "GuessBean") 
//@ApplicationScoped 
@SessionScoped
public class GuessBean {
    
    //Atributos
    
    private int numero;
    private int intentos;
    private int acumulado;
    private String estado;
    private int numeroUsuario;
    private String intentosFallidos;
    
    public GuessBean(){
        restart();
    }
    
    /**
     * This is method guess the number that the user try to guess to the program
     * @param numeroUsuario the integer that represent the number the user wants to guess
     */
    public void guess(int numeroUsuario){
        
        if(acumulado > 0 && estado!="gano" && numeroUsuario>=0 && numeroUsuario<=20){
            if(numeroUsuario == numero){
                intentos++;
                estado="gano";
            }else{
                acumulado-=10000;
                intentos++;
                estado="fallo";
                
                intentosFallidos += " " + String.valueOf(numeroUsuario)+",";
            }
        }else{
            if(estado!="gano" && numeroUsuario>=0 && numeroUsuario<=20 ){
                estado="Perdio y no tiene mas intentos.";
            }
        }
    }
    
    /**
     * This method vadidate if the entance of the method is a int or a string
     * @param numeroUsuario  number that the user wants to guess
     */
    public void guess(String numeroUsuario){
        try{
            this.numeroUsuario = Integer.parseInt(numeroUsuario);
            guess(this.numeroUsuario);
            
        }catch(Exception e){
            estado = "Valor invalido, solo se pueden digitar numeros enteros.";
        }
    }
    
    /**
     * This method restart the game
     */
    public void restart(){
        Random rand = new Random();
        numero = rand.nextInt(21);
        intentos = 0;
        acumulado = 100000;
        estado = "Tiene que adivinar un numero entero entre 0 y 20.";
        intentosFallidos = "";
        
    }
    
    public String getIntentosFallidos(){
        return intentosFallidos;
    }
    
    public void setIntentosFallidos(String intentosFallidos){
        this.intentosFallidos = intentosFallidos;
    }
    
    public int getNumeroUsuario(){
        return numeroUsuario;
    }
    
    public void setNumeroUsuario(int numeroUsuario){
        this.numeroUsuario = numeroUsuario;
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
