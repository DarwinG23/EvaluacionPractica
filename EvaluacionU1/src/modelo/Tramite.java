/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Tramite {
    
    private Integer id;
    private TipoTramite tipo;
    private String duracion;
    private Integer id_ventanilla;

    public Tramite(Integer id, TipoTramite tipo, String duracion, Integer id_ventanilla) {
        this.id = id;
        this.tipo = tipo;
        this.id_ventanilla = id_ventanilla;
        switch (tipo){
            case ACTUALIZACION_DE_DATOS:
                duracion = "7";
            case ASIGNACION_AFILIADOS:
                duracion = "15";
            case CAMBIO_DE_CLAVE:
                duracion = "4";
            case RECUPERACION_DE_CLAVE:
                duracion = "3";
            default:
                System.out.println("Error en tipo");
        }
    }
    
    
   
    public Tramite() {
        this.duracion = null;
        this.id_ventanilla = null;
        this.id = null;
        
         switch (tipo){
            case ACTUALIZACION_DE_DATOS:
                duracion = "7";
            case ASIGNACION_AFILIADOS:;
                duracion = "15";
            case CAMBIO_DE_CLAVE:
                duracion = "4";
            case RECUPERACION_DE_CLAVE:
                duracion = "3";
            default:
                System.out.println("Error en tipo");
        }  
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoTramite getTipo() {
        return tipo;
    }

    public void setTipo(TipoTramite tipo) {
        this.tipo = tipo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Integer getId_ventanilla() {
        return id_ventanilla;
    }

    public void setId_ventanilla(Integer id_ventanilla) {
        this.id_ventanilla = id_ventanilla;
    }
    
    

  

    @Override
    public String toString() {
        return "" + id + "";
    }    
}
