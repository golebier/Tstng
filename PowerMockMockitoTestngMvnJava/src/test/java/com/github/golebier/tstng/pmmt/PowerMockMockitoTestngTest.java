package com.github.golebier.tstng.pmmt;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.testng.annotations.Test;

/**
 * @author Gra <Gołębiewski Radosław A.> https://github.com/golebier
 *         plus.google.com/u/0/103563456777990778742/about
 *         http://www.linkedin.com
 *         /pub/rados%C5%82aw-go%C5%82%C4%99biewski/70/832/35
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ObjectWithStaticMethod.class)
public class PowerMockMockitoTestngTest {
    private static final String CORRECT_PARAM = "";
    
    @Test
    public void shouldTest() {
        Assert.assertEquals(ObjectWithStaticMethod.PREFIX_STRING,
                ObjectWithStaticMethod.prepareStaticMethodOperations(CORRECT_PARAM));
    }
    
    @Test
    public void testMethodThatCallsStaticMethod() {
        PowerMockito.mockStatic(ObjectWithStaticMethod.class);
        ObjwctUsingObjectWithStaticMethod greetings = Mockito.mock(ObjwctUsingObjectWithStaticMethod.class);
        Mockito.when(greetings.prepareOperationsOnObjectWithStaticMethod(Mockito.anyString()))
                .thenReturn(CORRECT_PARAM);
        Assert.assertEquals(CORRECT_PARAM, greetings.prepareOperationsOnObjectWithStaticMethod(CORRECT_PARAM));
        PowerMockito.verifyStatic();
    }
}
