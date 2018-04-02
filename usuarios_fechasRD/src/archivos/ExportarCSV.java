/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import beans.D_RBean;
import beans.JugadorBean;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author user
 */
public class ExportarCSV {

    public ExportarCSV() {
    }

    public void exportarResultados1(List<JugadorBean> jugadores) throws IOException {

        String outputFile = "C:/Users/user/Google Drive/Digital_Balance_AT/Retiros_Depositos_Diarios/bd_retiros_depositos1.csv";

        boolean alreadyExists = new File(outputFile).exists();

        if (alreadyExists) {
            File bd_retiros_depositos = new File(outputFile);
            bd_retiros_depositos.delete();
        }

        CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ';');

        csvOutput.write("id_user");
        csvOutput.write("id_wallet");
        csvOutput.write("apellido");
        csvOutput.write("email");

        csvOutput.write("fecha_retiro");
        csvOutput.write("monto_retiro");
        csvOutput.write("fecha_deposito");
        csvOutput.write("monto_deposito");

        csvOutput.endRecord();

        for (JugadorBean jugador : jugadores) {

            for (D_RBean listita : jugador.getListita()) {

                csvOutput.write(jugador.getIdUser() + "");
                csvOutput.write(jugador.getIdwallet() + "");
                csvOutput.write(jugador.getApellido());
                csvOutput.write(jugador.getEmail());

                csvOutput.write(listita.getFechaR());
                csvOutput.write(listita.getRetiros() + "");
                csvOutput.write(listita.getFechaD());
                csvOutput.write(listita.getDepositos() + "");

                csvOutput.endRecord();

            }

        }

        csvOutput.close();

    }

}
