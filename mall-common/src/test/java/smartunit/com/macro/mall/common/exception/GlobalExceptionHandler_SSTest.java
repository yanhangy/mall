/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.common.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.common.api.IErrorCode;
import com.macro.mall.common.exception.ApiException;
import com.macro.mall.common.exception.GlobalExceptionHandler;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.core.MethodParameter;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GlobalExceptionHandler_SSTest extends GlobalExceptionHandler_SSTest_scaffolding {
// allCoveredLines:[17, 22, 23, 25, 31, 32, 33, 34, 35, 36, 39, 45, 46, 47, 48, 49, 50, 53]

  @Test(timeout = 4000)
  public void test_handle_0()  throws Throwable  {
      //caseID:9b96b1d197061455899de6cf32c7d7d6
      //CoveredLines: [17, 22, 23]
      //Input_0_ApiException: iErrorCode0
      //Assert: assertEquals(0L, method_result.getCode());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      //mock iErrorCode0
      IErrorCode iErrorCode0 = mock(IErrorCode.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ApiException apiException0 = new ApiException(iErrorCode0);
      
      //Call method: handle
      CommonResult commonResult0 = globalExceptionHandler0.handle(apiException0);
      
      //Test Result Assert
      assertEquals(0L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_handle_1()  throws Throwable  {
      //caseID:f8652ebdaa12823161fecc8f5da9ec40
      //CoveredLines: [17, 22, 25]
      //Input_0_ApiException: \"Ce\"
      //Assert: assertEquals(500L, method_result.getCode());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      ApiException apiException0 = new ApiException("Ce");
      
      //Call method: handle
      CommonResult commonResult0 = globalExceptionHandler0.handle(apiException0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_handleValidException_2()  throws Throwable  {
      //caseID:0210d5e635da48a0b51f0c5ef16af61e
      //CoveredLines: [17, 31, 32, 33, 39]
      //Input_0_MethodArgumentNotValidException: methodParameter0, bindingResult0
      //Assert: assertEquals(404L, method_result.getCode());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      //mock methodParameter0
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock bindingResult0
      BindingResult bindingResult0 = mock(BindingResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      MethodArgumentNotValidException methodArgumentNotValidException0 = new MethodArgumentNotValidException(methodParameter0, bindingResult0);
      
      //Call method: handleValidException
      CommonResult commonResult0 = globalExceptionHandler0.handleValidException(methodArgumentNotValidException0);
      
      //Test Result Assert
      assertEquals(404L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_handleValidException_3()  throws Throwable  {
      //caseID:392b4e32f7cf89253cfc01927b1c704b
      //CoveredLines: [17, 45, 46, 47, 53]
      //Input_0_BindException: globalExceptionHandler0, \"%c~$xr3Bu(wbY$0\"
      //Assert: assertNull(method_result.getMessage());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      BindException bindException0 = new BindException(globalExceptionHandler0, "%c~$xr3Bu(wbY$0");
      
      //Call method: handleValidException
      CommonResult commonResult0 = globalExceptionHandler0.handleValidException(bindException0);
      
      //Test Result Assert
      assertNull(commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_handleValidException_4()  throws Throwable  {
      //caseID:5f186108762ffda11767c57c6e145bdd
      //CoveredLines: [17, 31, 32, 33, 34, 35, 39]
      //Input_0_MethodArgumentNotValidException: methodParameter0, bindingResult0
      //Assert: assertEquals(404L, method_result.getCode());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      //mock methodParameter0
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock bindingResult0
      BindingResult bindingResult0 = mock(BindingResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(true).when(bindingResult0).hasErrors();
      MethodArgumentNotValidException methodArgumentNotValidException0 = new MethodArgumentNotValidException(methodParameter0, bindingResult0);
      
      //Call method: handleValidException
      CommonResult commonResult0 = globalExceptionHandler0.handleValidException(methodArgumentNotValidException0);
      
      //Test Result Assert
      assertEquals(404L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_handleValidException_5()  throws Throwable  {
      //caseID:9ccfa33ae6e9ffd6d1986e57b068e1c0
      //CoveredLines: [17, 45, 46, 47, 48, 49, 53]
      //Input_0_BindException: globalExceptionHandler0, \"aspectjWeaving\"
      //Assert: assertEquals(404L, method_result.getCode());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      BindException bindException0 = new BindException(globalExceptionHandler0, "aspectjWeaving");
      
      bindException0.reject("aspectjWeaving");
      
      //Call method: handleValidException
      CommonResult commonResult0 = globalExceptionHandler0.handleValidException(bindException0);
      
      //Test Result Assert
      assertEquals(404L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_handleValidException_6()  throws Throwable  {
      //caseID:99f93f553df37864c595f932c7e782d8
      //CoveredLines: [17, 31, 32, 33, 34, 35, 36, 39]
      //Input_0_MethodArgumentNotValidException: methodParameter0, bindingResult0
      //Assert: assertEquals("nullnull", method_result.getMessage());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      //mock methodParameter0
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock fieldError0
      FieldError fieldError0 = mock(FieldError.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock bindingResult0
      BindingResult bindingResult0 = mock(BindingResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(fieldError0).when(bindingResult0).getFieldError();
      doReturn(true).when(bindingResult0).hasErrors();
      MethodArgumentNotValidException methodArgumentNotValidException0 = new MethodArgumentNotValidException(methodParameter0, bindingResult0);
      
      //Call method: handleValidException
      CommonResult commonResult0 = globalExceptionHandler0.handleValidException(methodArgumentNotValidException0);
      
      //Test Result Assert
      assertEquals("nullnull", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_handleValidException_7()  throws Throwable  {
      //caseID:f53709d8350c652190d05154a130c945
      //CoveredLines: [17, 45, 46, 47, 48, 49, 50, 53]
      //Input_0_BindException: bindingResult0
      //Assert: assertEquals("1.01.0", method_result.getMessage());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      //mock fieldError0
      FieldError fieldError0 = mock(FieldError.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1.0").when(fieldError0).getDefaultMessage();
      doReturn("1.0").when(fieldError0).getField();
      //mock bindingResult0
      BindingResult bindingResult0 = mock(BindingResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(fieldError0).when(bindingResult0).getFieldError();
      doReturn(true).when(bindingResult0).hasErrors();
      BindException bindException0 = new BindException(bindingResult0);
      
      //Call method: handleValidException
      CommonResult commonResult0 = globalExceptionHandler0.handleValidException(bindException0);
      
      //Test Result Assert
      assertEquals("1.01.0", commonResult0.getMessage());
  }
}
