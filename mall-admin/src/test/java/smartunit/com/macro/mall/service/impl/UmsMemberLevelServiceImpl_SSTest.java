/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.mapper.UmsMemberLevelMapper;
import com.macro.mall.model.UmsMemberLevel;
import com.macro.mall.service.impl.UmsMemberLevelServiceImpl;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UmsMemberLevelServiceImpl_SSTest extends UmsMemberLevelServiceImpl_SSTest_scaffolding {
// allCoveredLines:[17, 22, 23, 24]

  @Test(timeout = 4000)
  public void test_list_0()  throws Throwable  {
      //caseID:d42518d47e11c1c1f1f1f59dfc0aa682
      //CoveredLines: [17, 22, 23, 24]
      //Input_0_Integer: 0
      //Assert: assertNull(method_result);
      
      UmsMemberLevelServiceImpl umsMemberLevelServiceImpl0 = new UmsMemberLevelServiceImpl();
      //mock umsMemberLevelMapper0
      UmsMemberLevelMapper umsMemberLevelMapper0 = mock(UmsMemberLevelMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberLevelServiceImpl.class, umsMemberLevelServiceImpl0, "memberLevelMapper", (Object) umsMemberLevelMapper0);
      Integer integer0 = new Integer(0);
      
      //Call method: list
      List<UmsMemberLevel> list0 = umsMemberLevelServiceImpl0.list(integer0);
      
      //Test Result Assert
      assertNull(list0);
  }
}
