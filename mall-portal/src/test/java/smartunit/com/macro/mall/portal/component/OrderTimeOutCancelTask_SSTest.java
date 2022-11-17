/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.component;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.portal.component.OrderTimeOutCancelTask;
import com.macro.mall.portal.service.OmsPortalOrderService;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OrderTimeOutCancelTask_SSTest extends OrderTimeOutCancelTask_SSTest_scaffolding {
// allCoveredLines:[15, 16, 26, 27, 28]

  @Test(timeout = 4000)
  public void test_cancelTimeOutOrder_0()  throws Throwable  {
      //caseID:0af957f523e0c6385a6fdd82e118ab39
      //CoveredLines: [15, 16, 26, 27, 28]
      
      OrderTimeOutCancelTask orderTimeOutCancelTask0 = new OrderTimeOutCancelTask();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OrderTimeOutCancelTask.class, orderTimeOutCancelTask0, "portalOrderService", (Object) omsPortalOrderService0);
      
      //Call method: cancelTimeOutOrder
      PrivateAccess.callMethod((Class<OrderTimeOutCancelTask>) OrderTimeOutCancelTask.class, orderTimeOutCancelTask0, "cancelTimeOutOrder");
  }
}
