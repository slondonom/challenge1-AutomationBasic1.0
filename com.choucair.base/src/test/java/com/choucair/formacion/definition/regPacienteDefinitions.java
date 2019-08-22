package com.choucair.formacion.definition;

import com.choucair.formacion.steps.regPacienteSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class regPacienteDefinitions {
    @Steps
    regPacienteSteps RegPacienteSteps;

    @Dado("^que Carlos necesita registrar un nuevo paciente$")
    public void que_Carlos_necesita_registrar_un_nuevo_paciente()  {
        RegPacienteSteps.ingresaPagPaciente();
    }
    @Cuando("^realiza el registro del mismo en el aplicativo de Administración de Hospitales$")
    public void realiza_el_registro_del_mismo_en_el_aplicativo_de_Administración_de_Hospitales()  {
        RegPacienteSteps.RegPaciente();
    }
    @Entonces("^verifica que se presente en pantalla el mensaje Datos guardados correctamente$")
    public void verifica_que_se_presente_en_pantalla_el_mensaje_Datos_guardados_correctamente() {
        RegPacienteSteps.VerificaPaciente();
    }


}
