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
      //caseID:2fade5bbf631be60f91bc6701131b969
      //CoveredLines: [22, 30, 31, 32]
      //Input_0_List<SmsHomeNewProduct>: vector0
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(416).when(smsHomeNewProductService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeNewProduct>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Vector<SmsHomeNewProduct> vector0 = new Vector<SmsHomeNewProduct>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeNewProductController0.create(vector0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_create_1()  throws Throwable  {
      //caseID:75d367c05a2e84275f659d0071ac73dd
      //CoveredLines: [22, 30, 31, 34]
      //Input_0_List<SmsHomeNewProduct>: vector0
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-803)).when(smsHomeNewProductService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeNewProduct>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Vector<SmsHomeNewProduct> vector0 = new Vector<SmsHomeNewProduct>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeNewProductController0.create(vector0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_delete_2()  throws Throwable  {
      //caseID:edb97d5e93c3b141330e2deaa0b0f83d
      //CoveredLines: [22, 52, 53, 54]
      //Input_0_List<Long>: arrayList0
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1076).when(smsHomeNewProductService0).delete(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      ArrayList<Long> arrayList0 = new ArrayList<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeNewProductController0.delete(arrayList0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_delete_3()  throws Throwable  {
      //caseID:6e78d20e50aec2642e95ad36b389d36a
      //CoveredLines: [22, 52, 53, 56]
      //Input_0_List<Long>: stack0
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Stack<Long> stack0 = new Stack<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeNewProductController0.delete(stack0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:583674eb8f5919399ca5d669029cea1b
      //CoveredLines: [22, 77, 78]
      //Input_0_String: 17
      //Input_1_Integer: 1
      //Input_2_Integer: 1
      //Input_3_Integer: 1
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      ArrayList<SmsHomeNewProduct> arrayList0 = new ArrayList<SmsHomeNewProduct>();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(smsHomeNewProductService0).list(anyString() , anyInt() , anyInt() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Integer integer0 = new Integer(1);
      
      //Call method: list
      CommonResult<CommonPage<SmsHomeNewProduct>> commonResult0 = smsHomeNewProductController0.list("17", integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_5()  throws Throwable  {
      //caseID:b56f9ca912c9ced9992404c5daa0eda3
      //CoveredLines: [22, 63, 64, 67]
      //Input_0_List<Long>: stack0
      //Input_1_Integer: 0
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(smsHomeNewProductService0).updateRecommendStatus(ArgumentMatchers.<java.lang.Long>anyList() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Stack<Long> stack0 = new Stack<Long>();
      Integer integer0 = new Integer(0);
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeNewProductController0.updateRecommendStatus(stack0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_6()  throws Throwable  {
      //caseID:88a5caff709964105be721e4ef1b5bc5
      //CoveredLines: [22, 63, 64, 65]
      //Input_0_List<Long>: arrayList0
      //Input_1_Integer: 300
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(301).when(smsHomeNewProductService0).updateRecommendStatus(ArgumentMatchers.<java.lang.Long>anyList() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      ArrayList<Long> arrayList0 = new ArrayList<Long>();
      Integer integer0 = new Integer(300);
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeNewProductController0.updateRecommendStatus(arrayList0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateSort_7()  throws Throwable  {
      //caseID:cc387a509bb5bef1dbfa07ebe4b17ae1
      //CoveredLines: [22, 41, 42, 43]
      //Input_0_Long: 67
      //Input_1_Integer: 67
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(67).when(smsHomeNewProductService0).updateSort(anyLong() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Long long0 = new Long(67);
      Integer integer0 = new Integer(67);
      
      //Call method: updateSort
      CommonResult commonResult0 = smsHomeNewProductController0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateSort_8()  throws Throwable  {
      //caseID:0cf3a7b060802fab0361f199d85de0fb
      //CoveredLines: [22, 41, 42, 45]
      //Input_0_Long: (-1)
      //Input_1_Integer: (-1)
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(smsHomeNewProductService0).updateSort(anyLong() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Long long0 = new Long((-1));
      Integer integer0 = new Integer((-1));
      
      //Call method: updateSort
      CommonResult commonResult0 = smsHomeNewProductController0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }
}
