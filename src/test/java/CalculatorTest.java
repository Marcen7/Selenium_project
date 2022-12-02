

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeMethod
    void setUp(){
        System.out.println("Start cofiguratioun");
        calculator = new Calculator();    //given

    }

    @AfterTest
     void tearDown(){
        System.out.println("End of testing and quit driver");
    }

    @Test(priority = 2)
    public void testAdd(){

        // Każdy test składa się z:
        // 1. przygotowanie testu (sekcja given - wg notacji gerkinowa... )
        // 2. wykonanie istory testu (when - zrobienie tego o co nam chodzi w teście (testujemy kliknięcie to tu następuje kliknięcie)
        // 3. asercaj - sprawdzenie poprawności wyników (then)


        // -> given
        //Calculator calculator = new Calculator();    //given
        int expectedResult = 3;

        // -> when
        int actualResult = calculator.add(1, 2);

        // -> then
        System.out.println("Expected = " + expectedResult + " , Actual = " + actualResult);
        assertThat(expectedResult, equalTo(actualResult));

    }

    @Test(priority = 3)
    public void testAddNegativeNumber(){

        // Każdy test składa się z:
        // 1. przygotowanie testu (sekcja given - wg notacji gerkinowa... )
        // 2. wykonanie istory testu (when - zrobienie tego o co nam chodzi w teście (testujemy kliknięcie to tu następuje kliknięcie)
        // 3. asercaj - sprawdzenie poprawności wyników (then)


        // -> given
        // calculator = new Calculator();    //given
        int expectedResult = -311;

        // -> when
        int actualResult = calculator.add(-11, -300);

        // -> then
        System.out.println("Expected = " + expectedResult + " , Actual = " + actualResult);
        assertThat(expectedResult, equalTo(actualResult));
    }

    @Test(priority = 1)
    public void testAddNumber(){

        // Każdy test składa się z:
        // 1. przygotowanie testu (sekcja given - wg notacji gerkinowa... )
        // 2. wykonanie istory testu (when - zrobienie tego o co nam chodzi w teście (testujemy kliknięcie to tu następuje kliknięcie)
        // 3. asercaj - sprawdzenie poprawności wyników (then)


        // -> given
        // Calculator calculator = new Calculator();    //given
        int expectedResult = -410;

        // -> when
        int actualResult = calculator.add(-110, -300);

        // -> then
        System.out.println("Expected = " + expectedResult + " , Actual = " + actualResult);
        assertThat(expectedResult, equalTo(actualResult));
    }
}
