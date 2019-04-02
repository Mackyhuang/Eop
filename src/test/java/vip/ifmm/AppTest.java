package vip.ifmm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vip.ifmm.annotation.Recordlog;
import vip.ifmm.Sleep;
import vip.ifmm.enhancer.Enhancement;
import vip.ifmm.service.SimpleAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void BasicTest(){
        Sleep sleep = new Sleep();
        SimpleAdapter adapter = new SimpleAdapter();
        Enhancement enhancement = new Enhancement();
        Sleep proxySleep = (Sleep) enhancement.bind(sleep, adapter, Recordlog.class);
        String huLuuuuuuuu = proxySleep.sleep("HuLuuuuuuuu");
        System.out.println("log : " + huLuuuuuuuu);
    }





}
