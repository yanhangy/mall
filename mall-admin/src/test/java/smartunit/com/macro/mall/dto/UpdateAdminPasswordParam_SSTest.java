/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.dto.UpdateAdminPasswordParam;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UpdateAdminPasswordParam_SSTest extends UpdateAdminPasswordParam_SSTest_scaffolding {
// allCoveredLines:[14, 15, 18, 21, 24]

  @Test(timeout = 4000)
  public void test_getNewPassword_0()  throws Throwable  {
      //caseID:18c2aea1a33996870cd333e91276827d
      //CoveredLines: [15, 24]
      //Assert: assertNull(method_result);
      
      UpdateAdminPasswordParam updateAdminPasswordParam0 = new UpdateAdminPasswordParam();
      
      //Call method: getNewPassword
      String string0 = updateAdminPasswordParam0.getNewPassword();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getOldPassword_1()  throws Throwable  {
      //caseID:f6fa0d169a1121d5c9fa94176b06cd5e
      //CoveredLines: [15, 21]
      //Assert: assertNull(method_result);
      
      UpdateAdminPasswordParam updateAdminPasswordParam0 = new UpdateAdminPasswordParam();
      
      //Call method: getOldPassword
      String string0 = updateAdminPasswordParam0.getOldPassword();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getUsername_2()  throws Throwable  {
      //caseID:5afd3d7e3c4704eb868502a9c0130df9
      //CoveredLines: [15, 18]
      //Assert: assertNull(method_result);
      
      UpdateAdminPasswordParam updateAdminPasswordParam0 = new UpdateAdminPasswordParam();
      
      //Call method: getUsername
      String string0 = updateAdminPasswordParam0.getUsername();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_setNewPassword_3()  throws Throwable  {
      //caseID:8715591a131c614028c424b41f47eeda
      //CoveredLines: [14, 14, 14, 15]
      //Input_0_String: "1.0"
      
      UpdateAdminPasswordParam updateAdminPasswordParam0 = new UpdateAdminPasswordParam();
      
      //Call method: setNewPassword
      updateAdminPasswordParam0.setNewPassword("1.0");
      
      //Test Result Assert
      assertNull(updateAdminPasswordParam0.getOldPassword());
  }

  @Test(timeout = 4000)
  public void test_setOldPassword_4()  throws Throwable  {
      //caseID:fffc5e1d4e11fbe17f9c8adb838257a2
      //CoveredLines: [14, 14, 14, 15]
      //Input_0_String: "4aCaOF+8#W"
      
      UpdateAdminPasswordParam updateAdminPasswordParam0 = new UpdateAdminPasswordParam();
      
      //Call method: setOldPassword
      updateAdminPasswordParam0.setOldPassword("4aCaOF+8#W");
      
      //Test Result Assert
      assertNull(updateAdminPasswordParam0.getNewPassword());
  }

  @Test(timeout = 4000)
  public void test_setUsername_5()  throws Throwable  {
      //caseID:357c44b90fdc0c629b1e5b090c65173b
      //CoveredLines: [14, 14, 14, 15]
      //Input_0_String: "com.macro.mall.dto.UpdateAdminPasswordParam"
      
      UpdateAdminPasswordParam updateAdminPasswordParam0 = new UpdateAdminPasswordParam();
      
      //Call method: setUsername
      updateAdminPasswordParam0.setUsername("com.macro.mall.dto.UpdateAdminPasswordParam");
      
      //Test Result Assert
      assertNull(updateAdminPasswordParam0.getOldPassword());
  }
}
