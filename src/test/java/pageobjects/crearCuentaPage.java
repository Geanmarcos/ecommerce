package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

import java.util.Locale;

public class crearCuentaPage extends util {

    @FindBy(xpath="//input[@id='id_gender1']") protected WebElement rdomr;
    @FindBy(xpath="//input[@id='id_gender2']") protected WebElement rdomrs;
    @FindBy(xpath="//input[@id='customer_firstname']") protected WebElement txtfirstname;
    @FindBy(xpath="//input[@id='customer_lastname']") protected WebElement txtlastname;
    @FindBy(xpath="//input[@id='email']") protected WebElement txtemail;
    @FindBy(xpath="//input[@id='passwd']") protected WebElement txtpassword;
    @FindBy(xpath="//select[@id='days']") protected WebElement cmbdays;
    @FindBy(xpath="//select[@id='months']") protected WebElement cmbmonths;
    @FindBy(xpath="//select[@id='years']") protected WebElement cmbyears;
    @FindBy(xpath="//input[@id='newsletter']") protected WebElement chknewslet;
    @FindBy(xpath="//input[@id='optin']") protected WebElement chkoffers;

    @FindBy(xpath="//input[@id='firstname']") protected WebElement txtfirstnameAd;
    @FindBy(xpath="//input[@id='lastname']") protected WebElement txtlastnameAd;
    @FindBy(xpath="//input[@id='company']") protected WebElement txtcompany;
    @FindBy(xpath="//input[@id='address1']") protected WebElement txtaddress1;
    @FindBy(xpath="//input[@id='address2']") protected WebElement txtaddress2;
    @FindBy(xpath="//input[@id='city']") protected WebElement txtcity;
    @FindBy(xpath="//select[@id='id_state']") protected WebElement cmbstate;
    @FindBy(xpath="//input[@id='postcode']") protected WebElement txtpostcode;
    @FindBy(xpath="//select[@id='id_country']") protected WebElement cmbcountry;
    @FindBy(xpath="//textarea[@id='other']") protected WebElement txtinformation;
    @FindBy(xpath="//input[@id='phone']") protected WebElement txthomephone;
    @FindBy(xpath="//input[@id='phone_mobile']") protected WebElement txtmobilephone;
    @FindBy(xpath="//input[@id='alias']") protected WebElement txtaliasad;

    @FindBy(id="submitAccount") protected WebElement btncrearcuenta;


    public crearCuentaPage() {
        PageFactory.initElements(driver,this);
    }

    public void seleccionarGenero(String genero){
        wait.until(ExpectedConditions.elementToBeClickable(rdomr));

        if(genero.equalsIgnoreCase("señor")){
            rdomr.click();
        } else if (genero.equalsIgnoreCase("señora")) {
            rdomrs.click();
        } else {
            System.out.print("Valor enviado es invalido, seleccionar señor o señora");
        }

    }

    public void ingresarNombres(String texto){
        txtfirstname.sendKeys(texto);
    }

    public void ingresarApellidos(String texto){
        txtlastname.sendKeys(texto);
    }

    public void validarCorreo(String correo){
        String valor = txtemail.getAttribute("value");
        Assert.assertEquals(correo,valor);
    }

    public void ingresarPassword(String texto){
        txtpassword.sendKeys(texto);
    }

    public void seleccionarDia(String day){
        new Select(cmbdays).selectByValue(day);
    }

    public void seleccionarMes(String mes){
        new Select(cmbmonths).selectByValue(mes);
    }

    public void seleccionarAnio(String anio){
        new Select(cmbyears).selectByValue(anio);
    }

    public void permitirBoletin(String estado){

        if(estado.equalsIgnoreCase("si")){
            chknewslet.click();
            Assert.assertTrue(chknewslet.isSelected());
        } else if (estado.equalsIgnoreCase("no")) {
            Assert.assertFalse(chknewslet.isSelected());
        }

    }

    public void permitirOfertas(String estado){

        if(estado.equalsIgnoreCase("si")){
            chkoffers.click();
            Assert.assertTrue(chkoffers.isSelected());
        } else if (estado.equalsIgnoreCase("no")) {
            Assert.assertFalse(chkoffers.isSelected());
        }
    }

    public void ingresarNombreAddress(String texto){
        txtfirstnameAd.sendKeys(texto);
    }

    public void ingresarApellidoAddres(String texto){
        txtlastnameAd.sendKeys(texto);
    }

    public void ingresarCompania(String texto){
        txtcompany.sendKeys(texto);
    }

    public void ingresarAddress1(String texto){
        txtaddress1.sendKeys(texto);
    }

    public void ingresarAddress2(String texto){
        txtaddress2.sendKeys(texto);
    }

    public void ingresarCiudad(String texto){
        txtcity.sendKeys(texto);
    }

    public void seleccionarEstado(String estado){
        new Select(cmbstate).selectByVisibleText(estado);
    }

    public void ingresarPostCode(String texto){
        txtpostcode.sendKeys(texto);
    }

    public void seleccionarPais(String pais){
        new Select(cmbcountry).selectByVisibleText(pais);
    }

   public void ingresarInformacion(String texto){
        txtinformation.sendKeys(texto);
   }

   public void ingresarNumeroCasa(String texto){
        txthomephone.sendKeys(texto);
   }

   public void ingresarNumeroMobile(String texto){
        txtmobilephone.sendKeys(texto);
   }

   public void ingresarAlias(String texto){
        txtaliasad.sendKeys(texto);
   }

   public void clickCrear(){
        btncrearcuenta.click();
   }

}
