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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
      //caseID:257b52110e7ae4521a3825c9e249afa0
      //CoveredLines: [19, 24, 25, 26, 27, 28, 29]
      //Input_0_List<SmsHomeNewProduct>: vector0
      //Assert: assertEquals(1, method_result);
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Vector<SmsHomeNewProduct> vector0 = new Vector<SmsHomeNewProduct>();
      //mock smsHomeNewProduct0
      SmsHomeNewProduct smsHomeNewProduct0 = mock(SmsHomeNewProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      vector0.add(smsHomeNewProduct0);
      
      //Call method: create
      int int0 = smsHomeNewProductServiceImpl0.create(vector0);
      
      //Test Result Assert
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_delete_1()  throws Throwable  {
      //caseID:8f3a50c4b2a4685ad55ce70947718599
      //CoveredLines: [19, 42, 43, 44]
      //Input_0_List<Long>: arrayList0
      //Assert: assertEquals(0, method_result);
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      ArrayList<Long> arrayList0 = new ArrayList<Long>();
      
      //Call method: delete
      int int0 = smsHomeNewProductServiceImpl0.delete(arrayList0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_list_2()  throws Throwable  {
      //caseID:54a82882d56e1e0aa3f75add6e2e1515
      //CoveredLines: [19, 58, 59, 60, 61, 62, 64, 67, 68]
      //Input_0_String: 1
      //Input_1_Integer: null
      //Input_2_Integer: 458752
      //Input_3_Integer: 458752
      //Assert: assertEquals(0, method_result.size());
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      LinkedList<SmsHomeNewProduct> linkedList0 = new LinkedList<SmsHomeNewProduct>();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(smsHomeNewProductMapper0).selectByExample(any(com.macro.mall.model.SmsHomeNewProductExample.class));
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Integer integer0 = new Integer(458752);
      
      //Call method: list
      List<SmsHomeNewProduct> list0 = smsHomeNewProductServiceImpl0.list("1", (Integer) null, integer0, integer0);
      
      //Test Result Assert
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test_list_3()  throws Throwable  {
      //caseID:f69fa3a54b00897d3bd0c87640fd07b8
      //CoveredLines: [19, 58, 59, 60, 61, 64, 65, 67, 68]
      //Input_0_String: 
      //Input_1_Integer: 0
      //Input_2_Integer: 0
      //Input_3_Integer: 0
      //Assert: assertTrue(method_result.isEmpty());
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      LinkedList<SmsHomeNewProduct> linkedList0 = new LinkedList<SmsHomeNewProduct>();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(smsHomeNewProductMapper0).selectByExample(any(com.macro.mall.model.SmsHomeNewProductExample.class));
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Integer integer0 = new Integer(0);
      
      //Call method: list
      List<SmsHomeNewProduct> list0 = smsHomeNewProductServiceImpl0.list("", integer0, integer0, integer0);
      
      //Test Result Assert
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:131bd07772295b6db94beb768f357d2f
      //CoveredLines: [19, 58, 59, 60, 61, 62, 64, 65, 67, 68]
      //Input_0_String: kZmH4+-+DBHs~*
      //Input_1_Integer: 64
      //Input_2_Integer: 64
      //Input_3_Integer: 64
      //Assert: assertNull(method_result);
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Integer integer0 = new Integer(64);
      
      //Call method: list
      List<SmsHomeNewProduct> list0 = smsHomeNewProductServiceImpl0.list("kZmH4+-+DBHs~*", integer0, integer0, integer0);
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_5()  throws Throwable  {
      //caseID:7504810792c5295c6053ca9ed81073bc
      //CoveredLines: [19, 49, 50, 51, 52, 53]
      //Input_0_List<Long>: vector0
      //Input_1_Integer: 0
      //Assert: assertEquals(0, method_result);
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Vector<Long> vector0 = new Vector<Long>();
      Integer integer0 = new Integer(0);
      
      //Call method: updateRecommendStatus
      int int0 = smsHomeNewProductServiceImpl0.updateRecommendStatus(vector0, integer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_updateSort_6()  throws Throwable  {
      //caseID:02c07a1c7558c1b2d7f4831b59d25bbb
      //CoveredLines: [19, 34, 35, 36, 37]
      //Input_0_Long: 344L
      //Input_1_Integer: 1484
      //Assert: assertEquals(0, method_result);
      
      SmsHomeNewProductServiceImpl smsHomeNewProductServiceImpl0 = new SmsHomeNewProductServiceImpl();
      //mock smsHomeNewProductMapper0
      SmsHomeNewProductMapper smsHomeNewProductMapper0 = mock(SmsHomeNewProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductServiceImpl.class, smsHomeNewProductServiceImpl0, "homeNewProductMapper", (Object) smsHomeNewProductMapper0);
      Long long0 = new Long(344L);
      Integer integer0 = new Integer(1484);
      
      //Call method: updateSort
      int int0 = smsHomeNewProductServiceImpl0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }
}
