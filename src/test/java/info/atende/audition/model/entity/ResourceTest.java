package info.atende.audition.model.entity;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Giovanni Silva.
 */
public class ResourceTest {

    @Test
    public void testSetResourceIds() throws Exception {
        List<String> expected = Arrays.asList("david", "alan", "lucas");
        Resource resource = new Resource("names");
        resource.setResourceIds("david","alan","lucas");
        List<String> resourceIds = resource.getResourceIds();
        assertArrayEquals(expected.toArray(), resourceIds.toArray());
    }

    @Test
    public void testGetResourceIds() throws Exception {
        List<String> expected = Arrays.asList("david", "alan", "lucas");
        Resource resource = new Resource("names","david","alan","lucas");
        List<String> resourceIds = resource.getResourceIds();
        assertArrayEquals(expected.toArray(), resourceIds.toArray());
    }
}