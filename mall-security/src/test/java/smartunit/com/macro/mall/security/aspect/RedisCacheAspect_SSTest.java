/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.security.aspect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.security.aspect.RedisCacheAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RedisCacheAspect_SSTest extends RedisCacheAspect_SSTest_scaffolding {
// allCoveredLines:[24, 29, 33, 34, 35, 36, 38, 46, 47]

  @Test(timeout = 4000)
  public void test_cacheAspect_0()  throws Throwable  {
      //caseID:1a645ac75cb8f247d33eda06b0b97de2
      //CoveredLines: [24, 29]
      
      RedisCacheAspect redisCacheAspect0 = new RedisCacheAspect();
      
      //Call method: cacheAspect
      redisCacheAspect0.cacheAspect();
  }

  @Test(timeout = 4000)
  public void test_doAround_1()  throws Throwable  {
      //caseID:8a6f826d69a19f47cd17a56f0e383feb
      //CoveredLines: [24, 33, 34, 35, 36, 38, 46, 47]
      //Input_0_ProceedingJoinPoint: {getSignature=methodSignature0}
      //Assert: assertNull(method_result);
      
      RedisCacheAspect redisCacheAspect0 = new RedisCacheAspect();
      //mock methodSignature0
      MethodSignature methodSignature0 = mock(MethodSignature.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock proceedingJoinPoint0
      ProceedingJoinPoint proceedingJoinPoint0 = mock(ProceedingJoinPoint.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(methodSignature0).when(proceedingJoinPoint0).getSignature();
      
      //Call method: doAround
      Object object0 = redisCacheAspect0.doAround(proceedingJoinPoint0);
      
      //Test Result Assert
      assertNull(object0);
  }
}
