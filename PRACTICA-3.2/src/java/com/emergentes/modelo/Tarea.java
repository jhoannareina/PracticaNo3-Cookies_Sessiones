package com.emergentes.modelo;

public class Tarea {
    private int id;
    private String tarea;
    private String completado;
       
    //constructor
     public Tarea(){
         this.id=0;
         this.tarea="";
         this.completado="";
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getCompletado() {
        return completado;
    }

    public void setCompletado(String completado) {
        this.completado = completado;
    }
     
}    
