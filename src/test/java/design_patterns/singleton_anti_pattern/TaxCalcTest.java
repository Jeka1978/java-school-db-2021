package design_patterns.singleton_anti_pattern;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalcTest {

  /*  class MockNdsResolver implements NdsResolver{
        @Override
        public double getNds() {
            return 0.1;
        }
    }*/

    @Test
    public void withNds() {


        NdsResolver ndsResolverMock = Mockito.mock(NdsResolver.class);

        Mockito.when(ndsResolverMock.getNds()).thenReturn(0.1);

        TaxCalc taxCalc = new TaxCalc(ndsResolverMock);
        double withNds = taxCalc.withNds(100);
        Assert.assertEquals(110,withNds,0.00001);

        //tdd
    }
}