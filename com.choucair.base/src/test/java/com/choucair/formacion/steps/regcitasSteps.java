package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.regdoctorPageObject;
import net.thucydides.core.annotations.Step;

public class regcitasSteps {
    regdoctorPageObject RegdoctorPageObject;
    @Step
    public void regCitaMedica() {
        RegdoctorPageObject.regCitaMedica();
    }

    public void ingresaPagCita() {
        RegdoctorPageObject.open();
        RegdoctorPageObject.ingresaPagCita();
    }
    public void VerificaCita() {
        RegdoctorPageObject.VerificaCita();
    }

}
