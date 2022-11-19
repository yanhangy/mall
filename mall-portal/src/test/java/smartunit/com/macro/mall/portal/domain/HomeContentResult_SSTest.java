/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.PmsBrand;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.SmsHomeAdvertise;
import com.macro.mall.portal.domain.HomeContentResult;
import com.macro.mall.portal.domain.HomeFlashPromotion;
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
public class HomeContentResult_SSTest extends HomeContentResult_SSTest_scaffolding {
// allCoveredLines:[17, 18, 20, 22, 24, 26, 28, 30]

  @Test(timeout = 4000)
  public void test_getAdvertiseList_00()  throws Throwable  {
      //caseID:05082e1118222c0fab3213cd76ef2fb1
      //CoveredLines: [18, 20]
      //Assert: assertNull(method_result);
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      
      //Call method: getAdvertiseList
      List<SmsHomeAdvertise> list0 = homeContentResult0.getAdvertiseList();
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_getBrandList_01()  throws Throwable  {
      //caseID:e5da8093846bc90a7fe5fdc96707d99c
      //CoveredLines: [18, 22]
      //Assert: assertTrue(method_result.isEmpty());
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      Stack<PmsBrand> stack0 = new Stack<PmsBrand>();
      
      PrivateAccess.setVariable((Class<?>) HomeContentResult.class, homeContentResult0, "brandList", (Object) stack0);
      
      //Call method: getBrandList
      List<PmsBrand> list0 = homeContentResult0.getBrandList();
      
      //Test Result Assert
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_getHomeFlashPromotion_02()  throws Throwable  {
      //caseID:64b247528f8c6cea2e95976b93bf3539
      //CoveredLines: [18, 24]
      //Assert: assertNull(method_result);
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      
      //Call method: getHomeFlashPromotion
      HomeFlashPromotion homeFlashPromotion0 = homeContentResult0.getHomeFlashPromotion();
      
      //Test Result Assert
      assertNull(homeFlashPromotion0);
  }

  @Test(timeout = 4000)
  public void test_getHotProductList_03()  throws Throwable  {
      //caseID:1ee2ec08d4b04918182b50ee36c9f9d5
      //CoveredLines: [18, 28]
      //Assert: assertTrue(method_result.isEmpty());
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      Stack<PmsProduct> stack0 = new Stack<PmsProduct>();
      
      PrivateAccess.setVariable((Class<?>) HomeContentResult.class, homeContentResult0, "hotProductList", (Object) stack0);
      
      //Call method: getHotProductList
      List<PmsProduct> list0 = homeContentResult0.getHotProductList();
      
      //Test Result Assert
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_getNewProductList_04()  throws Throwable  {
      //caseID:d877ae78930157824dc13a89c3c2ca73
      //CoveredLines: [18, 26]
      //Assert: assertNull(method_result);
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      
      //Call method: getNewProductList
      List<PmsProduct> list0 = homeContentResult0.getNewProductList();
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_getSubjectList_05()  throws Throwable  {
      //caseID:8bdda7760f12f50d01696d096631854a
      //CoveredLines: [18, 30]
      //Assert: assertNull(method_result);
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      
      //Call method: getSubjectList
      List<CmsSubject> list0 = homeContentResult0.getSubjectList();
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_setAdvertiseList_06()  throws Throwable  {
      //caseID:42eae3254ecd1ad4f843fe8c4e0bff66
      //CoveredLines: [17, 17, 17, 17, 17, 17, 18]
      //Input_0_List<SmsHomeAdvertise>: stack0
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      Stack<SmsHomeAdvertise> stack0 = new Stack<SmsHomeAdvertise>();
      
      //Call method: setAdvertiseList
      homeContentResult0.setAdvertiseList(stack0);
      
      //Test Result Assert
      assertTrue(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_setBrandList_07()  throws Throwable  {
      //caseID:0b91c6349963a923b610c97a732798a2
      //CoveredLines: [17, 17, 17, 17, 17, 17, 18]
      //Input_0_List<PmsBrand>: stack0
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      Stack<PmsBrand> stack0 = new Stack<PmsBrand>();
      
      //Call method: setBrandList
      homeContentResult0.setBrandList(stack0);
      
      //Test Result Assert
      assertEquals(10, stack0.capacity());
  }

  @Test(timeout = 4000)
  public void test_setHomeFlashPromotion_08()  throws Throwable  {
      //caseID:5501b1419b46900b290224254db88721
      //CoveredLines: [17, 17, 17, 17, 17, 17, 18]
      //Input_0_HomeFlashPromotion: {}
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      //mock homeFlashPromotion0
      HomeFlashPromotion homeFlashPromotion0 = mock(HomeFlashPromotion.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setHomeFlashPromotion
      homeContentResult0.setHomeFlashPromotion(homeFlashPromotion0);
  }

  @Test(timeout = 4000)
  public void test_setHotProductList_09()  throws Throwable  {
      //caseID:c6a3ac963055c2e975e91951afafb9c2
      //CoveredLines: [17, 17, 17, 17, 17, 17, 18]
      //Input_0_List<PmsProduct>: stack0
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      Stack<PmsProduct> stack0 = new Stack<PmsProduct>();
      
      //Call method: setHotProductList
      homeContentResult0.setHotProductList(stack0);
      
      //Test Result Assert
      assertTrue(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_setNewProductList_10()  throws Throwable  {
      //caseID:aefa34f9700f3a210d652f97356ceae2
      //CoveredLines: [17, 17, 17, 17, 17, 17, 18]
      //Input_0_List<PmsProduct>: linkedList0
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      LinkedList<PmsProduct> linkedList0 = new LinkedList<PmsProduct>();
      
      //Call method: setNewProductList
      homeContentResult0.setNewProductList(linkedList0);
      
      //Test Result Assert
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test_setSubjectList_11()  throws Throwable  {
      //caseID:ae44a9304d00643aa8d15b123cab1c34
      //CoveredLines: [17, 17, 17, 17, 17, 17, 18]
      //Input_0_List<CmsSubject>: vector0
      
      HomeContentResult homeContentResult0 = new HomeContentResult();
      Vector<CmsSubject> vector0 = new Vector<CmsSubject>();
      
      //Call method: setSubjectList
      homeContentResult0.setSubjectList(vector0);
      
      //Test Result Assert
      assertTrue(vector0.isEmpty());
  }
}
