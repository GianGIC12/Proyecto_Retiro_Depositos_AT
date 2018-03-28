/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retiros_depositosat;

import gestion.Consultas;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        Consultas c = new Consultas();

        c.completarListaRetiros(8);
        System.out.println("****************");
        c.completarListaDepositos(8);

        System.out.println("****Lista_Total****");

        c.obtenerListaUsuarios();

        System.out.println("***Llennado fecha 1****");
        c.llenarfechas1();

        for (int i = 0; i < c.getFechas1().length; i++) {

            System.out.println("" + c.getFechas1()[i]);

        }

        System.out.println("***Llennado fecha 2****");

        c.llenarFechas2();

        for (int i = 0; i < c.getFechas2().length; i++) {

            System.out.println("" + c.getFechas2()[i]);

        }

        System.out.println("***Lista_Final");

        c.eliminarRepetidos();

        c.completarDatos();
        c.listarjugadores();

        System.out.println("****fechas caso 1");

        c.completarObjetoRetiros1(86);

        System.out.println("***Retiros");

        c.listarJugadores2();

        c.completarObjetoDepositos1(86);

        c.listarJugadores2();

    }

}
