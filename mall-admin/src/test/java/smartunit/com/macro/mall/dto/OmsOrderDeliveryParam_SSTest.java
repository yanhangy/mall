/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.dto.OmsOrderDeliveryParam;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OmsOrderDeliveryParam_SSTest extends OmsOrderDeliveryParam_SSTest_scaffolding {
// allCoveredLines:[12, 13, 15, 17, 19]

  @Test(timeout = 4000)
  public void test_getDeliveryCompany_0()  throws Throwable  {
      //caseID:4c07cc92afb180105f75a7e182c08cd3
      //CoveredLines: [13, 17]
      //Assert: assertNull(method_result);
      
      OmsOrderDeliveryParam omsOrderDeliveryParam0 = new OmsOrderDeliveryParam();
      
      //Call method: getDeliveryCompany
      String string0 = omsOrderDeliveryParam0.getDeliveryCompany();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getDeliverySn_1()  throws Throwable  {
      //caseID:e509a66ed589281a3b90e2510c9a7ee5
      //CoveredLines: [13, 19]
      //Assert: assertNull(method_result);
      
      OmsOrderDeliveryParam omsOrderDeliveryParam0 = new OmsOrderDeliveryParam();
      
      //Call method: getDeliverySn
      String string0 = omsOrderDeliveryParam0.getDeliverySn();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getOrderId_2()  throws Throwable  {
      //caseID:58ee899553f52f89c35772700b0efe4a
      //CoveredLines: [13, 15]
      //Assert: assertNull(method_result);
      
      OmsOrderDeliveryParam omsOrderDeliveryParam0 = new OmsOrderDeliveryParam();
      
      //Call method: getOrderId
      Long long0 = omsOrderDeliveryParam0.getOrderId();
      
      //Test Result Assert
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test_setDeliveryCompany_3()  throws Throwable  {
      //caseID:39231a31c39a59a0bb82137197a0c40a
      //CoveredLines: [12, 12, 12, 13]
      //Input_0_String: com.macro.mall.dto.OmsOrderDeliveryParam
      
      OmsOrderDeliveryParam omsOrderDeliveryParam0 = new OmsOrderDeliveryParam();
      
      //Call method: setDeliveryCompany
      omsOrderDeliveryParam0.setDeliveryCompany("com.macro.mall.dto.OmsOrderDeliveryParam");
      
      //Test Result Assert
      assertNull(omsOrderDeliveryParam0.getOrderId());
  }

  @Test(timeout = 4000)
  public void test_setDeliverySn_4()  throws Throwable  {
      //caseID:d662c76166736b9b1b69c187d311990f
      //CoveredLines: [12, 12, 12, 13]
      //Input_0_String: 
      
      OmsOrderDeliveryParam omsOrderDeliveryParam0 = new OmsOrderDeliveryParam();
      
      //Call method: setDeliverySn
      omsOrderDeliveryParam0.setDeliverySn("");
      
      //Test Result Assert
      assertEquals("", omsOrderDeliveryParam0.getDeliverySn());
  }

  @Test(timeout = 4000)
  public void test_setOrderId_5()  throws Throwable  {
      //caseID:34840c46e03393813d53ad6fee938979
      //CoveredLines: [12, 12, 12, 13]
      //Input_0_Long: 0L
      
      OmsOrderDeliveryParam omsOrderDeliveryParam0 = new OmsOrderDeliveryParam();
      Long long0 = new Long(0L);
      
      //Call method: setOrderId
      omsOrderDeliveryParam0.setOrderId(long0);
      
      //Test Result Assert
      assertEquals(0L, (long)omsOrderDeliveryParam0.getOrderId());
  }
}
