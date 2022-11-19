/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.security.component;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.macro.mall.security.component.DynamicAccessDecisionManager;
import com.macro.mall.security.component.DynamicSecurityFilter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.security.access.SecurityMetadataSource;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynamicSecurityFilter_SSTest extends DynamicSecurityFilter_SSTest_scaffolding {
// allCoveredLines:[21, 30, 31, 35, 39, 40, 65, 69, 74]

  @Test(timeout = 4000)
  public void test_destroy_0()  throws Throwable  {
      //caseID:5113769da3afe316131c70ca276a88c9
      //CoveredLines: [21, 65]
      
      DynamicSecurityFilter dynamicSecurityFilter0 = new DynamicSecurityFilter();
      
      //Call method: destroy
      dynamicSecurityFilter0.destroy();
      
      //Test Result Assert
      assertFalse(dynamicSecurityFilter0.isRejectPublicInvocations());
  }

  @Test(timeout = 4000)
  public void test_doFilter_1()  throws Throwable  {
      //caseID:e9831c33d23c947fe91366a127ed3f7e
      //CoveredLines: [21, 39, 40]
      //Input_0_ServletRequest: {}
      //Input_1_ServletResponse: {}
      //Input_2_FilterChain: {}
      
      DynamicSecurityFilter dynamicSecurityFilter0 = new DynamicSecurityFilter();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock servletResponse0
      ServletResponse servletResponse0 = mock(ServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock filterChain0
      FilterChain filterChain0 = mock(FilterChain.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: doFilter
      // Undeclared exception!
      try { 
        dynamicSecurityFilter0.doFilter(httpServletRequest0, servletResponse0, filterChain0);
      } catch(Throwable e) {
         verifyException("org.springframework.security.web.FilterInvocation", e);
         assertEquals("java.lang.ClassCastException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_getSecureObjectClass_2()  throws Throwable  {
      //caseID:beb1a7599c6f5ec270bf6841a9830587
      //CoveredLines: [21, 69]
      //Assert: assertFalse(method_result.isInterface());
      
      DynamicSecurityFilter dynamicSecurityFilter0 = new DynamicSecurityFilter();
      
      //Call method: getSecureObjectClass
      Class<?> class0 = dynamicSecurityFilter0.getSecureObjectClass();
      
      //Test Result Assert
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test_init_3()  throws Throwable  {
      //caseID:1679a59c3d856213946b81df56bc284d
      //CoveredLines: [21, 35]
      //Input_0_FilterConfig: {}
      
      DynamicSecurityFilter dynamicSecurityFilter0 = new DynamicSecurityFilter();
      //mock filterConfig0
      FilterConfig filterConfig0 = mock(FilterConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: init
      dynamicSecurityFilter0.init(filterConfig0);
      
      //Test Result Assert
      assertFalse(dynamicSecurityFilter0.isRejectPublicInvocations());
  }

  @Test(timeout = 4000)
  public void test_obtainSecurityMetadataSource_4()  throws Throwable  {
      //caseID:96bb76394d4c62ea4408a1be82f8024d
      //CoveredLines: [21, 74]
      //Assert: assertNull(method_result);
      
      DynamicSecurityFilter dynamicSecurityFilter0 = new DynamicSecurityFilter();
      
      //Call method: obtainSecurityMetadataSource
      SecurityMetadataSource securityMetadataSource0 = dynamicSecurityFilter0.obtainSecurityMetadataSource();
      
      //Test Result Assert
      assertNull(securityMetadataSource0);
  }

  @Test(timeout = 4000)
  public void test_setMyAccessDecisionManager_5()  throws Throwable  {
      //caseID:c67a9023e18233c032ab3afd063d1e82
      //CoveredLines: [21, 30, 31]
      //Input_0_DynamicAccessDecisionManager: {}
      
      DynamicSecurityFilter dynamicSecurityFilter0 = new DynamicSecurityFilter();
      //mock dynamicAccessDecisionManager0
      DynamicAccessDecisionManager dynamicAccessDecisionManager0 = mock(DynamicAccessDecisionManager.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setMyAccessDecisionManager
      dynamicSecurityFilter0.setMyAccessDecisionManager(dynamicAccessDecisionManager0);
      
      //Test Result Assert
      assertFalse(dynamicSecurityFilter0.isAlwaysReauthenticate());
  }
}
