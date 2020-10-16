package BaseTests;


import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class BaseTest extends Anotatoin {                      // присоединяем тесты

    int k=5;
    int n=12;

    @Test
    public void Abc() {
        // метод сравнения с числом
        if (k > n){
            System.out.println("K больше N");
        } else if (k<n) {
            System.out.println("K меньше N");
        } else {
            System.out.println("переменные равны");
        }
    }

}