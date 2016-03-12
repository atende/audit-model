package br.pucminas.icei.audition.entityModel;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Giovanni Silva
 */
public class StringUtilTest {

    @Test
    public void testToCsv() throws Exception {
        List<String> ids = Arrays.asList("1","2","3");
        String csv = StringUtil.toCsv(ids);
        assertEquals(csv, "1;2;3");
    }

    @Test
    public void testFromCsv() throws Exception {
        String csv = "1;2;3";
        List<String> ids = StringUtil.fromCsv(csv);
        String[] expected = {"1","2","3"};
        assertArrayEquals(ids.toArray(),expected);

        String csvOne = "1";
        List<String> idsOne = StringUtil.fromCsv(csvOne);
        String[] expectedOne = {"1"};
        assertArrayEquals(expectedOne, idsOne.toArray());
    }

    @Test
    public void testToString() throws Exception {
        List<String> ids = Arrays.asList("1","2","3");
        String string = StringUtil.toString(ids, '|');
        assertEquals(string, "1|2|3");
    }

    @Test
    public void testFromString() throws Exception {
        List<String> expected = Arrays.asList("1","2","3");
        List<String> atual = StringUtil.fromString("1-2-3", '-');
        assertArrayEquals(atual.toArray(), expected.toArray());
    }
}