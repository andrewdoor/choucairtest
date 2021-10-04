
package ChoucairPruebas;

import com.project.pom.metodos;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class ChoucairTestID4 {
    
    private WebDriver driver;
    metodos Metodos;


    @Before
    public void setUp() {
        Metodos = new metodos(driver);
        driver = Metodos.chromeDriverConnection();
        Metodos.visit("https://www.choucairtesting.com/");
    }

    @After
    public void tearDown() {
        //  driver.quit();
    }

    @Test
    public void test2() throws InterruptedException {
        Metodos.botoncontinuar();

    }
}
