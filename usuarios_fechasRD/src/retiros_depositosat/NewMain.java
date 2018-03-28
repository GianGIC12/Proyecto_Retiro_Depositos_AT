/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retiros_depositosat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author user
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] fechas1 = new String[366];

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();

        String fecha = dateFormat.format(date);
        String annio = fecha.substring(0, 4);

        fechas1[0] = annio + "-12-31";

        int contador = 0;

        for (int i = 1; i <= 12; i++) {

            String mes = "-0";

            if (i >= 10) {
                mes = "-";
            }

            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {

                for (int j = 1; j <= 31; j++) {
                    contador++;

                    if (j < 10) {

                        fechas1[contador] = annio + mes + i + "-0" + j;

                    } else {

                        fechas1[contador] = annio + mes + i + "-" + j;

                    }

                }

            } else if (i == 2) {

                for (int j = 1; j <= 28; j++) {
                    contador++;

                    if (j < 10) {

                        fechas1[contador] = annio + mes + i + "-0" + j;

                    } else {

                        fechas1[contador] = annio + mes + i + "-" + j;

                    }

                }

            } else {

                for (int j = 1; j <= 30; j++) {
                    contador++;

                    if (j < 10) {

                        fechas1[contador] = annio + mes + i + "-0" + j;

                    } else {

                        fechas1[contador] = annio + mes + i + "-" + j;

                    }

                }

            }

        }

        //******************************************//     
        for (int i = 0; i < 366; i++) {
            System.out.println("" + fechas1[i]);

        }

        //*****************************************//
        String[] fechas2 = new String[32];

        Calendar calendar = Calendar.getInstance();

        int num_dia = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("" + num_dia);

    }

}
