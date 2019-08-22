package com.choucair.formacion.definition;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import com.choucair.formacion.steps.regdoctorSteps;
import net.thucydides.core.annotations.Steps;


public class regdoctorDefinitions {
@Steps
    regdoctorSteps RegdoctorSteps;


    @Dado("^que Carlos necesita registrar un nuevo doctor$")
    public void que_Carlos_necesita_registrar_un_nuevo_doctor()  {
        RegdoctorSteps.ingresaPagdoc();
        // Write code here that turns the phrase above into concrete actions
    }
    @Cuando("^el realiza el registro del mismo en el aplicativo de Administración de Hospitales$")
    public void el_realiza_el_registro_del_mismo_en_el_aplicativo_de_Administración_de_Hospitales()  {

        RegdoctorSteps.RegDoctor();
        //RegdoctorSteps.RegPaciente();
    }
    @Entonces("^el verifica que se presente en pantalla el mensaje Datos guardados correctamente$")
    public void el_verifica_que_se_presente_en_pantalla_el_mensaje_Datos_guardados_correctamente() {
        RegdoctorSteps.VerificaDoc();
      // RegdoctorSteps.VerificaPaciente();
       // RegdoctorSteps.VerificaCita();
    }
}
