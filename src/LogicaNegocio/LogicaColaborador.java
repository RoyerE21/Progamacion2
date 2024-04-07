
package LogicaNegocio;

import Entidades.Colaborador;


public class LogicaColaborador {
    
    public static void main (String [] args){
        Colaborador colaborador = new Colaborador();
        //calculoHorasExtrasNormales(colaborador);
        calculoHorasExtrasDobles(colaborador);
        calculoSalarioBase(colaborador);
    }
    
    public static  double calculoHorasExtrasNormales(Colaborador objColaborador){
       objColaborador.setExtrasCorrientes(15.0);
       objColaborador.setSalarioHora(1500.0);
       double totalHorasExtrasNormales = objColaborador.getExtrasCorrientes()*objColaborador.getSalarioHora()*1.5;
       System.out.println(totalHorasExtrasNormales);
       return totalHorasExtrasNormales;
    }
    
     public static  double calculoHorasExtrasDobles(Colaborador objColaborador){
       objColaborador.setExtrasCorrientes(15.0);
       objColaborador.setSalarioHora(1500.0);
       double totalHorasExtrasDobles = objColaborador.getExtrasCorrientes()*objColaborador.getSalarioHora()*2;
       System.out.println(totalHorasExtrasDobles);
       return totalHorasExtrasDobles;
    }
     
     public static  double calculoSalarioBase(Colaborador objColaborador){
       objColaborador.setExtrasCorrientes(15.0);
       objColaborador.setSalarioHora(1500.0);
       double totalSalarioBase = objColaborador.getExtrasCorrientes()*objColaborador.getSalarioHora();
       System.out.println(totalSalarioBase);
       return totalSalarioBase;
    }
    
}
