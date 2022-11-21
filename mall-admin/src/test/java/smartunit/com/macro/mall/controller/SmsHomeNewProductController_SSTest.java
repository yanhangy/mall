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
      //caseID:ed5a3212a8a684da364fa5863d4499a4
      //CoveredLines: [22, 30, 31, 34]
      //Input_0_List<SmsHomeNewProduct>: arrayList0
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(smsHomeNewProductService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeNewProduct>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      ArrayList<SmsHomeNewProduct> arrayList0 = new ArrayList<SmsHomeNewProduct>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeNewProductController0.create(arrayList0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_create_1()  throws Throwable  {
      //caseID:05c594be3d9eb0fa759ea65e1a9a2e9c
      //CoveredLines: [22, 30, 31, 32]
      //Input_0_List<SmsHomeNewProduct>: linkedList0
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(461845907).when(smsHomeNewProductService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeNewProduct>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      LinkedList<SmsHomeNewProduct> linkedList0 = new LinkedList<SmsHomeNewProduct>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeNewProductController0.create(linkedList0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_delete_2()  throws Throwable  {
      //caseID:9d79d9c9cbdbfccd8b02e5ddaac45d27
      //CoveredLines: [22, 52, 53, 56]
      //Input_0_List<Long>: stack0
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(smsHomeNewProductService0).delete(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Stack<Long> stack0 = new Stack<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeNewProductController0.delete(stack0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_delete_3()  throws Throwable  {
      //caseID:1d07d1e7b080c259c792c121083e5691
      //CoveredLines: [22, 52, 53, 54]
      //Input_0_List<Long>: vector0
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2072).when(smsHomeNewProductService0).delete(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Vector<Long> vector0 = new Vector<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeNewProductController0.delete(vector0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:b3bc4053bf8fa8323a0104e9cd7cc044
      //CoveredLines: [22, 77, 78]
      //Input_0_String: 1
      //Input_1_Integer: (-1)
      //Input_2_Integer: (-1)
      //Input_3_Integer: (-1)
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      LinkedList<SmsHomeNewProduct> linkedList0 = new LinkedList<SmsHomeNewProduct>();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(smsHomeNewProductService0).list(anyString() , anyInt() , anyInt() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Integer integer0 = new Integer((-1));
      
      //Call method: list
      CommonResult<CommonPage<SmsHomeNewProduct>> commonResult0 = smsHomeNewProductController0.list("1", integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_5()  throws Throwable  {
      //caseID:451a2e2f4517a95c360473c7fc3aae9d
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
      //caseID:c08c68a150c6ef395afff0896e6c3d39
      //CoveredLines: [22, 63, 64, 65]
      //Input_0_List<Long>: vector0
      //Input_1_Integer: 2326
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(86).when(smsHomeNewProductService0).updateRecommendStatus(ArgumentMatchers.<java.lang.Long>anyList() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Vector<Long> vector0 = new Vector<Long>();
      Integer integer0 = new Integer(2326);
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeNewProductController0.updateRecommendStatus(vector0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_updateSort_7()  throws Throwable  {
      //caseID:dd5a7ff9b90e0ec674499d680861e589
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
      //caseID:77fa89884bd7d13ea48901d0b6fa0d02
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
