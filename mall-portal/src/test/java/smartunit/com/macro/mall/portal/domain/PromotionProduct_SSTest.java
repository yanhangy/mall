/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.model.PmsProductFullReduction;
import com.macro.mall.model.PmsProductLadder;
import com.macro.mall.model.PmsSkuStock;
import com.macro.mall.portal.domain.PromotionProduct;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.junit.runner.RunWith;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PromotionProduct_SSTest extends PromotionProduct_SSTest_scaffolding {
// allCoveredLines:[14, 23, 27, 28, 31, 35, 36, 39, 43, 44]

  @Test(timeout = 4000)
  public void test_getProductFullReductionList_0()  throws Throwable  {
      //caseID:8d28fdb323ed0aa6b43e275c0a45a09b
      //CoveredLines: [14, 39]
      //Assert: assertTrue(method_result.isEmpty());
      
      PromotionProduct promotionProduct0 = new PromotionProduct();
      ArrayList<PmsProductFullReduction> arrayList0 = new ArrayList<PmsProductFullReduction>();
      
      PrivateAccess.setVariable((Class<?>) PromotionProduct.class, promotionProduct0, "productFullReductionList", (Object) arrayList0);
      
      //Call method: getProductFullReductionList
      List<PmsProductFullReduction> list0 = promotionProduct0.getProductFullReductionList();
      
      //Test Result Assert
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_getProductLadderList_1()  throws Throwable  {
      //caseID:7766b065938607584e80fee5760f6c00
      //CoveredLines: [14, 31]
      //Assert: assertEquals(0, method_result.size());
      
      PromotionProduct promotionProduct0 = new PromotionProduct();
      Stack<PmsProductLadder> stack0 = new Stack<PmsProductLadder>();
      
      PrivateAccess.setVariable((Class<?>) PromotionProduct.class, promotionProduct0, "productLadderList", (Object) stack0);
      
      //Call method: getProductLadderList
      List<PmsProductLadder> list0 = promotionProduct0.getProductLadderList();
      
      //Test Result Assert
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test_getSkuStockList_2()  throws Throwable  {
      //caseID:48a65ea7cb6b8e3d2f7ee2e4b31dfc36
      //CoveredLines: [14, 23]
      //Assert: assertEquals(0, method_result.size());
      
      PromotionProduct promotionProduct0 = new PromotionProduct();
      ArrayList<PmsSkuStock> arrayList0 = new ArrayList<PmsSkuStock>();
      
      PrivateAccess.setVariable((Class<?>) PromotionProduct.class, promotionProduct0, "skuStockList", (Object) arrayList0);
      
      //Call method: getSkuStockList
      List<PmsSkuStock> list0 = promotionProduct0.getSkuStockList();
      
      //Test Result Assert
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test_setProductFullReductionList_3()  throws Throwable  {
      //caseID:adbb4b921652e52b59fc8530c4c3f82a
      //CoveredLines: [14, 43, 44]
      //Input_0_List<PmsProductFullReduction>: linkedList0
      
      PromotionProduct promotionProduct0 = new PromotionProduct();
      LinkedList<PmsProductFullReduction> linkedList0 = new LinkedList<PmsProductFullReduction>();
      
      //Call method: setProductFullReductionList
      promotionProduct0.setProductFullReductionList(linkedList0);
      
      //Test Result Assert
      assertNull(promotionProduct0.getDescription());
  }

  @Test(timeout = 4000)
  public void test_setProductLadderList_4()  throws Throwable  {
      //caseID:cd8c963539485f46cc56ace2a1796080
      //CoveredLines: [14, 35, 36]
      //Input_0_List<PmsProductLadder>: linkedList0
      
      PromotionProduct promotionProduct0 = new PromotionProduct();
      LinkedList<PmsProductLadder> linkedList0 = new LinkedList<PmsProductLadder>();
      
      //Call method: setProductLadderList
      promotionProduct0.setProductLadderList(linkedList0);
      
      //Test Result Assert
      assertNull(promotionProduct0.getDetailHtml());
  }

  @Test(timeout = 4000)
  public void test_setSkuStockList_5()  throws Throwable  {
      //caseID:e71a7e5d50c4dfba45689f08ed141336
      //CoveredLines: [14, 27, 28]
      //Input_0_List<PmsSkuStock>: stack0
      
      PromotionProduct promotionProduct0 = new PromotionProduct();
      Stack<PmsSkuStock> stack0 = new Stack<PmsSkuStock>();
      
      //Call method: setSkuStockList
      promotionProduct0.setSkuStockList(stack0);
      
      //Test Result Assert
      assertEquals(0, stack0.size());
  }
}
