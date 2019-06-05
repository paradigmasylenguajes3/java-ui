/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavisual.ui.grillas;


import java.util.ArrayList;
import javavisual.objects.Persona;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hugo Chanampe
 */
public class GrillaPersona extends AbstractTableModel{
    
    private ArrayList<Persona> personas= new ArrayList<>();

    @Override
    public int getRowCount() {
        return personas.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 4; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona p = personas.get(rowIndex);
        
             switch(columnIndex){
              case 0: return p.getNombre();
              case 1: return p.getApellido();
              case 2: return p.getTipoDocumento();
              case 3: return p.getCodigoDocumento();
              default: return "";
          } 
    }

    @Override
    public String getColumnName(int column) {
         switch(column){
            case 0: return "NOMBRE";
            case 1: return "APELLIDO";
            case 2: return "TIPO DOCUMENTO";
            case 3: return "CODIGO DOCUMENTO";
            default: return "";
        
        
        } //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    public GrillaPersona(ArrayList<Persona> datos) {
        personas = datos;
    }
    
    
    
}
