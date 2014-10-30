package generators;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class NameGeneratorSimpleTest {
    NameGenerator nameGenerator;

    @Before
    public void setUp() throws Exception {
        nameGenerator = new NameGeneratorSimple();
    }

    @Test
    public void print1UniqueName() throws Exception {
        System.out.println(nameGenerator.getUniqueName());
    }

    @Test
    public void testGetUniqueName99times() throws Exception {

        ArrayList<String> names = new ArrayList<String>();

        for(int i = 0; i < 99; i++ ){
            String generatedName = nameGenerator.getUniqueName();
            names.add(generatedName);
            System.out.println(generatedName);
        }

        Set<String> namesAsSet = new HashSet<String>(names);

        assertEquals(names.size(), namesAsSet.size());


    }
}