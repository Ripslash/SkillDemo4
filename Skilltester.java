import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class Skilltester {
    @Test
    public void test() {
        assertEquals(Skills.returnOne(), 5);
    }    
}

//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java

//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest