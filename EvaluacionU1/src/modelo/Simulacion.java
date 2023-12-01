/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author darwi
 */
public class Simulacion {
    private Integer id;
    private String nombre;
    private Integer personasAtendidas;

    public Simulacion(Integer id, String nombre, Integer personasAtendidas) {
        this.id = id;
        this.nombre = nombre;
        this.personasAtendidas = personasAtendidas;
    }

    public Simulacion() {
        this.id =null;
        this.nombre = null;
        this.personasAtendidas = null;     
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPersonasAtendidas() {
        return personasAtendidas;
    }

    public void setPersonasAtendidas(Integer personasAtendidas) {
        this.personasAtendidas = personasAtendidas;
    }

    @Override
    public String toString() {
        return "" + id + "";
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
