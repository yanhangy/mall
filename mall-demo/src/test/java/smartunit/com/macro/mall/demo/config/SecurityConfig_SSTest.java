/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.demo.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.demo.config.SecurityConfig;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.springframework.security.core.userdetails.UserDetailsService;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SecurityConfig_SSTest extends SecurityConfig_SSTest_scaffolding {
// allCoveredLines:[26, 66]

  @Test(timeout = 4000)
  public void test_userDetailsService_0()  throws Throwable  {
      //caseID:5082af4c1bd86930aee93c83acd12e0e
      //CoveredLines: [26, 66]
      //Assert: assertNotNull(method_result);
      
      SecurityConfig securityConfig0 = new SecurityConfig();
      
      //Call method: userDetailsService
      UserDetailsService userDetailsService0 = securityConfig0.userDetailsService();
      
      //Test Result Assert
      assertNotNull(userDetailsService0);
  }
}
