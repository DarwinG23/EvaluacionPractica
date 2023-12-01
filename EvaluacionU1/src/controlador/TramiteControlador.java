/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;
import modelo.Tramite;

/**
 *
 * @author darwi
 */
public class TramiteControlador extends  DaoImplement<Tramite>{
     private DynamicList<Tramite> ListTramite;
    private Tramite tramite;

    public TramiteControlador() {
        super(Tramite.class);
    }
    

    public DynamicList<Tramite> getListTramite() {
        ListTramite = all();
        return ListTramite;
    }

    public void setListTramite(DynamicList<Tramite> ListTramite) {
        this.ListTramite = ListTramite;
    }

    public Tramite getTramite() {
        if(tramite ==null){
            tramite = new Tramite();
        }
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite= tramite;
    }
    
    public Boolean persist(){
        tramite.setId(all().getLength()+1);
        return persist(tramite);
    }
    
    
}
