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
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynamicAccessDecisionManager_SSTest extends DynamicAccessDecisionManager_SSTest_scaffolding {
// allCoveredLines:[18, 24, 25, 27, 28, 29, 31, 32, 33, 34, 36, 37, 38, 43, 48]

  @Test(timeout = 4000)
  public void test_decide_0()  throws Throwable  {
      //caseID:e55644220e62396fd0f9bee203504b0a
      //CoveredLines: [18, 24, 25]
      //Input_0_Authentication: {}
      //Input_1_Object: {}
      //Input_2_Collection<ConfigAttribute>: linkedList0
      
      DynamicAccessDecisionManager dynamicAccessDecisionManager0 = new DynamicAccessDecisionManager();
      //mock authentication0
      Authentication authentication0 = mock(Authentication.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      LinkedList<ConfigAttribute> linkedList0 = new LinkedList<ConfigAttribute>();
      
      //Call method: decide
      dynamicAccessDecisionManager0.decide(authentication0, authentication0, linkedList0);
      
      //Test Result Assert
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test_decide_1()  throws Throwable  {
      //caseID:f6bfd255b5aafc8a263f481efe225c01
      //CoveredLines: [18, 24, 27, 28, 29, 31, 32, 33, 34]
      //Input_0_Authentication: {getAuthorities=linkedList0}
      //Input_1_Object: {getAuthorities=linkedList0}
      //Input_2_Collection<ConfigAttribute>: arrayDeque0
      
      DynamicAccessDecisionManager dynamicAccessDecisionManager0 = new DynamicAccessDecisionManager();
      LinkedList<SimpleGrantedAuthority> linkedList0 = new LinkedList<SimpleGrantedAuthority>();
      //mock simpleGrantedAuthority0
      SimpleGrantedAuthority simpleGrantedAuthority0 = mock(SimpleGrantedAuthority.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("\u62B1\u6B49\uFF0C\u60A8\u6CA1\u6709\u8BBF\u95EE\u6743\u9650").when(simpleGrantedAuthority0).getAuthority();
      
      linkedList0.add(simpleGrantedAuthority0);
      //mock authentication0
      Authentication authentication0 = mock(Authentication.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(authentication0).getAuthorities();
      ArrayDeque<ConfigAttribute> arrayDeque0 = new ArrayDeque<ConfigAttribute>();
      //mock configAttribute0
      ConfigAttribute configAttribute0 = mock(ConfigAttribute.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("\u62B1\u6B49\uFF0C\u60A8\u6CA1\u6709\u8BBF\u95EE\u6743\u9650").when(configAttribute0).getAttribute();
      
      arrayDeque0.add(configAttribute0);
      
      //Call method: decide
      dynamicAccessDecisionManager0.decide(authentication0, authentication0, arrayDeque0);
      
      //Test Result Assert
      assertTrue(arrayDeque0.contains(configAttribute0));
  }

  @Test(timeout = 4000)
  public void test_decide_2()  throws Throwable  {
      //caseID:48b32503f473cbd2a8c0251ef5aa4597
      //CoveredLines: [18, 24, 27, 28, 29, 31, 32, 33, 36, 37, 38]
      //Input_0_Authentication: {getAuthorities=arrayDeque0}
      //Input_1_Object: {getAuthorities=arrayDeque0}
      //Input_2_Collection<ConfigAttribute>: stack0
      
      DynamicAccessDecisionManager dynamicAccessDecisionManager0 = new DynamicAccessDecisionManager();
      ArrayDeque<SimpleGrantedAuthority> arrayDeque0 = new ArrayDeque<SimpleGrantedAuthority>();
      //mock simpleGrantedAuthority0
      SimpleGrantedAuthority simpleGrantedAuthority0 = mock(SimpleGrantedAuthority.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      arrayDeque0.add(simpleGrantedAuthority0);
      //mock authentication0
      Authentication authentication0 = mock(Authentication.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayDeque0).when(authentication0).getAuthorities();
      Stack<ConfigAttribute> stack0 = new Stack<ConfigAttribute>();
      //mock configAttribute0
      ConfigAttribute configAttribute0 = mock(ConfigAttribute.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1").when(configAttribute0).getAttribute();
      
      stack0.add(configAttribute0);
      
      //Call method: decide
      try { 
        dynamicAccessDecisionManager0.decide(authentication0, authentication0, stack0);
      } catch(Throwable e) {
         verifyException("com.macro.mall.security.component.DynamicAccessDecisionManager", e);
         assertEquals("org.springframework.security.access.AccessDeniedException", e.getClass().getName());
         assertEquals("\u62B1\u6B49\uFF0C\u60A8\u6CA1\u6709\u8BBF\u95EE\u6743\u9650", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_supports_3()  throws Throwable  {
      //caseID:d642ddf92a58b109dffb270b66b66e34
      //CoveredLines: [18, 48]
      //Input_0_Class<?>: Object.class
      //Assert: assertTrue(method_result);
      
      DynamicAccessDecisionManager dynamicAccessDecisionManager0 = new DynamicAccessDecisionManager();
      Class<Object> class0 = Object.class;
      
      //Call method: supports
      boolean boolean0 = dynamicAccessDecisionManager0.supports(class0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_supports_4()  throws Throwable  {
      //caseID:3610c7b4b7d32163bdb932f5b87168e9
      //CoveredLines: [18, 43]
      //Input_0_ConfigAttribute: {}
      //Assert: assertTrue(method_result);
      
      DynamicAccessDecisionManager dynamicAccessDecisionManager0 = new DynamicAccessDecisionManager();
      //mock configAttribute0
      ConfigAttribute configAttribute0 = mock(ConfigAttribute.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: supports
      boolean boolean0 = dynamicAccessDecisionManager0.supports(configAttribute0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }
}
