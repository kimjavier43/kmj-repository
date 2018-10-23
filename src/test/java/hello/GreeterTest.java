package hello;

import static hello.TestGroups.UNIT;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;


@Test(groups = TestGroups.UNIT)
public class GreeterTest {

    public void testSayHello() {
        Greeter greeter = new Greeter();

        assertThat(greeter.sayHello()).isEqualTo("Hello world!");

    }
}