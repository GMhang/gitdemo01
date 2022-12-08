import org.junit.Test;

/**
 * @author GM
 * @date 2022/9/14 23:15
 * @discribe
 */
public class HelloTest{
    @Test
    public void test(){
        new Hello().sayHello();
        new Hello().sayHello();
        new Hello().sayHello();
        System.out.println("master commit");
        System.out.println("hot-fix commit");
    }

}
