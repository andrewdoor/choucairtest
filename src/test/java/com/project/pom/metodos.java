package com.project.pom;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class metodos extends base {

    By empleosLocator = By.linkText("Empleos");
    By EmpleosSecLocator = By.xpath("//img[@ src='https://www.choucairtesting.com/wp-content/uploads/2019/07/banner.png']");
    By serLocator = By.xpath("//a[@ href ='#ser']");
    By MensajeLocator = By.tagName("p");
    By prepararseLocator = By.xpath("//a[@ href ='#prepararse']");
    By btnEmpleosLocator = By.xpath("//A[@href='#elementor-action%3Aaction%3Dpopup%3Aopen%26settings%3DeyJpZCI6IjExODc2IiwidG9nZ2xlIjpmYWxzZX0%3D']");
    By btncontinuarLocator = By.xpath("//SPAN[@class='elementor-button-text'][text()='Continuar']");

    public metodos(WebDriver driver) {
        super(driver);
    }

    public void queEsChoucair() throws InterruptedException {
        clickon(empleosLocator);
        Thread.sleep(2000);
        if (isDisplayed(EmpleosSecLocator)) {
            clickon(serLocator);
            Thread.sleep(2000);
        } else {
            System.out.println("Pagina de Empleos no encontrada");
        }
    }

    public void prepararseChoucair() throws InterruptedException {
        clickon(empleosLocator);
        Thread.sleep(2000);
        if (isDisplayed(EmpleosSecLocator)) {
            clickon(prepararseLocator);
            Thread.sleep(2000);

        } else {
            System.out.println("Pagina de Empleos no encontrada");
        }

    }

    public void botonIraEmpleos() throws InterruptedException {
        clickon(empleosLocator);
        Thread.sleep(2000);
        clickon(btnEmpleosLocator);
        Thread.sleep(5000);
        List<WebElement> p = findElements(MensajeLocator);
        assertEquals("¡todo en un solo lugar!", p.get(15).getText());
        Thread.sleep(2000);
    }
    
    public void botoncontinuar()throws InterruptedException{
        clickon(empleosLocator);
        Thread.sleep(2000);
        clickon(btnEmpleosLocator);
        Thread.sleep(2000);
        clickon(btncontinuarLocator);
        Thread.sleep(2000);
        assertEquals("https://www.magneto365.com/choucair",actualUrl());
        Thread.sleep(2000);
    }

}
