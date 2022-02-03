import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class Skilltester {
    @Test
    public void test() {
        assertEquals((int) (Skills.returnOne()), 1);
    }    
}
//;) stolen
//javac -cp ".;lib\junit-4.12.jar;lib\hamcrest-core-1.3.jar" Skilltester.java  

//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest