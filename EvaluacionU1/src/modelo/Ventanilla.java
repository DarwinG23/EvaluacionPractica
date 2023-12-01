/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author darwi
 */
public class Ventanilla {
    private Integer id;
    private Integer nroPersonas;
    private Integer id_Tramite;

    public Ventanilla(Integer id, Integer tiempo, Integer nroPersonas) {
        this.id = id;
        this.nroPersonas =  (int) (Math.random() * 20) + 15;
    }

    public Ventanilla() {
        this.id = null;
        this.nroPersonas = (int) (Math.random() * 20) + 15;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNroPersonas() {
        return nroPersonas;
    }

    public void setNroPersonas(Integer nroPersonas) {
        this.nroPersonas = nroPersonas;
    }

    @Override
    public String toString() {
        return "" + id + "";
    }
    
    
    
    
    
    
    
    
    
    
}
