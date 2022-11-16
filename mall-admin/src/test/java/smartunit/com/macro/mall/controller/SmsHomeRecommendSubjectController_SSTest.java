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
import com.macro.mall.controller.SmsHomeRecommendSubjectController;
import com.macro.mall.model.SmsHomeRecommendSubject;
import com.macro.mall.service.SmsHomeRecommendSubjectService;
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

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SmsHomeRecommendSubjectController_SSTest extends SmsHomeRecommendSubjectController_SSTest_scaffolding {
// allCoveredLines:[22, 30, 31, 32, 34, 41, 42, 43, 45, 52, 53, 54, 56, 63, 64, 65, 67, 77, 78]

  @Test(timeout = 4000)
  public void test_create_0()  throws Throwable  {
      //caseID:e0e6a67c87cf9360bdabf16728f9d9df
      //CoveredLines: [22, 30, 31, 32]
      //Input_0_SmsHomeRecommendSubject>: stack0
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeRecommendSubjectController smsHomeRecommendSubjectController0 = new SmsHomeRecommendSubjectController();
      //mock smsHomeRecommendSubjectService0
      SmsHomeRecommendSubjectService smsHomeRecommendSubjectService0 = mock(SmsHomeRecommendSubjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(smsHomeRecommendSubjectService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeRecommendSubject>anyList());
      PrivateAccess.setVariable((Class<?>) SmsHomeRecommendSubjectController.class, smsHomeRecommendSubjectController0, "recommendSubjectService", (Object) smsHomeRecommendSubjectService0);
      Stack<SmsHomeRecommendSubject> stack0 = new Stack<SmsHomeRecommendSubject>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeRecommendSubjectController0.create(stack0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_create_1()  throws Throwable  {
      //caseID:31ec69b6c709de7f24858d0be6db850d
      //CoveredLines: [22, 30, 31, 34]
      //Input_0_SmsHomeRecommendSubject>: linkedList0
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsHomeRecommendSubjectController smsHomeRecommendSubjectController0 = new SmsHomeRecommendSubjectController();
      //mock smsHomeRecommendSubjectService0
      SmsHomeRecommendSubjectService smsHomeRecommendSubjectService0 = mock(SmsHomeRecommendSubjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) SmsHomeRecommendSubjectController.class, smsHomeRecommendSubjectController0, "recommendSubjectService", (Object) smsHomeRecommendSubjectService0);
      LinkedList<SmsHomeRecommendSubject> linkedList0 = new LinkedList<SmsHomeRecommendSubject>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeRecommendSubjectController0.create(linkedList0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_delete_2()  throws Throwable  {
      //caseID:c34204c98c7184d002a9033686a660eb
      //CoveredLines: [22, 52, 53, 54]
      //Input_0_Long>: stack0
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeRecommendSubjectController smsHomeRecommendSubjectController0 = new SmsHomeRecommendSubjectController();
      //mock smsHomeRecommendSubjectService0
      SmsHomeRecommendSubjectService smsHomeRecommendSubjectService0 = mock(SmsHomeRecommendSubjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(67).when(smsHomeRecommendSubjectService0).delete(ArgumentMatchers.<java.lang.Long>anyList());
      PrivateAccess.setVariable((Class<?>) SmsHomeRecommendSubjectController.class, smsHomeRecommendSubjectController0, "recommendSubjectService", (Object) smsHomeRecommendSubjectService0);
      Stack<Long> stack0 = new Stack<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeRecommendSubjectController0.delete(stack0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_delete_3()  throws Throwable  {
      //caseID:8fe2a178ce0f70f0ec786ae98b55cf2e
      //CoveredLines: [22, 52, 53, 56]
      //Input_0_Long>: stack0
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsHomeRecommendSubjectController smsHomeRecommendSubjectController0 = new SmsHomeRecommendSubjectController();
      //mock smsHomeRecommendSubjectService0
      SmsHomeRecommendSubjectService smsHomeRecommendSubjectService0 = mock(SmsHomeRecommendSubjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(smsHomeRecommendSubjectService0).delete(ArgumentMatchers.<java.lang.Long>anyList());
      PrivateAccess.setVariable((Class<?>) SmsHomeRecommendSubjectController.class, smsHomeRecommendSubjectController0, "recommendSubjectService", (Object) smsHomeRecommendSubjectService0);
      Stack<Long> stack0 = new Stack<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeRecommendSubjectController0.delete(stack0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:542f0d845b7a101b5823c9592761f54d
      //CoveredLines: [22, 77, 78]
      //Input_0_String: "86"
      //Input_1_Integer: 92
      //Input_2_Integer: 92
      //Input_3_Integer: 92
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeRecommendSubjectController smsHomeRecommendSubjectController0 = new SmsHomeRecommendSubjectController();
      Vector<SmsHomeRecommendSubject> vector0 = new Vector<SmsHomeRecommendSubject>();
      //mock smsHomeRecommendSubjectService0
      SmsHomeRecommendSubjectService smsHomeRecommendSubjectService0 = mock(SmsHomeRecommendSubjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(vector0).when(smsHomeRecommendSubjectService0).list(anyString() , anyInt() , anyInt() , anyInt());
      PrivateAccess.setVariable((Class<?>) SmsHomeRecommendSubjectController.class, smsHomeRecommendSubjectController0, "recommendSubjectService", (Object) smsHomeRecommendSubjectService0);
      Integer integer0 = new Integer(92);
      
      //Call method: list
      CommonResult<CommonPage<SmsHomeRecommendSubject>> commonResult0 = smsHomeRecommendSubjectController0.list("86", integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_5()  throws Throwable  {
      //caseID:d507bbaa238b2a7e47b78e4567e32f22
      //CoveredLines: [22, 63, 64, 65]
      //Input_0_Long>: vector0
      //Input_1_Integer: 4001
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeRecommendSubjectController smsHomeRecommendSubjectController0 = new SmsHomeRecommendSubjectController();
      //mock smsHomeRecommendSubjectService0
      SmsHomeRecommendSubjectService smsHomeRecommendSubjectService0 = mock(SmsHomeRecommendSubjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(4001).when(smsHomeRecommendSubjectService0).updateRecommendStatus(ArgumentMatchers.<java.lang.Long>anyList() , anyInt());
      PrivateAccess.setVariable((Class<?>) SmsHomeRecommendSubjectController.class, smsHomeRecommendSubjectController0, "recommendSubjectService", (Object) smsHomeRecommendSubjectService0);
      Vector<Long> vector0 = new Vector<Long>();
      Integer integer0 = new Integer(4001);
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeRecommendSubjectController0.updateRecommendStatus(vector0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_6()  throws Throwable  {
      //caseID:5d11d0b174e2f12b398043ff33a2b7fa
      //CoveredLines: [22, 63, 64, 67]
      //Input_0_Long>: vector0
      //Input_1_Integer: 22
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsHomeRecommendSubjectController smsHomeRecommendSubjectController0 = new SmsHomeRecommendSubjectController();
      //mock smsHomeRecommendSubjectService0
      SmsHomeRecommendSubjectService smsHomeRecommendSubjectService0 = mock(SmsHomeRecommendSubjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) SmsHomeRecommendSubjectController.class, smsHomeRecommendSubjectController0, "recommendSubjectService", (Object) smsHomeRecommendSubjectService0);
      Vector<Long> vector0 = new Vector<Long>();
      Integer integer0 = new Integer(22);
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeRecommendSubjectController0.updateRecommendStatus(vector0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateSort_7()  throws Throwable  {
      //caseID:1b816dfccea2266069eeb79fda74ca20
      //CoveredLines: [22, 41, 42, 43]
      //Input_0_Long: 2333
      //Input_1_Integer: 2333
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeRecommendSubjectController smsHomeRecommendSubjectController0 = new SmsHomeRecommendSubjectController();
      //mock smsHomeRecommendSubjectService0
      SmsHomeRecommendSubjectService smsHomeRecommendSubjectService0 = mock(SmsHomeRecommendSubjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2333).when(smsHomeRecommendSubjectService0).updateSort(anyLong() , anyInt());
      PrivateAccess.setVariable((Class<?>) SmsHomeRecommendSubjectController.class, smsHomeRecommendSubjectController0, "recommendSubjectService", (Object) smsHomeRecommendSubjectService0);
      Long long0 = new Long(2333);
      Integer integer0 = new Integer(2333);
      
      //Call method: updateSort
      CommonResult commonResult0 = smsHomeRecommendSubjectController0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateSort_8()  throws Throwable  {
      //caseID:e27097c38c5c25de3264cea49ca3204d
      //CoveredLines: [22, 41, 42, 45]
      //Input_0_Long: 1781L
      //Input_1_Integer: 0
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      SmsHomeRecommendSubjectController smsHomeRecommendSubjectController0 = new SmsHomeRecommendSubjectController();
      //mock smsHomeRecommendSubjectService0
      SmsHomeRecommendSubjectService smsHomeRecommendSubjectService0 = mock(SmsHomeRecommendSubjectService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) SmsHomeRecommendSubjectController.class, smsHomeRecommendSubjectController0, "recommendSubjectService", (Object) smsHomeRecommendSubjectService0);
      Long long0 = new Long(1781L);
      Integer integer0 = new Integer(0);
      
      //Call method: updateSort
      CommonResult commonResult0 = smsHomeRecommendSubjectController0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }
}
