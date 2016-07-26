import com.endava.junit.process.SplitPattern;
import com.sun.org.apache.xml.internal.security.keys.content.SPKIData;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by mistrate on 7/22/2016.
 */
public class SplitPatternTest {

    SplitPattern splitPattern;
    List<String> stringList;
    List<String> expectedResult;

    @Before
    public void setUp(){
        splitPattern = new SplitPattern();
        stringList= new ArrayList<String>();
        expectedResult= new ArrayList<String>();

        stringList.add("laal");
        stringList.add("lalalalala");
        stringList.add("lalalalalalalalalalalalalalalala");
        stringList.add(null);

        expectedResult.add("small");
        expectedResult.add("medium");
        expectedResult.add("long");
        expectedResult.add(null);
    }

    @Test
    public void testLength1(){
        List<String> actualResult = splitPattern.splitByLength(stringList);
        assertThat(actualResult, is(expectedResult));
    }

    //SAU

    @Test
    public void testLength2(){
        List<String> actualResult = splitPattern.splitByLength(stringList);
        //Verifica daca listele au aceeasi dimensiune
        assertEquals(actualResult.size(), expectedResult.size());

        //Verifica daca elementele din liste coincid
        for(int i = 0; i < expectedResult.size(); i++){
            assertEquals(actualResult.get(i), expectedResult.get(i));
        }
    }

    //SAU mai corect teste pentru fiecare - small - medium -long
    @Test
    public void testSmall(){
        splitPattern = new SplitPattern();
        String value = "laal";

        String actual = splitPattern.getStringLength(value);
        String expected = "small";

        assertEquals(expected,actual);

    }

    @Test
    public void testSMedium(){
        splitPattern = new SplitPattern();
        String value = "laaallaaala";

        String actual = splitPattern.getStringLength(value);
        String expected = "medium";

        assertEquals(expected,actual);

    }

    @Test
    public void testLong(){
        splitPattern = new SplitPattern();
        String value = "laaaaaaaaaaaaaaaaal";

        String actual = splitPattern.getStringLength(value);
        String expected = "long";

        assertEquals(expected,actual);

    }
}
