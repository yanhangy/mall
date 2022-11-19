/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.dto.SmsFlashPromotionSessionDetail;
import com.macro.mall.mapper.SmsFlashPromotionSessionMapper;
import com.macro.mall.model.SmsFlashPromotionSession;
import com.macro.mall.service.SmsFlashPromotionProductRelationService;
import com.macro.mall.service.impl.SmsFlashPromotionSessionServiceImpl;
import java.util.List;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SmsFlashPromotionSessionServiceImpl_SSTest extends SmsFlashPromotionSessionServiceImpl_SSTest_scaffolding {
// allCoveredLines:[22, 30, 31, 36, 37, 42, 43, 44, 45, 50, 55, 60, 61, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77]

  @Test(timeout = 4000)
  public void test_create_0()  throws Throwable  {
      //caseID:41d90bf23b9fd0bcb4781b74f922b0ea
      //CoveredLines: [22, 30, 31]
      //Input_0_SmsFlashPromotionSession: {}
      //Assert: assertEquals(0, method_result);
      
      SmsFlashPromotionSessionServiceImpl smsFlashPromotionSessionServiceImpl0 = new SmsFlashPromotionSessionServiceImpl();
      //mock smsFlashPromotionSessionMapper0
      SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper0 = mock(SmsFlashPromotionSessionMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsFlashPromotionSessionServiceImpl.class, smsFlashPromotionSessionServiceImpl0, "promotionSessionMapper", (Object) smsFlashPromotionSessionMapper0);
      //mock smsFlashPromotionSession0
      SmsFlashPromotionSession smsFlashPromotionSession0 = mock(SmsFlashPromotionSession.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: create
      int int0 = smsFlashPromotionSessionServiceImpl0.create(smsFlashPromotionSession0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_delete_1()  throws Throwable  {
      //caseID:f0999a2b9a96f13f83e7b0e87b26734c
      //CoveredLines: [22, 50]
      //Input_0_Long: 1862L
      //Assert: assertEquals(0, method_result);
      
      SmsFlashPromotionSessionServiceImpl smsFlashPromotionSessionServiceImpl0 = new SmsFlashPromotionSessionServiceImpl();
      //mock smsFlashPromotionSessionMapper0
      SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper0 = mock(SmsFlashPromotionSessionMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsFlashPromotionSessionServiceImpl.class, smsFlashPromotionSessionServiceImpl0, "promotionSessionMapper", (Object) smsFlashPromotionSessionMapper0);
      Long long0 = new Long(1862L);
      
      //Call method: delete
      int int0 = smsFlashPromotionSessionServiceImpl0.delete(long0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_getItem_2()  throws Throwable  {
      //caseID:f5c4d43148a2681b30155d4c2cdd9ee2
      //CoveredLines: [22, 55]
      //Input_0_Long: 908L
      //Assert: assertNull(method_result);
      
      SmsFlashPromotionSessionServiceImpl smsFlashPromotionSessionServiceImpl0 = new SmsFlashPromotionSessionServiceImpl();
      //mock smsFlashPromotionSessionMapper0
      SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper0 = mock(SmsFlashPromotionSessionMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsFlashPromotionSessionServiceImpl.class, smsFlashPromotionSessionServiceImpl0, "promotionSessionMapper", (Object) smsFlashPromotionSessionMapper0);
      Long long0 = new Long(908L);
      
      //Call method: getItem
      SmsFlashPromotionSession smsFlashPromotionSession0 = smsFlashPromotionSessionServiceImpl0.getItem(long0);
      
      //Test Result Assert
      assertNull(smsFlashPromotionSession0);
  }

  @Test(timeout = 4000)
  public void test_list_3()  throws Throwable  {
      //caseID:9c8a865618fd86f987072b4a1c25e283
      //CoveredLines: [22, 60, 61]
      //Assert: assertNull(method_result);
      
      SmsFlashPromotionSessionServiceImpl smsFlashPromotionSessionServiceImpl0 = new SmsFlashPromotionSessionServiceImpl();
      //mock smsFlashPromotionSessionMapper0
      SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper0 = mock(SmsFlashPromotionSessionMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsFlashPromotionSessionServiceImpl.class, smsFlashPromotionSessionServiceImpl0, "promotionSessionMapper", (Object) smsFlashPromotionSessionMapper0);
      
      //Call method: list
      List<SmsFlashPromotionSession> list0 = smsFlashPromotionSessionServiceImpl0.list();
      
      //Test Result Assert
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test_selectList_4()  throws Throwable  {
      //caseID:a4c3d3f8acf821f9d2343e281aa23ecc
      //CoveredLines: [22, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77]
      //Input_0_Long: 0L
      //Assert: assertEquals(1, method_result.size());
      
      SmsFlashPromotionSessionServiceImpl smsFlashPromotionSessionServiceImpl0 = new SmsFlashPromotionSessionServiceImpl();
      Vector<SmsFlashPromotionSession> vector0 = new Vector<SmsFlashPromotionSession>();
      //mock smsFlashPromotionSession0
      SmsFlashPromotionSession smsFlashPromotionSession0 = mock(SmsFlashPromotionSession.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      vector0.add(smsFlashPromotionSession0);
      //mock smsFlashPromotionSessionMapper0
      SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper0 = mock(SmsFlashPromotionSessionMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(vector0).when(smsFlashPromotionSessionMapper0).selectByExample(any(com.macro.mall.model.SmsFlashPromotionSessionExample.class));
      //mock smsFlashPromotionProductRelationService0
      SmsFlashPromotionProductRelationService smsFlashPromotionProductRelationService0 = mock(SmsFlashPromotionProductRelationService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsFlashPromotionSessionServiceImpl.class, smsFlashPromotionSessionServiceImpl0, "relationService", (Object) smsFlashPromotionProductRelationService0);
      
      PrivateAccess.setVariable((Class<?>) SmsFlashPromotionSessionServiceImpl.class, smsFlashPromotionSessionServiceImpl0, "promotionSessionMapper", (Object) smsFlashPromotionSessionMapper0);
      Long long0 = new Long(0L);
      
      //Call method: selectList
      List<SmsFlashPromotionSessionDetail> list0 = smsFlashPromotionSessionServiceImpl0.selectList(long0);
      
      //Test Result Assert
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test_update_5()  throws Throwable  {
      //caseID:68287767489e658f5c509262906e9d43
      //CoveredLines: [22, 36, 37]
      //Input_0_Long: 0L
      //Input_1_SmsFlashPromotionSession: {}
      //Assert: assertEquals(0, method_result);
      
      SmsFlashPromotionSessionServiceImpl smsFlashPromotionSessionServiceImpl0 = new SmsFlashPromotionSessionServiceImpl();
      //mock smsFlashPromotionSessionMapper0
      SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper0 = mock(SmsFlashPromotionSessionMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsFlashPromotionSessionServiceImpl.class, smsFlashPromotionSessionServiceImpl0, "promotionSessionMapper", (Object) smsFlashPromotionSessionMapper0);
      Long long0 = new Long(0L);
      //mock smsFlashPromotionSession0
      SmsFlashPromotionSession smsFlashPromotionSession0 = mock(SmsFlashPromotionSession.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: update
      int int0 = smsFlashPromotionSessionServiceImpl0.update(long0, smsFlashPromotionSession0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_updateStatus_6()  throws Throwable  {
      //caseID:f27a44eae5202e5b97f881f16cfeb3db
      //CoveredLines: [22, 42, 43, 44, 45]
      //Input_0_Long: 0
      //Input_1_Integer: 0
      //Assert: assertEquals(0, method_result);
      
      SmsFlashPromotionSessionServiceImpl smsFlashPromotionSessionServiceImpl0 = new SmsFlashPromotionSessionServiceImpl();
      //mock smsFlashPromotionSessionMapper0
      SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper0 = mock(SmsFlashPromotionSessionMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(smsFlashPromotionSessionMapper0).updateByPrimaryKeySelective(any(com.macro.mall.model.SmsFlashPromotionSession.class));
      
      PrivateAccess.setVariable((Class<?>) SmsFlashPromotionSessionServiceImpl.class, smsFlashPromotionSessionServiceImpl0, "promotionSessionMapper", (Object) smsFlashPromotionSessionMapper0);
      Long long0 = new Long(0);
      Integer integer0 = new Integer(0);
      
      //Call method: updateStatus
      int int0 = smsFlashPromotionSessionServiceImpl0.updateStatus(long0, integer0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }
}
