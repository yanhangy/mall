/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.dto.PmsProductAttributeCategoryItem;
import com.macro.mall.model.PmsProductAttribute;
import java.util.List;
import java.util.Stack;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PmsProductAttributeCategoryItem_SSTest extends PmsProductAttributeCategoryItem_SSTest_scaffolding {
// allCoveredLines:[16, 17, 18]

  @Test(timeout = 4000)
  public void test_getProductAttributeList_0()  throws Throwable  {
      //caseID:b0fb440bdd87e40d6567aff131ecd6d1
      //CoveredLines: [16, 17]
      //Assert: assertNull(method_result);
      
      PmsProductAttributeCategoryItem pmsProductAttributeCategoryItem0 = new PmsProductAttributeCategoryItem();
      
      //Call method: getProductAttributeList
      List<PmsProductAttribute> list0 = pmsProductAttributeCategoryItem0.getProductAttributeList();
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_setProductAttributeList_1()  throws Throwable  {
      //caseID:57ad1ad9dbb621ce92d918102802c3f2
      //CoveredLines: [16, 18]
      //Input_0_List<PmsProductAttribute>: stack0
      
      PmsProductAttributeCategoryItem pmsProductAttributeCategoryItem0 = new PmsProductAttributeCategoryItem();
      Stack<PmsProductAttribute> stack0 = new Stack<PmsProductAttribute>();
      
      //Call method: setProductAttributeList
      pmsProductAttributeCategoryItem0.setProductAttributeList(stack0);
      
      //Test Result Assert
      assertEquals(10, stack0.capacity());
  }
}
