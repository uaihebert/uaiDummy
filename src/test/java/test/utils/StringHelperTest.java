package test.utils;

import com.uaihebert.uaidummy.utils.StringHelper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringHelperTest {

    @Test
    public void isReturningCorrectlyWithNullFilling(){
        assertEquals("33", StringHelper.leftFill(null, "33"));
    }

    @Test
    public void isReturningCorrectlyWithNullString(){
        assertNull(StringHelper.leftFill("aaa", null));
    }

    @Test
    public void isLeftFillingCorrectly(){
        assertEquals("aa3", StringHelper.leftFill("aaa", "3"));
    }

    @Test
    public void isLeftFillingCorrectly2(){
        assertEquals("a33", StringHelper.leftFill("aaa", "33"));
    }

    @Test
    public void isLeftFillingCorrectly3(){
        assertEquals("abcd33", StringHelper.leftFill("abcdef", "33"));
    }

    @Test
    public void isLeftFillingWhenStringLongerThanFilling(){
        assertEquals("33", StringHelper.leftFill("a", "33"));
    }
}