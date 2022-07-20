package definitions; //El definition se creea a traves del feature solo java y ubicandolo en la carpeta y el feature se crea creando new file en features y agregando el nombre .features

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.autenticacionPage;
import pageobjects.crearCuentaPage;
import pageobjects.menuPage;

import java.io.IOException;

import static support.util.evidencias;

public class registroClienteDefinition {

    //llamo a la clase
    menuPage menu;
    autenticacionPage autenticacion;
    crearCuentaPage crear;

    //inicializo la variable en un constructor
    public registroClienteDefinition() {
        menu = new menuPage();
        autenticacion = new autenticacionPage();
        crear = new crearCuentaPage();
    }

    @Given("que la web este disponible")
    public void queLaWebEsteDisponible() {
        hooks.driver.get("http://automationpractice.com/index.php");
    }


    @And("ingresar a la opcion de creacion de cuenta")
    public void ingresarALaOpcionDeCreacionDeCuenta() throws IOException {
    }

    @When("ingresar un correo {string}")
    public void ingresarUnCorreo(String email) {
        autenticacion.ingresarCorreo(email);
        autenticacion.clickCrearCuenta();
    }


    @And("seleccionar el genero {string}")
    public void seleccionarElGenero(String genero) {
        crear.seleccionarGenero(genero);
    }

    @And("ingresar el nombre {string}")
    public void ingresarElNombre(String nombres) {
        crear.ingresarNombres(nombres);
    }


    @And("ingresar el apellido {string}")
    public void ingresarElApellido(String apellidos) {
        crear.ingresarApellidos(apellidos);
    }


    @And("validar el correo {string}")
    public void validarElCorreo(String email) {
        crear.validarCorreo(email);
    }


    @And("ingresar la clave {string}")
    public void ingresarLaClave(String password) {
        crear.ingresarPassword(password);
    }


    @And("ingresar la fecha de nacimiento {string}")
    public void ingresarLaFechaDeNacimiento(String valor) {

        String[] fecha = valor.split("/");
        crear.seleccionarDia(fecha[0]);
        crear.seleccionarMes(fecha[1]);
        crear.seleccionarAnio(fecha[2]);

    }


    @And("{string} permitir envio de newsletter")
    public void permitirEnvioDeNewsletter(String estado) {
        crear.permitirBoletin(estado);
    }


    @And("{string} permitir envio de ofertas")
    public void permitirEnvioDeOfertas(String estado) {
        crear.permitirOfertas(estado);
    }


    @And("ingresar empresa {string}")
    public void ingresarEmpresa(String empresa) {
        crear.ingresarCompania(empresa);
    }

    @And("ingresar primera direccion {string}")
    public void ingresarPrimeraDireccion(String address) {
        crear.ingresarAddress1(address);
    }


    @And("ingresar segunda direccion {string}")
    public void ingresarSegundaDireccion(String address) {
        crear.ingresarAddress2(address);
    }


    @And("ingresar ciudad {string}")
    public void ingresarCiudad(String ciudad) {
        crear.ingresarCiudad(ciudad);
    }


    @And("seleccionar estado {string}")
    public void seleccionarEstado(String estado) {
        crear.seleccionarEstado(estado);
    }


    @And("ingresar codigo postal {string}")
    public void ingresarCodigoPostal(String postal) {
        crear.ingresarPostCode(postal);
    }


    @And("seleccionar pais {string}")
    public void seleccionarPais(String pais) {
        crear.seleccionarPais(pais);
    }


    @And("ingresar informacion {string}")
    public void ingresarInformacion(String informacion) {
        crear.ingresarInformacion(informacion);
    }


    @And("ingresar telefono {string}")
    public void ingresarTelefono(String telefono) {
        crear.ingresarNumeroCasa(telefono);
    }


    @And("ingresar celular {string}")
    public void ingresarCelular(String celular) {
        crear.ingresarNumeroMobile(celular);
    }

    @And("ingresar alias {string}")
    public void ingresarAlias(String alias) {
        crear.ingresarAlias(alias);
    }


    @And("guardar registro")
    public void guardarRegistro() {
        crear.clickCrear();
    }

    @And("ingresar al login")
    public void ingresarAlLogin() throws IOException {
        menu.clicklogin();
        evidencias();
    }
}
