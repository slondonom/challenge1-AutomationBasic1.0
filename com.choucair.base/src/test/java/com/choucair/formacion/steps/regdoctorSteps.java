package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.regdoctorPageObject;
import net.thucydides.core.annotations.Step;

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

}
