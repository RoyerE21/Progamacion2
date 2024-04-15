package LogicaNegocio;

import Entidades.Colaborador;

/**
 *
 * "@author Sebastian"
 */
public class LogicaColaborador {

    /**
     * En esta variable privada se almacenará el total del salario base del
     * trabajador dependiendo de sus horas laboradas
     */
    private static double totalSalarioBase;
    /**
     * En esta variable privada se almacenará el total del salario generado por
     * el trabajador según las horas extras dobles laboradas
     */
    private static double totalHorasExtrasDobles;
    /**
     * En esta variable privada se almacenará el total del salario generado por
     * el trabajador según las horas extras corrientes laboradas
     */
    private static double totalHorasExtrasNormales;
    /**
     * En esta variable privada se almacenará el total del salario tomando en
     * cuenta tambien todo tipo de horas extras laboradas por el trabajador
     * antes de aplicar las deducciones correspondientes
     */
    private static double salarioSinDeducciones;
    /**
     * En esta variable de tipo privada se almacenaran las deducciones al sueldo
     * del trabajador correspondientes de la caja
     */
    private static double deduccionesCcssColaborador;
    /**
     * En esta variable de tipo privada se almacenaran las deducciones al sueldo
     * del trabajador correspondientes a la renta
     */
    private static double impuestosSobreRenta;
    /**
     * En esta variable de tipo privada se almacenará el sueldo del trabajador
     * luego de sufrir todas las deducciones correspondientes
     */
    private static double salarioNeto;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones SEM al patrono
     */
    private static double deduccionSemPatrono;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones IVM al patrono
     */
    private static double deduccionIvmPatrono;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones de caja al patrono
     */
    private static double deduccionCajaPatrono;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones de CuotaPatronalBancoPopular
     */
    private static double deduccionCuotaPopularPatrono;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones de Asignaciones Familiares por parte del patrono
     */
    private static double deduccionAsignacionesFamiliares;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones de IMAS por parte del patrono
     */
    private static double deduccionImas;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones del INA por parte del patrono
     */
    private static double deduccionIna;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones correspondientes al rubro "TOTAL OTRAS INSTITUCIONES"
     */
    private static double otrasInstituciones;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones Aporte Patrono Banco Popular
     */
    private static double deduccionAportePopularPatrono;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones Fondo de Capitalización Laboral al patrono
     */
    private static double totalFondoCapitalizacion;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones Fondo de Pensiones Complementarias al patrono
     */
    private static double totalFondoPensiones;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones del INS al patrono
     */
    private static double totalIns;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones correspondientes al rubro "TOTAL LPT"
     */
    private static double lptPatrono;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones correspondientes al total de los aportes del patrono
     */
    private static double aporteTotalPatrono;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones SEM al trabajador
     */
    private static double deduccionSemTrabajador;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones IVM al trabajador
     */
    private static double deduccionIvmTrabajador;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones de la caja al trabajador
     */
    private static double deduccionCajaTrabajador;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * Aporte Trabajador Banco Popular
     */
    private static double deduccionAportePopularTrabajador;
    /**
     * En esta variable de tipo privada se almacenará el monto correspondiente a
     * las deducciones correspondientes al rubro "TOTAL LPT" al trabajador
     */
    private static double lptTrabajador;

    /**
     * En este metodo se calcula el total del dinero generado por el trabajador
     * mulplicando sus horas extras por su salario de hora y por 1.5 en este
     * caso
     *
     * @param objColaborador
     * @return totalHorasExtrasNormales
     */
    public static double calculoHorasExtrasNormales(Colaborador objColaborador) {
        totalHorasExtrasNormales = objColaborador.getExtrasCorrientes() * objColaborador.getSalarioHora() * 1.5;
        return totalHorasExtrasNormales;
    }

    /**
     * En este metodo se calcula el total del dinero generado por el trabajador
     * mulplicando sus horas extras por su salario de hora y por el doble en
     * este caso
     *
     * @param objColaborador
     * @return totalHorasExtrasDobles
     */

    public static double calculoHorasExtrasDobles(Colaborador objColaborador) {
        totalHorasExtrasDobles = objColaborador.getExtrasDobles() * objColaborador.getSalarioHora() * 2;
        return totalHorasExtrasDobles;
    }

