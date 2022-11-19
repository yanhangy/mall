/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.dao.OmsOrderDao;
import com.macro.mall.dao.OmsOrderOperateHistoryDao;
import com.macro.mall.dto.OmsMoneyInfoParam;
import com.macro.mall.dto.OmsOrderDeliveryParam;
import com.macro.mall.dto.OmsOrderDetail;
import com.macro.mall.dto.OmsOrderQueryParam;
import com.macro.mall.dto.OmsReceiverInfoParam;
import com.macro.mall.mapper.OmsOrderMapper;
import com.macro.mall.mapper.OmsOrderOperateHistoryMapper;
import com.macro.mall.model.OmsOrder;
import com.macro.mall.service.impl.OmsOrderServiceImpl;
import java.util.ArrayList;
import java.util.LinkedList;
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
public class OmsOrderServiceImpl_SSTest extends OmsOrderServiceImpl_SSTest_scaffolding {
// allCoveredLines:[25, 37, 38, 44, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 82, 83, 84, 85, 86, 91, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 108, 109, 110, 111, 112, 113, 114, 115, 120, 121, 122, 123, 124, 125, 127, 128, 129, 130, 131, 132, 133, 134, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151]

  @Test(timeout = 4000)
  public void test_close_0()  throws Throwable  {
      //caseID:e9dbcf3ba938841a307ae55df6181886
      //CoveredLines: [25, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77]
      //Input_0_List<Long>: linkedList0
      //Input_1_String:  servlets=
      //Assert: assertEquals(0, method_result);
      
      OmsOrderServiceImpl omsOrderServiceImpl0 = new OmsOrderServiceImpl();
      //mock omsOrderOperateHistoryDao0
      OmsOrderOperateHistoryDao omsOrderOperateHistoryDao0 = mock(OmsOrderOperateHistoryDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsOrderMapper0
      OmsOrderMapper omsOrderMapper0 = mock(OmsOrderMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderMapper", (Object) omsOrderMapper0);
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderOperateHistoryDao", (Object) omsOrderOperateHistoryDao0);
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long(9999L);
      
      linkedList0.add(long0);
      
      //Call method: close
      int int0 = omsOrderServiceImpl0.close(linkedList0, " servlets=");
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_delete_1()  throws Throwable  {
      //caseID:9de46401f2cabaf325549de00b2be5a4
      //CoveredLines: [25, 82, 83, 84, 85, 86]
      //Input_0_List<Long>: stack0
      //Assert: assertEquals(2, method_result);
      
      OmsOrderServiceImpl omsOrderServiceImpl0 = new OmsOrderServiceImpl();
      //mock omsOrderMapper0
      OmsOrderMapper omsOrderMapper0 = mock(OmsOrderMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2).when(omsOrderMapper0).updateByExampleSelective(any(com.macro.mall.model.OmsOrder.class) , any(com.macro.mall.model.OmsOrderExample.class));
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderMapper", (Object) omsOrderMapper0);
      Stack<Long> stack0 = new Stack<Long>();
      
      //Call method: delete
      int int0 = omsOrderServiceImpl0.delete(stack0);
      
      //Test Result Assert
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test_delivery_2()  throws Throwable  {
      //caseID:32a2b622870cd33862b0369e1ff47893
      //CoveredLines: [25, 44, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57]
      //Input_0_List<OmsOrderDeliveryParam>: arrayList0
      //Assert: assertEquals(0, method_result);
      
      OmsOrderServiceImpl omsOrderServiceImpl0 = new OmsOrderServiceImpl();
      //mock omsOrderDao0
      OmsOrderDao omsOrderDao0 = mock(OmsOrderDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsOrderOperateHistoryDao0
      OmsOrderOperateHistoryDao omsOrderOperateHistoryDao0 = mock(OmsOrderOperateHistoryDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderOperateHistoryDao", (Object) omsOrderOperateHistoryDao0);
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderDao", (Object) omsOrderDao0);
      ArrayList<OmsOrderDeliveryParam> arrayList0 = new ArrayList<OmsOrderDeliveryParam>();
      //mock omsOrderDeliveryParam0
      OmsOrderDeliveryParam omsOrderDeliveryParam0 = mock(OmsOrderDeliveryParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      arrayList0.add(omsOrderDeliveryParam0);
      
      //Call method: delivery
      int int0 = omsOrderServiceImpl0.delivery(arrayList0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_detail_3()  throws Throwable  {
      //caseID:9165b0fc337bd3ebdc3de191813b854e
      //CoveredLines: [25, 91]
      //Input_0_Long: 2147483647L
      //Assert: assertNull(method_result);
      
      OmsOrderServiceImpl omsOrderServiceImpl0 = new OmsOrderServiceImpl();
      //mock omsOrderDao0
      OmsOrderDao omsOrderDao0 = mock(OmsOrderDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderDao", (Object) omsOrderDao0);
      Long long0 = new Long(2147483647L);
      
      //Call method: detail
      OmsOrderDetail omsOrderDetail0 = omsOrderServiceImpl0.detail(long0);
      
      //Test Result Assert
      assertNull(omsOrderDetail0);
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:49f0d520b67cce9ba95a31415add06c9
      //CoveredLines: [25, 37, 38]
      //Input_0_OmsOrderQueryParam: {}
      //Input_1_Integer: (-1)
      //Input_2_Integer: (-1)
      //Assert: assertNull(method_result);
      
      OmsOrderServiceImpl omsOrderServiceImpl0 = new OmsOrderServiceImpl();
      //mock omsOrderDao0
      OmsOrderDao omsOrderDao0 = mock(OmsOrderDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderDao", (Object) omsOrderDao0);
      //mock omsOrderQueryParam0
      OmsOrderQueryParam omsOrderQueryParam0 = mock(OmsOrderQueryParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Integer integer0 = new Integer((-1));
      
      //Call method: list
      List<OmsOrder> list0 = omsOrderServiceImpl0.list(omsOrderQueryParam0, integer0, integer0);
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_updateMoneyInfo_5()  throws Throwable  {
      //caseID:cfa412dd78941c3fe3ae9a435984e81a
      //CoveredLines: [25, 120, 121, 122, 123, 124, 125, 127, 128, 129, 130, 131, 132, 133, 134]
      //Input_0_OmsMoneyInfoParam: {}
      //Assert: assertEquals(0, method_result);
      
      OmsOrderServiceImpl omsOrderServiceImpl0 = new OmsOrderServiceImpl();
      //mock omsOrderMapper0
      OmsOrderMapper omsOrderMapper0 = mock(OmsOrderMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsOrderOperateHistoryMapper0
      OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper0 = mock(OmsOrderOperateHistoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderOperateHistoryMapper", (Object) omsOrderOperateHistoryMapper0);
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderMapper", (Object) omsOrderMapper0);
      //mock omsMoneyInfoParam0
      OmsMoneyInfoParam omsMoneyInfoParam0 = mock(OmsMoneyInfoParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: updateMoneyInfo
      int int0 = omsOrderServiceImpl0.updateMoneyInfo(omsMoneyInfoParam0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_updateNote_6()  throws Throwable  {
      //caseID:680215cdfb19b0d709a0d48d88a0a3dd
      //CoveredLines: [25, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151]
      //Input_0_Long: 1527L
      //Input_1_String: This feature requires ASM8_EXPERIMENTAL
      //Input_2_Integer: 1
      //Assert: assertEquals(0, method_result);
      
      OmsOrderServiceImpl omsOrderServiceImpl0 = new OmsOrderServiceImpl();
      //mock omsOrderMapper0
      OmsOrderMapper omsOrderMapper0 = mock(OmsOrderMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsOrderOperateHistoryMapper0
      OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper0 = mock(OmsOrderOperateHistoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderOperateHistoryMapper", (Object) omsOrderOperateHistoryMapper0);
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderMapper", (Object) omsOrderMapper0);
      Long long0 = new Long(1527L);
      Integer integer0 = new Integer(1);
      
      //Call method: updateNote
      int int0 = omsOrderServiceImpl0.updateNote(long0, "This feature requires ASM8_EXPERIMENTAL", integer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_updateReceiverInfo_7()  throws Throwable  {
      //caseID:6254297bfd0f6778635a5c20d82f0370
      //CoveredLines: [25, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 108, 109, 110, 111, 112, 113, 114, 115]
      //Input_0_OmsReceiverInfoParam: {}
      //Assert: assertEquals(0, method_result);
      
      OmsOrderServiceImpl omsOrderServiceImpl0 = new OmsOrderServiceImpl();
      //mock omsOrderMapper0
      OmsOrderMapper omsOrderMapper0 = mock(OmsOrderMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsOrderOperateHistoryMapper0
      OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper0 = mock(OmsOrderOperateHistoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderOperateHistoryMapper", (Object) omsOrderOperateHistoryMapper0);
      
      PrivateAccess.setVariable((Class<?>) OmsOrderServiceImpl.class, omsOrderServiceImpl0, "orderMapper", (Object) omsOrderMapper0);
      //mock omsReceiverInfoParam0
      OmsReceiverInfoParam omsReceiverInfoParam0 = mock(OmsReceiverInfoParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: updateReceiverInfo
      int int0 = omsOrderServiceImpl0.updateReceiverInfo(omsReceiverInfoParam0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }
}
