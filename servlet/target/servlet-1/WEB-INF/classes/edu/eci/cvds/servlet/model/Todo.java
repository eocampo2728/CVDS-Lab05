package edu.eci.cvds.servlet.model;

/**
 * Clase Todo que es la representacion de un JSON en un objeto java. 
 */
public class Todo {
    
    //atributos
    private int userId;
    private int id;
    private String title;
    private boolean completed;
    
    public Todo (){
        
    }
    
    /**
     * Metodo que permite consultar el id del usuario.
     * @return  Retorna el userID.
     */
    public int getUserId(){
        return userId;
    }
    
    /**
     * Metodo que permite consultar el id.
     * @return  Retorna el id.
     */
    public int getId(){
        return id;
    }
    
    /**
     * Metodo que permite consultar el titulo.
     * @return  Retorna el titulo.
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Metodo que permite consultar el estado.
     * @return  Retorna el estado.
     */
    public boolean getCompleted(){
        return completed;
    }

    /**
     * Metodo que permite la modificacion del userId.
     * @param userId    Es el nuevo userId.
     */
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    /**
     * Metodo que permite la modificacion del id.
     * @param id    Es el nuevo id.
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * Metodo que permite la modificacion del titulo
     * @param title     Es el nuevo titulo.
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * Metodo que permite la modificacion del estado
     * @param completed     Es el nuevo estado.
     */
    public void setCompleted(boolean completed){
        this.completed = completed;
    }
    
}
