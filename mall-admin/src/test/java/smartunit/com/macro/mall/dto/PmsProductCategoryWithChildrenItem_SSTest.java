/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.dto.PmsProductCategoryWithChildrenItem;
import com.macro.mall.model.PmsProductCategory;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PmsProductCategoryWithChildrenItem_SSTest extends PmsProductCategoryWithChildrenItem_SSTest_scaffolding {
// allCoveredLines:[13, 14, 15]

  @Test(timeout = 4000)
  public void test_getChildren_0()  throws Throwable  {
      //caseID:61af3e9e03e78c2c4436494d2c02b2ec
      //CoveredLines: [13, 14]
      //Assert: assertTrue(method_result.isEmpty());
      
      PmsProductCategoryWithChildrenItem pmsProductCategoryWithChildrenItem0 = new PmsProductCategoryWithChildrenItem();
      ArrayList<PmsProductCategory> arrayList0 = new ArrayList<PmsProductCategory>();
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryWithChildrenItem.class, pmsProductCategoryWithChildrenItem0, "children", (Object) arrayList0);
      
      //Call method: getChildren
      List<PmsProductCategory> list0 = pmsProductCategoryWithChildrenItem0.getChildren();
      
      //Test Result Assert
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_setChildren_1()  throws Throwable  {
      //caseID:7bf4ac926883a0564408680e117f3943
      //CoveredLines: [13, 15]
      //Input_0_List<PmsProductCategory>: linkedList0
      
      PmsProductCategoryWithChildrenItem pmsProductCategoryWithChildrenItem0 = new PmsProductCategoryWithChildrenItem();
      LinkedList<PmsProductCategory> linkedList0 = new LinkedList<PmsProductCategory>();
      
      //Call method: setChildren
      pmsProductCategoryWithChildrenItem0.setChildren(linkedList0);
      
      //Test Result Assert
      assertNull(pmsProductCategoryWithChildrenItem0.getShowStatus());
  }
}
