/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavisual.objects;

/**
 *
 * @author Hugo Chanampe
 */
public class Persona {
    private String  apellido;
    private String  nombre;
    private TipoDocumento tipoDocumento;
    private String codigoDocumento;

    public String getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(String codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    private Integer documento;

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return apellido+", "+ nombre+" - TipoDoc: "+tipoDocumento ;
    }

    public Persona(String apellido, String nombre, TipoDocumento tipoDocumento,String codigoDoc) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.codigoDocumento = codigoDoc;
    }
    
    public Persona(){
    
    }
    
}
