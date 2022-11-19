/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.macro.mall.MallAdminApplication;
import java.util.ServiceConfigurationError;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MallAdminApplication_SSTest extends MallAdminApplication_SSTest_scaffolding {
// allCoveredLines:[11, 13]

  @Test(timeout = 4000)
  public void test_main_0()  throws Throwable  {
      //caseID:0c7f6c025e970f2f11b894678923b597
      //CoveredLines: [11, 13]
      //Input_0_String[]: stringArray0
      
      MallAdminApplication mallAdminApplication0 = new MallAdminApplication();
      String[] stringArray0 = new String[0];
      
      //Call method: main
      // Undeclared exception!
      try { 
        MallAdminApplication.main(stringArray0);
      } catch(Throwable e) {
         verifyException("java.util.ServiceLoader", e);
         assertEquals("java.util.ServiceConfigurationError", e.getClass().getName());
         assertEquals("com.fasterxml.jackson.databind.Module: Provider com.fasterxml.jackson.module.paramnames.ParameterNamesModule not a subtype", e.getMessage());
      }
  }
}
