/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.portal.domain.MemberReadHistory;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MemberReadHistory_SSTest extends MemberReadHistory_SSTest_scaffolding {
// allCoveredLines:[14, 30, 34, 35, 38, 42, 43, 46, 50, 51, 54, 58, 59, 62, 66, 67, 70, 74, 75, 78, 82, 83, 86, 90, 91, 94, 98, 99, 102, 106, 107]

  @Test(timeout = 4000)
  public void test_getCreateTime_00()  throws Throwable  {
      //caseID:e8be0de891b85c6e9adc827c03ca0288
      //CoveredLines: [14, 102]
      //Assert: assertNull(method_result);
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: getCreateTime
      Date date0 = memberReadHistory0.getCreateTime();
      
      //Test Result Assert
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test_getId_01()  throws Throwable  {
      //caseID:649c6c92ec4ce9f883df0b09e6eb34fd
      //CoveredLines: [14, 30]
      //Assert: assertNull(method_result);
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: getId
      String string0 = memberReadHistory0.getId();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getMemberIcon_02()  throws Throwable  {
      //caseID:756a7d32bba394e5d754401864acd771
      //CoveredLines: [14, 54]
      //Assert: assertNull(method_result);
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: getMemberIcon
      String string0 = memberReadHistory0.getMemberIcon();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getMemberId_03()  throws Throwable  {
      //caseID:eeb73a4db11d2914326d32fc967a568f
      //CoveredLines: [14, 38]
      //Assert: assertNull(method_result);
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: getMemberId
      Long long0 = memberReadHistory0.getMemberId();
      
      //Test Result Assert
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test_getMemberNickname_04()  throws Throwable  {
      //caseID:4c54a491d1ff387bd8812b820908f881
      //CoveredLines: [14, 46]
      //Assert: assertNull(method_result);
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: getMemberNickname
      String string0 = memberReadHistory0.getMemberNickname();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getProductId_05()  throws Throwable  {
      //caseID:286c58b3b12191d8a5c7e9f215b5732f
      //CoveredLines: [14, 62]
      //Assert: assertNull(method_result);
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: getProductId
      Long long0 = memberReadHistory0.getProductId();
      
      //Test Result Assert
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test_getProductName_06()  throws Throwable  {
      //caseID:c8a69dd2a6a539b57e41428c44fc5889
      //CoveredLines: [14, 70]
      //Assert: assertNull(method_result);
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: getProductName
      String string0 = memberReadHistory0.getProductName();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getProductPic_07()  throws Throwable  {
      //caseID:f71a64347f62a23206c8f811e46c3910
      //CoveredLines: [14, 78]
      //Assert: assertNull(method_result);
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: getProductPic
      String string0 = memberReadHistory0.getProductPic();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getProductPrice_08()  throws Throwable  {
      //caseID:59dd9ab34b58fa4e4bea883223c5ff54
      //CoveredLines: [14, 94]
      //Assert: assertNull(method_result);
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: getProductPrice
      String string0 = memberReadHistory0.getProductPrice();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getProductSubTitle_09()  throws Throwable  {
      //caseID:4d6eb001c24d32aa3da61ea2f15907e9
      //CoveredLines: [14, 86]
      //Assert: assertNull(method_result);
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: getProductSubTitle
      String string0 = memberReadHistory0.getProductSubTitle();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_setCreateTime_10()  throws Throwable  {
      //caseID:63384a39140ee2632d2159f4d3c07e59
      //CoveredLines: [14, 106, 107]
      //Input_0_Date: {}
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setCreateTime
      memberReadHistory0.setCreateTime(date0);
      
      //Test Result Assert
      assertNull(memberReadHistory0.getProductId());
  }

  @Test(timeout = 4000)
  public void test_setId_11()  throws Throwable  {
      //caseID:2a3e628f3b26d04dd407bcca105cba97
      //CoveredLines: [14, 34, 35]
      //Input_0_String: zYw**8+@3Q{EW,KWWm
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: setId
      memberReadHistory0.setId("zYw**8+@3Q{EW,KWWm");
      
      //Test Result Assert
      assertNull(memberReadHistory0.getProductName());
  }

  @Test(timeout = 4000)
  public void test_setMemberIcon_12()  throws Throwable  {
      //caseID:c40fe8b34fa98796d16933e0f02e57ae
      //CoveredLines: [14, 58, 59]
      //Input_0_String: ZN#_R[DzS/2
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: setMemberIcon
      memberReadHistory0.setMemberIcon("ZN#_R[DzS/2");
      
      //Test Result Assert
      assertNull(memberReadHistory0.getProductPic());
  }

  @Test(timeout = 4000)
  public void test_setMemberId_13()  throws Throwable  {
      //caseID:e5fa2e68f3fd7710f8319177629de854
      //CoveredLines: [14, 42, 43]
      //Input_0_Long: 0L
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      Long long0 = new Long(0L);
      
      //Call method: setMemberId
      memberReadHistory0.setMemberId(long0);
      
      //Test Result Assert
      assertNull(memberReadHistory0.getProductPic());
  }

  @Test(timeout = 4000)
  public void test_setMemberNickname_14()  throws Throwable  {
      //caseID:6c69c03dad89d085f6022d1744f43075
      //CoveredLines: [14, 50, 51]
      //Input_0_String: 3Q FIJ ./J
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: setMemberNickname
      memberReadHistory0.setMemberNickname("3Q FIJ ./J");
      
      //Test Result Assert
      assertNull(memberReadHistory0.getId());
  }

  @Test(timeout = 4000)
  public void test_setProductId_15()  throws Throwable  {
      //caseID:6947aaf1dac59018731cca1e355f595c
      //CoveredLines: [14, 66, 67]
      //Input_0_Long: 5106L
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      Long long0 = new Long(5106L);
      
      //Call method: setProductId
      memberReadHistory0.setProductId(long0);
      
      //Test Result Assert
      assertNull(memberReadHistory0.getMemberIcon());
  }

  @Test(timeout = 4000)
  public void test_setProductName_16()  throws Throwable  {
      //caseID:36c044f11429e898cc2d58ed583aac62
      //CoveredLines: [14, 74, 75]
      //Input_0_String: 
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: setProductName
      memberReadHistory0.setProductName("");
      
      //Test Result Assert
      assertEquals("", memberReadHistory0.getProductName());
  }

  @Test(timeout = 4000)
  public void test_setProductPic_17()  throws Throwable  {
      //caseID:181f5bdcd90cd64d835d8a75169383e1
      //CoveredLines: [14, 82, 83]
      //Input_0_String: reactor.core.publisher.FluxSwitchMap$SwitchMapMain
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: setProductPic
      memberReadHistory0.setProductPic("reactor.core.publisher.FluxSwitchMap$SwitchMapMain");
      
      //Test Result Assert
      assertNull(memberReadHistory0.getProductName());
  }

  @Test(timeout = 4000)
  public void test_setProductPrice_18()  throws Throwable  {
      //caseID:d7f3919945f37f1d6f19d54966ac58cc
      //CoveredLines: [14, 98, 99]
      //Input_0_String: M^S&-7|4olKcO3trl
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: setProductPrice
      memberReadHistory0.setProductPrice("M^S&-7|4olKcO3trl");
      
      //Test Result Assert
      assertNull(memberReadHistory0.getMemberIcon());
  }

  @Test(timeout = 4000)
  public void test_setProductSubTitle_19()  throws Throwable  {
      //caseID:5b3334be8f464de253d052228bc60284
      //CoveredLines: [14, 90, 91]
      //Input_0_String: 1
      
      MemberReadHistory memberReadHistory0 = new MemberReadHistory();
      
      //Call method: setProductSubTitle
      memberReadHistory0.setProductSubTitle("1");
      
      //Test Result Assert
      assertNull(memberReadHistory0.getProductName());
  }
}
