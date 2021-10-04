
package ChoucairPruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/*
pruebas ID 3 y ID 4 no realizadas por problemas encontrados, ver novedad en el documento.
*/

@RunWith(Suite.class)
@Suite.SuiteClasses({ ChoucairPruebas.ChoucairTestID1.class, ChoucairPruebas.ChoucairTestID2.class })
//@Suite.SuiteClasses({ChoucairPruebas.choucairTestID3.class, ChoucairPruebas.ChoucairTestID2.class, ChoucairPruebas.ChoucairTestID4.class, ChoucairPruebas.ChoucairTestID1.class})
public class ChoucairTests {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
