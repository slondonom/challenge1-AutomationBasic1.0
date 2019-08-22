package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.regdoctorPageObject;
import net.thucydides.core.annotations.Step;

public class regPacienteSteps {
    regdoctorPageObject RegdoctorPageObject;
    @Step
    public void ingresaPagPaciente() {
        RegdoctorPageObject.open();
        RegdoctorPageObject.ingresaPagPaciente();
    }
    public void RegPaciente() {
        RegdoctorPageObject.RegPaciente();
    }
    public void VerificaPaciente() {
        RegdoctorPageObject.VerificaPaciente();
    }


}
