import com.endava.junit.process.ProcessPattern;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by mistrate on 7/22/2016.
 */
public class ProcessPatternTest {
    ProcessPattern processPattern;

    @Test
    public void testJuniorGrade(){
        processPattern = new ProcessPattern();
        String grade = "junior";
        String actual = processPattern.generatePosition(grade, 1);
        String expected = "Junior Developer";
        assertEquals(expected,actual);
    }

    @Test
    public void testMiddleGrade(){
        processPattern = new ProcessPattern();
        String grade = "middle";
        String actual = processPattern.generatePosition(grade, 1);
        String expected = "Developer 1";
        assertEquals(expected,actual);

    }

    @Test
    public void testMiddleGrade1(){
        processPattern = new ProcessPattern();
        String grade = "middle";
        String actual = processPattern.generatePosition(grade, 2);
        String expected = "Developer 2";
        assertEquals(expected,actual);

    }

    @Test
    public void testSeniorGrade(){
        processPattern = new ProcessPattern();
        String grade = "senior";
        String actual = processPattern.generatePosition(grade, 3);
        String expected = "Senior 1";
        assertEquals(expected,actual);

    }

    @Test
    public void testSeniorGrade1(){
        processPattern = new ProcessPattern();
        String grade = "senior";
        String actual = processPattern.generatePosition(grade, 6);
        String expected = "Senior 2";
        assertEquals(expected,actual);
    }
    @Test
    public void testUndefinedGrade(){
        processPattern = new ProcessPattern();
        String grade = "unknown";
        String actual = processPattern.generatePosition(grade, 1);
        String expected = "Unknown Position";
        assertEquals(expected,actual);
    }

    @Test
    public void testNullGrade(){
        processPattern = new ProcessPattern();
        String grade = null;
        String actual = processPattern.generatePosition(grade, 1);
        assertNull(actual);

    }

    @Test
    public void testZeroAge(){
        processPattern = new ProcessPattern();
        String grade = "junior";
        String actual = processPattern.generatePosition(grade, 0);
        assertNull(actual);

    }

}
