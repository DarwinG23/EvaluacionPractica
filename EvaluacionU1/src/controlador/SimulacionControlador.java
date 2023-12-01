/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;
import modelo.Simulacion;

/**
 *
 * @author darwi
 */
public class SimulacionControlador extends DaoImplement<Simulacion> {
    private DynamicList<Simulacion> ListSimulacion;
    private Simulacion simulacion;

    public SimulacionControlador() {
        super(Simulacion.class);
    }
    

    public DynamicList<Simulacion> getListSimulacion() {
        ListSimulacion = all();
        return ListSimulacion;
    }

    public void setListC(DynamicList<Simulacion> ListSimulacion) {
        this.ListSimulacion = ListSimulacion;
    }

    public Simulacion getSimulacion() {
        if(simulacion ==null){
            simulacion = new Simulacion();
        }
        return simulacion;
    }

    public void setCasa(Simulacion simulacion) {
        this.simulacion = simulacion;
    }
    
    public Boolean persist(){
        simulacion.setId(all().getLength()+1);
        return persist(simulacion);
    }
    
}
