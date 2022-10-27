/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.macro.mall.portal.MallPortalApplication;
import java.util.ServiceConfigurationError;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MallPortalApplication_SSTest extends MallPortalApplication_SSTest_scaffolding {
// allCoveredLines:[7, 10]

  @Test(timeout = 4000)
  public void test_main_0()  throws Throwable  {
      //caseID:d407bde4fd30c029d134d2bcd9672819
      //CoveredLines: [7, 10]
      //Input_0_String[]: stringArray0
      
      MallPortalApplication mallPortalApplication0 = new MallPortalApplication();
      String[] stringArray0 = new String[0];
      
      //Call method: main
      // Undeclared exception!
      try { 
        MallPortalApplication.main(stringArray0);
      } catch(Throwable e) {
         verifyException("java.util.ServiceLoader", e);
         assertEquals("java.util.ServiceConfigurationError", e.getClass().getName());
         assertEquals("com.fasterxml.jackson.databind.Module: Provider com.fasterxml.jackson.datatype.jsr310.JavaTimeModule not a subtype", e.getMessage());
      }
  }
}
