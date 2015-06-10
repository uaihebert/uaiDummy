package test.coverage;

import com.uaihebert.uaidummy.config.DummyConfig;
import com.uaihebert.uaidummy.creditcard.DummyCreditCardGenerator;
import com.uaihebert.uaidummy.creditcard.ExpirationDateUtil;
import com.uaihebert.uaidummy.utils.ListUtils;
import com.uaihebert.uaidummy.utils.RandomUtils;
import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.assertNotNull;

public class PrivateConstructorTest {

    @Test
    public void testExpirationDateUtil() throws Exception {
        final Constructor<ExpirationDateUtil> constructor = ExpirationDateUtil.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        final ExpirationDateUtil createdObject = constructor.newInstance(new Object[0]);
        assertNotNull(createdObject);
    }

    @Test
    public void testDummyCreditCardGenerator() throws Exception {
        final Constructor<DummyCreditCardGenerator> constructor = DummyCreditCardGenerator.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        final DummyCreditCardGenerator createdObject = constructor.newInstance(new Object[0]);
        assertNotNull(createdObject);
    }

    @Test
    public void testDummyConfig() throws Exception {
        final Constructor<DummyConfig> constructor = DummyConfig.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        final DummyConfig createdObject = constructor.newInstance(new Object[0]);
        assertNotNull(createdObject);
    }

    @Test
    public void testListUtils() throws Exception {
        final Constructor<ListUtils> constructor = ListUtils.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        final ListUtils createdObject = constructor.newInstance(new Object[0]);
        assertNotNull(createdObject);
    }

    @Test
    public void testRandomUtils() throws Exception {
        final Constructor<RandomUtils> constructor = RandomUtils.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        final RandomUtils createdObject = constructor.newInstance(new Object[0]);
        assertNotNull(createdObject);
    }
}