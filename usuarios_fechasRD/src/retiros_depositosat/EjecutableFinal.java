/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retiros_depositosat;

import archivos.ExportarCSV;
import gestion.Consultas;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;

/**
 *
 * @author user
 */
public class EjecutableFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException {
        // TODO code application logic here

        Calendar calendar = Calendar.getInstance();

        int num_dia = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("" + num_dia);

        System.out.println("estamos en el día: " + num_dia);

        Consultas c = new Consultas();

        System.out.println("Llenando las fechas1: ");
        c.llenarfechas1();

        System.out.println("LLenando las fechas2: ");
        c.llenarFechas2();

        System.out.println("Completando Lista usuarios retiros*************************");
        c.completarListaRetiros(num_dia);

        System.out.println("Completando Lista usuarios depositos***********************");
        c.completarListaDepositos(num_dia);

        System.out.println("Completando Lista usuarios en general************************");
        c.obtenerListaUsuarios();

        System.out.println("Eliminar usuarios repetidos****************************");
        c.eliminarRepetidos();

        System.out.println("Completando Datos usuarios*******************");
        c.completarDatos();
        c.listarjugadores();

        System.out.println("Completando objetos Retiros1*************");
        c.completarObjetoRetiros1(num_dia);
        c.listarJugadores2();

        System.out.println("Completando objetos depositos1*************");
        c.completarObjetoDepositos1(num_dia);
        c.listarJugadores2();
        
        System.out.println("Completando objetos Retiros2*************");
        c.completarObjetoRetiros2(num_dia);
        c.listarJugadores2();

        System.out.println("Completando objetos depositos2*************");
        c.completarObjetoDepositos2(num_dia);
        c.listarJugadores2();
        
        System.out.println("Completando objetos Retiros3*************");
        c.completarObjetoRetiros3(num_dia);
        c.listarJugadores2();

        System.out.println("Completando objetos depositos3*************");
        c.completarObjetoDepositos3(num_dia);
        c.listarJugadores2();
        
        System.out.println("Completando objetos Retiros4*************");
        c.completarObjetoRetiros4(num_dia);
        c.listarJugadores2();

        System.out.println("Completando objetos depositos4*************");
        c.completarObjetoDepositos4(num_dia);
        c.listarJugadores2();
        
        System.out.println("Completando objetos Retiros5*************");
        c.completarObjetoRetiros5(num_dia);
        c.listarJugadores2();

        System.out.println("Completando objetos depositos5*************");
        c.completarObjetoDepositos5(num_dia);
        c.listarJugadores2();
       
        System.out.println("Completando objetos Retiros6*************");
        c.completarObjetoRetiros6(num_dia);
        c.listarJugadores2();

        System.out.println("Completando objetos depositos6*************");
        c.completarObjetoDepositos6(num_dia);
        c.listarJugadores2();
        
        

        System.out.println("Finalizo la carga *********");
        
        System.out.println("Exportando los datos*******");
        ExportarCSV e= new ExportarCSV();
        e.exportarResultados1(c.getJugadores());

    }

}
