import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanPrototypeTest {
    private HumanPrototype humanPrototype;

    @BeforeEach
    void setUp() {
        humanPrototype = new HumanPrototype("Pedro", "Henrique", 30);
    }

    @Test
    void getClone() {
        System.out.println("Running: testGetClone");
        HumanPrototype humanPrototype2 = (HumanPrototype) humanPrototype.getClone();

        humanPrototype2.setName("Jonas");
        humanPrototype2.setLastName("Silva");
        humanPrototype2.setAge(40);

        assertEquals("HumanPrototype@Name: Pedro, Lastname: Henrique, Age: 30", humanPrototype.toString());
        assertEquals("HumanPrototype@Name: Jonas, Lastname: Silva, Age: 40", humanPrototype2.toString());
    }
}
