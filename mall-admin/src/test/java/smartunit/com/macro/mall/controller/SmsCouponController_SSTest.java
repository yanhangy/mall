/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.controller.SmsCouponController;
import com.macro.mall.dto.SmsCouponParam;
import com.macro.mall.model.SmsCoupon;
import com.macro.mall.service.SmsCouponService;
import java.util.LinkedList;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SmsCouponController_SSTest extends SmsCouponController_SSTest_scaffolding {
// allCoveredLines:[23, 30, 31, 32, 34, 41, 42, 43, 45, 52, 53, 54, 56, 67, 68, 75, 76]

  @Test(timeout = 4000)
  public void test_add_0()  throws Throwable  {
      //caseID:96c48a5005ab5fea8379eec513bb75bd
      //CoveredLines: [23, 30, 31, 32]
      //Input_0_SmsCouponParam: {}
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsCouponController smsCouponController0 = new SmsCouponController();
      //mock smsCouponService0
      SmsCouponService smsCouponService0 = mock(SmsCouponService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1157).when(smsCouponService0).create(any(com.macro.mall.dto.SmsCouponParam.class));
      
      PrivateAccess.setVariable((Class<?>) SmsCouponController.class, smsCouponController0, "couponService", (Object) smsCouponService0);
      //mock smsCouponParam0
      SmsCouponParam smsCouponParam0 = mock(SmsCouponParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: add
      CommonResult commonResult0 = smsCouponController0.add(smsCouponParam0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_add_1()  throws Throwable  {
      //caseID:01ba47c97254e1664d93e8f55fa6ff84
      //CoveredLines: [23, 30, 31, 34]
      //Input_0_SmsCouponParam: {}
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsCouponController smsCouponController0 = new SmsCouponController();
      //mock smsCouponService0
      SmsCouponService smsCouponService0 = mock(SmsCouponService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsCouponController.class, smsCouponController0, "couponService", (Object) smsCouponService0);
      //mock smsCouponParam0
      SmsCouponParam smsCouponParam0 = mock(SmsCouponParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: add
      CommonResult commonResult0 = smsCouponController0.add(smsCouponParam0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_delete_2()  throws Throwable  {
      //caseID:02cbb85039f351e3bccdf2d909df3f42
      //CoveredLines: [23, 41, 42, 43]
      //Input_0_Long: 59
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsCouponController smsCouponController0 = new SmsCouponController();
      //mock smsCouponService0
      SmsCouponService smsCouponService0 = mock(SmsCouponService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(59).when(smsCouponService0).delete(anyLong());
      
      PrivateAccess.setVariable((Class<?>) SmsCouponController.class, smsCouponController0, "couponService", (Object) smsCouponService0);
      Long long0 = new Long(59);
      
      //Call method: delete
      CommonResult commonResult0 = smsCouponController0.delete(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_delete_3()  throws Throwable  {
      //caseID:106d5437c7c5632b48ef48a3d60e3481
      //CoveredLines: [23, 41, 42, 45]
      //Input_0_Long: 0L
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsCouponController smsCouponController0 = new SmsCouponController();
      //mock smsCouponService0
      SmsCouponService smsCouponService0 = mock(SmsCouponService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsCouponController.class, smsCouponController0, "couponService", (Object) smsCouponService0);
      Long long0 = new Long(0L);
      
      //Call method: delete
      CommonResult commonResult0 = smsCouponController0.delete(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_getItem_4()  throws Throwable  {
      //caseID:e67aa32c3831a9bf7fdaf7008167e627
      //CoveredLines: [23, 75, 76]
      //Input_0_Long: 0L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsCouponController smsCouponController0 = new SmsCouponController();
      //mock smsCouponService0
      SmsCouponService smsCouponService0 = mock(SmsCouponService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsCouponController.class, smsCouponController0, "couponService", (Object) smsCouponService0);
      Long long0 = new Long(0L);
      
      //Call method: getItem
      CommonResult<SmsCouponParam> commonResult0 = smsCouponController0.getItem(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_list_5()  throws Throwable  {
      //caseID:ab382f50de093bd2f081219e76f63369
      //CoveredLines: [23, 67, 68]
      //Input_0_String: properties
      //Input_1_Integer: 1194
      //Input_2_Integer: 1194
      //Input_3_Integer: 1194
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsCouponController smsCouponController0 = new SmsCouponController();
      LinkedList<SmsCoupon> linkedList0 = new LinkedList<SmsCoupon>();
      //mock smsCouponService0
      SmsCouponService smsCouponService0 = mock(SmsCouponService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(smsCouponService0).list(anyString() , anyInt() , anyInt() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsCouponController.class, smsCouponController0, "couponService", (Object) smsCouponService0);
      Integer integer0 = new Integer(1194);
      
      //Call method: list
      CommonResult<CommonPage<SmsCoupon>> commonResult0 = smsCouponController0.list("properties", integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_update_6()  throws Throwable  {
      //caseID:a6b7b48558054c00bfe1a0bb4c60f026
      //CoveredLines: [23, 52, 53, 54]
      //Input_0_Long: 1
      //Input_1_SmsCouponParam: {}
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsCouponController smsCouponController0 = new SmsCouponController();
      //mock smsCouponService0
      SmsCouponService smsCouponService0 = mock(SmsCouponService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(smsCouponService0).update(anyLong() , any(com.macro.mall.dto.SmsCouponParam.class));
      
      PrivateAccess.setVariable((Class<?>) SmsCouponController.class, smsCouponController0, "couponService", (Object) smsCouponService0);
      Long long0 = new Long(1);
      //mock smsCouponParam0
      SmsCouponParam smsCouponParam0 = mock(SmsCouponParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: update
      CommonResult commonResult0 = smsCouponController0.update(long0, smsCouponParam0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_update_7()  throws Throwable  {
      //caseID:c2c5c4fe7e7ecc4a98dd62855dd89b49
      //CoveredLines: [23, 52, 53, 56]
      //Input_0_Long: 2456L
      //Input_1_SmsCouponParam: {}
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsCouponController smsCouponController0 = new SmsCouponController();
      //mock smsCouponService0
      SmsCouponService smsCouponService0 = mock(SmsCouponService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsCouponController.class, smsCouponController0, "couponService", (Object) smsCouponService0);
      Long long0 = new Long(2456L);
      //mock smsCouponParam0
      SmsCouponParam smsCouponParam0 = mock(SmsCouponParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: update
      CommonResult commonResult0 = smsCouponController0.update(long0, smsCouponParam0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }
}