    /**
     * En este metodo se calcula el total del dinero generado por el trabajador
     * mulplicando sus horas laborales por su salario de hora
     *
     * @param objColaborador
     * @return totalSalarioBase
     */
    public static double calculoSalarioBase(Colaborador objColaborador) {
        totalSalarioBase = objColaborador.getHorasTrabajadas() * objColaborador.getSalarioHora();
        return totalSalarioBase;
    }

    /**
     * En este metodo se suman los ingresos por horas extras sencillas, dobles y
     * salario ordinario Aqui se obtiene el salario bruto
     *
     * @return salarioSinDeducciones
     */
    public static double salarioSinDeducciones() {
        salarioSinDeducciones = totalSalarioBase + totalHorasExtrasDobles + totalHorasExtrasNormales;
        return salarioSinDeducciones;
    }

    /**
     * En este metodo se calculan los impuestos a la renta segun el intervalo al
     * que pertenezca la cantidad de dinero que el trabajador recibe como pago
     *
     * @return impuestosSobreRenta
     */
    public static double impuestosSobreRenta() {
        if (salarioSinDeducciones > 929000 && salarioSinDeducciones < 1363000) {
            impuestosSobreRenta = (salarioSinDeducciones - 929000) * 0.10;
            return impuestosSobreRenta;
        } else if (salarioSinDeducciones > 1363000 && salarioSinDeducciones < 2392000) {
            impuestosSobreRenta = (salarioSinDeducciones - 1363000) * 0.15 + 43400;
            return impuestosSobreRenta;
        } else if (salarioSinDeducciones > 2392000 && salarioSinDeducciones < 4783000) {
            impuestosSobreRenta = (salarioSinDeducciones - 2392000) * 0.20 + 197750;
            return impuestosSobreRenta;
        } else if (salarioSinDeducciones > 4783000) {
            impuestosSobreRenta = (salarioSinDeducciones - 4783000) * 0.25 + 675950;
            return impuestosSobreRenta;
        } else {
            impuestosSobreRenta = 0.0;
        }
        return impuestosSobreRenta;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al SEM del patrono,
     * el cual es de un 9.25% sobre el salario bruto
     *
     * @return deduccionSemPatrono
     */
    public static double semPatrono() {
        deduccionSemPatrono = salarioSinDeducciones * 0.0925;
        return deduccionSemPatrono;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al IVM del patrono,
     * el cual es de un 5.42% sobre el salario bruto
     *
     * @return deduccionIvmPatrono
     */
    public static double ivmPatrono() {
        deduccionIvmPatrono = salarioSinDeducciones * 0.0542;
        return deduccionIvmPatrono;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al total de
     * deducciones de la caja al patrono, el cual es de un 14.67% sobre el
     * salario bruto
     *
     * @return deduccionCajaPatrono
     */
    public static double cajaPatrono() {
        deduccionCajaPatrono = deduccionIvmPatrono + deduccionSemPatrono;
        return deduccionCajaPatrono;
    }

    /**
     * En este metodo se calcula la Cuota Patronal Banco Popular, el cual es de
     * un 0.25% sobre el salario bruto
     *
     * @return deduccionCuotaPopularPatrono
     */
    public static double cuotaPopularPatrono() {
        deduccionCuotaPopularPatrono = salarioSinDeducciones * 0.0025;
        return deduccionCuotaPopularPatrono;
    }

    /**
     * En este metodo se calculan las Asignaciones Familiares, el cual es de un
     * 5% sobre el salario bruto
     *
     * @return deduccionAsignacionesFamiliares
     */
    public static double asignacionesFamiliares() {
        deduccionAsignacionesFamiliares = salarioSinDeducciones * 0.05;
        return deduccionAsignacionesFamiliares;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al IMAS por
     * patrono, el cual es de un 0.5% sobre el salario bruto
     *
     * @return deduccionImas
     */
    public static double imasDeducciones() {
        deduccionImas = salarioSinDeducciones * 0.005;
        return deduccionImas;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al INA por patrono,
     * el cual es de un 1.5% sobre el salario bruto
     *
     * @return deduccionIna
     */
    public static double inaDeducciones() {
        deduccionIna = salarioSinDeducciones * 0.015;
        return deduccionIna;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al total de
     * deducciones de otras instituciones al patrono, el cual es de un 7.25%
     * sobre el salario bruto
     *
     * @return otrasInstituciones
     */
    public static double totalOtrasInstituciones() {
        otrasInstituciones = deduccionIna + deduccionImas + deduccionAsignacionesFamiliares + deduccionCuotaPopularPatrono;
        return otrasInstituciones;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al Aporte Patrono
     * Banco Popular, el cual es de un 0.25% sobre el salario bruto
     *
     * @return deduccionAportePopularPatrono
     */
    public static double aportePopularPatrono() {
        deduccionAportePopularPatrono = salarioSinDeducciones * 0.0025;
        return deduccionAportePopularPatrono;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al Fondo de
     * Capitalizacion Laboral al patrono, el cual es de un 1.5% sobre el salario
     * bruto
     *
     * @return totalFondoCapitalizacion
     */
    public static double fondoCapitalizacion() {
        totalFondoCapitalizacion = salarioSinDeducciones * 0.015;
        return totalFondoCapitalizacion;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al Fondo de
     * Pensiones Complementarias al patrono, el cual es de un 2% sobre el
     * salario bruto
     *
     * @return totalFondoPensiones
     */
    public static double fondoPensiones() {
        totalFondoPensiones = salarioSinDeducciones * 0.02;
        return totalFondoPensiones;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al INS al patrono,
     * el cual es de un 1% sobre el salario bruto
     *
     * @return totalIns
     */
    public static double deduccionesInsPatrono() {
        totalIns = salarioSinDeducciones * 0.01;
        return totalIns;
    }

    /**
     * En este metodo se calcula el impuesto correspondiente al total de
     * deducciones LPT al patrono, el cual es de un 4.75% sobre el salario bruto
     *
     * @return lptPatrono
     */
    public static double totalLptPatrono() {
        lptPatrono = totalIns + totalFondoPensiones + totalFondoCapitalizacion + deduccionAportePopularPatrono;
        return lptPatrono;
    }

    /**
     * En este metodo se suman todos los aportes patronales para unificarlos,
     * loc aules corresponde a un total de: 26.67% sobre el salario bruto del
     * trabajador
     *
     * @return aporteTotalPatrono
     */
    public static double totalPatrono() {
        aporteTotalPatrono = lptPatrono + otrasInstituciones + deduccionCajaPatrono;
        return aporteTotalPatrono;
    }

    /**
     * En esta funcion se calcula el salario Neto del trabajador luego de pasar
     * por todas las deducciones correspondientes
     *
     * @return salarioNeto
     */
    public static double calculoSalarioNeto() {
        salarioNeto = salarioSinDeducciones - impuestosSobreRenta - deduccionesCcssColaborador;
        return salarioNeto;
    }
/**
     * En este metodo se calcula el impuesto correspondiente al SEM del trabajador,
     * el cual es de un 5.50% sobre el salario bruto
     *
     * @return deduccionSemTrabajador
     */
    public static double semTrabajador() {
        deduccionSemTrabajador = salarioSinDeducciones * 0.055;
        return deduccionSemTrabajador;
    }
 /**
     * En este metodo se calcula el impuesto correspondiente al IVM del trabajador,
     * el cual es de un 4.17% sobre el salario bruto
     *
     * @return deduccionIvmTrabajador
     */
    public static double ivmTrabajador() {
        deduccionIvmTrabajador = salarioSinDeducciones * 0.0417;
        return deduccionIvmTrabajador;
    }
  /**
     * En este metodo se calcula el impuesto correspondiente al total de
     * deducciones de la caja al trabajador, el cual es de un 9.67% sobre el
     * salario bruto
     *
     * @return deduccionCajaTrabajador
     */
    public static double cajaTrabajador() {
        deduccionCajaTrabajador = deduccionIvmTrabajador + deduccionSemTrabajador;
        return deduccionCajaTrabajador;
    }
 /**
     * En este metodo se calcula el impuesto correspondiente al Aporte Trabajador
     * Banco Popular, el cual es de un 1% sobre el salario bruto
     *
     * @return deduccionAportePopularTrabajador
     */
    public static double aportePopularTrabajador() {
        deduccionAportePopularTrabajador = salarioSinDeducciones * 0.01;
        return deduccionAportePopularTrabajador;
    }
/**
 *En este metodo se calcula el impuesto correspondiente al total de
 * deducciones LPT al trabajador, el cual es de un 1% sobre el salario bruto
 * @return lptTrabajador
 */
    public static double totalLptTrabajador() {
        lptTrabajador = deduccionAportePopularTrabajador;
        return lptTrabajador;
    }
/**
 *En este metodo se calcula el impuesto correspondiente al total de
 * deducciones de CCSS al trabajador, el cual es de un 10.67% sobre el salario bruto
 * @return deduccionesCcssColaborador
 */
    public static double deduccionesCcssColaborador() {
        deduccionesCcssColaborador = lptTrabajador + deduccionCajaTrabajador;
        return deduccionesCcssColaborador;
    }
/**
 * Funcion get de salario base
 * @return totalSalarioBase
 */
    public static double getTotalSalarioBase() {
        return totalSalarioBase;
    }
/**
 * Funcion set de totalSalarioBase
 * @param aTotalSalarioBase 
 */
    public static void setTotalSalarioBase(double aTotalSalarioBase) {
        totalSalarioBase = aTotalSalarioBase;
    }
/**
 * Funcion get de HorasExtrasDobles
 * @return totalHorasExtrasDobles
 */
    public static double getTotalHorasExtrasDobles() {
        return totalHorasExtrasDobles;
    }
/**
 * Funcion set de totalHorasExtrasDobles
 * @param aTotalHorasExtrasDobles 
 */
    public static void setTotalHorasExtrasDobles(double aTotalHorasExtrasDobles) {
        totalHorasExtrasDobles = aTotalHorasExtrasDobles;
    }
/**
 * Funcion get de TotalHorasExtrasNormales
 * @return totalHorasExtrasNormales
 */
    public static double getTotalHorasExtrasNormales() {
        return totalHorasExtrasNormales;
    }
/**
 * Funcion set de totalHorasExtrasNormales
 * @param aTotalHorasExtrasNormales 
 */
    public static void setTotalHorasExtrasNormales(double aTotalHorasExtrasNormales) {
        totalHorasExtrasNormales = aTotalHorasExtrasNormales;
    }
/**
 * Funcion get de SalarioSinDeducciones
 * @return salarioSinDeducciones
 */
    public static double getSalarioSinDeducciones() {
        return salarioSinDeducciones;
    }
/**
 * Funcion set de salarioSinDeducciones
 * @param aSalarioSinDeducciones 
 */
    public static void setSalarioSinDeducciones(double aSalarioSinDeducciones) {
        salarioSinDeducciones = aSalarioSinDeducciones;
    }
/**
 * Funcion get de DeduccionesCcssColaborador
 * @return deduccionesCcssColaborador
 */
    public static double getDeduccionesCcssColaborador() {
        return deduccionesCcssColaborador;
    }
/**
 * Funcion set de deduccionesCcssColaborador
 * @param aDeduccionesCcssColaborador 
 */
    public static void setDeduccionesCcssColaborador(double aDeduccionesCcssColaborador) {
        deduccionesCcssColaborador = aDeduccionesCcssColaborador;
    }
/**
 * Funcion get de ImpuestosSobreRenta
 * @return impuestosSobreRenta
 */
    public static double getImpuestosSobreRenta() {
        return impuestosSobreRenta;
    }
/**
 * Funcion set de impuestosSobreRenta
 * @param aImpuestosSobreRenta 
 */
    public static void setImpuestosSobreRenta(double aImpuestosSobreRenta) {
        impuestosSobreRenta = aImpuestosSobreRenta;
    }
/**
 * Funcion get de getSalarioNeto
 * @return salarioNeto
 */
    public static double getSalarioNeto() {
        return salarioNeto;
    }
/**
 * Funcion set de salarioNeto
 * @param aSalarioNeto 
 */
    public static void setSalarioNeto(double aSalarioNeto) {
        salarioNeto = aSalarioNeto;
    }
/**
 * Funcion get de DeduccionSemPatrono
 * @return deduccionSemPatrono
 */
    public static double getDeduccionSemPatrono() {
        return deduccionSemPatrono;
    }
/**
 * Funcion set de deduccionSemPatrono
 * @param aDeduccionSemPatrono 
 */
    public static void setDeduccionSemPatrono(double aDeduccionSemPatrono) {
        deduccionSemPatrono = aDeduccionSemPatrono;
    }
/**
 * Funcion get de DeduccionIvmPatrono
 * @return deduccionIvmPatrono
 */
    public static double getDeduccionIvmPatrono() {
        return deduccionIvmPatrono;
    }
/**
 * Funcion set de deduccionIvmPatrono
 * @param aDeduccionIvmPatrono 
 */
    public static void setDeduccionIvmPatrono(double aDeduccionIvmPatrono) {
        deduccionIvmPatrono = aDeduccionIvmPatrono;
    }
/**
 * Funcion get de DeduccionCajaPatrono
 * @return deduccionCajaPatrono
 */
    public static double getDeduccionCajaPatrono() {
        return deduccionCajaPatrono;
    }
/**
 * Funcion set de deduccionCajaPatrono
 * @param aDeduccionCajaPatrono 
 */
    public static void setDeduccionCajaPatrono(double aDeduccionCajaPatrono) {
        deduccionCajaPatrono = aDeduccionCajaPatrono;
    }
/**
 * Funcion get de DeduccionCuotaPopularPatrono
 * @return deduccionCuotaPopularPatrono
 */
    public static double getDeduccionCuotaPopularPatrono() {
        return deduccionCuotaPopularPatrono;
    }
/**
 * Funcion set de deduccionCuotaPopularPatrono
 * @param aDeduccionCuotaPopularPatrono 
 */
    public static void setDeduccionCuotaPopularPatrono(double aDeduccionCuotaPopularPatrono) {
        deduccionCuotaPopularPatrono = aDeduccionCuotaPopularPatrono;
    }
/**
 * Funcion get de DeduccionAsignacionesFamiliares
 * @return deduccionAsignacionesFamiliares
 */
    public static double getDeduccionAsignacionesFamiliares() {
        return deduccionAsignacionesFamiliares;
    }
/**
 * Funcion set de deduccionAsignacionesFamiliares
 * @param aDeduccionAsignacionesFamiliares 
 */
    public static void setDeduccionAsignacionesFamiliares(double aDeduccionAsignacionesFamiliares) {
        deduccionAsignacionesFamiliares = aDeduccionAsignacionesFamiliares;
    }
/**
 * Funcion get de DeduccionImas
 * @return deduccionImas
 */
    public static double getDeduccionImas() {
        return deduccionImas;
    }
/**
 * Funcion set de deduccionImas
 * @param aDeduccionImas 
 */
    public static void setDeduccionImas(double aDeduccionImas) {
        deduccionImas = aDeduccionImas;
    }
/**
 * Funcion get de DeduccionIna
 * @return deduccionIna
 */
    public static double getDeduccionIna() {
        return deduccionIna;
    }
/**
 * Funcion set de deduccionIna
 * @param aDeduccionIna 
 */
    public static void setDeduccionIna(double aDeduccionIna) {
        deduccionIna = aDeduccionIna;
    }
/**
 * Funcion get de OtrasInstituciones
 * @return otrasInstituciones
 */
    public static double getOtrasInstituciones() {
        return otrasInstituciones;
    }
/**
 * Funcion set de otrasInstituciones
 * @param aOtrasInstituciones 
 */
    public static void setOtrasInstituciones(double aOtrasInstituciones) {
        otrasInstituciones = aOtrasInstituciones;
    }
/**
 * Funcion get de deduccionAportePopularPatrono
 * @return deduccionAportePopularPatrono
 */
    public static double getDeduccionAportePopularPatrono() {
        return deduccionAportePopularPatrono;
    }
/**
 * Funcion set de deduccionAportePopularPatrono
 * @param aDeduccionAportePopularPatrono 
 */
    public static void setDeduccionAportePopularPatrono(double aDeduccionAportePopularPatrono) {
        deduccionAportePopularPatrono = aDeduccionAportePopularPatrono;
    }
/**
 * Funcion get de totalFondoCapitalizacion
 * @return totalFondoCapitalizacion
 */
    public static double getTotalFondoCapitalizacion() {
        return totalFondoCapitalizacion;
    }
/**
 * Funcion set de totalFondoCapitalizacion
 * @param aTotalFondoCapitalizacion 
 */
    public static void setTotalFondoCapitalizacion(double aTotalFondoCapitalizacion) {
        totalFondoCapitalizacion = aTotalFondoCapitalizacion;
    }
/**
 * Funcion get de totalFondoPensiones
 * @return totalFondoPensiones
 */
    public static double getTotalFondoPensiones() {
        return totalFondoPensiones;
    }
/**
 * Funcion set de totalFondoPensiones
 * @param aTotalFondoPensiones 
 */
    public static void setTotalFondoPensiones(double aTotalFondoPensiones) {
        totalFondoPensiones = aTotalFondoPensiones;
    }
/**
 * Funcion get de totalIns
 * @return totalIns
 */
    public static double getTotalIns() {
        return totalIns;
    }
/**
 * Funcion set de totalIns
 * @param aTotalIns 
 */
    public static void setTotalIns(double aTotalIns) {
        totalIns = aTotalIns;
    }
/**
 * Funcion get de lptPatrono
 * @return lptPatrono
 */
    public static double getLptPatrono() {
        return lptPatrono;
    }
/**
 * Funcion set de lptPatrono
 * @param aLptPatrono 
 */
    public static void setLptPatrono(double aLptPatrono) {
        lptPatrono = aLptPatrono;
    }
/**
 * Funcion get de aporteTotalPatrono
 * @return aporteTotalPatrono
 */
    public static double getAporteTotalPatrono() {
        return aporteTotalPatrono;
    }
/**
 * Funcion set de aporteTotalPatrono
 * @param aAporteTotalPatrono 
 */
    public static void setAporteTotalPatrono(double aAporteTotalPatrono) {
        aporteTotalPatrono = aAporteTotalPatrono;
    }
/**
 * Funcion get de deduccionSemTrabajador
 * @return deduccionSemTrabajador
 */
    public static double getDeduccionSemTrabajador() {
        return deduccionSemTrabajador;
    }
/**
 * Funcion set de deduccionSemTrabajador
 * @param aDeduccionSemTrabajador 
 */
    public static void setDeduccionSemTrabajador(double aDeduccionSemTrabajador) {
        deduccionSemTrabajador = aDeduccionSemTrabajador;
    }
/**
 * Funcion get de deduccionIvmTrabajador
 * @return deduccionIvmTrabajador
 */
    public static double getDeduccionIvmTrabajador() {
        return deduccionIvmTrabajador;
    }
/**
 * Funcion set de deduccionIvmTrabajador
 * @param aDeduccionIvmTrabajador 
 */
    public static void setDeduccionIvmTrabajador(double aDeduccionIvmTrabajador) {
        deduccionIvmTrabajador = aDeduccionIvmTrabajador;
    }
/**
 * Funcion get de deduccionCajaTrabajador
 * @return deduccionCajaTrabajador
 */
    public static double getDeduccionCajaTrabajador() {
        return deduccionCajaTrabajador;
    }
/**
 * Funcion set de deduccionCajaTrabajador
 * @param aDeduccionCajaTrabajador 
 */
    public static void setDeduccionCajaTrabajador(double aDeduccionCajaTrabajador) {
        deduccionCajaTrabajador = aDeduccionCajaTrabajador;
    }
/**
 * Funcion get de deduccionAportePopularTrabajador
 * @return deduccionAportePopularTrabajador
 */
    public static double getDeduccionAportePopularTrabajador() {
        return deduccionAportePopularTrabajador;
    }
/**
 * Funcion set de deduccionAportePopularTrabajador
 * @param aDeduccionAportePopularTrabajador 
 */
    public static void setDeduccionAportePopularTrabajador(double aDeduccionAportePopularTrabajador) {
        deduccionAportePopularTrabajador = aDeduccionAportePopularTrabajador;
    }
/**
 * Funcion get de lptTrabajador
 * @return lptTrabajador
 */
    public static double getLptTrabajador() {
        return lptTrabajador;
    }
/**
 * Funcion set de lptTrabajador
 * @param aLptTrabajador 
 */
    public static void setLptTrabajador(double aLptTrabajador) {
        lptTrabajador = aLptTrabajador;
    }

}
