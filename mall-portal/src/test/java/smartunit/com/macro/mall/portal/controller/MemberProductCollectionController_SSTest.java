/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.portal.controller.MemberProductCollectionController;
import com.macro.mall.portal.domain.MemberProductCollection;
import com.macro.mall.portal.service.MemberCollectionService;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.data.domain.Page;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MemberProductCollectionController_SSTest extends MemberProductCollectionController_SSTest_scaffolding {
// allCoveredLines:[23, 31, 32, 33, 35, 43, 44, 45, 47, 56, 57, 64, 65, 72, 73]

  @Test(timeout = 4000)
  public void test_add_0()  throws Throwable  {
      //caseID:7de397a79ad9cddf84a08a7389146796
      //CoveredLines: [23, 31, 32, 33]
      //Input_0_MemberProductCollection: {}
      //Assert: assertEquals(200L, method_result.getCode());
      
      MemberProductCollectionController memberProductCollectionController0 = new MemberProductCollectionController();
      //mock memberCollectionService0
      MemberCollectionService memberCollectionService0 = mock(MemberCollectionService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(memberCollectionService0).add(any(com.macro.mall.portal.domain.MemberProductCollection.class));
      
      PrivateAccess.setVariable((Class<?>) MemberProductCollectionController.class, memberProductCollectionController0, "memberCollectionService", (Object) memberCollectionService0);
      //mock memberProductCollection0
      MemberProductCollection memberProductCollection0 = mock(MemberProductCollection.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: add
      CommonResult commonResult0 = memberProductCollectionController0.add(memberProductCollection0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_add_1()  throws Throwable  {
      //caseID:779ec0cce2026d3f798e3831799ebc7f
      //CoveredLines: [23, 31, 32, 35]
      //Input_0_MemberProductCollection: {}
      //Assert: assertEquals(500L, method_result.getCode());
      
      MemberProductCollectionController memberProductCollectionController0 = new MemberProductCollectionController();
      //mock memberCollectionService0
      MemberCollectionService memberCollectionService0 = mock(MemberCollectionService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) MemberProductCollectionController.class, memberProductCollectionController0, "memberCollectionService", (Object) memberCollectionService0);
      //mock memberProductCollection0
      MemberProductCollection memberProductCollection0 = mock(MemberProductCollection.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: add
      CommonResult commonResult0 = memberProductCollectionController0.add(memberProductCollection0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_clear_2()  throws Throwable  {
      //caseID:6771e112062343d7ec6c61325bf27c86
      //CoveredLines: [23, 72, 73]
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      MemberProductCollectionController memberProductCollectionController0 = new MemberProductCollectionController();
      //mock memberCollectionService0
      MemberCollectionService memberCollectionService0 = mock(MemberCollectionService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) MemberProductCollectionController.class, memberProductCollectionController0, "memberCollectionService", (Object) memberCollectionService0);
      
      //Call method: clear
      CommonResult commonResult0 = memberProductCollectionController0.clear();
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_delete_3()  throws Throwable  {
      //caseID:33e3cecc8e41fda7e2978283496fb13b
      //CoveredLines: [23, 43, 44, 45]
      //Input_0_Long: 535
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      MemberProductCollectionController memberProductCollectionController0 = new MemberProductCollectionController();
      //mock memberCollectionService0
      MemberCollectionService memberCollectionService0 = mock(MemberCollectionService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(535).when(memberCollectionService0).delete(anyLong());
      
      PrivateAccess.setVariable((Class<?>) MemberProductCollectionController.class, memberProductCollectionController0, "memberCollectionService", (Object) memberCollectionService0);
      Long long0 = new Long(535);
      
      //Call method: delete
      CommonResult commonResult0 = memberProductCollectionController0.delete(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_delete_4()  throws Throwable  {
      //caseID:5c4955bad1008582f56d364cf0862d93
      //CoveredLines: [23, 43, 44, 47]
      //Input_0_Long: 921L
      //Assert: assertEquals(500L, method_result.getCode());
      
      MemberProductCollectionController memberProductCollectionController0 = new MemberProductCollectionController();
      //mock memberCollectionService0
      MemberCollectionService memberCollectionService0 = mock(MemberCollectionService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) MemberProductCollectionController.class, memberProductCollectionController0, "memberCollectionService", (Object) memberCollectionService0);
      Long long0 = new Long(921L);
      
      //Call method: delete
      CommonResult commonResult0 = memberProductCollectionController0.delete(long0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_detail_5()  throws Throwable  {
      //caseID:d296d5ca217a7e82d656ea5aab09940c
      //CoveredLines: [23, 64, 65]
      //Input_0_Long: 1000L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      MemberProductCollectionController memberProductCollectionController0 = new MemberProductCollectionController();
      //mock memberCollectionService0
      MemberCollectionService memberCollectionService0 = mock(MemberCollectionService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) MemberProductCollectionController.class, memberProductCollectionController0, "memberCollectionService", (Object) memberCollectionService0);
      Long long0 = new Long(1000L);
      
      //Call method: detail
      CommonResult<MemberProductCollection> commonResult0 = memberProductCollectionController0.detail(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_list_6()  throws Throwable  {
      //caseID:3e77caf2f62c86bde99d61f6b298f8a6
      //CoveredLines: [23, 56, 57]
      //Input_0_Integer: 35
      //Input_1_Integer: 35
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      MemberProductCollectionController memberProductCollectionController0 = new MemberProductCollectionController();
      Vector<MemberProductCollection> vector0 = new Vector<MemberProductCollection>();
      //mock page0
      Page<MemberProductCollection> page0 = (Page<MemberProductCollection>) mock(Page.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1L)).when(page0).getTotalElements();
      doReturn((-1)).when(page0).getTotalPages();
      doReturn(vector0).when(page0).getContent();
      doReturn((-1)).when(page0).getNumber();
      doReturn(1).when(page0).getSize();
      //mock memberCollectionService0
      MemberCollectionService memberCollectionService0 = mock(MemberCollectionService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(page0).when(memberCollectionService0).list(anyInt() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) MemberProductCollectionController.class, memberProductCollectionController0, "memberCollectionService", (Object) memberCollectionService0);
      Integer integer0 = new Integer(35);
      
      //Call method: list
      CommonResult<CommonPage<MemberProductCollection>> commonResult0 = memberProductCollectionController0.list(integer0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }
}
