/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.demo.bo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.demo.bo.AdminUserDetails;
import com.macro.mall.model.UmsAdmin;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.security.core.GrantedAuthority;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AdminUserDetails_SSTest extends AdminUserDetails_SSTest_scaffolding {
// allCoveredLines:[17, 18, 19, 24, 29, 34, 39, 44, 49, 54]

  @Test(timeout = 4000)
  public void test_getAuthorities_0()  throws Throwable  {
      //caseID:0bc20144d165b10c2dbf044e42290339
      //CoveredLines: [17, 18, 19, 24]
      //Assert: assertNotNull(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0);
      
      //Call method: getAuthorities
      Collection<? extends GrantedAuthority> collection0 = adminUserDetails0.getAuthorities();
      
      //Test Result Assert
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test_getPassword_1()  throws Throwable  {
      //caseID:40c19514375c57786c26ed9732c55222
      //CoveredLines: [17, 18, 19, 29]
      //Assert: assertNull(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0);
      
      //Call method: getPassword
      String string0 = adminUserDetails0.getPassword();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getUsername_2()  throws Throwable  {
      //caseID:8c3c5a6cc7029f7277935dbc9945287c
      //CoveredLines: [17, 18, 19, 34]
      //Assert: assertNull(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0);
      
      //Call method: getUsername
      String string0 = adminUserDetails0.getUsername();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_isAccountNonExpired_3()  throws Throwable  {
      //caseID:90782027bbafdade0b800612d3da071b
      //CoveredLines: [17, 18, 19, 39]
      //Assert: assertTrue(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0);
      
      //Call method: isAccountNonExpired
      boolean boolean0 = adminUserDetails0.isAccountNonExpired();
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_isAccountNonLocked_4()  throws Throwable  {
      //caseID:f50b401903fad4dbd8b0733e900dfc83
      //CoveredLines: [17, 18, 19, 44]
      //Assert: assertTrue(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0);
      
      //Call method: isAccountNonLocked
      boolean boolean0 = adminUserDetails0.isAccountNonLocked();
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_isCredentialsNonExpired_5()  throws Throwable  {
      //caseID:14dc0f88c31e278674ecbaa0bd20a79e
      //CoveredLines: [17, 18, 19, 49]
      //Assert: assertTrue(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0);
      
      //Call method: isCredentialsNonExpired
      boolean boolean0 = adminUserDetails0.isCredentialsNonExpired();
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_isEnabled_6()  throws Throwable  {
      //caseID:f7c2aa6f6b58c4cd4e15a4a388ad967d
      //CoveredLines: [17, 18, 19, 54]
      //Assert: assertTrue(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0);
      
      //Call method: isEnabled
      boolean boolean0 = adminUserDetails0.isEnabled();
      
      //Test Result Assert
      assertTrue(boolean0);
  }
}
