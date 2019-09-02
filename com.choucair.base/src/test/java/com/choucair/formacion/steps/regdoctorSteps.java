package com.choucair.formacion.steps;
import com.choucair.formacion.pageobjects.regdoctorPageObject;
import com.opencsv.CSVReader;
import net.thucydides.core.annotations.Step;
import java.io.FileReader;
import java.io.IOException;

public class regdoctorSteps {
    regdoctorPageObject RegdoctorPageObject;
    @Step
    public void ingresaPagdoc() {
        RegdoctorPageObject.open();
        RegdoctorPageObject.ingresaPagdoc();
    }
    public void RegDoctor() {
        RegdoctorPageObject.RegDoctor();
    }
    public void VerificaDoc() {
        RegdoctorPageObject.VerificaDoc();
    }

    public void llenarFormularioDatosPersonales(String id) throws IOException {
        String CSV_file = "src/test/resources/Datadriven/badeDatos.csv";
        CSVReader reader = null;
        reader = new CSVReader(new FileReader(CSV_file));
        String[] cell = reader.readNext();
        while((cell = reader.readNext()) !=null){
            if (id.equals(cell[0])){ //.trim() elimina espacios a los lados
                RegdoctorPageObject.agregarNombre(cell[1]);
                RegdoctorPageObject.agregarApellido(cell[2]);
                RegdoctorPageObject.agregarTelefono(cell[3]);
                RegdoctorPageObject.agregarIdentidadDoc(cell[4]);
                RegdoctorPageObject.ingresarDocumentoDoc(cell[5]);
            }
        }
        RegdoctorPageObject.RegDoctor();
        reader.close();
    }
    }


