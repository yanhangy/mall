/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.dto.PmsBrandParam;
import com.macro.mall.mapper.PmsBrandMapper;
import com.macro.mall.mapper.PmsProductMapper;
import com.macro.mall.model.PmsBrand;
import com.macro.mall.service.impl.PmsBrandServiceImpl;
import java.util.ArrayList;
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
public class PmsBrandServiceImpl_SSTest extends PmsBrandServiceImpl_SSTest_scaffolding {
// allCoveredLines:[24, 32, 37, 38, 40, 41, 43, 48, 49, 50, 52, 56, 57, 58, 59, 60, 61, 66, 71, 72, 73, 78, 79, 80, 81, 82, 83, 85, 90, 95, 96, 97, 98, 99, 104, 105, 106, 107, 108]

  @Test(timeout = 4000)
  public void test_createBrand_00()  throws Throwable  {
      //caseID:f92875806753222e95305ed2324c77c0
      //CoveredLines: [24, 37, 38, 40, 43]
      //Input_0_PmsBrandParam: {getSort=(-1), getLogo="%", getName="%", getShowStatus=(-1), getFactoryStatus=(-1), getBrandStory="%", getBigPic="%", getFirstLetter="%"}
      //Assert: assertEquals((-1), method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(pmsBrandMapper0).insertSelective(any(com.macro.mall.model.PmsBrand.class));
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Integer integer0 = new Integer((-1));
      //mock pmsBrandParam0
      PmsBrandParam pmsBrandParam0 = mock(PmsBrandParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("%").when(pmsBrandParam0).getBigPic();
      doReturn("%").when(pmsBrandParam0).getBrandStory();
      doReturn(integer0).when(pmsBrandParam0).getFactoryStatus();
      doReturn("%").when(pmsBrandParam0).getFirstLetter();
      doReturn("%").when(pmsBrandParam0).getLogo();
      doReturn("%").when(pmsBrandParam0).getName();
      doReturn(integer0).when(pmsBrandParam0).getShowStatus();
      doReturn(integer0).when(pmsBrandParam0).getSort();
      
      //Call method: createBrand
      int int0 = pmsBrandServiceImpl0.createBrand(pmsBrandParam0);
      
      //Test Result Assert
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_createBrand_01()  throws Throwable  {
      //caseID:1fb476bdb8627d86d11db38b8457b17e
      //CoveredLines: [24, 37, 38, 40, 41, 43]
      //Input_0_PmsBrandParam: {getSort=1, getLogo="1", getName="1", getShowStatus=1, getFactoryStatus=1, getBrandStory="sort desc", getBigPic="1", getFirstLetter=""}
      //Assert: assertEquals(1426, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1426).when(pmsBrandMapper0).insertSelective(any(com.macro.mall.model.PmsBrand.class));
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Integer integer0 = new Integer(1);
      //mock pmsBrandParam0
      PmsBrandParam pmsBrandParam0 = mock(PmsBrandParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1").when(pmsBrandParam0).getBigPic();
      doReturn("sort desc").when(pmsBrandParam0).getBrandStory();
      doReturn(integer0).when(pmsBrandParam0).getFactoryStatus();
      doReturn("").when(pmsBrandParam0).getFirstLetter();
      doReturn("1").when(pmsBrandParam0).getLogo();
      doReturn("1").when(pmsBrandParam0).getName();
      doReturn(integer0).when(pmsBrandParam0).getShowStatus();
      doReturn(integer0).when(pmsBrandParam0).getSort();
      
      //Call method: createBrand
      int int0 = pmsBrandServiceImpl0.createBrand(pmsBrandParam0);
      
      //Test Result Assert
      assertEquals(1426, int0);
  }

  @Test(timeout = 4000)
  public void test_deleteBrand_02()  throws Throwable  {
      //caseID:befdd03d64dc5256d637a4aa77462910
      //CoveredLines: [24, 66]
      //Input_0_Long: 0L
      //Assert: assertEquals(0, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Long long0 = new Long(0L);
      
      //Call method: deleteBrand
      int int0 = pmsBrandServiceImpl0.deleteBrand(long0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_deleteBrand_03()  throws Throwable  {
      //caseID:c14e6eebaa99cb6eec40ac6b02f004d8
      //CoveredLines: [24, 71, 72, 73]
      //Input_0_Long>: arrayList0
      //Assert: assertEquals(0, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      ArrayList<Long> arrayList0 = new ArrayList<Long>();
      
      //Call method: deleteBrand
      int int0 = pmsBrandServiceImpl0.deleteBrand((List<Long>) arrayList0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_getBrand_04()  throws Throwable  {
      //caseID:5965b67f6c44fc51e5444249fbfefe97
      //CoveredLines: [24, 90]
      //Input_0_Long: 0L
      //Assert: assertNull(method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Long long0 = new Long(0L);
      
      //Call method: getBrand
      PmsBrand pmsBrand0 = pmsBrandServiceImpl0.getBrand(long0);
      
      //Test Result Assert
      assertNull(pmsBrand0);
  }

  @Test(timeout = 4000)
  public void test_listAllBrand_05()  throws Throwable  {
      //caseID:0f4248dc4f5551915dd06eee35dde965
      //CoveredLines: [24, 32]
      //Assert: assertNull(method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      
      //Call method: listAllBrand
      List<PmsBrand> list0 = pmsBrandServiceImpl0.listAllBrand();
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_listBrand_06()  throws Throwable  {
      //caseID:ce6eda1166bfd8c7f2e3415604fadd07
      //CoveredLines: [24, 78, 79, 80, 81, 82, 85]
      //Input_0_String: ""
      //Input_1_int: 48
      //Input_2_int: 1
      //Assert: assertEquals(0, method_result.size());
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      Stack<PmsBrand> stack0 = new Stack<PmsBrand>();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(pmsBrandMapper0).selectByExample(any(com.macro.mall.model.PmsBrandExample.class));
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      
      //Call method: listBrand
      List<PmsBrand> list0 = pmsBrandServiceImpl0.listBrand("", 48, 1);
      
      //Test Result Assert
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test_listBrand_07()  throws Throwable  {
      //caseID:201a8cfe331ff6307cea996eaecd2b08
      //CoveredLines: [24, 78, 79, 80, 81, 82, 83, 85]
      //Input_0_String: "%"
      //Input_1_int: 0
      //Input_2_int: 1
      //Assert: assertNull(method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      
      //Call method: listBrand
      List<PmsBrand> list0 = pmsBrandServiceImpl0.listBrand("%", 0, 1);
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_updateBrand_08()  throws Throwable  {
      //caseID:9e9a960b3093f0895b5e72ede5a512b2
      //CoveredLines: [24, 48, 49, 50, 52, 56, 57, 58, 59, 60, 61]
      //Input_0_Long: 1399
      //Input_1_PmsBrandParam: {getSort=1399, getLogo="0", getName="0", getShowStatus=1399, getFactoryStatus=1399, getBrandStory="0", getBigPic="0", getFirstLetter="0"}
      //Assert: assertEquals(1399, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1399).when(pmsBrandMapper0).updateByPrimaryKeySelective(any(com.macro.mall.model.PmsBrand.class));
      //mock pmsProductMapper0
      PmsProductMapper pmsProductMapper0 = mock(PmsProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1399).when(pmsProductMapper0).updateByExampleSelective(any(com.macro.mall.model.PmsProduct.class) , any(com.macro.mall.model.PmsProductExample.class));
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "productMapper", (Object) pmsProductMapper0);
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Long long0 = new Long(1399);
      Integer integer0 = new Integer(1399);
      //mock pmsBrandParam0
      PmsBrandParam pmsBrandParam0 = mock(PmsBrandParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("0").when(pmsBrandParam0).getBigPic();
      doReturn("0").when(pmsBrandParam0).getBrandStory();
      doReturn(integer0).when(pmsBrandParam0).getFactoryStatus();
      doReturn("0").when(pmsBrandParam0).getFirstLetter();
      doReturn("0").when(pmsBrandParam0).getLogo();
      doReturn("0").when(pmsBrandParam0).getName();
      doReturn(integer0).when(pmsBrandParam0).getShowStatus();
      doReturn(integer0).when(pmsBrandParam0).getSort();
      
      //Call method: updateBrand
      int int0 = pmsBrandServiceImpl0.updateBrand(long0, pmsBrandParam0);
      
      //Test Result Assert
      assertEquals(1399, int0);
  }

  @Test(timeout = 4000)
  public void test_updateFactoryStatus_09()  throws Throwable  {
      //caseID:1c4d8bdce0d3406c392705ef725ef28a
      //CoveredLines: [24, 104, 105, 106, 107, 108]
      //Input_0_Long>: stack0
      //Input_1_Integer: 78721
      //Assert: assertEquals(78721, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(78721).when(pmsBrandMapper0).updateByExampleSelective(any(com.macro.mall.model.PmsBrand.class) , any(com.macro.mall.model.PmsBrandExample.class));
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Stack<Long> stack0 = new Stack<Long>();
      Integer integer0 = new Integer(78721);
      
      //Call method: updateFactoryStatus
      int int0 = pmsBrandServiceImpl0.updateFactoryStatus(stack0, integer0);
      
      //Test Result Assert
      assertEquals(78721, int0);
  }

  @Test(timeout = 4000)
  public void test_updateShowStatus_10()  throws Throwable  {
      //caseID:bba77ca338803dd02bd1fb4324239cdb
      //CoveredLines: [24, 95, 96, 97, 98, 99]
      //Input_0_Long>: stack0
      //Input_1_Integer: 215
      //Assert: assertEquals(215, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(215).when(pmsBrandMapper0).updateByExampleSelective(any(com.macro.mall.model.PmsBrand.class) , any(com.macro.mall.model.PmsBrandExample.class));
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Stack<Long> stack0 = new Stack<Long>();
      Integer integer0 = new Integer(215);
      
      //Call method: updateShowStatus
      int int0 = pmsBrandServiceImpl0.updateShowStatus(stack0, integer0);
      
      //Test Result Assert
      assertEquals(215, int0);
  }
}
