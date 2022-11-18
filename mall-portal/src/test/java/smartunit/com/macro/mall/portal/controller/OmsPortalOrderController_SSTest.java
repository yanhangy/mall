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
import com.macro.mall.portal.controller.OmsPortalOrderController;
import com.macro.mall.portal.domain.ConfirmOrderResult;
import com.macro.mall.portal.domain.OmsOrderDetail;
import com.macro.mall.portal.domain.OrderParam;
import com.macro.mall.portal.service.OmsPortalOrderService;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OmsPortalOrderController_SSTest extends OmsPortalOrderController_SSTest_scaffolding {
// allCoveredLines:[26, 34, 35, 42, 43, 51, 52, 63, 64, 71, 72, 83, 84, 91, 92, 99, 100, 107, 108, 115, 116]

  @Test(timeout = 4000)
  public void test_cancelOrder_0()  throws Throwable  {
      //caseID:4d7934650cf3c770b77385c0331a819b
      //CoveredLines: [26, 71, 72]
      //Input_0_Long: 1456L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(1456L);
      
      //Call method: cancelOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelOrder(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_cancelTimeOutOrder_1()  throws Throwable  {
      //caseID:917ed766f598dd2b7294124fe48d932c
      //CoveredLines: [26, 63, 64]
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      
      //Call method: cancelTimeOutOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelTimeOutOrder();
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_cancelUserOrder_2()  throws Throwable  {
      //caseID:b3ec2e2085ee96ca865e5f1a962c68d9
      //CoveredLines: [26, 99, 100]
      //Input_0_Long: 528L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(528L);
      
      //Call method: cancelUserOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelUserOrder(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_confirmReceiveOrder_3()  throws Throwable  {
      //caseID:0dd82c33145442cd437f5933932e9d3d
      //CoveredLines: [26, 107, 108]
      //Input_0_Long: 2676L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(2676L);
      
      //Call method: confirmReceiveOrder
      CommonResult commonResult0 = omsPortalOrderController0.confirmReceiveOrder(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_deleteOrder_4()  throws Throwable  {
      //caseID:7bc282eabe967478b633c9d768486da5
      //CoveredLines: [26, 115, 116]
      //Input_0_Long: 146L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(146L);
      
      //Call method: deleteOrder
      CommonResult commonResult0 = omsPortalOrderController0.deleteOrder(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_detail_5()  throws Throwable  {
      //caseID:3a5197fb7fc46f48ad74d408f386fd1e
      //CoveredLines: [26, 91, 92]
      //Input_0_Long: 458L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(458L);
      
      //Call method: detail
      CommonResult<OmsOrderDetail> commonResult0 = omsPortalOrderController0.detail(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_generateConfirmOrder_6()  throws Throwable  {
      //caseID:a2fdf62b8337de18a83f588db48209f7
      //CoveredLines: [26, 34, 35]
      //Input_0_List<Long>: linkedList0
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      
      //Call method: generateConfirmOrder
      CommonResult<ConfirmOrderResult> commonResult0 = omsPortalOrderController0.generateConfirmOrder(linkedList0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_generateOrder_7()  throws Throwable  {
      //caseID:724197c44a80f9dda88cdf01723a4f1c
      //CoveredLines: [26, 42, 43]
      //Input_0_OrderParam: {}
      //Assert: assertEquals("\u4E0B\u5355\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      //mock orderParam0
      OrderParam orderParam0 = mock(OrderParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: generateOrder
      CommonResult commonResult0 = omsPortalOrderController0.generateOrder(orderParam0);
      
      //Test Result Assert
      assertEquals("\u4E0B\u5355\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_list_8()  throws Throwable  {
      //caseID:6597ebd91ef396842675dcf7f8bc5caf
      //CoveredLines: [26, 83, 84]
      //Input_0_Integer: 100
      //Input_1_Integer: 100
      //Input_2_Integer: 100
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock commonPage0
      CommonPage<OmsOrderDetail> commonPage0 = (CommonPage<OmsOrderDetail>) mock(CommonPage.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(commonPage0).when(omsPortalOrderService0).list(anyInt() , anyInt() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Integer integer0 = new Integer(100);
      
      //Call method: list
      CommonResult<CommonPage<OmsOrderDetail>> commonResult0 = omsPortalOrderController0.list(integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_paySuccess_9()  throws Throwable  {
      //caseID:58e7dccfa4913f8611c243cd51cc3a10
      //CoveredLines: [26, 51, 52]
      //Input_0_Long: (-1L)
      //Input_1_Integer: 259
      //Assert: assertEquals("\u652F\u4ED8\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long((-1L));
      Integer integer0 = new Integer(259);
      
      //Call method: paySuccess
      CommonResult commonResult0 = omsPortalOrderController0.paySuccess(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u652F\u4ED8\u6210\u529F", commonResult0.getMessage());
  }
}
