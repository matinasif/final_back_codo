package com.mycompany.web.models;

import java.io.Serializable;

public class Cliente implements Serializable {
        private int id;
        private String nombre,apellido,contacto;

        public Cliente(){
    
        }
    
        public int getId(){
            return id;
        }
    
        public void setId(int nuevoId){
            this.id = nuevoId;
        }
    
        public String getNombre(){
            return nombre;
        }
    
        public void setNombre(String nuevoNombre){
            this.nombre = nuevoNombre;
        }
    
        public String getApellido(){
            return apellido;
        }
    
        public void setApellido(String nuevoApellido){
            this.apellido = nuevoApellido;
        }
    
        public String getContacto(){
            return contacto;
        }
    
        public void setContacto(String nuevoContacto){
            this.contacto = nuevoContacto;
        }
    }

