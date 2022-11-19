/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.dto.PmsProductParam;
import com.macro.mall.model.CmsPrefrenceAreaProductRelation;
import com.macro.mall.model.CmsSubjectProductRelation;
import com.macro.mall.model.PmsMemberPrice;
import com.macro.mall.model.PmsProductAttributeValue;
import com.macro.mall.model.PmsProductFullReduction;
import com.macro.mall.model.PmsProductLadder;
import com.macro.mall.model.PmsSkuStock;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PmsProductParam_SSTest extends PmsProductParam_SSTest_scaffolding {
// allCoveredLines:[14, 15, 18, 20, 22, 24, 26, 28, 30]

  @Test(timeout = 4000)
  public void test_equals_00()  throws Throwable  {
      //caseID:e67786481b680c1ba894c4118ef3b65e
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15]
      //Input_0_Object: pmsProductParam0
      //Assert: assertTrue(method_result);
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      
      //Call method: equals
      boolean boolean0 = pmsProductParam0.equals(pmsProductParam0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_equals_01()  throws Throwable  {
      //caseID:1bf53107f85296114e11c8cea74b8d8c
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15]
      //Input_0_Object: 0
      //Assert: assertFalse(method_result);
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      
      //Call method: equals
      boolean boolean0 = pmsProductParam0.equals("0");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_equals_02()  throws Throwable  {
      //caseID:b016e25d9503e2041a765de804c96951
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 18, 20, 22, 24, 26, 28, 30]
      //Input_0_Object: pmsProductParam1
      //Assert: assertTrue(method_result);
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      PmsProductParam pmsProductParam1 = new PmsProductParam();
      
      //Call method: equals
      boolean boolean0 = pmsProductParam0.equals(pmsProductParam1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_hashCode_03()  throws Throwable  {
      //caseID:7269127fff01f71d68128d8b1facf734
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 18, 20, 22, 24, 26, 28, 30]
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      
      //Call method: hashCode
      pmsProductParam0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_setMemberPriceList_04()  throws Throwable  {
      //caseID:085e3b7249db71946b3b1661f84c3840
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_List<PmsMemberPrice>: linkedList0
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      LinkedList<PmsMemberPrice> linkedList0 = new LinkedList<PmsMemberPrice>();
      
      //Call method: setMemberPriceList
      pmsProductParam0.setMemberPriceList(linkedList0);
      
      //Test Result Assert
      assertNull(pmsProductParam0.getLowStock());
  }

  @Test(timeout = 4000)
  public void test_setPrefrenceAreaProductRelationList_05()  throws Throwable  {
      //caseID:482d0a6390cfae42c2e0113cd3e8c915
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_List<CmsPrefrenceAreaProductRelation>: vector0
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      Vector<CmsPrefrenceAreaProductRelation> vector0 = new Vector<CmsPrefrenceAreaProductRelation>();
      
      //Call method: setPrefrenceAreaProductRelationList
      pmsProductParam0.setPrefrenceAreaProductRelationList(vector0);
      
      //Test Result Assert
      assertNull(pmsProductParam0.getKeywords());
  }

  @Test(timeout = 4000)
  public void test_setProductAttributeValueList_06()  throws Throwable  {
      //caseID:524d7818dc9a2804ece2e77947292df5
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_List<PmsProductAttributeValue>: stack0
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      Stack<PmsProductAttributeValue> stack0 = new Stack<PmsProductAttributeValue>();
      
      //Call method: setProductAttributeValueList
      pmsProductParam0.setProductAttributeValueList(stack0);
      
      //Test Result Assert
      assertNull(pmsProductParam0.getUsePointLimit());
  }

  @Test(timeout = 4000)
  public void test_setProductFullReductionList_07()  throws Throwable  {
      //caseID:a9e03eb2bd7b4ba7dd30575f16b3bd81
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_List<PmsProductFullReduction>: vector0
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      Vector<PmsProductFullReduction> vector0 = new Vector<PmsProductFullReduction>();
      
      //Call method: setProductFullReductionList
      pmsProductParam0.setProductFullReductionList(vector0);
      
      //Test Result Assert
      assertNull(pmsProductParam0.getServiceIds());
  }

  @Test(timeout = 4000)
  public void test_setProductLadderList_08()  throws Throwable  {
      //caseID:819ee89cc6436a5fa62c11eb7843ce9c
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_List<PmsProductLadder>: vector0
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      Vector<PmsProductLadder> vector0 = new Vector<PmsProductLadder>();
      
      //Call method: setProductLadderList
      pmsProductParam0.setProductLadderList(vector0);
      
      //Test Result Assert
      assertNull(pmsProductParam0.getPreviewStatus());
  }

  @Test(timeout = 4000)
  public void test_setSkuStockList_09()  throws Throwable  {
      //caseID:f74e6755c8a84906af3a1fb51f64dfb4
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_List<PmsSkuStock>: vector0
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      Vector<PmsSkuStock> vector0 = new Vector<PmsSkuStock>();
      
      //Call method: setSkuStockList
      pmsProductParam0.setSkuStockList(vector0);
      
      //Test Result Assert
      assertNull(pmsProductParam0.getBrandName());
  }

  @Test(timeout = 4000)
  public void test_setSubjectProductRelationList_10()  throws Throwable  {
      //caseID:480c00a4a62e015cfaf96c2e62dbff1b
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14]
      //Input_0_List<CmsSubjectProductRelation>: stack0
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      Stack<CmsSubjectProductRelation> stack0 = new Stack<CmsSubjectProductRelation>();
      
      //Call method: setSubjectProductRelationList
      pmsProductParam0.setSubjectProductRelationList(stack0);
      
      //Test Result Assert
      assertNull(pmsProductParam0.getKeywords());
  }

  @Test(timeout = 4000)
  public void test_toString_11()  throws Throwable  {
      //caseID:faf00dc731d27051d07bb000f8e21b2f
      //CoveredLines: [14, 14, 14, 14, 14, 14, 14, 14, 14, 18, 20, 22, 24, 26, 28, 30]
      //Assert: assertEquals("PmsProductParam(productLadderList=null, productFullReductionList=null, memberPriceList=null, skuStockList=null, productAttributeValueList=null, subjectProductRelationList=null, prefrenceAreaProductRelationList=null)", method_result);
      
      PmsProductParam pmsProductParam0 = new PmsProductParam();
      
      //Call method: toString
      String string0 = pmsProductParam0.toString();
      
      //Test Result Assert
      assertEquals("PmsProductParam(productLadderList=null, productFullReductionList=null, memberPriceList=null, skuStockList=null, productAttributeValueList=null, subjectProductRelationList=null, prefrenceAreaProductRelationList=null)", string0);
  }
}
