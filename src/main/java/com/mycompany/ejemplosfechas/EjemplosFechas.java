
package com.mycompany.ejemplosfechas;

import java.time.LocalDate;
import java.time.Month;


public class EjemplosFechas {

    public static void main(String[] args) {
        
        //Clase que guarda fechas
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("Año " + fechaHoy.getYear());
        System.out.println("Mes " + fechaHoy.getMonthValue());
        Month mesActual = fechaHoy.getMonth();
        System.out.println("Month " + mesActual );
        
        
        //Fechas concretas
        LocalDate fecha = LocalDate.of(2000, 11, 10);
        LocalDate fecha2 = LocalDate.of(2022, Month.NOVEMBER, 10);
        
        
        System.out.println("Fecha " + fecha);
        
        
        //Son iguales
        if (fecha.equals(fecha2)) {
            
            System.out.println("Son iguales");
        } else {
            
            System.out.println("No son iguales");
            
        }
        
        
        //Anterior y posterior
        
        
        if (fecha.isBefore(fecha2)) {
            
            System.out.println("La fecha es anterior a fecha2");
        }
        
        if (fecha.isAfter(fecha2)) {
            
            System.out.println("La fecha es posterior a fecha2");
        }
    }
}
