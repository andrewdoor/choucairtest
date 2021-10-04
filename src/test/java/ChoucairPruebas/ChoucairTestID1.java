package ChoucairPruebas;


import com.project.pom.metodos;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author phunk
 */
public class ChoucairTestID1 {
    private WebDriver driver;
    metodos Metodos;
    
    @Before
    public void setUp() {
        Metodos = new metodos(driver);
        driver = Metodos.chromeDriverConnection();
        Metodos.visit("https://www.choucairtesting.com/");
    }

    @After
    public void tearDown() throws Exception {
      //  driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        Metodos.queEsChoucair();
    }

  

//    @Test
//    public void botonIraEmpleos() throws InterruptedException {
//        driver.findElement(empleosLocator).click();
//        Thread.sleep(5000);
//        driver.findElement(btnEmpleosLocator).click();
//        Thread.sleep(5000);
//        List<WebElement> p = driver.findElements(By.tagName("p"));
//        assertEquals("¡todo en un solo lugar!", p.get(15).getText());
//        Thread.sleep(2000);
//    }
}
