/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.dao.PmsProductCategoryAttributeRelationDao;
import com.macro.mall.dao.PmsProductCategoryDao;
import com.macro.mall.dto.PmsProductCategoryParam;
import com.macro.mall.dto.PmsProductCategoryWithChildrenItem;
import com.macro.mall.mapper.PmsProductCategoryAttributeRelationMapper;
import com.macro.mall.mapper.PmsProductCategoryMapper;
import com.macro.mall.mapper.PmsProductMapper;
import com.macro.mall.model.PmsProductCategory;
import com.macro.mall.service.impl.PmsProductCategoryServiceImpl;
import java.util.ArrayList;
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
public class PmsProductCategoryServiceImpl_SSTest extends PmsProductCategoryServiceImpl_SSTest_scaffolding {
// allCoveredLines:[26, 39, 40, 41, 43, 44, 46, 47, 48, 50, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 72, 73, 74, 76, 77, 78, 79, 80, 82, 83, 84, 85, 86, 87, 88, 89, 90, 92, 97, 98, 99, 100, 101, 106, 111, 116, 117, 118, 119, 120, 125, 126, 127, 128, 129, 134, 142, 143, 146, 147, 148, 150, 153]

  @Test(timeout = 4000)
  public void test_create_00()  throws Throwable  {
      //caseID:a30291775388a73023996c42f06167a3
      //CoveredLines: [26, 39, 40, 41, 43, 44, 46, 47, 50, 142, 143, 153]
      //Input_0_PmsProductCategoryParam: {getSort=0, getName=\"channelInactive\", getProductUnit=\"channelInactive\", getShowStatus=0, getNavStatus=0, getKeywords=\"channelInactive\", getDescription=\"channelInactive\", getParentId=0, getIcon=\"channelInactive\", getProductAttributeIdList=vector0}
      //Assert: assertEquals(0, method_result);
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryMapper0
      PmsProductCategoryMapper pmsProductCategoryMapper0 = mock(PmsProductCategoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(pmsProductCategoryMapper0).insertSelective(any(com.macro.mall.model.PmsProductCategory.class));
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryMapper", (Object) pmsProductCategoryMapper0);
      Integer integer0 = new Integer(0);
      Long long0 = new Long(0);
      Vector<Long> vector0 = new Vector<Long>();
      //mock pmsProductCategoryParam0
      PmsProductCategoryParam pmsProductCategoryParam0 = mock(PmsProductCategoryParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("channelInactive").when(pmsProductCategoryParam0).getDescription();
      doReturn("channelInactive").when(pmsProductCategoryParam0).getIcon();
      doReturn("channelInactive").when(pmsProductCategoryParam0).getKeywords();
      doReturn("channelInactive").when(pmsProductCategoryParam0).getName();
      doReturn(integer0).when(pmsProductCategoryParam0).getNavStatus();
      doReturn(long0).when(pmsProductCategoryParam0).getParentId();
      doReturn(vector0).when(pmsProductCategoryParam0).getProductAttributeIdList();
      doReturn("channelInactive").when(pmsProductCategoryParam0).getProductUnit();
      doReturn(integer0).when(pmsProductCategoryParam0).getShowStatus();
      doReturn(integer0).when(pmsProductCategoryParam0).getSort();
      
      //Call method: create
      int int0 = pmsProductCategoryServiceImpl0.create(pmsProductCategoryParam0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_create_01()  throws Throwable  {
      //caseID:0f51c0bc481e2185cb020a5545c3bd92
      //CoveredLines: [26, 39, 40, 41, 43, 44, 46, 47, 48, 50, 59, 60, 61, 62, 63, 64, 65, 66, 67, 142, 146, 147, 148, 153]
      //Input_0_PmsProductCategoryParam: {getSort=721, getName=\"channelInactive\", getProductUnit=\"channelInactive\", getShowStatus=721, getNavStatus=721, getKeywords=\"channelInactive\", getDescription=\"channelInactive\", getParentId=21, getIcon=\"channelInactive\", getProductAttributeIdList=vector0}
      //Assert: assertEquals(2146659910, method_result);
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryAttributeRelationDao0
      PmsProductCategoryAttributeRelationDao pmsProductCategoryAttributeRelationDao0 = mock(PmsProductCategoryAttributeRelationDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(pmsProductCategoryAttributeRelationDao0).insertList(ArgumentMatchers.<com.macro.mall.model.PmsProductCategoryAttributeRelation>anyList());
      Integer integer0 = new Integer(721);
      //mock pmsProductCategory0
      PmsProductCategory pmsProductCategory0 = mock(PmsProductCategory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(pmsProductCategory0).getLevel();
      //mock pmsProductCategoryMapper0
      PmsProductCategoryMapper pmsProductCategoryMapper0 = mock(PmsProductCategoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2146659910).when(pmsProductCategoryMapper0).insertSelective(any(com.macro.mall.model.PmsProductCategory.class));
      doReturn(pmsProductCategory0).when(pmsProductCategoryMapper0).selectByPrimaryKey(anyLong());
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryMapper", (Object) pmsProductCategoryMapper0);
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryAttributeRelationDao", (Object) pmsProductCategoryAttributeRelationDao0);
      Long long0 = new Long(21);
      Vector<Long> vector0 = new Vector<Long>();
      
      vector0.add(long0);
      //mock pmsProductCategoryParam0
      PmsProductCategoryParam pmsProductCategoryParam0 = mock(PmsProductCategoryParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("channelInactive").when(pmsProductCategoryParam0).getDescription();
      doReturn("channelInactive").when(pmsProductCategoryParam0).getIcon();
      doReturn("channelInactive").when(pmsProductCategoryParam0).getKeywords();
      doReturn("channelInactive").when(pmsProductCategoryParam0).getName();
      doReturn(integer0).when(pmsProductCategoryParam0).getNavStatus();
      doReturn(long0).when(pmsProductCategoryParam0).getParentId();
      doReturn(vector0).when(pmsProductCategoryParam0).getProductAttributeIdList();
      doReturn("channelInactive").when(pmsProductCategoryParam0).getProductUnit();
      doReturn(integer0).when(pmsProductCategoryParam0).getShowStatus();
      doReturn(integer0).when(pmsProductCategoryParam0).getSort();
      
      //Call method: create
      int int0 = pmsProductCategoryServiceImpl0.create(pmsProductCategoryParam0);
      
      //Test Result Assert
      assertEquals(2146659910, int0);
  }

  @Test(timeout = 4000)
  public void test_delete_02()  throws Throwable  {
      //caseID:ee26450533d2d0ad43e9e9dcc5cabb1e
      //CoveredLines: [26, 106]
      //Input_0_Long: (-1L)
      //Assert: assertEquals(0, method_result);
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryMapper0
      PmsProductCategoryMapper pmsProductCategoryMapper0 = mock(PmsProductCategoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryMapper", (Object) pmsProductCategoryMapper0);
      Long long0 = new Long((-1L));
      
      //Call method: delete
      int int0 = pmsProductCategoryServiceImpl0.delete(long0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_getItem_03()  throws Throwable  {
      //caseID:1e47d8777097a2542df4d64ba72ea6ef
      //CoveredLines: [26, 111]
      //Input_0_Long: 2348L
      //Assert: assertNull(method_result);
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryMapper0
      PmsProductCategoryMapper pmsProductCategoryMapper0 = mock(PmsProductCategoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryMapper", (Object) pmsProductCategoryMapper0);
      Long long0 = new Long(2348L);
      
      //Call method: getItem
      PmsProductCategory pmsProductCategory0 = pmsProductCategoryServiceImpl0.getItem(long0);
      
      //Test Result Assert
      assertNull(pmsProductCategory0);
  }

  @Test(timeout = 4000)
  public void test_getList_04()  throws Throwable  {
      //caseID:527b008ef1d20337f1c4bc9536a46158
      //CoveredLines: [26, 97, 98, 99, 100, 101]
      //Input_0_Long: 0L
      //Input_1_Integer: 8232
      //Input_2_Integer: 8232
      //Assert: assertNull(method_result);
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryMapper0
      PmsProductCategoryMapper pmsProductCategoryMapper0 = mock(PmsProductCategoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryMapper", (Object) pmsProductCategoryMapper0);
      Long long0 = new Long(0L);
      Integer integer0 = new Integer(8232);
      
      //Call method: getList
      List<PmsProductCategory> list0 = pmsProductCategoryServiceImpl0.getList(long0, integer0, integer0);
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_listWithChildren_05()  throws Throwable  {
      //caseID:9037629cd09961d7a47b57482d01a89b
      //CoveredLines: [26, 134]
      //Assert: assertNull(method_result);
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryDao0
      PmsProductCategoryDao pmsProductCategoryDao0 = mock(PmsProductCategoryDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryDao", (Object) pmsProductCategoryDao0);
      
      //Call method: listWithChildren
      List<PmsProductCategoryWithChildrenItem> list0 = pmsProductCategoryServiceImpl0.listWithChildren();
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_setCategoryLevel_06()  throws Throwable  {
      //caseID:9253f7c663230b389537cbf3fc95f3c7
      //CoveredLines: [26, 142, 146, 147, 150, 153]
      //Input_0_com.macro.mall.model.PmsProductCategory: {getParentId=1381L}
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryMapper0
      PmsProductCategoryMapper pmsProductCategoryMapper0 = mock(PmsProductCategoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryMapper", (Object) pmsProductCategoryMapper0);
      Long long0 = new Long(1381L);
      //mock pmsProductCategory0
      PmsProductCategory pmsProductCategory0 = mock(PmsProductCategory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(pmsProductCategory0).getParentId();
      
      //Call method: setCategoryLevel
      PrivateAccess.callMethod((Class<PmsProductCategoryServiceImpl>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "setCategoryLevel", (Object) pmsProductCategory0, (Class<?>) PmsProductCategory.class);
  }

  @Test(timeout = 4000)
  public void test_update_07()  throws Throwable  {
      //caseID:cc1d9cbb29aa980a2514d121722f165e
      //CoveredLines: [26, 71, 72, 73, 74, 76, 77, 78, 79, 80, 82, 88, 89, 90, 92, 142, 143, 153]
      //Input_0_Long: 0L
      //Input_1_PmsProductCategoryParam: {getSort=1, getName=\"\", getProductUnit=\"\", getShowStatus=1, getNavStatus=1, getKeywords=\"\", getDescription=\"\", getParentId=0L, getIcon=\"\", getProductAttributeIdList=stack0}
      //Assert: assertEquals(1, method_result);
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryAttributeRelationMapper0
      PmsProductCategoryAttributeRelationMapper pmsProductCategoryAttributeRelationMapper0 = mock(PmsProductCategoryAttributeRelationMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(pmsProductCategoryAttributeRelationMapper0).deleteByExample(any(com.macro.mall.model.PmsProductCategoryAttributeRelationExample.class));
      //mock pmsProductCategoryMapper0
      PmsProductCategoryMapper pmsProductCategoryMapper0 = mock(PmsProductCategoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(pmsProductCategoryMapper0).updateByPrimaryKeySelective(any(com.macro.mall.model.PmsProductCategory.class));
      //mock pmsProductMapper0
      PmsProductMapper pmsProductMapper0 = mock(PmsProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(pmsProductMapper0).updateByExampleSelective(any(com.macro.mall.model.PmsProduct.class) , any(com.macro.mall.model.PmsProductExample.class));
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productMapper", (Object) pmsProductMapper0);
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryMapper", (Object) pmsProductCategoryMapper0);
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryAttributeRelationMapper", (Object) pmsProductCategoryAttributeRelationMapper0);
      Long long0 = new Long(0L);
      Integer integer0 = new Integer(1);
      Stack<Long> stack0 = new Stack<Long>();
      //mock pmsProductCategoryParam0
      PmsProductCategoryParam pmsProductCategoryParam0 = mock(PmsProductCategoryParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(pmsProductCategoryParam0).getDescription();
      doReturn("").when(pmsProductCategoryParam0).getIcon();
      doReturn("").when(pmsProductCategoryParam0).getKeywords();
      doReturn("").when(pmsProductCategoryParam0).getName();
      doReturn(integer0).when(pmsProductCategoryParam0).getNavStatus();
      doReturn(long0).when(pmsProductCategoryParam0).getParentId();
      doReturn(stack0).when(pmsProductCategoryParam0).getProductAttributeIdList();
      doReturn("").when(pmsProductCategoryParam0).getProductUnit();
      doReturn(integer0).when(pmsProductCategoryParam0).getShowStatus();
      doReturn(integer0).when(pmsProductCategoryParam0).getSort();
      
      //Call method: update
      int int0 = pmsProductCategoryServiceImpl0.update(long0, pmsProductCategoryParam0);
      
      //Test Result Assert
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_update_08()  throws Throwable  {
      //caseID:cdd37b47287e244feef53090362c2c2e
      //CoveredLines: [26, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 72, 73, 74, 76, 77, 78, 79, 80, 82, 83, 84, 85, 86, 87, 92, 142, 143, 153]
      //Input_0_Long: 0L
      //Input_1_PmsProductCategoryParam: {getSort=1, getName=\"\", getProductUnit=\"\", getShowStatus=1, getNavStatus=1, getKeywords=\"\", getDescription=\"\", getParentId=0L, getIcon=\"\", getProductAttributeIdList=stack0}
      //Assert: assertEquals(1, method_result);
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryAttributeRelationDao0
      PmsProductCategoryAttributeRelationDao pmsProductCategoryAttributeRelationDao0 = mock(PmsProductCategoryAttributeRelationDao.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock pmsProductCategoryAttributeRelationMapper0
      PmsProductCategoryAttributeRelationMapper pmsProductCategoryAttributeRelationMapper0 = mock(PmsProductCategoryAttributeRelationMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(pmsProductCategoryAttributeRelationMapper0).deleteByExample(any(com.macro.mall.model.PmsProductCategoryAttributeRelationExample.class));
      //mock pmsProductCategoryMapper0
      PmsProductCategoryMapper pmsProductCategoryMapper0 = mock(PmsProductCategoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(pmsProductCategoryMapper0).updateByPrimaryKeySelective(any(com.macro.mall.model.PmsProductCategory.class));
      //mock pmsProductMapper0
      PmsProductMapper pmsProductMapper0 = mock(PmsProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(pmsProductMapper0).updateByExampleSelective(any(com.macro.mall.model.PmsProduct.class) , any(com.macro.mall.model.PmsProductExample.class));
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productMapper", (Object) pmsProductMapper0);
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryMapper", (Object) pmsProductCategoryMapper0);
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryAttributeRelationMapper", (Object) pmsProductCategoryAttributeRelationMapper0);
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryAttributeRelationDao", (Object) pmsProductCategoryAttributeRelationDao0);
      Long long0 = new Long(0L);
      Integer integer0 = new Integer(1);
      Stack<Long> stack0 = new Stack<Long>();
      
      stack0.add(long0);
      //mock pmsProductCategoryParam0
      PmsProductCategoryParam pmsProductCategoryParam0 = mock(PmsProductCategoryParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(pmsProductCategoryParam0).getDescription();
      doReturn("").when(pmsProductCategoryParam0).getIcon();
      doReturn("").when(pmsProductCategoryParam0).getKeywords();
      doReturn("").when(pmsProductCategoryParam0).getName();
      doReturn(integer0).when(pmsProductCategoryParam0).getNavStatus();
      doReturn(long0).when(pmsProductCategoryParam0).getParentId();
      doReturn(stack0).when(pmsProductCategoryParam0).getProductAttributeIdList();
      doReturn("").when(pmsProductCategoryParam0).getProductUnit();
      doReturn(integer0).when(pmsProductCategoryParam0).getShowStatus();
      doReturn(integer0).when(pmsProductCategoryParam0).getSort();
      
      //Call method: update
      int int0 = pmsProductCategoryServiceImpl0.update(long0, pmsProductCategoryParam0);
      
      //Test Result Assert
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_updateNavStatus_09()  throws Throwable  {
      //caseID:edaa0035574128a469b32c96cda4322b
      //CoveredLines: [26, 116, 117, 118, 119, 120]
      //Input_0_List<Long>: arrayList0
      //Input_1_Integer: 0
      //Assert: assertEquals(0, method_result);
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryMapper0
      PmsProductCategoryMapper pmsProductCategoryMapper0 = mock(PmsProductCategoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryMapper", (Object) pmsProductCategoryMapper0);
      ArrayList<Long> arrayList0 = new ArrayList<Long>();
      Integer integer0 = new Integer(0);
      
      //Call method: updateNavStatus
      int int0 = pmsProductCategoryServiceImpl0.updateNavStatus(arrayList0, integer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_updateShowStatus_10()  throws Throwable  {
      //caseID:7b6e62cf14e79fa4bd22dd952be5d1bd
      //CoveredLines: [26, 125, 126, 127, 128, 129]
      //Input_0_List<Long>: arrayList0
      //Input_1_Integer: 2405
      //Assert: assertEquals(0, method_result);
      
      PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl0 = new PmsProductCategoryServiceImpl();
      //mock pmsProductCategoryMapper0
      PmsProductCategoryMapper pmsProductCategoryMapper0 = mock(PmsProductCategoryMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsProductCategoryServiceImpl.class, pmsProductCategoryServiceImpl0, "productCategoryMapper", (Object) pmsProductCategoryMapper0);
      ArrayList<Long> arrayList0 = new ArrayList<Long>();
      Integer integer0 = new Integer(2405);
      
      //Call method: updateShowStatus
      int int0 = pmsProductCategoryServiceImpl0.updateShowStatus(arrayList0, integer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }
}
