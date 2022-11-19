/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.macro.mall.model.OmsCartItem;
import com.macro.mall.model.PmsProductFullReduction;
import com.macro.mall.model.PmsProductLadder;
import com.macro.mall.model.PmsSkuStock;
import com.macro.mall.portal.dao.PortalProductDao;
import com.macro.mall.portal.domain.CartPromotionItem;
import com.macro.mall.portal.domain.PromotionProduct;
import com.macro.mall.portal.service.impl.OmsPromotionServiceImpl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OmsPromotionServiceImpl_SSTest extends OmsPromotionServiceImpl_SSTest_scaffolding {
// allCoveredLines:[25, 32, 34, 36, 37, 38, 39, 40, 41, 42, 44, 45, 46, 47, 49, 50, 52, 53, 54, 55, 56, 57, 58, 59, 61, 62, 63, 64, 65, 66, 67, 68, 70, 71, 72, 73, 74, 75, 76, 77, 78, 80, 82, 84, 85, 86, 87, 88, 89, 90, 91, 93, 94, 95, 96, 97, 98, 99, 100, 101, 103, 105, 107, 109, 110, 117, 118, 119, 120, 121, 128, 129, 130, 131, 132, 133, 134, 136, 138, 139, 146, 147, 148, 149, 150, 151, 152, 153, 154, 161, 162, 163, 164, 165, 166, 167, 168, 170, 171, 172, 173, 174, 178, 181, 184, 185, 186, 188, 189, 196, 197, 198, 199, 200, 201, 202, 203, 204, 212, 215, 218, 219, 220, 222, 223, 230, 231, 232, 233, 234, 241, 242, 244, 245, 246, 247, 248, 255, 256, 257, 259, 260, 267, 268, 269, 271, 272]

  @Test(timeout = 4000)
  public void test_calcCartPromotion_0()  throws Throwable  {
      //caseID:191a86cf8d3cd199adbd4639c7c15ca5
      //CoveredLines: [25, 32, 34, 36, 37, 38, 39, 40, 41, 117, 118, 119, 120, 121, 128, 129, 130, 131, 132, 133, 134, 136, 138, 139, 267, 268, 271, 272]
      //Input_0_List<OmsCartItem>: vector0
      
      OmsPromotionServiceImpl omsPromotionServiceImpl0 = new OmsPromotionServiceImpl();
      ArrayList<PromotionProduct> arrayList0 = new ArrayList<PromotionProduct>();
      Long long0 = new Long(0L);
      //mock promotionProduct0
      PromotionProduct promotionProduct0 = mock(PromotionProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(promotionProduct0).getId();
      doReturn("4").when(promotionProduct0).toString();
      
      arrayList0.add(promotionProduct0);
      //mock portalProductDao0
      PortalProductDao portalProductDao0 = mock(PortalProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(portalProductDao0).getPromotionProductList(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) OmsPromotionServiceImpl.class, omsPromotionServiceImpl0, "portalProductDao", (Object) portalProductDao0);
      Vector<OmsCartItem> vector0 = new Vector<OmsCartItem>();
      Long long1 = new Long(595L);
      //mock omsCartItem0
      OmsCartItem omsCartItem0 = mock(OmsCartItem.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long1, long1).when(omsCartItem0).getProductId();
      doReturn("\u51CF").when(omsCartItem0).toString();
      //mock omsCartItem1
      OmsCartItem omsCartItem1 = mock(OmsCartItem.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long1, long1, long1).when(omsCartItem1).getProductId();
      doReturn("4").when(omsCartItem1).toString();
      
      vector0.add(omsCartItem1);
      
      vector0.add(omsCartItem0);
      
      //Call method: calcCartPromotion
      // Undeclared exception!
      try { 
        omsPromotionServiceImpl0.calcCartPromotion(vector0);
      } catch(Throwable e) {
         verifyException("com.macro.mall.portal.service.impl.OmsPromotionServiceImpl", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_calcCartPromotion_1()  throws Throwable  {
      //caseID:446392d6925cb39939903f5ffd5e28ec
      //CoveredLines: [25, 32, 34, 36, 37, 38, 39, 40, 41, 42, 44, 45, 46, 47, 49, 50, 52, 53, 54, 55, 56, 57, 58, 109, 110, 117, 118, 119, 120, 121, 128, 129, 130, 131, 132, 133, 134, 138, 139, 255, 256, 257, 267, 268, 269]
      //Input_0_List<OmsCartItem>: stack0
      //Assert: assertFalse(method_result.isEmpty());
      
      OmsPromotionServiceImpl omsPromotionServiceImpl0 = new OmsPromotionServiceImpl();
      ArrayList<PromotionProduct> arrayList0 = new ArrayList<PromotionProduct>();
      Long long0 = new Long(0L);
      Integer integer0 = new Integer(1);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      LinkedList<PmsSkuStock> linkedList0 = new LinkedList<PmsSkuStock>();
      //mock pmsSkuStock0
      PmsSkuStock pmsSkuStock0 = mock(PmsSkuStock.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(pmsSkuStock0).getId();
      doReturn(integer0).when(pmsSkuStock0).getLockStock();
      doReturn(bigDecimal0).when(pmsSkuStock0).getPrice();
      doReturn(bigDecimal0).when(pmsSkuStock0).getPromotionPrice();
      doReturn(integer0).when(pmsSkuStock0).getStock();
      doReturn("1").when(pmsSkuStock0).toString();
      
      linkedList0.add(pmsSkuStock0);
      //mock promotionProduct0
      PromotionProduct promotionProduct0 = mock(PromotionProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(promotionProduct0).getId();
      doReturn(integer0).when(promotionProduct0).getPromotionType();
      doReturn("1", "1").when(promotionProduct0).toString();
      doReturn(linkedList0).when(promotionProduct0).getSkuStockList();
      
      arrayList0.add(promotionProduct0);
      //mock portalProductDao0
      PortalProductDao portalProductDao0 = mock(PortalProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(portalProductDao0).getPromotionProductList(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) OmsPromotionServiceImpl.class, omsPromotionServiceImpl0, "portalProductDao", (Object) portalProductDao0);
      Stack<OmsCartItem> stack0 = new Stack<OmsCartItem>();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock date1
      Date date1 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsCartItem0
      OmsCartItem omsCartItem0 = mock(OmsCartItem.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date1).when(omsCartItem0).getCreateDate();
      doReturn(integer0).when(omsCartItem0).getDeleteStatus();
      doReturn(long0).when(omsCartItem0).getId();
      doReturn(long0).when(omsCartItem0).getMemberId();
      doReturn("1").when(omsCartItem0).getMemberNickname();
      doReturn(date0).when(omsCartItem0).getModifyDate();
      doReturn(bigDecimal0).when(omsCartItem0).getPrice();
      doReturn("1").when(omsCartItem0).getProductAttr();
      doReturn("1").when(omsCartItem0).getProductBrand();
      doReturn(long0).when(omsCartItem0).getProductCategoryId();
      doReturn(long0, long0, long0, long0).when(omsCartItem0).getProductId();
      doReturn("1").when(omsCartItem0).getProductName();
      doReturn("1").when(omsCartItem0).getProductPic();
      doReturn("1").when(omsCartItem0).getProductSkuCode();
      doReturn(long0, long0).when(omsCartItem0).getProductSkuId();
      doReturn("1").when(omsCartItem0).getProductSn();
      doReturn("1").when(omsCartItem0).getProductSubTitle();
      doReturn(integer0).when(omsCartItem0).getQuantity();
      doReturn("1").when(omsCartItem0).toString();
      
      stack0.add(omsCartItem0);
      
      //Call method: calcCartPromotion
      List<CartPromotionItem> list0 = omsPromotionServiceImpl0.calcCartPromotion(stack0);
      
      //Test Result Assert
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_calcCartPromotion_2()  throws Throwable  {
      //caseID:a79125881c22b7faaa47eeceecb41e3d
      //CoveredLines: [25, 32, 34, 36, 37, 38, 39, 40, 41, 42, 59, 107, 109, 110, 117, 118, 119, 120, 121, 128, 129, 130, 131, 132, 133, 134, 138, 139, 161, 162, 163, 164, 165, 166, 167, 168, 170, 171, 172, 173, 174, 255, 256, 257, 267, 268, 269]
      //Input_0_List<OmsCartItem>: stack0
      //Assert: assertEquals(1, method_result.size());
      
      OmsPromotionServiceImpl omsPromotionServiceImpl0 = new OmsPromotionServiceImpl();
      ArrayList<PromotionProduct> arrayList0 = new ArrayList<PromotionProduct>();
      Long long0 = new Long(0L);
      Integer integer0 = new Integer(13);
      BigDecimal bigDecimal0 = new BigDecimal(13);
      LinkedList<PmsSkuStock> linkedList0 = new LinkedList<PmsSkuStock>();
      //mock pmsSkuStock0
      PmsSkuStock pmsSkuStock0 = mock(PmsSkuStock.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(pmsSkuStock0).getId();
      doReturn(integer0).when(pmsSkuStock0).getLockStock();
      doReturn(integer0).when(pmsSkuStock0).getStock();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(pmsSkuStock0).toString();
      
      linkedList0.add(pmsSkuStock0);
      //mock promotionProduct0
      PromotionProduct promotionProduct0 = mock(PromotionProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(promotionProduct0).getGiftGrowth();
      doReturn(integer0).when(promotionProduct0).getGiftPoint();
      doReturn(long0).when(promotionProduct0).getId();
      doReturn(integer0).when(promotionProduct0).getPromotionType();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest", "org.springframework.http.server.reactive.AbstractServerHttpRequest").when(promotionProduct0).toString();
      doReturn(linkedList0).when(promotionProduct0).getSkuStockList();
      
      arrayList0.add(promotionProduct0);
      //mock portalProductDao0
      PortalProductDao portalProductDao0 = mock(PortalProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(portalProductDao0).getPromotionProductList(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) OmsPromotionServiceImpl.class, omsPromotionServiceImpl0, "portalProductDao", (Object) portalProductDao0);
      Stack<OmsCartItem> stack0 = new Stack<OmsCartItem>();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(date0).toString();
      //mock date1
      Date date1 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(date1).toString();
      //mock omsCartItem0
      OmsCartItem omsCartItem0 = mock(OmsCartItem.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date1).when(omsCartItem0).getCreateDate();
      doReturn(integer0).when(omsCartItem0).getDeleteStatus();
      doReturn(long0).when(omsCartItem0).getId();
      doReturn(long0).when(omsCartItem0).getMemberId();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(omsCartItem0).getMemberNickname();
      doReturn(date0).when(omsCartItem0).getModifyDate();
      doReturn(bigDecimal0).when(omsCartItem0).getPrice();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(omsCartItem0).getProductAttr();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(omsCartItem0).getProductBrand();
      doReturn(long0).when(omsCartItem0).getProductCategoryId();
      doReturn(long0, long0, long0, long0).when(omsCartItem0).getProductId();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(omsCartItem0).getProductName();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(omsCartItem0).getProductPic();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(omsCartItem0).getProductSkuCode();
      doReturn(long0, long0).when(omsCartItem0).getProductSkuId();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(omsCartItem0).getProductSn();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(omsCartItem0).getProductSubTitle();
      doReturn(integer0).when(omsCartItem0).getQuantity();
      doReturn("org.springframework.http.server.reactive.AbstractServerHttpRequest").when(omsCartItem0).toString();
      
      stack0.add(omsCartItem0);
      
      //Call method: calcCartPromotion
      List<CartPromotionItem> list0 = omsPromotionServiceImpl0.calcCartPromotion(stack0);
      
      //Test Result Assert
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_calcCartPromotion_3()  throws Throwable  {
      //caseID:0ef1dbf45393fc2dacff55977e3fc8d9
      //CoveredLines: [25, 32, 34, 36, 37, 38, 39, 40, 41, 42, 59, 61, 62, 63, 80, 82, 109, 110, 117, 118, 119, 120, 121, 128, 129, 130, 131, 132, 133, 134, 138, 139, 161, 162, 163, 164, 165, 166, 167, 170, 171, 172, 173, 174, 212, 218, 219, 222, 223, 230, 231, 232, 233, 234, 255, 256, 259, 260, 267, 268, 269]
      //Input_0_List<OmsCartItem>: vector0
      //Assert: assertFalse(method_result.isEmpty());
      
      OmsPromotionServiceImpl omsPromotionServiceImpl0 = new OmsPromotionServiceImpl();
      Stack<PromotionProduct> stack0 = new Stack<PromotionProduct>();
      Long long0 = new Long(0L);
      Integer integer0 = new Integer(3);
      ArrayList<PmsProductLadder> arrayList0 = new ArrayList<PmsProductLadder>();
      //mock pmsProductLadder0
      PmsProductLadder pmsProductLadder0 = mock(PmsProductLadder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(pmsProductLadder0).getCount();
      
      arrayList0.add(pmsProductLadder0);
      ArrayList<PmsSkuStock> arrayList1 = new ArrayList<PmsSkuStock>();
      //mock pmsSkuStock0
      PmsSkuStock pmsSkuStock0 = mock(PmsSkuStock.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(pmsSkuStock0).getId();
      
      arrayList1.add(pmsSkuStock0);
      //mock promotionProduct0
      PromotionProduct promotionProduct0 = mock(PromotionProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(promotionProduct0).getGiftGrowth();
      doReturn(integer0).when(promotionProduct0).getGiftPoint();
      doReturn(long0).when(promotionProduct0).getId();
      doReturn(integer0).when(promotionProduct0).getPromotionType();
      doReturn("3174", "3").when(promotionProduct0).toString();
      doReturn(arrayList0).when(promotionProduct0).getProductLadderList();
      doReturn(arrayList1).when(promotionProduct0).getSkuStockList();
      
      stack0.add(promotionProduct0);
      //mock portalProductDao0
      PortalProductDao portalProductDao0 = mock(PortalProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(portalProductDao0).getPromotionProductList(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) OmsPromotionServiceImpl.class, omsPromotionServiceImpl0, "portalProductDao", (Object) portalProductDao0);
      Vector<OmsCartItem> vector0 = new Vector<OmsCartItem>();
      Long long1 = new Long((-1L));
      Long long2 = new Long(0L);
      Integer integer1 = new Integer((-1));
      BigDecimal bigDecimal0 = new BigDecimal(511);
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("com.macro.mall.portal.service.impl.OmsPromotionServiceImpl$2").when(date0).toString();
      //mock date1
      Date date1 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("z;ypCU8P!>").when(date1).toString();
      //mock omsCartItem0
      OmsCartItem omsCartItem0 = mock(OmsCartItem.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date1).when(omsCartItem0).getCreateDate();
      doReturn(integer0).when(omsCartItem0).getDeleteStatus();
      doReturn(long1).when(omsCartItem0).getId();
      doReturn(long0).when(omsCartItem0).getMemberId();
      doReturn("").when(omsCartItem0).getMemberNickname();
      doReturn(date0).when(omsCartItem0).getModifyDate();
      doReturn(bigDecimal0).when(omsCartItem0).getPrice();
      doReturn("org.springframework.messaging.tcp.reactor.ReactorNettyTcpClient$ReactorNettyHandler").when(omsCartItem0).getProductAttr();
      doReturn("\u6253").when(omsCartItem0).getProductBrand();
      doReturn(long2).when(omsCartItem0).getProductCategoryId();
      doReturn(long1, long2, long1, long1).when(omsCartItem0).getProductId();
      doReturn("com.macro.mall.portal.service.impl.OmsPromotionServiceImpl").when(omsCartItem0).getProductName();
      doReturn("503").when(omsCartItem0).getProductPic();
      doReturn("\u51CF").when(omsCartItem0).getProductSkuCode();
      doReturn(long1, long1).when(omsCartItem0).getProductSkuId();
      doReturn("t kyR3(V80)g;").when(omsCartItem0).getProductSn();
      doReturn("").when(omsCartItem0).getProductSubTitle();
      doReturn(integer1, integer1).when(omsCartItem0).getQuantity();
      doReturn("10").when(omsCartItem0).toString();
      
      vector0.add(omsCartItem0);
      
      //Call method: calcCartPromotion
      List<CartPromotionItem> list0 = omsPromotionServiceImpl0.calcCartPromotion(vector0);
      
      //Test Result Assert
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_calcCartPromotion_4()  throws Throwable  {
      //caseID:3124d0457f7ca2ea98e406c5792a55f6
      //CoveredLines: [25, 32, 34, 36, 37, 38, 39, 40, 41, 42, 59, 84, 85, 86, 103, 105, 109, 110, 117, 118, 119, 120, 121, 128, 129, 130, 131, 132, 133, 134, 138, 139, 161, 162, 163, 164, 165, 166, 167, 168, 170, 171, 172, 173, 174, 178, 184, 189, 241, 242, 244, 245, 246, 247, 248, 255, 256, 257, 267, 268, 269]
      //Input_0_List<OmsCartItem>: stack2
      //Assert: assertEquals(1, method_result.size());
      
      OmsPromotionServiceImpl omsPromotionServiceImpl0 = new OmsPromotionServiceImpl();
      ArrayList<PromotionProduct> arrayList0 = new ArrayList<PromotionProduct>();
      Long long0 = new Long(526L);
      Integer integer0 = new Integer(4);
      Stack<PmsSkuStock> stack0 = new Stack<PmsSkuStock>();
      BigDecimal bigDecimal0 = new BigDecimal((long) 4);
      //mock pmsSkuStock0
      PmsSkuStock pmsSkuStock0 = mock(PmsSkuStock.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long0).when(pmsSkuStock0).getId();
      doReturn(integer0).when(pmsSkuStock0).getLockStock();
      doReturn(bigDecimal0).when(pmsSkuStock0).getPrice();
      doReturn(integer0).when(pmsSkuStock0).getStock();
      doReturn("\u6298", "\u6298").when(pmsSkuStock0).toString();
      
      stack0.add(pmsSkuStock0);
      Stack<PmsProductFullReduction> stack1 = new Stack<PmsProductFullReduction>();
      //mock promotionProduct0
      PromotionProduct promotionProduct0 = mock(PromotionProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(promotionProduct0).getGiftGrowth();
      doReturn(integer0).when(promotionProduct0).getGiftPoint();
      doReturn(long0, long0).when(promotionProduct0).getId();
      doReturn(integer0).when(promotionProduct0).getPromotionType();
      doReturn("\u6298", "\u6298", "\u6298").when(promotionProduct0).toString();
      doReturn(stack1).when(promotionProduct0).getProductFullReductionList();
      doReturn(stack0, stack0).when(promotionProduct0).getSkuStockList();
      
      arrayList0.add(promotionProduct0);
      //mock portalProductDao0
      PortalProductDao portalProductDao0 = mock(PortalProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(portalProductDao0).getPromotionProductList(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) OmsPromotionServiceImpl.class, omsPromotionServiceImpl0, "portalProductDao", (Object) portalProductDao0);
      Stack<OmsCartItem> stack2 = new Stack<OmsCartItem>();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("\u6298").when(date0).toString();
      //mock date1
      Date date1 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("\u6298").when(date1).toString();
      //mock omsCartItem0
      OmsCartItem omsCartItem0 = mock(OmsCartItem.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date1).when(omsCartItem0).getCreateDate();
      doReturn(integer0).when(omsCartItem0).getDeleteStatus();
      doReturn(long0).when(omsCartItem0).getId();
      doReturn(long0).when(omsCartItem0).getMemberId();
      doReturn("\u6298").when(omsCartItem0).getMemberNickname();
      doReturn(date0).when(omsCartItem0).getModifyDate();
      doReturn(bigDecimal0).when(omsCartItem0).getPrice();
      doReturn("\u6298").when(omsCartItem0).getProductAttr();
      doReturn("\u6298").when(omsCartItem0).getProductBrand();
      doReturn(long0).when(omsCartItem0).getProductCategoryId();
      doReturn(long0, long0, long0, long0, long0).when(omsCartItem0).getProductId();
      doReturn("\u6298").when(omsCartItem0).getProductName();
      doReturn("\u6298").when(omsCartItem0).getProductPic();
      doReturn("\u6298").when(omsCartItem0).getProductSkuCode();
      doReturn(long0, long0, long0).when(omsCartItem0).getProductSkuId();
      doReturn("\u6298").when(omsCartItem0).getProductSn();
      doReturn("\u6298").when(omsCartItem0).getProductSubTitle();
      doReturn(integer0, integer0).when(omsCartItem0).getQuantity();
      doReturn("\u6298").when(omsCartItem0).toString();
      
      stack2.add(omsCartItem0);
      
      //Call method: calcCartPromotion
      List<CartPromotionItem> list0 = omsPromotionServiceImpl0.calcCartPromotion(stack2);
      
      //Test Result Assert
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_calcCartPromotion_5()  throws Throwable  {
      //caseID:4f421bf257db29adb7cba4d0128c68fe
      //CoveredLines: [25, 32, 34, 36, 37, 38, 39, 40, 41, 42, 59, 61, 62, 63, 64, 65, 66, 67, 68, 70, 71, 72, 73, 74, 75, 76, 77, 78, 82, 109, 110, 117, 118, 119, 120, 121, 128, 129, 130, 131, 132, 133, 134, 138, 139, 196, 197, 198, 199, 200, 201, 202, 203, 204, 212, 218, 219, 220, 230, 231, 232, 233, 234, 255, 256, 257, 267, 268, 269]
      //Input_0_List<OmsCartItem>: stack1
      //Assert: assertEquals(1, method_result.size());
      
      OmsPromotionServiceImpl omsPromotionServiceImpl0 = new OmsPromotionServiceImpl();
      ArrayList<PromotionProduct> arrayList0 = new ArrayList<PromotionProduct>();
      Long long0 = new Long(0L);
      Integer integer0 = new Integer(3);
      Stack<PmsProductLadder> stack0 = new Stack<PmsProductLadder>();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      //mock pmsProductLadder0
      PmsProductLadder pmsProductLadder0 = mock(PmsProductLadder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0, integer0).when(pmsProductLadder0).getCount();
      doReturn(bigDecimal0, bigDecimal0).when(pmsProductLadder0).getDiscount();
      doReturn("1").when(pmsProductLadder0).toString();
      
      stack0.add(pmsProductLadder0);
      LinkedList<PmsSkuStock> linkedList0 = new LinkedList<PmsSkuStock>();
      //mock pmsSkuStock0
      PmsSkuStock pmsSkuStock0 = mock(PmsSkuStock.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(pmsSkuStock0).getId();
      doReturn(integer0).when(pmsSkuStock0).getLockStock();
      doReturn(bigDecimal0).when(pmsSkuStock0).getPrice();
      doReturn(integer0).when(pmsSkuStock0).getStock();
      doReturn("1").when(pmsSkuStock0).toString();
      
      linkedList0.add(pmsSkuStock0);
      //mock promotionProduct0
      PromotionProduct promotionProduct0 = mock(PromotionProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(promotionProduct0).getGiftGrowth();
      doReturn(integer0).when(promotionProduct0).getGiftPoint();
      doReturn(long0).when(promotionProduct0).getId();
      doReturn(integer0).when(promotionProduct0).getPromotionType();
      doReturn("1", "1").when(promotionProduct0).toString();
      doReturn(stack0).when(promotionProduct0).getProductLadderList();
      doReturn(linkedList0).when(promotionProduct0).getSkuStockList();
      
      arrayList0.add(promotionProduct0);
      //mock portalProductDao0
      PortalProductDao portalProductDao0 = mock(PortalProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(portalProductDao0).getPromotionProductList(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) OmsPromotionServiceImpl.class, omsPromotionServiceImpl0, "portalProductDao", (Object) portalProductDao0);
      Stack<OmsCartItem> stack1 = new Stack<OmsCartItem>();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1").when(date0).toString();
      //mock date1
      Date date1 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1").when(date1).toString();
      //mock omsCartItem0
      OmsCartItem omsCartItem0 = mock(OmsCartItem.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date1).when(omsCartItem0).getCreateDate();
      doReturn(integer0).when(omsCartItem0).getDeleteStatus();
      doReturn(long0).when(omsCartItem0).getId();
      doReturn(long0).when(omsCartItem0).getMemberId();
      doReturn("1").when(omsCartItem0).getMemberNickname();
      doReturn(date0).when(omsCartItem0).getModifyDate();
      doReturn(bigDecimal0).when(omsCartItem0).getPrice();
      doReturn("1").when(omsCartItem0).getProductAttr();
      doReturn("1").when(omsCartItem0).getProductBrand();
      doReturn(long0).when(omsCartItem0).getProductCategoryId();
      doReturn(long0, long0, long0, long0).when(omsCartItem0).getProductId();
      doReturn("1").when(omsCartItem0).getProductName();
      doReturn("1").when(omsCartItem0).getProductPic();
      doReturn("1").when(omsCartItem0).getProductSkuCode();
      doReturn(long0, long0).when(omsCartItem0).getProductSkuId();
      doReturn("1").when(omsCartItem0).getProductSn();
      doReturn("1").when(omsCartItem0).getProductSubTitle();
      doReturn(integer0, integer0).when(omsCartItem0).getQuantity();
      doReturn("1").when(omsCartItem0).toString();
      
      stack1.add(omsCartItem0);
      
      //Call method: calcCartPromotion
      List<CartPromotionItem> list0 = omsPromotionServiceImpl0.calcCartPromotion(stack1);
      
      //Test Result Assert
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_calcCartPromotion_6()  throws Throwable  {
      //caseID:cd73d56c57338e04d2defa46adf1a5e3
      //CoveredLines: [25, 32, 34, 36, 37, 38, 39, 40, 41, 42, 59, 84, 85, 86, 87, 88, 89, 90, 91, 93, 94, 95, 96, 97, 98, 99, 100, 101, 105, 109, 110, 117, 118, 119, 120, 121, 128, 129, 130, 131, 132, 133, 134, 138, 139, 146, 147, 148, 149, 150, 151, 152, 153, 154, 178, 181, 184, 185, 186, 241, 242, 244, 245, 246, 247, 248, 255, 256, 257, 267, 268, 269]
      //Input_0_List<OmsCartItem>: stack2
      //Assert: assertFalse(method_result.isEmpty());
      
      OmsPromotionServiceImpl omsPromotionServiceImpl0 = new OmsPromotionServiceImpl();
      ArrayList<PromotionProduct> arrayList0 = new ArrayList<PromotionProduct>();
      Long long0 = new Long(1495L);
      Integer integer0 = new Integer(4);
      Stack<PmsSkuStock> stack0 = new Stack<PmsSkuStock>();
      BigDecimal bigDecimal0 = new BigDecimal((long) 4);
      //mock pmsSkuStock0
      PmsSkuStock pmsSkuStock0 = mock(PmsSkuStock.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long0).when(pmsSkuStock0).getId();
      doReturn(integer0).when(pmsSkuStock0).getLockStock();
      doReturn(bigDecimal0, bigDecimal0).when(pmsSkuStock0).getPrice();
      doReturn(integer0).when(pmsSkuStock0).getStock();
      doReturn("", "10").when(pmsSkuStock0).toString();
      
      stack0.add(pmsSkuStock0);
      Stack<PmsProductFullReduction> stack1 = new Stack<PmsProductFullReduction>();
      //mock pmsProductFullReduction0
      PmsProductFullReduction pmsProductFullReduction0 = mock(PmsProductFullReduction.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0, bigDecimal0, bigDecimal0).when(pmsProductFullReduction0).getFullPrice();
      doReturn(bigDecimal0, bigDecimal0).when(pmsProductFullReduction0).getReducePrice();
      doReturn("0").when(pmsProductFullReduction0).toString();
      
      stack1.add(pmsProductFullReduction0);
      //mock pmsProductFullReduction1
      PmsProductFullReduction pmsProductFullReduction1 = mock(PmsProductFullReduction.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0).when(pmsProductFullReduction1).getFullPrice();
      
      stack1.add(pmsProductFullReduction1);
      //mock promotionProduct0
      PromotionProduct promotionProduct0 = mock(PromotionProduct.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(promotionProduct0).getGiftGrowth();
      doReturn(integer0).when(promotionProduct0).getGiftPoint();
      doReturn(long0, long0).when(promotionProduct0).getId();
      doReturn(integer0).when(promotionProduct0).getPromotionType();
      doReturn("", "", "").when(promotionProduct0).toString();
      doReturn(stack1).when(promotionProduct0).getProductFullReductionList();
      doReturn(stack0, stack0).when(promotionProduct0).getSkuStockList();
      
      arrayList0.add(promotionProduct0);
      //mock portalProductDao0
      PortalProductDao portalProductDao0 = mock(PortalProductDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(portalProductDao0).getPromotionProductList(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) OmsPromotionServiceImpl.class, omsPromotionServiceImpl0, "portalProductDao", (Object) portalProductDao0);
      Stack<OmsCartItem> stack2 = new Stack<OmsCartItem>();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("<]2<g#").when(date0).toString();
      //mock date1
      Date date1 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("GATEWAY_TIMEOUT").when(date1).toString();
      //mock omsCartItem0
      OmsCartItem omsCartItem0 = mock(OmsCartItem.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date0).when(omsCartItem0).getCreateDate();
      doReturn(integer0).when(omsCartItem0).getDeleteStatus();
      doReturn(long0).when(omsCartItem0).getId();
      doReturn(long0).when(omsCartItem0).getMemberId();
      doReturn("10").when(omsCartItem0).getMemberNickname();
      doReturn(date1).when(omsCartItem0).getModifyDate();
      doReturn(bigDecimal0).when(omsCartItem0).getPrice();
      doReturn("3").when(omsCartItem0).getProductAttr();
      doReturn("com.macro.mall.model.SmsCoupon").when(omsCartItem0).getProductBrand();
      doReturn(long0).when(omsCartItem0).getProductCategoryId();
      doReturn(long0, long0, long0, long0, long0).when(omsCartItem0).getProductId();
      doReturn("]($.i642j").when(omsCartItem0).getProductName();
      doReturn("wofbHUk").when(omsCartItem0).getProductPic();
      doReturn("reactor.core.publisher.FluxTimeout$TimeoutTimeoutSubscriber").when(omsCartItem0).getProductSkuCode();
      doReturn(long0, long0, long0).when(omsCartItem0).getProductSkuId();
      doReturn("0").when(omsCartItem0).getProductSn();
      doReturn(" V57G;i*(W [d").when(omsCartItem0).getProductSubTitle();
      doReturn(integer0, integer0).when(omsCartItem0).getQuantity();
      doReturn("").when(omsCartItem0).toString();
      
      stack2.add(omsCartItem0);
      
      //Call method: calcCartPromotion
      List<CartPromotionItem> list0 = omsPromotionServiceImpl0.calcCartPromotion(stack2);
      
      //Test Result Assert
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_getProductFullReduction_7()  throws Throwable  {
      //caseID:5c6d83365501f6923c43ed66a492906e
      //CoveredLines: [25, 178, 184, 185, 188, 189]
      //Input_0_BigDecimal: 0.0
      //Input_1_List<com.macro.mall.model.PmsProductFullReduction>: arrayList0
      //Assert: assertNull(method_result);
      
      OmsPromotionServiceImpl omsPromotionServiceImpl0 = new OmsPromotionServiceImpl();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      ArrayList<PmsProductFullReduction> arrayList0 = new ArrayList<PmsProductFullReduction>();
      BigDecimal bigDecimal1 = BigDecimal.TEN;
      //mock pmsProductFullReduction0
      PmsProductFullReduction pmsProductFullReduction0 = mock(PmsProductFullReduction.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal1).when(pmsProductFullReduction0).getFullPrice();
      
      arrayList0.add(pmsProductFullReduction0);
      
      //Call method: getProductFullReduction
      Object object0 = PrivateAccess.callMethod((Class<OmsPromotionServiceImpl>) OmsPromotionServiceImpl.class, omsPromotionServiceImpl0, "getProductFullReduction", (Object) bigDecimal0, (Class<?>) BigDecimal.class, (Object) arrayList0, (Class<?>) List.class);
      
      //Test Result Assert
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_getProductLadder_8()  throws Throwable  {
      //caseID:c8c5ae356bf549886c26ef49346e3cb7
      //CoveredLines: [25, 212, 215, 218, 219, 222, 223]
      //Input_0_int: 52
      //Input_1_List<com.macro.mall.model.PmsProductLadder>: vector0
      //Assert: assertNull(method_result);
      
      OmsPromotionServiceImpl omsPromotionServiceImpl0 = new OmsPromotionServiceImpl();
      Vector<PmsProductLadder> vector0 = new Vector<PmsProductLadder>();
      Integer integer0 = new Integer(202);
      //mock pmsProductLadder0
      PmsProductLadder pmsProductLadder0 = mock(PmsProductLadder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0, integer0).when(pmsProductLadder0).getCount();
      
      vector0.add(pmsProductLadder0);
      //mock pmsProductLadder1
      PmsProductLadder pmsProductLadder1 = mock(PmsProductLadder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0, integer0).when(pmsProductLadder1).getCount();
      
      vector0.add(pmsProductLadder1);
      
      //Call method: getProductLadder
      Object object0 = PrivateAccess.callMethod((Class<OmsPromotionServiceImpl>) OmsPromotionServiceImpl.class, omsPromotionServiceImpl0, "getProductLadder", (Object) 52, (Class<?>) int.class, (Object) vector0, (Class<?>) List.class);
      
      //Test Result Assert
      assertNull(object0);
  }
}
