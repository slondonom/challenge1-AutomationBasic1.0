package com.choucair.formacion.definition;

import com.choucair.formacion.steps.regcitasSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class regCitaDefinitions {
    @Steps
    regcitasSteps RegcitasSteps;

    @Dado("^que Carlos necesita asistir al medico$")
    public void que_Carlos_necesita_asistir_al_medico() {
        RegcitasSteps.ingresaPagCita();
    }

    @Cuando("^el realiza el agendamiento de una Cita$")
    public void el_realiza_el_agendamiento_de_una_Cita()  {
        RegcitasSteps.regCitaMedica();
    }

    @Entonces("^el verifica que se presente en pantalla mensaje Datos guardados correctamente$")
    public void el_verifica_que_se_presente_en_pantalla_mensaje_Datos_guardados_correctamente() {
        RegcitasSteps.VerificaCita();
    }
}
