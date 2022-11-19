/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.common.domain.SwaggerProperties;
import com.macro.mall.portal.config.SwaggerConfig;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SwaggerConfig_SSTest extends SwaggerConfig_SSTest_scaffolding {
// allCoveredLines:[14, 18, 19, 20, 21, 22, 23, 24, 25]

  @Test(timeout = 4000)
  public void test_swaggerProperties_0()  throws Throwable  {
      //caseID:60d5587e07517ae2791cb1e37a5c8c28
      //CoveredLines: [14, 18, 19, 20, 21, 22, 23, 24, 25]
      //Assert: assertEquals("mall\u524D\u53F0\u76F8\u5173\u63A5\u53E3\u6587\u6863", method_result.getDescription());
      //Assert: assertTrue(method_result.isEnableSecurity());
      //Assert: assertEquals("macro", method_result.getContactName());
      //Assert: assertEquals("1.0", method_result.getVersion());
      //Assert: assertEquals("mall\u524D\u53F0\u7CFB\u7EDF", method_result.getTitle());
      //Assert: assertEquals("com.macro.mall.portal.controller", method_result.getApiBasePackage());
      
      SwaggerConfig swaggerConfig0 = new SwaggerConfig();
      
      //Call method: swaggerProperties
      SwaggerProperties swaggerProperties0 = swaggerConfig0.swaggerProperties();
      
      //Test Result Assert
      assertEquals("mall\u524D\u53F0\u76F8\u5173\u63A5\u53E3\u6587\u6863", swaggerProperties0.getDescription());
      
      //Test Result Assert
      assertTrue(swaggerProperties0.isEnableSecurity());
      
      //Test Result Assert
      assertEquals("macro", swaggerProperties0.getContactName());
      
      //Test Result Assert
      assertEquals("1.0", swaggerProperties0.getVersion());
      
      //Test Result Assert
      assertEquals("mall\u524D\u53F0\u7CFB\u7EDF", swaggerProperties0.getTitle());
      
      //Test Result Assert
      assertEquals("com.macro.mall.portal.controller", swaggerProperties0.getApiBasePackage());
  }
}
