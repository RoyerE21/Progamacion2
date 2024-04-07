
package LogicaNegocio;

import Entidades.Colaborador;


public class LogicaColaborador {
    
     private static double totalSalarioBase;
     private static double totalHorasExtrasDobles;
     private static double totalHorasExtrasNormales;
     private static double salarioSinDeducciones;
     private static double salarioSinDeduccionesDeCcssAlPatrono;
     private static double deduccionesCcssColaborador;
    public static void main (String [] args){
        Colaborador colaborador = new Colaborador();
        calculoHorasExtrasNormales(colaborador);
        calculoHorasExtrasDobles(colaborador);
        calculoSalarioBase(colaborador);
        salarioSinDeducciones();
        salarioSinDeduccionesDeCcssAlPatrono();
        deduccionesCcssColaborador();
    }
    
    public static  double calculoHorasExtrasNormales(Colaborador objColaborador){
       objColaborador.setExtrasCorrientes(15.0);
       objColaborador.setSalarioHora(1500.0);
       totalHorasExtrasNormales = objColaborador.getExtrasCorrientes()*objColaborador.getSalarioHora()*1.5;
       System.out.println(totalHorasExtrasNormales);
       return totalHorasExtrasNormales;
    }
    
     public static  double calculoHorasExtrasDobles(Colaborador objColaborador){
       objColaborador.setExtrasDobles(15.0);
       objColaborador.setSalarioHora(1500.0);
       totalHorasExtrasDobles = objColaborador.getExtrasCorrientes()*objColaborador.getSalarioHora()*2;
       System.out.println(totalHorasExtrasDobles);
       return totalHorasExtrasDobles;
    }
     
     public static  double calculoSalarioBase(Colaborador objColaborador){
       objColaborador.setHorasTrabajadas(15.0);
       objColaborador.setSalarioHora(1500.0);
       totalSalarioBase = objColaborador.getExtrasCorrientes()*objColaborador.getSalarioHora();
       System.out.println(totalSalarioBase);
       return totalSalarioBase;
    }
     
    public static double salarioSinDeducciones(){
          salarioSinDeducciones =  totalSalarioBase + totalHorasExtrasDobles + totalHorasExtrasNormales;
          System.out.println(salarioSinDeducciones);
          return salarioSinDeducciones;
    }
    
    public static double salarioSinDeduccionesDeCcssAlPatrono(){
        salarioSinDeduccionesDeCcssAlPatrono = (100*salarioSinDeducciones)/73.33;
        System.out.println(salarioSinDeduccionesDeCcssAlPatrono);
        return salarioSinDeduccionesDeCcssAlPatrono;
    }
    
    public static double deduccionesCcssColaborador(){
        deduccionesCcssColaborador = salarioSinDeducciones *0.1067;
        System.out.println(deduccionesCcssColaborador);
        return deduccionesCcssColaborador;
    }

    public static double getTotalSalarioBase() {
        return totalSalarioBase;
    }

    public static double getTotalHorasExtrasDobles() {
        return totalHorasExtrasDobles;
    }

    public static double getTotalHorasExtrasNormales() {
        return totalHorasExtrasNormales;
    }

    public static double getSalarioSinDeducciones() {
        return salarioSinDeducciones;
    }

    public static double getSalarioSinDeduccionesDeCcssAlPatrono() {
        return salarioSinDeduccionesDeCcssAlPatrono;
    }
    
    
    
}
