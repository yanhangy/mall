/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.bo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.bo.AdminUserDetails;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.security.core.GrantedAuthority;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AdminUserDetails_SSTest extends AdminUserDetails_SSTest_scaffolding {
// allCoveredLines:[20, 21, 22, 23, 28, 29, 30, 35, 40, 45, 50, 55, 60]

  @Test(timeout = 4000)
  public void test_getAuthorities_0()  throws Throwable  {
      //caseID:aa94396eb79435f223b0f93a0406db0e
      //CoveredLines: [20, 21, 22, 23, 28, 29, 29, 30]
      //Assert: assertNotNull(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ArrayList<UmsResource> arrayList0 = new ArrayList<UmsResource>();
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0, arrayList0);
      
      //Call method: getAuthorities
      Collection<? extends GrantedAuthority> collection0 = adminUserDetails0.getAuthorities();
      
      //Test Result Assert
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test_getPassword_1()  throws Throwable  {
      //caseID:8e1f56da5e8f7e8372cf8daf47689a7a
      //CoveredLines: [20, 21, 22, 23, 35]
      //Assert: assertNull(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Stack<UmsResource> stack0 = new Stack<UmsResource>();
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0, stack0);
      
      //Call method: getPassword
      String string0 = adminUserDetails0.getPassword();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getUsername_2()  throws Throwable  {
      //caseID:bff751dd5e7335bcd7775bc5fecacdeb
      //CoveredLines: [20, 21, 22, 23, 40]
      //Assert: assertNull(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Stack<UmsResource> stack0 = new Stack<UmsResource>();
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0, stack0);
      
      //Call method: getUsername
      String string0 = adminUserDetails0.getUsername();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_isAccountNonExpired_3()  throws Throwable  {
      //caseID:7b13ac3877226ec701c679900625b915
      //CoveredLines: [20, 21, 22, 23, 45]
      //Assert: assertTrue(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      LinkedList<UmsResource> linkedList0 = new LinkedList<UmsResource>();
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0, linkedList0);
      
      //Call method: isAccountNonExpired
      boolean boolean0 = adminUserDetails0.isAccountNonExpired();
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_isAccountNonLocked_4()  throws Throwable  {
      //caseID:94995567c6187e62366a26b8a8a4ae06
      //CoveredLines: [20, 21, 22, 23, 50]
      //Assert: assertTrue(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ArrayList<UmsResource> arrayList0 = new ArrayList<UmsResource>();
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0, arrayList0);
      
      //Call method: isAccountNonLocked
      boolean boolean0 = adminUserDetails0.isAccountNonLocked();
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_isCredentialsNonExpired_5()  throws Throwable  {
      //caseID:499d93a5ff37c4a22d1d1d61dcc3c9a0
      //CoveredLines: [20, 21, 22, 23, 55]
      //Assert: assertTrue(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Stack<UmsResource> stack0 = new Stack<UmsResource>();
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0, stack0);
      
      //Call method: isCredentialsNonExpired
      boolean boolean0 = adminUserDetails0.isCredentialsNonExpired();
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_isEnabled_6()  throws Throwable  {
      //caseID:cac48b5876a774f76e270921ce175768
      //CoveredLines: [20, 21, 22, 23, 60]
      //Assert: assertFalse(method_result);
      
      //mock umsAdmin0
      UmsAdmin umsAdmin0 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Vector<UmsResource> vector0 = new Vector<UmsResource>();
      AdminUserDetails adminUserDetails0 = new AdminUserDetails(umsAdmin0, vector0);
      Integer integer0 = new Integer(414);
      //mock umsAdmin1
      UmsAdmin umsAdmin1 = mock(UmsAdmin.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(umsAdmin1).getStatus();
      
      PrivateAccess.setVariable((Class<?>) AdminUserDetails.class, adminUserDetails0, "umsAdmin", (Object) umsAdmin1);
      
      //Call method: isEnabled
      boolean boolean0 = adminUserDetails0.isEnabled();
      
      //Test Result Assert
      assertFalse(boolean0);
  }
}
