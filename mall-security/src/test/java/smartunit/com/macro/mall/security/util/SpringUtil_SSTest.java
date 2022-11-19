/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.security.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.macro.mall.security.util.SpringUtil;
import javax.swing.JRadioButtonMenuItem;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.context.ApplicationContext;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SpringUtil_SSTest extends SpringUtil_SSTest_scaffolding {
// allCoveredLines:[13, 19, 24, 25, 27, 31, 36, 41]

  @Test(timeout = 4000)
  public void test_getApplicationContext_0()  throws Throwable  {
      //caseID:bf27b8e29c0f9eb9a89cfde67cef2d1a
      //CoveredLines: [13, 19]
      //Assert: assertNull(method_result);
      
      SpringUtil springUtil0 = new SpringUtil();
      
      //Call method: getApplicationContext
      ApplicationContext applicationContext0 = SpringUtil.getApplicationContext();
      
      //Test Result Assert
      assertNull(applicationContext0);
  }

  @Test(timeout = 4000)
  public void test_getBean_1()  throws Throwable  {
      //caseID:7bb5d4bae609ae3128487776b4a14042
      //CoveredLines: [19, 41]
      //Input_0_String: ?Sc3Z)3R@nL4~C&6bD
      //Input_1_Class<JRadioButtonMenuItem>: JRadioButtonMenuItem.class
      
      Class<JRadioButtonMenuItem> class0 = JRadioButtonMenuItem.class;
      
      //Call method: getBean
      // Undeclared exception!
      try { 
        SpringUtil.getBean("?Sc3Z)3R@nL4~C&6bD", class0);
      } catch(Throwable e) {
         verifyException("com.macro.mall.security.util.SpringUtil", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_getBean_2()  throws Throwable  {
      //caseID:ac75257d94bb359006e7d852faa9690d
      //CoveredLines: [19, 36]
      //Input_0_Class<String>: String.class
      
      Class<String> class0 = String.class;
      
      //Call method: getBean
      // Undeclared exception!
      try { 
        SpringUtil.getBean(class0);
      } catch(Throwable e) {
         verifyException("com.macro.mall.security.util.SpringUtil", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_getBean_3()  throws Throwable  {
      //caseID:19c38f232a32c92d52d172d56ef73b87
      //CoveredLines: [19, 31]
      //Input_0_String: 1.0
      
      
      //Call method: getBean
      // Undeclared exception!
      try { 
        SpringUtil.getBean("1.0");
      } catch(Throwable e) {
         verifyException("com.macro.mall.security.util.SpringUtil", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_setApplicationContext_4()  throws Throwable  {
      //caseID:8c99182f6b2bd2afbcc7448a349d62eb
      //CoveredLines: [13, 24, 25, 27]
      //Input_0_ApplicationContext: {}
      
      SpringUtil springUtil0 = new SpringUtil();
      //mock applicationContext0
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setApplicationContext
      springUtil0.setApplicationContext(applicationContext0);
  }
}
