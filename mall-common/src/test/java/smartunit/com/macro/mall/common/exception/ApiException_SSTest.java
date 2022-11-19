/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.common.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.common.api.IErrorCode;
import com.macro.mall.common.exception.ApiException;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ApiException_SSTest extends ApiException_SSTest_scaffolding {
// allCoveredLines:[13, 14, 15, 18, 19, 22, 23, 26, 27, 30]

  @Test(timeout = 4000)
  public void test_getErrorCode_0()  throws Throwable  {
      //caseID:4d6c4b7a422aa5783398a6e992e5298d
      //CoveredLines: [22, 23, 30]
      //Assert: assertNull(method_result);
      
      //mock throwable0
      Throwable throwable0 = mock(Throwable.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ApiException apiException0 = new ApiException(throwable0);
      
      //Call method: getErrorCode
      IErrorCode iErrorCode0 = apiException0.getErrorCode();
      
      //Test Result Assert
      assertNull(iErrorCode0);
  }

  @Test(timeout = 4000)
  public void test_getErrorCode_1()  throws Throwable  {
      //caseID:a656c1bd2cc22732b8981f86b7406e8b
      //CoveredLines: [26, 27, 30]
      //Assert: assertNull(method_result);
      
      //mock throwable0
      Throwable throwable0 = mock(Throwable.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ApiException apiException0 = new ApiException("1.0", throwable0);
      
      //Call method: getErrorCode
      IErrorCode iErrorCode0 = apiException0.getErrorCode();
      
      //Test Result Assert
      assertNull(iErrorCode0);
  }

  @Test(timeout = 4000)
  public void test_getErrorCode_2()  throws Throwable  {
      //caseID:2591c5ad22c8ef6789c6929efc68bc47
      //CoveredLines: [18, 19, 30]
      //Assert: assertNull(method_result);
      
      ApiException apiException0 = new ApiException("1.0");
      
      //Call method: getErrorCode
      IErrorCode iErrorCode0 = apiException0.getErrorCode();
      
      //Test Result Assert
      assertNull(iErrorCode0);
  }

  @Test(timeout = 4000)
  public void test_getErrorCode_3()  throws Throwable  {
      //caseID:733b846fbbc8f8b760b822a9556e091a
      //CoveredLines: [13, 14, 15, 30]
      //Assert: assertNull(method_result.getMessage());
      
      //mock iErrorCode0
      IErrorCode iErrorCode0 = mock(IErrorCode.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ApiException apiException0 = new ApiException(iErrorCode0);
      
      //Call method: getErrorCode
      IErrorCode iErrorCode1 = apiException0.getErrorCode();
      
      //Test Result Assert
      assertNull(iErrorCode1.getMessage());
  }
}
