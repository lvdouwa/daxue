package service;

import com.lvdouwa.daxue.core.feature.test.TestSupport;
import com.lvdouwa.daxue.web.model.Jbxx;
import com.lvdouwa.daxue.web.service.JbxxService;
import com.lvdouwa.daxue.web.service.impl.JbxxServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by u6031313 on 8/10/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class JbxxServiceTest {
    @Configuration
    static class ContextConfiguration {
        // this bean will be injected into the OrderServiceTest class
        @Resource
        public JbxxService jbxxService() {
            JbxxService jbxxService = new JbxxServiceImpl();
            // set properties, etc.
            return jbxxService;
        }
    }
    //@Autowired
    private JbxxService jbxxService;
    @Test
    public void test_select() {
        Jbxx jbxx = jbxxService.selectById(1);
        if (jbxx!=null){
            System.out.println("ok");
        }
    }
}
