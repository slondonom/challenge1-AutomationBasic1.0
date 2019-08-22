package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.Keys;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class regdoctorPageObject extends PageObject {
    //------------------Xpath del doctor-------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[1]")
     WebElementFacade liagregarDoctor;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElementFacade lblingresenombreDoc;

    @FindBy(xpath = "//*[@id=\"last_name\"]")
    public WebElementFacade lblingreseapellidoDoc;

    @FindBy(xpath = "//*[@id=\"telephone\"]")
    public WebElementFacade lbltelephoneDoc;

    @FindBy (xpath = "//*[@id=\"identification_type\"]")
    public WebElementFacade cbmtipoIdentidadDoc;

    @FindBy (xpath = "//*[@id=\"identification\"]")
    public WebElementFacade slctDocumentoDoc;

    @FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/a")
    public WebElementFacade btnGuardarDoc;

    @FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/p")
    public WebElementFacade lblGuardadoDoc;

    @FindBy (xpath = "//*[@id=\"wrapper\"]/nav/div/a")
    public WebElementFacade lblinicio;

    //--------------------Agendar del paciente--------------------------------------------------

    @FindBy (xpath ="//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[2]")
    public WebElementFacade liagregarPaciente;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/div[1]/input")
    public WebElementFacade lblingresenombrePac;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input")
    public WebElementFacade lblingreseapellidoPac;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input")
    public WebElementFacade lbltelephonePac;

    @FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/select")
    public WebElementFacade cbmtipoIdentidadPac;

    @FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/div[5]/input")
    public WebElementFacade slctDocumentoPac;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/div[6]/label")
    public WebElementFacade lblSaludPrepagada;

    @FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/a")
    public WebElementFacade btnGuardarPac;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/div[2]")
    public WebElementFacade lblguardadoPaciente;

    //-----------------xpath Agendar Cita---------------------------------------------

    @FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[6]")
    public WebElementFacade lblAgendarCita;

    @FindBy (xpath = "//*[@id=\"datepicker\"]")
    public WebElementFacade lbldiaCita;

    @FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input")
    public WebElementFacade lblIdPaciente;

    @FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input")
    public WebElementFacade lblIdDoctor;

    @FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/textarea")
    public WebElementFacade txtObservaciones;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[3]/div/a")
    public WebElementFacade lblguardadoCita;

    //---------Doctor-------------------------------------------------
    public void ingresaPagdoc (){
        liagregarDoctor.click();
    }
    public void RegDoctor() {
        lblingresenombreDoc.sendKeys("Carlos");
        lblingreseapellidoDoc.sendKeys("Puerta");
        lbltelephoneDoc.sendKeys("223222");
        cbmtipoIdentidadDoc.selectByVisibleText("Cédula de ciudadanía");
        slctDocumentoDoc.sendKeys("1011333774");
        btnGuardarDoc.click();
    }
    public void VerificaDoc() {
        String labelv="Datos guardados correctamente.";
        String strMensaje =lblGuardadoDoc.getText();
        assertThat (strMensaje, containsString(labelv));
        lblinicio.click();
    }
    //-------------------Paciente---------------------------------

    public void ingresaPagPaciente() {
        liagregarPaciente.click();
    }

    public void RegPaciente() {
        lblingresenombrePac.sendKeys("Carlos");
        lblingreseapellidoPac.sendKeys("Puerta");
        lbltelephonePac.sendKeys("224722");
        cbmtipoIdentidadPac.selectByVisibleText("Cédula de ciudadanía");
        slctDocumentoPac.sendKeys("1074222884");
        lblSaludPrepagada.click();
        btnGuardarPac.click();
    }

    public void VerificaPaciente() {
        String labelv="Datos guardados correctamente.";
        String strMensaje =lblGuardadoDoc.getText();
        assertThat (strMensaje, containsString(labelv));
        lblinicio.click();
    }

    //---------------Cita------------------------------------

    public void ingresaPagCita(){
        lblAgendarCita.click();
    }

    public void regCitaMedica() {

        lbldiaCita.sendKeys("08/23/2019");
        lbldiaCita.sendKeys(Keys.RETURN);
        lblIdPaciente.sendKeys("1074222884");
        lblIdDoctor.sendKeys("1011333774");
        txtObservaciones.sendKeys("Hola");
        lblguardadoCita.click();
    }

    public void VerificaCita() {
        String labelv="Datos guardados correctamente.";
        String strMensaje =lblGuardadoDoc.getText();
        assertThat (strMensaje, containsString(labelv));
        lblinicio.click();
    }
}
