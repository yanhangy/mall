/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.dto.OmsOrderDetail;
import com.macro.mall.model.OmsOrderItem;
import com.macro.mall.model.OmsOrderOperateHistory;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OmsOrderDetail_SSTest extends OmsOrderDetail_SSTest_scaffolding {
// allCoveredLines:[16, 17, 18, 21, 22]

  @Test(timeout = 4000)
  public void test_getHistoryList_0()  throws Throwable  {
      //caseID:9c35c39a999d875dcbd9256d87a27003
      //CoveredLines: [16, 21]
      //Assert: assertEquals(0, method_result.size());
      
      OmsOrderDetail omsOrderDetail0 = new OmsOrderDetail();
      Vector<OmsOrderOperateHistory> vector0 = new Vector<OmsOrderOperateHistory>();
      
      PrivateAccess.setVariable((Class<?>) OmsOrderDetail.class, omsOrderDetail0, "historyList", (Object) vector0);
      
      //Call method: getHistoryList
      List<OmsOrderOperateHistory> list0 = omsOrderDetail0.getHistoryList();
      
      //Test Result Assert
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test_getOrderItemList_1()  throws Throwable  {
      //caseID:d152441215ab2c25436f928c6219b650
      //CoveredLines: [16, 17]
      //Assert: assertNull(method_result);
      
      OmsOrderDetail omsOrderDetail0 = new OmsOrderDetail();
      
      //Call method: getOrderItemList
      List<OmsOrderItem> list0 = omsOrderDetail0.getOrderItemList();
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_setHistoryList_2()  throws Throwable  {
      //caseID:00120eccf4ab39e52aedab436beec964
      //CoveredLines: [16, 22]
      //Input_0_List<OmsOrderOperateHistory>: arrayList0
      
      OmsOrderDetail omsOrderDetail0 = new OmsOrderDetail();
      ArrayList<OmsOrderOperateHistory> arrayList0 = new ArrayList<OmsOrderOperateHistory>();
      
      //Call method: setHistoryList
      omsOrderDetail0.setHistoryList(arrayList0);
      
      //Test Result Assert
      assertNull(omsOrderDetail0.getOrderType());
  }

  @Test(timeout = 4000)
  public void test_setOrderItemList_3()  throws Throwable  {
      //caseID:827c71af91ade957e00e585a04a89c56
      //CoveredLines: [16, 18]
      //Input_0_List<OmsOrderItem>: vector0
      
      OmsOrderDetail omsOrderDetail0 = new OmsOrderDetail();
      Vector<OmsOrderItem> vector0 = new Vector<OmsOrderItem>();
      
      //Call method: setOrderItemList
      omsOrderDetail0.setOrderItemList(vector0);
      
      //Test Result Assert
      assertNull(omsOrderDetail0.getNote());
  }
}
