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
import java.util.Vector;
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
      //caseID:c0c0a78af6e817c7dcc61703772b9b84
      //CoveredLines: [26, 71, 72]
      //Input_0_Long: 1144L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(1144L);
      
      //Call method: cancelOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelOrder(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_cancelTimeOutOrder_1()  throws Throwable  {
      //caseID:5d1f80040d0d6a000ff5faf25e78c68d
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
      //caseID:33526552176fd90a1846e6d35d9ea507
      //CoveredLines: [26, 99, 100]
      //Input_0_Long: 0L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(0L);
      
      //Call method: cancelUserOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelUserOrder(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_confirmReceiveOrder_3()  throws Throwable  {
      //caseID:97e3f56843aa5641c8e50e4fa1a93d18
      //CoveredLines: [26, 107, 108]
      //Input_0_Long: 0L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(0L);
      
      //Call method: confirmReceiveOrder
      CommonResult commonResult0 = omsPortalOrderController0.confirmReceiveOrder(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_deleteOrder_4()  throws Throwable  {
      //caseID:01d5804c6a3c41649616992c7a2ef176
      //CoveredLines: [26, 115, 116]
      //Input_0_Long: 1312L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(1312L);
      
      //Call method: deleteOrder
      CommonResult commonResult0 = omsPortalOrderController0.deleteOrder(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_detail_5()  throws Throwable  {
      //caseID:76fc3854ab218256e784c7465f9ef925
      //CoveredLines: [26, 91, 92]
      //Input_0_Long: (-1L)
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long((-1L));
      
      //Call method: detail
      CommonResult<OmsOrderDetail> commonResult0 = omsPortalOrderController0.detail(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_generateConfirmOrder_6()  throws Throwable  {
      //caseID:bfb96ce3c4985ea8a727d886dc2aae25
      //CoveredLines: [26, 34, 35]
      //Input_0_List<Long>: vector0
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock confirmOrderResult0
      ConfirmOrderResult confirmOrderResult0 = mock(ConfirmOrderResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(confirmOrderResult0).when(omsPortalOrderService0).generateConfirmOrder(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Vector<Long> vector0 = new Vector<Long>();
      
      //Call method: generateConfirmOrder
      CommonResult<ConfirmOrderResult> commonResult0 = omsPortalOrderController0.generateConfirmOrder(vector0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_generateOrder_7()  throws Throwable  {
      //caseID:1a9843fa053ac892b469c58c989f8970
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
      //caseID:53fca0c8052ee1017ba2a2ffd4f1a436
      //CoveredLines: [26, 83, 84]
      //Input_0_Integer: 396
      //Input_1_Integer: 396
      //Input_2_Integer: 396
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Integer integer0 = new Integer(396);
      
      //Call method: list
      CommonResult<CommonPage<OmsOrderDetail>> commonResult0 = omsPortalOrderController0.list(integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_paySuccess_9()  throws Throwable  {
      //caseID:dabaf8767ee2c4305f430403c84fa54b
      //CoveredLines: [26, 51, 52]
      //Input_0_Long: 3627L
      //Input_1_Integer: 501
      //Assert: assertEquals("\u652F\u4ED8\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(3627L);
      Integer integer0 = new Integer(501);
      
      //Call method: paySuccess
      CommonResult commonResult0 = omsPortalOrderController0.paySuccess(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u652F\u4ED8\u6210\u529F", commonResult0.getMessage());
  }
}
