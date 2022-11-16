/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.demo.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.demo.controller.DemoController;
import com.macro.mall.demo.dto.PmsBrandDto;
import com.macro.mall.demo.service.DemoService;
import com.macro.mall.model.PmsBrand;
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DemoController_SSTest extends DemoController_SSTest_scaffolding {
// allCoveredLines:[24, 34, 42, 43, 44, 45, 47, 48, 50, 58, 59, 60, 61, 63, 64, 66, 73, 74, 75, 76, 78, 79, 88, 89, 96]

  @Test(timeout = 4000)
  public void test_brand_0()  throws Throwable  {
      //caseID:f5ca41b11922138644fc80b8a048904b
      //CoveredLines: [24, 96]
      //Input_0_Long: 135L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      DemoController demoController0 = new DemoController();
      //mock demoService0
      DemoService demoService0 = mock(DemoService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) DemoController.class, demoController0, "demoService", (Object) demoService0);
      Long long0 = new Long(135L);
      
      //Call method: brand
      CommonResult<PmsBrand> commonResult0 = demoController0.brand(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_createBrand_1()  throws Throwable  {
      //caseID:f8d3d9d4be7ddb270694e1e490e3538e
      //CoveredLines: [24, 42, 43, 44, 45, 50]
      //Input_0_PmsBrandDto: {}
      //Assert: assertEquals(200L, method_result.getCode());
      
      DemoController demoController0 = new DemoController();
      //mock demoService0
      DemoService demoService0 = mock(DemoService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(demoService0).createBrand(any(com.macro.mall.demo.dto.PmsBrandDto.class));
      PrivateAccess.setVariable((Class<?>) DemoController.class, demoController0, "demoService", (Object) demoService0);
      //mock pmsBrandDto0
      PmsBrandDto pmsBrandDto0 = mock(PmsBrandDto.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: createBrand
      CommonResult commonResult0 = demoController0.createBrand(pmsBrandDto0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_createBrand_2()  throws Throwable  {
      //caseID:763f2d1eb6eba5ba699bc6092823529d
      //CoveredLines: [24, 42, 43, 47, 48, 50]
      //Input_0_PmsBrandDto: {}
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      DemoController demoController0 = new DemoController();
      //mock demoService0
      DemoService demoService0 = mock(DemoService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) DemoController.class, demoController0, "demoService", (Object) demoService0);
      //mock pmsBrandDto0
      PmsBrandDto pmsBrandDto0 = mock(PmsBrandDto.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: createBrand
      CommonResult commonResult0 = demoController0.createBrand(pmsBrandDto0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_deleteBrand_3()  throws Throwable  {
      //caseID:9db54c30292afb7ce45b59c75aa95583
      //CoveredLines: [24, 73, 74, 75, 76]
      //Input_0_Long: 1
      //Assert: assertEquals(200L, method_result.getCode());
      
      DemoController demoController0 = new DemoController();
      //mock demoService0
      DemoService demoService0 = mock(DemoService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(demoService0).deleteBrand(anyLong());
      PrivateAccess.setVariable((Class<?>) DemoController.class, demoController0, "demoService", (Object) demoService0);
      Long long0 = new Long(1);
      
      //Call method: deleteBrand
      CommonResult commonResult0 = demoController0.deleteBrand(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_deleteBrand_4()  throws Throwable  {
      //caseID:8b7008510763de1cfb32c361aebb52cd
      //CoveredLines: [24, 73, 74, 78, 79]
      //Input_0_Long: 609L
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      DemoController demoController0 = new DemoController();
      //mock demoService0
      DemoService demoService0 = mock(DemoService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) DemoController.class, demoController0, "demoService", (Object) demoService0);
      Long long0 = new Long(609L);
      
      //Call method: deleteBrand
      CommonResult commonResult0 = demoController0.deleteBrand(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_getBrandList_5()  throws Throwable  {
      //caseID:c439dcbd0c02383580bb3d4b2728e88b
      //CoveredLines: [24, 34]
      //Assert: assertEquals(200L, method_result.getCode());
      
      DemoController demoController0 = new DemoController();
      //mock demoService0
      DemoService demoService0 = mock(DemoService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) DemoController.class, demoController0, "demoService", (Object) demoService0);
      
      //Call method: getBrandList
      CommonResult<List<PmsBrand>> commonResult0 = demoController0.getBrandList();
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_listBrand_6()  throws Throwable  {
      //caseID:a7b23d8af9d44e3e05d32fdaf963d425
      //CoveredLines: [24, 88, 89]
      //Input_0_Integer: (-6)
      //Input_1_Integer: (-6)
      //Assert: assertEquals(200L, method_result.getCode());
      
      DemoController demoController0 = new DemoController();
      ArrayList<PmsBrand> arrayList0 = new ArrayList<PmsBrand>();
      //mock demoService0
      DemoService demoService0 = mock(DemoService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(demoService0).listBrand(anyInt() , anyInt());
      PrivateAccess.setVariable((Class<?>) DemoController.class, demoController0, "demoService", (Object) demoService0);
      Integer integer0 = new Integer((-6));
      
      //Call method: listBrand
      CommonResult<CommonPage<PmsBrand>> commonResult0 = demoController0.listBrand(integer0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateBrand_7()  throws Throwable  {
      //caseID:632559c4ef6be14593c52b5d53ae657a
      //CoveredLines: [24, 58, 59, 60, 61, 66]
      //Input_0_Long: 1
      //Input_1_PmsBrandDto: {}
      //Assert: assertEquals(200L, method_result.getCode());
      
      DemoController demoController0 = new DemoController();
      //mock demoService0
      DemoService demoService0 = mock(DemoService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(demoService0).updateBrand(anyLong() , any(com.macro.mall.demo.dto.PmsBrandDto.class));
      PrivateAccess.setVariable((Class<?>) DemoController.class, demoController0, "demoService", (Object) demoService0);
      Long long0 = new Long(1);
      //mock pmsBrandDto0
      PmsBrandDto pmsBrandDto0 = mock(PmsBrandDto.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: updateBrand
      CommonResult commonResult0 = demoController0.updateBrand(long0, pmsBrandDto0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateBrand_8()  throws Throwable  {
      //caseID:ceef63a1c86abdfede1601b54ba50499
      //CoveredLines: [24, 58, 59, 63, 64, 66]
      //Input_0_Long: 1105L
      //Input_1_PmsBrandDto: {}
      //Assert: assertEquals("\u64CD\u4F5C\u5931\u8D25", method_result.getMessage());
      
      DemoController demoController0 = new DemoController();
      //mock demoService0
      DemoService demoService0 = mock(DemoService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) DemoController.class, demoController0, "demoService", (Object) demoService0);
      Long long0 = new Long(1105L);
      //mock pmsBrandDto0
      PmsBrandDto pmsBrandDto0 = mock(PmsBrandDto.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: updateBrand
      CommonResult commonResult0 = demoController0.updateBrand(long0, pmsBrandDto0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u5931\u8D25", commonResult0.getMessage());
  }
}
