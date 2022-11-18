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
import java.util.List;
import java.util.Stack;
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
      //caseID:6f5e61cdedd5ae508f3faf294d166992
      //CoveredLines: [26, 71, 72]
      //Input_0_Long: 2723L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(2723L);
      
      //Call method: cancelOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelOrder(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_cancelTimeOutOrder_1()  throws Throwable  {
      //caseID:1ec991c5524359d22de3086f07ebdb7b
      //CoveredLines: [26, 63, 64]
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      
      //Call method: cancelTimeOutOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelTimeOutOrder();
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_cancelUserOrder_2()  throws Throwable  {
      //caseID:ece97ba642ede0a449f40057857f62e9
      //CoveredLines: [26, 99, 100]
      //Input_0_Long: (-1L)
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long((-1L));
      
      //Call method: cancelUserOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelUserOrder(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_confirmReceiveOrder_3()  throws Throwable  {
      //caseID:b5e7e3b38c5fa15b4937dae4ca7fbefb
      //CoveredLines: [26, 107, 108]
      //Input_0_Long: 200L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(200L);
      
      //Call method: confirmReceiveOrder
      CommonResult commonResult0 = omsPortalOrderController0.confirmReceiveOrder(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_deleteOrder_4()  throws Throwable  {
      //caseID:589ea9dde0899b6255bf4a18cfe5b361
      //CoveredLines: [26, 115, 116]
      //Input_0_Long: 685L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(685L);
      
      //Call method: deleteOrder
      CommonResult commonResult0 = omsPortalOrderController0.deleteOrder(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_detail_5()  throws Throwable  {
      //caseID:b7b3dc84309d5ca4fea8bd417fe83cef
      //CoveredLines: [26, 91, 92]
      //Input_0_Long: 0L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(0L);
      
      //Call method: detail
      CommonResult<OmsOrderDetail> commonResult0 = omsPortalOrderController0.detail(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_generateConfirmOrder_6()  throws Throwable  {
      //caseID:04cf1051f4daefc02d521a5a734a65af
      //CoveredLines: [26, 34, 35]
      //Input_0_List<Long>: stack0
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock confirmOrderResult0
      ConfirmOrderResult confirmOrderResult0 = mock(ConfirmOrderResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(confirmOrderResult0).when(omsPortalOrderService0).generateConfirmOrder(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Stack<Long> stack0 = new Stack<Long>();
      
      //Call method: generateConfirmOrder
      CommonResult<ConfirmOrderResult> commonResult0 = omsPortalOrderController0.generateConfirmOrder(stack0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_generateOrder_7()  throws Throwable  {
      //caseID:13a6c1deade50d960bfaf629e367ed42
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
      //caseID:38d062de5373ca0d69dfed5bfabb908d
      //CoveredLines: [26, 83, 84]
      //Input_0_Integer: 0
      //Input_1_Integer: 0
      //Input_2_Integer: 0
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Integer integer0 = new Integer(0);
      
      //Call method: list
      CommonResult<CommonPage<OmsOrderDetail>> commonResult0 = omsPortalOrderController0.list(integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_paySuccess_9()  throws Throwable  {
      //caseID:60350eba162b6c843b3140eb92e1432d
      //CoveredLines: [26, 51, 52]
      //Input_0_Long: 0L
      //Input_1_Integer: 0
      //Assert: assertEquals("\u652F\u4ED8\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(0L);
      Integer integer0 = new Integer(0);
      
      //Call method: paySuccess
      CommonResult commonResult0 = omsPortalOrderController0.paySuccess(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u652F\u4ED8\u6210\u529F", commonResult0.getMessage());
  }
}
