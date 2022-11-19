/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.mapper.SmsHomeNewProductMapper;
import com.macro.mall.model.SmsHomeNewProduct;
import com.macro.mall.service.impl.SmsHomeNewProductServiceImpl;
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
public class SmsHomeNewProductServiceImpl_SSTest extends SmsHomeNewProductServiceImpl_SSTest_scaffolding {
// allCoveredLines:[19, 24, 25, 26, 27, 28, 29, 34, 35, 36, 37, 42, 43, 44, 49, 50, 51, 52, 53, 58, 59, 60, 61, 62, 64, 65, 67, 68]

  @Test(timeout = 4000)
  public void test_create_0()  throws Throwable  {
      //caseID:53b986e41151018eece4114f27056a8f
      //CoveredLines: [19, 24, 25, 26, 27, 28, 29]
      //Input_0_List<SmsHomeNewProduct>: linkedList0
      //Assert: assertEquals(1, method_result);
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      LinkedList<SmsHomeNewProduct> linkedList0 = new LinkedList<SmsHomeNewProduct>();
      //mock smsHomeNewProduct0
      SmsHomeNewProduct smsHomeNewProduct0 = mock(SmsHomeNewProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      linkedList0.add(smsHomeNewProduct0);
      
      //Call method: create
      int int0 = smsHomeNewProductServiceImpl0.create(linkedList0);
      
      //Test Result Assert
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_delete_1()  throws Throwable  {
      //caseID:095b49f7430a864fe8373de4f3af20cb
      //CoveredLines: [19, 42, 43, 44]
      //Input_0_List<Long>: vector0
      //Assert: assertEquals(0, method_result);
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Vector<Long> vector0 = new Vector<Long>();
      
      //Call method: delete
      int int0 = smsHomeNewProductServiceImpl0.delete(vector0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_list_2()  throws Throwable  {
      //caseID:9084fb34e90c651e554948b84f56cdb6
      //CoveredLines: [19, 58, 59, 60, 61, 62, 64, 67, 68]
      //Input_0_String: org.springframework.core.env.MutablePropertySources
      //Input_1_Integer: null
      //Input_2_Integer: 1047
      //Input_3_Integer: 1047
      //Assert: assertTrue(method_result.isEmpty());
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      Vector<SmsHomeNewProduct> vector0 = new Vector<SmsHomeNewProduct>();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(vector0).when(smsHomeNewProductMapper0).selectByExample(any(com.macro.mall.model.SmsHomeNewProductExample.class));
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Integer integer0 = new Integer(1047);
      
      //Call method: list
      List<SmsHomeNewProduct> list0 = smsHomeNewProductServiceImpl0.list("org.springframework.core.env.MutablePropertySources", (Integer) null, integer0, integer0);
      
      //Test Result Assert
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_list_3()  throws Throwable  {
      //caseID:2205e3bf8f6bdea6957e17bfe86d3841
      //CoveredLines: [19, 58, 59, 60, 61, 64, 65, 67, 68]
      //Input_0_String: 
      //Input_1_Integer: 24
      //Input_2_Integer: 24
      //Input_3_Integer: 24
      //Assert: assertTrue(method_result.isEmpty());
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      Stack<SmsHomeNewProduct> stack0 = new Stack<SmsHomeNewProduct>();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(smsHomeNewProductMapper0).selectByExample(any(com.macro.mall.model.SmsHomeNewProductExample.class));
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Integer integer0 = new Integer(24);
      
      //Call method: list
      List<SmsHomeNewProduct> list0 = smsHomeNewProductServiceImpl0.list("", integer0, integer0, integer0);
      
      //Test Result Assert
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:7b25b8e978f4c77c7a357617d8c24ad8
      //CoveredLines: [19, 58, 59, 60, 61, 62, 64, 65, 67, 68]
      //Input_0_String: org.springframework.core.env.MutablePropertySources
      //Input_1_Integer: 1047
      //Input_2_Integer: 1047
      //Input_3_Integer: 1047
      //Assert: assertNull(method_result);
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Integer integer0 = new Integer(1047);
      
      //Call method: list
      List<SmsHomeNewProduct> list0 = smsHomeNewProductServiceImpl0.list("org.springframework.core.env.MutablePropertySources", integer0, integer0, integer0);
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_5()  throws Throwable  {
      //caseID:e0f7b1508f9793fb9cac89a52d39eebf
      //CoveredLines: [19, 49, 50, 51, 52, 53]
      //Input_0_List<Long>: linkedList0
      //Input_1_Integer: 0
      //Assert: assertEquals(0, method_result);
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Integer integer0 = new Integer(0);
      
      //Call method: updateRecommendStatus
      int int0 = smsHomeNewProductServiceImpl0.updateRecommendStatus(linkedList0, integer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_updateSort_6()  throws Throwable  {
      //caseID:e728e025267e0182317775a6dc94ebcc
      //CoveredLines: [19, 34, 35, 36, 37]
      //Input_0_Long: 0L
      //Input_1_Integer: 1
      //Assert: assertEquals(0, method_result);
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Long long0 = new Long(0L);
      Integer integer0 = new Integer(1);
      
      //Call method: updateSort
      int int0 = smsHomeNewProductServiceImpl0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }
}
