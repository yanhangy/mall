/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.portal.config.GlobalCorsConfig;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.springframework.web.filter.CorsFilter;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GlobalCorsConfig_SSTest extends GlobalCorsConfig_SSTest_scaffolding {
// allCoveredLines:[14, 21, 23, 25, 27, 29, 30, 31, 32]

  @Test(timeout = 4000)
  public void test_corsFilter_0()  throws Throwable  {
      //caseID:0296744e3eca66417a1256a97770bb55
      //CoveredLines: [14, 21, 23, 25, 27, 29, 30, 31, 32]
      //Assert: assertNotNull(method_result);
      
      GlobalCorsConfig globalCorsConfig0 = new GlobalCorsConfig();
      
      //Call method: corsFilter
      CorsFilter corsFilter0 = globalCorsConfig0.corsFilter();
      
      //Test Result Assert
      assertNotNull(corsFilter0);
  }
}
