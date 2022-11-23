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
import com.macro.mall.controller.SmsHomeNewProductController;
import com.macro.mall.model.SmsHomeNewProduct;
import com.macro.mall.service.SmsHomeNewProductService;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SmsHomeNewProductController_SSTest extends SmsHomeNewProductController_SSTest_scaffolding {
// allCoveredLines:[22, 30, 31, 32, 34, 41, 42, 43, 45, 52, 53, 54, 56, 63, 64, 65, 67, 77, 78]

  @Test(timeout = 4000)
  public void test_create_0()  throws Throwable  {
      //caseID:563588051a5f411cf24aebe3cec06888
      //CoveredLines: [22, 30, 31, 34]
      //Input_0_List<SmsHomeNewProduct>: vector0
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(smsHomeNewProductService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeNewProduct>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Vector<SmsHomeNewProduct> vector0 = new Vector<SmsHomeNewProduct>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeNewProductController0.create(vector0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_create_1()  throws Throwable  {
      //caseID:05bfeb722cf933dbfd9302d9cc5eedb4
      //CoveredLines: [22, 30, 31, 32]
      //Input_0_List<SmsHomeNewProduct>: stack0
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(63).when(smsHomeNewProductService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeNewProduct>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Stack<SmsHomeNewProduct> stack0 = new Stack<SmsHomeNewProduct>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeNewProductController0.create(stack0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_delete_2()  throws Throwable  {
      //caseID:8731ecb27fba00521e10d592b2ca2a24
      //CoveredLines: [22, 52, 53, 54]
      //Input_0_List<Long>: vector0
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1802).when(smsHomeNewProductService0).delete(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Vector<Long> vector0 = new Vector<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeNewProductController0.delete(vector0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_delete_3()  throws Throwable  {
      //caseID:96397e65b214ab7aa43debcaf3589873
      //CoveredLines: [22, 52, 53, 56]
      //Input_0_List<Long>: stack0
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Stack<Long> stack0 = new Stack<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeNewProductController0.delete(stack0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:6cf4de9f14b7fe9b972e7da82f8c056e
      //CoveredLines: [22, 77, 78]
      //Input_0_String: YT!ZLnZa}-~h
      //Input_1_Integer: 860
      //Input_2_Integer: 860
      //Input_3_Integer: 860
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      Stack<SmsHomeNewProduct> stack0 = new Stack<SmsHomeNewProduct>();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(smsHomeNewProductService0).list(anyString() , anyInt() , anyInt() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Integer integer0 = new Integer(860);
      
      //Call method: list
      CommonResult<CommonPage<SmsHomeNewProduct>> commonResult0 = smsHomeNewProductController0.list("YT!ZLnZa}-~h", integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_5()  throws Throwable  {
      //caseID:bad285852b7444d451df726e7a53d004
      //CoveredLines: [22, 63, 64, 67]
      //Input_0_List<Long>: linkedList0
      //Input_1_Integer: (-8193)
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-8193)).when(smsHomeNewProductService0).updateRecommendStatus(ArgumentMatchers.<java.lang.Long>anyList() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Integer integer0 = new Integer((-8193));
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeNewProductController0.updateRecommendStatus(linkedList0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_6()  throws Throwable  {
      //caseID:063d5646372e5d675aa59b91413c0e26
      //CoveredLines: [22, 63, 64, 65]
      //Input_0_List<Long>: linkedList0
      //Input_1_Integer: 165
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(406).when(smsHomeNewProductService0).updateRecommendStatus(ArgumentMatchers.<java.lang.Long>anyList() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Integer integer0 = new Integer(165);
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeNewProductController0.updateRecommendStatus(linkedList0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateSort_7()  throws Throwable  {
      //caseID:5fb4fd5b3bb14b5dd6b0cbd56afb27a5
      //CoveredLines: [22, 41, 42, 43]
      //Input_0_Long: 426
      //Input_1_Integer: 426
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(426).when(smsHomeNewProductService0).updateSort(anyLong() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Long long0 = new Long(426);
      Integer integer0 = new Integer(426);
      
      //Call method: updateSort
      CommonResult commonResult0 = smsHomeNewProductController0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateSort_8()  throws Throwable  {
      //caseID:c88239fe4e4b19a6a472d9d78619a138
      //CoveredLines: [22, 41, 42, 45]
      //Input_0_Long: 0
      //Input_1_Integer: 0
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(smsHomeNewProductService0).updateSort(anyLong() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Long long0 = new Long(0);
      Integer integer0 = new Integer(0);
      
      //Call method: updateSort
      CommonResult commonResult0 = smsHomeNewProductController0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }
}
