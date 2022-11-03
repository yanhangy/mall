/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.portal.config.MallSecurityConfig;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.springframework.security.core.userdetails.UserDetailsService;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MallSecurityConfig_SSTest extends MallSecurityConfig_SSTest_scaffolding {
// allCoveredLines:[25, 33]

  @Test(timeout = 4000)
  public void test_userDetailsService_0()  throws Throwable  {
      //caseID:af78ab914bd4c9e8d79799710b151adc
      //CoveredLines: [25, 33, 33]
      //Assert: assertNotNull(method_result);
      
      MallSecurityConfig mallSecurityConfig0 = new MallSecurityConfig();
      
      //Call method: userDetailsService
      UserDetailsService userDetailsService0 = mallSecurityConfig0.userDetailsService();
      
      //Test Result Assert
      assertNotNull(userDetailsService0);
  }
}
