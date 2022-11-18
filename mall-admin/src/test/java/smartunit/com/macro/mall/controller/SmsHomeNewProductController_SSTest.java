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
import java.util.ArrayList;
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
      //caseID:a7593d30edf52d32dd0194d5c35dce54
      //CoveredLines: [22, 30, 31, 32]
      //Input_0_List<SmsHomeNewProduct>: arrayList0
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(316).when(smsHomeNewProductService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeNewProduct>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      ArrayList<SmsHomeNewProduct> arrayList0 = new ArrayList<SmsHomeNewProduct>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeNewProductController0.create(arrayList0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_create_1()  throws Throwable  {
      //caseID:b9f7150121d823815dc62738530836f9
      //CoveredLines: [22, 30, 31, 34]
      //Input_0_List<SmsHomeNewProduct>: stack0
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(smsHomeNewProductService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeNewProduct>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Stack<SmsHomeNewProduct> stack0 = new Stack<SmsHomeNewProduct>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeNewProductController0.create(stack0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_delete_2()  throws Throwable  {
      //caseID:31006426c7b9ea5b5571d6ebce7dd551
      //CoveredLines: [22, 52, 53, 54]
      //Input_0_List<Long>: vector0
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(smsHomeNewProductService0).delete(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Vector<Long> vector0 = new Vector<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeNewProductController0.delete(vector0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_delete_3()  throws Throwable  {
      //caseID:2dc373e56b9b57c9c3a45953705ca99c
      //CoveredLines: [22, 52, 53, 56]
      //Input_0_List<Long>: vector0
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Vector<Long> vector0 = new Vector<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeNewProductController0.delete(vector0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:0234cebf6b752fbe9a546bc11a256e74
      //CoveredLines: [22, 77, 78]
      //Input_0_String: 
      //Input_1_Integer: (-513)
      //Input_2_Integer: (-513)
      //Input_3_Integer: (-513)
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      Vector<SmsHomeNewProduct> vector0 = new Vector<SmsHomeNewProduct>();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(vector0).when(smsHomeNewProductService0).list(anyString() , anyInt() , anyInt() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Integer integer0 = new Integer((-513));
      
      //Call method: list
      CommonResult<CommonPage<SmsHomeNewProduct>> commonResult0 = smsHomeNewProductController0.list("", integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_5()  throws Throwable  {
      //caseID:9ec1178ad38a74edb8f31b4b17cbab23
      //CoveredLines: [22, 63, 64, 67]
      //Input_0_List<Long>: stack0
      //Input_1_Integer: 1
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Stack<Long> stack0 = new Stack<Long>();
      Integer integer0 = new Integer(1);
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeNewProductController0.updateRecommendStatus(stack0, integer0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_6()  throws Throwable  {
      //caseID:d71789af2506166295750ffb87b152e7
      //CoveredLines: [22, 63, 64, 65]
      //Input_0_List<Long>: stack0
      //Input_1_Integer: 1
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(428).when(smsHomeNewProductService0).updateRecommendStatus(ArgumentMatchers.<java.lang.Long>anyList() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Stack<Long> stack0 = new Stack<Long>();
      Integer integer0 = new Integer(1);
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeNewProductController0.updateRecommendStatus(stack0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateSort_7()  throws Throwable  {
      //caseID:b6a69287ee30293c63b1084544a4077e
      //CoveredLines: [22, 41, 42, 43]
      //Input_0_Long: 1
      //Input_1_Integer: 1
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(smsHomeNewProductService0).updateSort(anyLong() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Long long0 = new Long(1);
      Integer integer0 = new Integer(1);
      
      //Call method: updateSort
      CommonResult commonResult0 = smsHomeNewProductController0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateSort_8()  throws Throwable  {
      //caseID:7ad4c31cf5442c09a45c713553ec9c3b
      //CoveredLines: [22, 41, 42, 45]
      //Input_0_Long: 0
      //Input_1_Integer: 0
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
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
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }
}
