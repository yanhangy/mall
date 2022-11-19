/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.macro.mall.mapper.UmsMemberLevelMapper;
import com.macro.mall.mapper.UmsMemberMapper;
import com.macro.mall.model.UmsMember;
import com.macro.mall.model.UmsMemberLevel;
import com.macro.mall.portal.service.UmsMemberCacheService;
import com.macro.mall.portal.service.impl.UmsMemberServiceImpl;
import com.macro.mall.security.util.JwtTokenUtil;
import java.util.LinkedList;
import java.util.Stack;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UmsMemberServiceImpl_SSTest extends UmsMemberServiceImpl_SSTest_scaffolding {
// allCoveredLines:[40, 59, 60, 61, 62, 63, 64, 65, 66, 67, 69, 74, 80, 81, 84, 85, 86, 87, 88, 89, 92, 93, 94, 95, 96, 97, 99, 100, 101, 102, 103, 105, 106, 107, 111, 112, 113, 114, 116, 117, 122, 123, 124, 125, 126, 129, 130, 132, 133, 134, 135, 136, 140, 141, 142, 143, 148, 149, 150, 151, 152, 153, 157, 158, 159, 161, 166, 169, 170, 171, 173, 174, 175, 176, 177, 178, 179, 184, 189, 190, 192, 193]

  @Test(timeout = 4000)
  public void test_generateAuthCode_00()  throws Throwable  {
      //caseID:d096a0b007ff0605b8c4141bcaf8c3a6
      //CoveredLines: [40, 111, 112, 113, 114, 116, 117]
      //Input_0_String: Orwg}:3
      //Assert: assertEquals("000000", method_result);
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      //Call method: generateAuthCode
      String string0 = umsMemberServiceImpl0.generateAuthCode("Orwg}:3");
      
      //Test Result Assert
      assertEquals("000000", string0);
  }

  @Test(timeout = 4000)
  public void test_getById_01()  throws Throwable  {
      //caseID:0864f328ed2921f67cf06c239423769f
      //CoveredLines: [40, 74]
      //Input_0_Long: 4835L
      //Assert: assertNull(method_result);
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      //mock umsMemberMapper0
      UmsMemberMapper umsMemberMapper0 = mock(UmsMemberMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Long long0 = new Long(4835L);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberMapper", (Object) umsMemberMapper0);
      
      //Call method: getById
      UmsMember umsMember0 = umsMemberServiceImpl0.getById(long0);
      
      //Test Result Assert
      assertNull(umsMember0);
  }

  @Test(timeout = 4000)
  public void test_getCurrentMember_02()  throws Throwable  {
      //caseID:61996fd0398640abfb6b66d4c63bacc0
    try {
      //CoveredLines: [40, 140, 141, 142, 143]
      //Assert: assertNull(method_result.getPhone());
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      
      //Call method: getCurrentMember
      UmsMember umsMember0 = umsMemberServiceImpl0.getCurrentMember();
      
      //Test Result Assert
      assertNull(umsMember0.getPhone());
    } catch (java.lang.Exception checkException) {
            // Need to catch junit check exceptions
   assertEquals("java.lang.NullPointerException", checkException.getClass().getName());

    }
  }

  @Test(timeout = 4000)
  public void test_loadUserByUsername_03()  throws Throwable  {
      //caseID:950409a8e727c2ff7616cb0f7b4beb3d
      //CoveredLines: [40, 59, 60, 61, 62, 63, 64, 65, 66, 67, 157, 158, 159]
      //Input_0_String: 
      //Assert: assertTrue(method_result.isCredentialsNonExpired());
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      Stack<UmsMember> stack0 = new Stack<UmsMember>();
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      stack0.add(umsMember0);
      //mock umsMemberMapper0
      UmsMemberMapper umsMemberMapper0 = mock(UmsMemberMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(umsMemberMapper0).selectByExample(any(com.macro.mall.model.UmsMemberExample.class));
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((UmsMember) null).when(umsMemberCacheService0).getMember(anyString());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberMapper", (Object) umsMemberMapper0);
      
      //Call method: loadUserByUsername
      UserDetails userDetails0 = umsMemberServiceImpl0.loadUserByUsername("");
      
      //Test Result Assert
      assertTrue(userDetails0.isCredentialsNonExpired());
  }

  @Test(timeout = 4000)
  public void test_login_04()  throws Throwable  {
      //caseID:0b8b0a8335e502053ca715cbddcead95
      //CoveredLines: [40, 59, 60, 157, 158, 159, 166, 169, 170, 171, 176, 177, 179]
      //Input_0_String: 1
      //Input_1_String: 1.0
      //Assert: assertNull(method_result);
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberCacheService0).getMember(anyString());
      //mock passwordEncoder0
      PasswordEncoder passwordEncoder0 = mock(PasswordEncoder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "passwordEncoder", (Object) passwordEncoder0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      //Call method: login
      String string0 = umsMemberServiceImpl0.login("1", "1.0");
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_login_05()  throws Throwable  {
      //caseID:78ea3b63a351d562ea70f2f3707944cf
      //CoveredLines: [40, 59, 60, 157, 158, 159, 166, 169, 170, 173, 174, 175, 178, 179]
      //Input_0_String: 1.0
      //Input_1_String: 6
      //Assert: assertNull(method_result);
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("city not like").when(umsMember0).getPassword();
      doReturn("city not like").when(umsMember0).toString();
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberCacheService0).getMember(anyString());
      //mock jwtTokenUtil0
      JwtTokenUtil jwtTokenUtil0 = mock(JwtTokenUtil.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock passwordEncoder0
      PasswordEncoder passwordEncoder0 = mock(PasswordEncoder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(true).when(passwordEncoder0).matches(nullable(java.lang.CharSequence.class) , nullable(java.lang.String.class));
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "passwordEncoder", (Object) passwordEncoder0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "jwtTokenUtil", (Object) jwtTokenUtil0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      //Call method: login
      String string0 = umsMemberServiceImpl0.login("1.0", "6");
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_login_06()  throws Throwable  {
      //caseID:792d1d42543404fabca0c0252eee98c6
      //CoveredLines: [40, 59, 60, 61, 62, 63, 64, 69, 157, 158, 161, 166, 169, 176, 177, 179]
      //Input_0_String: \u8BE5\u8D26\u53F7\u4E0D\u5B58\u5728
      //Input_1_String: 
      //Assert: assertNull(method_result);
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      //mock umsMemberMapper0
      UmsMemberMapper umsMemberMapper0 = mock(UmsMemberMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberMapper", (Object) umsMemberMapper0);
      
      //Call method: login
      String string0 = umsMemberServiceImpl0.login("\u8BE5\u8D26\u53F7\u4E0D\u5B58\u5728", "");
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_refreshToken_07()  throws Throwable  {
      //caseID:d83d92abec50cfce3d9c36bb7082eb19
      //CoveredLines: [40, 184]
      //Input_0_String: 1
      //Assert: assertNull(method_result);
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      //mock jwtTokenUtil0
      JwtTokenUtil jwtTokenUtil0 = mock(JwtTokenUtil.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "jwtTokenUtil", (Object) jwtTokenUtil0);
      
      //Call method: refreshToken
      String string0 = umsMemberServiceImpl0.refreshToken("1");
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_register_08()  throws Throwable  {
      //caseID:94d71d5d9abb71e954009800bb85bf62
      //CoveredLines: [40, 80, 81, 189, 190]
      //Input_0_String: reactor.core.publisher.MonoDelayElement$DelayElementSubscriber
      //Input_1_String: reactor.core.publisher.MonoDelayElement$DelayElementSubscriber
      //Input_2_String: 1.0
      //Input_3_String: 
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      
      //Call method: register
      // Undeclared exception!
      try { 
        umsMemberServiceImpl0.register("reactor.core.publisher.MonoDelayElement$DelayElementSubscriber", "reactor.core.publisher.MonoDelayElement$DelayElementSubscriber", "1.0", "");
      } catch(Throwable e) {
         verifyException("com.macro.mall.common.exception.Asserts", e);
         assertEquals("com.macro.mall.common.exception.ApiException", e.getClass().getName());
         assertEquals("\u9A8C\u8BC1\u7801\u9519\u8BEF", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_register_09()  throws Throwable  {
      //caseID:29b0970f3b0b434efe64cf529caa3327
      //CoveredLines: [40, 80, 81, 189, 192, 193]
      //Input_0_String: \u7528\u6237\u540D\u6216\u5BC6\u7801\u9519\u8BEF
      //Input_1_String: \u9A8C\u8BC1\u7801\u9519\u8BEF
      //Input_2_String: \u5BC6\u7801\u4E0D\u6B63\u786E
      //Input_3_String: 0
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      //Call method: register
      // Undeclared exception!
      try { 
        umsMemberServiceImpl0.register("\u7528\u6237\u540D\u6216\u5BC6\u7801\u9519\u8BEF", "\u9A8C\u8BC1\u7801\u9519\u8BEF", "\u5BC6\u7801\u4E0D\u6B63\u786E", "0");
      } catch(Throwable e) {
         verifyException("com.macro.mall.common.exception.Asserts", e);
         assertEquals("com.macro.mall.common.exception.ApiException", e.getClass().getName());
         assertEquals("\u9A8C\u8BC1\u7801\u9519\u8BEF", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_register_10()  throws Throwable  {
      //caseID:ed7c3d2a7d153502545e2a8e944a1868
      //CoveredLines: [40, 80, 84, 85, 86, 87, 88, 89, 189, 192, 193]
      //Input_0_String: reactor.core.publishew.FluxExpand$ExpandDefthSubscriber
      //Input_1_String: qS|-@,3{H&Vm
      //Input_2_String: 1
      //Input_3_String: 1
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      LinkedList<UmsMember> linkedList0 = new LinkedList<UmsMember>();
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      linkedList0.add(umsMember0);
      //mock umsMemberMapper0
      UmsMemberMapper umsMemberMapper0 = mock(UmsMemberMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(umsMemberMapper0).selectByExample(any(com.macro.mall.model.UmsMemberExample.class));
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1").when(umsMemberCacheService0).getAuthCode(anyString());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberMapper", (Object) umsMemberMapper0);
      
      //Call method: register
      // Undeclared exception!
      try { 
        umsMemberServiceImpl0.register("reactor.core.publishew.FluxExpand$ExpandDefthSubscriber", "qS|-@,3{H&Vm", "1", "1");
      } catch(Throwable e) {
         verifyException("com.macro.mall.common.exception.Asserts", e);
         assertEquals("com.macro.mall.common.exception.ApiException", e.getClass().getName());
         assertEquals("\u8BE5\u7528\u6237\u5DF2\u7ECF\u5B58\u5728", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_register_11()  throws Throwable  {
      //caseID:91ced66fba763f45c56110347868a9e2
      //CoveredLines: [40, 80, 84, 85, 86, 87, 88, 92, 93, 94, 95, 96, 97, 99, 100, 101, 102, 105, 106, 107, 189, 192, 193]
      //Input_0_String: \u767B\u5F55\u5F02\u5E38:{}
      //Input_1_String: \u767B\u5F55\u5F02\u5E38:{}
      //Input_2_String: com.macro.mall.portal.service.impl.UmsMemberServiceImpl
      //Input_3_String: \u7528\u6237\u540D\u6216\u5BC6\u7801\u9519\u8BEF
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      //mock umsMemberLevelMapper0
      UmsMemberLevelMapper umsMemberLevelMapper0 = mock(UmsMemberLevelMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberMapper0
      UmsMemberMapper umsMemberMapper0 = mock(UmsMemberMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("\u7528\u6237\u540D\u6216\u5BC6\u7801\u9519\u8BEF").when(umsMemberCacheService0).getAuthCode(anyString());
      //mock passwordEncoder0
      PasswordEncoder passwordEncoder0 = mock(PasswordEncoder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "passwordEncoder", (Object) passwordEncoder0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberMapper", (Object) umsMemberMapper0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberLevelMapper", (Object) umsMemberLevelMapper0);
      
      //Call method: register
      umsMemberServiceImpl0.register("\u767B\u5F55\u5F02\u5E38:{}", "\u767B\u5F55\u5F02\u5E38:{}", "com.macro.mall.portal.service.impl.UmsMemberServiceImpl", "\u7528\u6237\u540D\u6216\u5BC6\u7801\u9519\u8BEF");
  }

  @Test(timeout = 4000)
  public void test_register_12()  throws Throwable  {
      //caseID:7950204124d137301bb3c3f2243f3b45
      //CoveredLines: [40, 80, 84, 85, 86, 87, 88, 92, 93, 94, 95, 96, 97, 99, 100, 101, 102, 103, 105, 106, 107, 189, 192, 193]
      //Input_0_String: fQ;N`xRuC<[6i@
      //Input_1_String: fQ;N`xRuC<[6i@
      //Input_2_String: \u7528\u6237\u540D\u6216\u5BC6\u7801\u9519\u8BEF
      //Input_3_String: 0NdxFtufN/eXz+8|fvt
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      Stack<UmsMemberLevel> stack0 = new Stack<UmsMemberLevel>();
      //mock umsMemberLevelMapper0
      UmsMemberLevelMapper umsMemberLevelMapper0 = mock(UmsMemberLevelMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(umsMemberLevelMapper0).selectByExample(any(com.macro.mall.model.UmsMemberLevelExample.class));
      Stack<UmsMember> stack1 = new Stack<UmsMember>();
      //mock umsMemberMapper0
      UmsMemberMapper umsMemberMapper0 = mock(UmsMemberMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1137232011).when(umsMemberMapper0).insert(any(com.macro.mall.model.UmsMember.class));
      doReturn(stack1).when(umsMemberMapper0).selectByExample(any(com.macro.mall.model.UmsMemberExample.class));
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("0NdxFtufN/eXz+8|fvt").when(umsMemberCacheService0).getAuthCode(anyString());
      Long long0 = new Long(1137232011);
      //mock passwordEncoder0
      PasswordEncoder passwordEncoder0 = mock(PasswordEncoder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("+6").when(passwordEncoder0).encode(any(java.lang.CharSequence.class));
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "passwordEncoder", (Object) passwordEncoder0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberMapper", (Object) umsMemberMapper0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberLevelMapper", (Object) umsMemberLevelMapper0);
      //mock umsMemberLevel0
      UmsMemberLevel umsMemberLevel0 = mock(UmsMemberLevel.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(umsMemberLevel0).getId();
      
      stack0.add(umsMemberLevel0);
      
      //Call method: register
      umsMemberServiceImpl0.register("fQ;N`xRuC<[6i@", "fQ;N`xRuC<[6i@", "\u7528\u6237\u540D\u6216\u5BC6\u7801\u9519\u8BEF", "0NdxFtufN/eXz+8|fvt");
  }

  @Test(timeout = 4000)
  public void test_updateIntegration_13()  throws Throwable  {
      //caseID:360f2994502212d67cf02c9d9202b647
      //CoveredLines: [40, 148, 149, 150, 151, 152, 153]
      //Input_0_Long: 194L
      //Input_1_Integer: (-1)
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      //mock umsMemberMapper0
      UmsMemberMapper umsMemberMapper0 = mock(UmsMemberMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Long long0 = new Long(194L);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberMapper", (Object) umsMemberMapper0);
      Integer integer0 = new Integer((-1));
      
      //Call method: updateIntegration
      umsMemberServiceImpl0.updateIntegration(long0, integer0);
  }

  @Test(timeout = 4000)
  public void test_updatePassword_14()  throws Throwable  {
      //caseID:c305eee911fba208493b0047fac6c5e5
      //CoveredLines: [40, 122, 123, 124, 125, 126]
      //Input_0_String: T=(M*HyF?h0[Sz7
      //Input_1_String: \u9A8C\u8BC1\u7801\u9519\u8BEF
      //Input_2_String: 1.0
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      //mock umsMemberMapper0
      UmsMemberMapper umsMemberMapper0 = mock(UmsMemberMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberMapper", (Object) umsMemberMapper0);
      
      //Call method: updatePassword
      // Undeclared exception!
      try { 
        umsMemberServiceImpl0.updatePassword("T=(M*HyF?h0[Sz7", "\u9A8C\u8BC1\u7801\u9519\u8BEF", "1.0");
      } catch(Throwable e) {
         verifyException("com.macro.mall.common.exception.Asserts", e);
         assertEquals("com.macro.mall.common.exception.ApiException", e.getClass().getName());
         assertEquals("\u8BE5\u8D26\u53F7\u4E0D\u5B58\u5728", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_updatePassword_15()  throws Throwable  {
      //caseID:93228c6db16331eb39a69d665cc4795b
      //CoveredLines: [40, 122, 123, 124, 125, 129, 130, 189, 192, 193]
      //Input_0_String: EOF found inside tag value.
      //Input_1_String: EOF found inside tag value.
      //Input_2_String: EOF found inside tag value.
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      Stack<UmsMember> stack0 = new Stack<UmsMember>();
      //mock umsMemberMapper0
      UmsMemberMapper umsMemberMapper0 = mock(UmsMemberMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(umsMemberMapper0).selectByExample(any(com.macro.mall.model.UmsMemberExample.class));
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      stack0.add(umsMember0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberMapper", (Object) umsMemberMapper0);
      
      //Call method: updatePassword
      // Undeclared exception!
      try { 
        umsMemberServiceImpl0.updatePassword("EOF found inside tag value.", "EOF found inside tag value.", "EOF found inside tag value.");
      } catch(Throwable e) {
         verifyException("com.macro.mall.common.exception.Asserts", e);
         assertEquals("com.macro.mall.common.exception.ApiException", e.getClass().getName());
         assertEquals("\u9A8C\u8BC1\u7801\u9519\u8BEF", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_updatePassword_16()  throws Throwable  {
      //caseID:dff44ad0eeca461202f59fb433583ec0
      //CoveredLines: [40, 122, 123, 124, 125, 129, 132, 133, 134, 135, 136, 189, 192, 193]
      //Input_0_String: EOF found inside tag value.
      //Input_1_String: EOF found inside tag value.
      //Input_2_String: EOF found inside tag value.
      
      UmsMemberServiceImpl umsMemberServiceImpl0 = new UmsMemberServiceImpl();
      Stack<UmsMember> stack0 = new Stack<UmsMember>();
      //mock umsMemberMapper0
      UmsMemberMapper umsMemberMapper0 = mock(UmsMemberMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(umsMemberMapper0).selectByExample(any(com.macro.mall.model.UmsMemberExample.class));
      //mock umsMemberCacheService0
      UmsMemberCacheService umsMemberCacheService0 = mock(UmsMemberCacheService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("EOF found inside tag value.").when(umsMemberCacheService0).getAuthCode(anyString());
      //mock passwordEncoder0
      PasswordEncoder passwordEncoder0 = mock(PasswordEncoder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "passwordEncoder", (Object) passwordEncoder0);
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      stack0.add(umsMember0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberCacheService", (Object) umsMemberCacheService0);
      
      PrivateAccess.setVariable((Class<?>) UmsMemberServiceImpl.class, umsMemberServiceImpl0, "memberMapper", (Object) umsMemberMapper0);
      
      //Call method: updatePassword
      umsMemberServiceImpl0.updatePassword("EOF found inside tag value.", "EOF found inside tag value.", "EOF found inside tag value.");
  }
}
