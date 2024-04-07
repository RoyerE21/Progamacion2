
package LogicaNegocio;

import Entidades.Colaborador;


public class LogicaColaborador {
    
     private static double totalSalarioBase;
     private static double totalHorasExtrasDobles;
     private static double totalHorasExtrasNormales;
     private static double salarioSinDeducciones = 1364000;
     private static double salarioSinDeduccionesDeCcssAlPatrono;
     private static double deduccionesCcssColaborador;
     private static double impuestosSobreRenta;
     
     
    public static void main (String [] args){
        Colaborador colaborador = new Colaborador();
       // calculoHorasExtrasNormales(colaborador);
       // calculoHorasExtrasDobles(colaborador);
       // calculoSalarioBase(colaborador);
      //  salarioSinDeducciones();
      //  salarioSinDeduccionesDeCcssAlPatrono();
        deduccionesCcssColaborador();
        impuestosSobreRenta();
    }
    
    public static  double calculoHorasExtrasNormales(Colaborador objColaborador){
       objColaborador.setExtrasCorrientes(15.0); 
       objColaborador.setSalarioHora(15000.0);
       totalHorasExtrasNormales = objColaborador.getExtrasCorrientes()*objColaborador.getSalarioHora()*1.5;
       System.out.println(totalHorasExtrasNormales);
       return totalHorasExtrasNormales;
    }
    
     public static  double calculoHorasExtrasDobles(Colaborador objColaborador){
       objColaborador.setExtrasDobles(15.0);
       objColaborador.setSalarioHora(15000.0);
       totalHorasExtrasDobles = objColaborador.getExtrasDobles()*objColaborador.getSalarioHora()*2;
       System.out.println(totalHorasExtrasDobles);
       return totalHorasExtrasDobles;
    }
     
     public static  double calculoSalarioBase(Colaborador objColaborador){
       objColaborador.setHorasTrabajadas(300.0);
       objColaborador.setSalarioHora(15000.0);
       totalSalarioBase = objColaborador.getHorasTrabajadas()*objColaborador.getSalarioHora();
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
    
    public static double impuestosSobreRenta(){
     if(salarioSinDeducciones > 929000 && salarioSinDeducciones <1363000){        
         impuestosSobreRenta = (salarioSinDeducciones-929000)* 0.10; 
          System.out.println(impuestosSobreRenta);
         return impuestosSobreRenta;
    } else if(salarioSinDeducciones > 1363000 && salarioSinDeducciones <2392000){
         impuestosSobreRenta = (salarioSinDeducciones-1363000) * 0.15; 
          System.out.println(impuestosSobreRenta);
         return impuestosSobreRenta;
    } else if (salarioSinDeducciones > 2392000 && salarioSinDeducciones <4783000){
         impuestosSobreRenta = (salarioSinDeducciones-2392000) * 0.20;  
          System.out.println(impuestosSobreRenta);
         return impuestosSobreRenta;
    }else if(salarioSinDeducciones > 4783000){
         impuestosSobreRenta = (salarioSinDeducciones-4783000) * 0.25; 
          System.out.println(impuestosSobreRenta);
         return impuestosSobreRenta;
    }
    else {
        impuestosSobreRenta = 0.0;
        System.out.println(impuestosSobreRenta);
    }
     return impuestosSobreRenta;
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

    public static double getDeduccionesCcssColaborador() {
        return deduccionesCcssColaborador;
    }
    
    
    
}
