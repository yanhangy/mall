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
      //caseID:b747cac2bedd15ba9c4f7572e0d8dbed
      //CoveredLines: [26, 71, 72]
      //Input_0_Long: 543L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(543L);
      
      //Call method: cancelOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelOrder(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_cancelTimeOutOrder_1()  throws Throwable  {
      //caseID:bb31cafd6c2ddb950451d93bdd0ba472
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
      //caseID:a246925e7b4c003cb1ede3605d0fcf69
      //CoveredLines: [26, 99, 100]
      //Input_0_Long: 1L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(1L);
      
      //Call method: cancelUserOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelUserOrder(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_confirmReceiveOrder_3()  throws Throwable  {
      //caseID:b1fab6c28d1e2bb880d308221d9f361d
      //CoveredLines: [26, 107, 108]
      //Input_0_Long: 2893L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(2893L);
      
      //Call method: confirmReceiveOrder
      CommonResult commonResult0 = omsPortalOrderController0.confirmReceiveOrder(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_deleteOrder_4()  throws Throwable  {
      //caseID:489ec281b7828121f20a49287c477736
      //CoveredLines: [26, 115, 116]
      //Input_0_Long: 841L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(841L);
      
      //Call method: deleteOrder
      CommonResult commonResult0 = omsPortalOrderController0.deleteOrder(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_detail_5()  throws Throwable  {
      //caseID:04f62b829f0373c64626425d6781fee2
      //CoveredLines: [26, 91, 92]
      //Input_0_Long: 552L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(552L);
      
      //Call method: detail
      CommonResult<OmsOrderDetail> commonResult0 = omsPortalOrderController0.detail(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_generateConfirmOrder_6()  throws Throwable  {
      //caseID:755bceef1b02f2263fe46b4daab310a7
      //CoveredLines: [26, 34, 35]
      //Input_0_List<Long>: stack0
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
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
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_generateOrder_7()  throws Throwable  {
      //caseID:283e121a67434fc4bd3e7819e852a246
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
      //caseID:9f3737baaf77ff3da1679368372b0089
      //CoveredLines: [26, 83, 84]
      //Input_0_Integer: 2189
      //Input_1_Integer: 2189
      //Input_2_Integer: 2189
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock commonPage0
      CommonPage<OmsOrderDetail> commonPage0 = (CommonPage<OmsOrderDetail>) mock(CommonPage.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(commonPage0).when(omsPortalOrderService0).list(anyInt() , anyInt() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Integer integer0 = new Integer(2189);
      
      //Call method: list
      CommonResult<CommonPage<OmsOrderDetail>> commonResult0 = omsPortalOrderController0.list(integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_paySuccess_9()  throws Throwable  {
      //caseID:34ef9429806c6b0b096a098728829f21
      //CoveredLines: [26, 51, 52]
      //Input_0_Long: 1L
      //Input_1_Integer: 14
      //Assert: assertEquals("\u652F\u4ED8\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(1L);
      Integer integer0 = new Integer(14);
      
      //Call method: paySuccess
      CommonResult commonResult0 = omsPortalOrderController0.paySuccess(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u652F\u4ED8\u6210\u529F", commonResult0.getMessage());
  }
}
