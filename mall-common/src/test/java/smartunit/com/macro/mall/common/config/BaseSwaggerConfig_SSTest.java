/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.common.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.common.config.BaseSwaggerConfig;
import com.macro.mall.common.domain.SwaggerProperties;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import springfox.documentation.spring.web.plugins.Docket;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BaseSwaggerConfig_SSTest extends BaseSwaggerConfig_SSTest_scaffolding {
// allCoveredLines:[24, 25, 26, 27, 28, 29, 30, 31, 32, 34, 38, 39, 40, 41, 42, 43, 48, 49, 50, 51, 56, 57, 58, 62, 63, 64, 65, 69, 70, 71, 72, 73, 74]

  @Test(timeout = 4000)
  public void test_createRestApi_0()  throws Throwable  {
      //caseID:3730218bd603f1787ef0487ded59971c
      //CoveredLines: [24, 25, 26, 27, 28, 29, 30, 31, 34, 38, 39, 40, 41, 42, 43]
      //Assert: assertEquals("default", method_result.getGroupName());
      
      //mock swaggerProperties0
      SwaggerProperties swaggerProperties0 = mock(SwaggerProperties.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock baseSwaggerConfig0
      BaseSwaggerConfig baseSwaggerConfig0 = mock(BaseSwaggerConfig.class, CALLS_REAL_METHODS);
      doReturn(swaggerProperties0).when(baseSwaggerConfig0).swaggerProperties();
      
      //Call method: createRestApi
      Docket docket0 = baseSwaggerConfig0.createRestApi();
      
      //Test Result Assert
      assertEquals("default", docket0.getGroupName());
  }

  @Test(timeout = 4000)
  public void test_createRestApi_1()  throws Throwable  {
      //caseID:be83305122c1862853a58e200dd5e8aa
      //CoveredLines: [24, 25, 26, 27, 28, 29, 30, 31, 32, 34, 38, 39, 40, 41, 42, 43, 48, 49, 50, 51, 56, 57, 58, 62, 63, 64, 65, 69, 70, 71, 72, 73, 74]
      //Assert: assertEquals("default", method_result.getGroupName());
      
      //mock swaggerProperties0
      SwaggerProperties swaggerProperties0 = mock(SwaggerProperties.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("upgradeHandler.pruned").when(swaggerProperties0).getApiBasePackage();
      doReturn("0").when(swaggerProperties0).getContactEmail();
      doReturn("1.0").when(swaggerProperties0).getContactName();
      doReturn("1").when(swaggerProperties0).getContactUrl();
      doReturn("%ao3i^U_}~.He]><").when(swaggerProperties0).getDescription();
      doReturn("/*/.*").when(swaggerProperties0).getTitle();
      doReturn("1").when(swaggerProperties0).getVersion();
      doReturn(true).when(swaggerProperties0).isEnableSecurity();
      //mock baseSwaggerConfig0
      BaseSwaggerConfig baseSwaggerConfig0 = mock(BaseSwaggerConfig.class, CALLS_REAL_METHODS);
      doReturn(swaggerProperties0).when(baseSwaggerConfig0).swaggerProperties();
      
      //Call method: createRestApi
      Docket docket0 = baseSwaggerConfig0.createRestApi();
      
      //Test Result Assert
      assertEquals("default", docket0.getGroupName());
  }
}
