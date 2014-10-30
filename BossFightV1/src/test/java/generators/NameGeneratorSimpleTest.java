package generators;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class NameGeneratorSimpleTest {
    NameGenerator nameGenerator;

    @Before
    public void setUp() throws Exception {
        nameGenerator = new NameGeneratorSimple();
    }

    @Test
    public void testGetUniqueName99times() throws Exception {
        ArrayList<String> names = null;
        for(int i = 0; i < 99; i++ ){
            names.add(nameGenerator.getUniqueName());
        }

        Set namesAsSet = (Set) names;

        assertEquals(names.size(), namesAsSet.size());


    }
}