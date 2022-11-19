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
public class PmsBrandServiceImpl_SSTest extends PmsBrandServiceImpl_SSTest_scaffolding {
// allCoveredLines:[24, 32, 37, 38, 40, 43, 48, 49, 50, 52, 56, 57, 58, 59, 60, 61, 66, 71, 72, 73, 78, 79, 80, 81, 82, 83, 85, 90, 95, 96, 97, 98, 99, 104, 105, 106, 107, 108]

  @Test(timeout = 4000)
  public void test_createBrand_0()  throws Throwable  {
      //caseID:c88373949fb7eaf195da519fdea811cc
      //CoveredLines: [24, 37, 38, 40, 43]
      //Input_0_PmsBrandParam: {getSort=2022, getLogo=\"$%kuc<^#>o6\", getName=\"$%kuc<^#>o6\", getShowStatus=2022, getFactoryStatus=2022, getBrandStory=\"$%kuc<^#>o6\", getBigPic=\"$%kuc<^#>o6\", getFirstLetter=\"$%kuc<^#>o6\"}
      //Assert: assertEquals(2022, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2022).when(pmsBrandMapper0).insertSelective(any(com.macro.mall.model.PmsBrand.class));
      
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Integer integer0 = new Integer(2022);
      //mock pmsBrandParam0
      PmsBrandParam pmsBrandParam0 = mock(PmsBrandParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("$%kuc<^#>o6").when(pmsBrandParam0).getBigPic();
      doReturn("$%kuc<^#>o6").when(pmsBrandParam0).getBrandStory();
      doReturn(integer0).when(pmsBrandParam0).getFactoryStatus();
      doReturn("$%kuc<^#>o6").when(pmsBrandParam0).getFirstLetter();
      doReturn("$%kuc<^#>o6").when(pmsBrandParam0).getLogo();
      doReturn("$%kuc<^#>o6").when(pmsBrandParam0).getName();
      doReturn(integer0).when(pmsBrandParam0).getShowStatus();
      doReturn(integer0).when(pmsBrandParam0).getSort();
      
      //Call method: createBrand
      int int0 = pmsBrandServiceImpl0.createBrand(pmsBrandParam0);
      
      //Test Result Assert
      assertEquals(2022, int0);
  }

  @Test(timeout = 4000)
  public void test_deleteBrand_1()  throws Throwable  {
      //caseID:ced932d2aa190405c45d3ef55a87b86a
      //CoveredLines: [24, 66]
      //Input_0_Long: 1000L
      //Assert: assertEquals(0, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Long long0 = new Long(1000L);
      
      //Call method: deleteBrand
      int int0 = pmsBrandServiceImpl0.deleteBrand(long0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_deleteBrand_2()  throws Throwable  {
      //caseID:2ed570ff7e4b67cba7f6d327169ec933
      //CoveredLines: [24, 71, 72, 73]
      //Input_0_List<Long>: stack0
      //Assert: assertEquals(0, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Stack<Long> stack0 = new Stack<Long>();
      
      //Call method: deleteBrand
      int int0 = pmsBrandServiceImpl0.deleteBrand((List<Long>) stack0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_getBrand_3()  throws Throwable  {
      //caseID:59a317a49054aa1735ea1065cfcc67d5
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
  public void test_listAllBrand_4()  throws Throwable  {
      //caseID:2027ea75b1fbf9cb6425de03e87a59e0
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
  public void test_listBrand_5()  throws Throwable  {
      //caseID:bdde1e2fee9675ca60c71166bcf59da4
      //CoveredLines: [24, 78, 79, 80, 81, 82, 85]
      //Input_0_String: 
      //Input_1_int: 1
      //Input_2_int: 415
      //Assert: assertNull(method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      
      //Call method: listBrand
      List<PmsBrand> list0 = pmsBrandServiceImpl0.listBrand("", 1, 415);
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_listBrand_6()  throws Throwable  {
      //caseID:3037ca71b0fd18303659d707a9560ccb
      //CoveredLines: [24, 78, 79, 80, 81, 82, 83, 85]
      //Input_0_String: SUBSCRIBE
      //Input_1_int: 1
      //Input_2_int: 1
      //Assert: assertNull(method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      
      //Call method: listBrand
      List<PmsBrand> list0 = pmsBrandServiceImpl0.listBrand("SUBSCRIBE", 1, 1);
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_updateBrand_7()  throws Throwable  {
      //caseID:f3f2a81d814bafc09fcdd9a626af8fc8
      //CoveredLines: [24, 48, 49, 50, 52, 56, 57, 58, 59, 60, 61]
      //Input_0_Long: 1
      //Input_1_PmsBrandParam: {getSort=1, getLogo=\"^G;\", getName=\"^G;\", getShowStatus=1, getFactoryStatus=1, getBrandStory=\"^G;\", getBigPic=\"^G;\", getFirstLetter=\"^G;\"}
      //Assert: assertEquals(1, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(pmsBrandMapper0).updateByPrimaryKeySelective(any(com.macro.mall.model.PmsBrand.class));
      //mock pmsProductMapper0
      PmsProductMapper pmsProductMapper0 = mock(PmsProductMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(pmsProductMapper0).updateByExampleSelective(any(com.macro.mall.model.PmsProduct.class) , any(com.macro.mall.model.PmsProductExample.class));
      
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "productMapper", (Object) pmsProductMapper0);
      
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Long long0 = new Long(1);
      Integer integer0 = new Integer(1);
      //mock pmsBrandParam0
      PmsBrandParam pmsBrandParam0 = mock(PmsBrandParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("^G;").when(pmsBrandParam0).getBigPic();
      doReturn("^G;").when(pmsBrandParam0).getBrandStory();
      doReturn(integer0).when(pmsBrandParam0).getFactoryStatus();
      doReturn("^G;").when(pmsBrandParam0).getFirstLetter();
      doReturn("^G;").when(pmsBrandParam0).getLogo();
      doReturn("^G;").when(pmsBrandParam0).getName();
      doReturn(integer0).when(pmsBrandParam0).getShowStatus();
      doReturn(integer0).when(pmsBrandParam0).getSort();
      
      //Call method: updateBrand
      int int0 = pmsBrandServiceImpl0.updateBrand(long0, pmsBrandParam0);
      
      //Test Result Assert
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_updateFactoryStatus_8()  throws Throwable  {
      //caseID:a0e97767d8c4a1f57e6e09bd788c0d26
      //CoveredLines: [24, 104, 105, 106, 107, 108]
      //Input_0_List<Long>: stack0
      //Input_1_Integer: 0
      //Assert: assertEquals(0, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Stack<Long> stack0 = new Stack<Long>();
      Integer integer0 = new Integer(0);
      
      //Call method: updateFactoryStatus
      int int0 = pmsBrandServiceImpl0.updateFactoryStatus(stack0, integer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_updateShowStatus_9()  throws Throwable  {
      //caseID:904c4fb6c07e2d19154a4170e36a9b2c
      //CoveredLines: [24, 95, 96, 97, 98, 99]
      //Input_0_List<Long>: vector0
      //Input_1_Integer: (-1)
      //Assert: assertEquals(0, method_result);
      
      PmsBrandServiceImpl pmsBrandServiceImpl0 = new PmsBrandServiceImpl();
      //mock pmsBrandMapper0
      PmsBrandMapper pmsBrandMapper0 = mock(PmsBrandMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) PmsBrandServiceImpl.class, pmsBrandServiceImpl0, "brandMapper", (Object) pmsBrandMapper0);
      Vector<Long> vector0 = new Vector<Long>();
      Integer integer0 = new Integer((-1));
      
      //Call method: updateShowStatus
      int int0 = pmsBrandServiceImpl0.updateShowStatus(vector0, integer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }
}
