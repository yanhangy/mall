/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.model.UmsMember;
import com.macro.mall.portal.domain.MemberBrandAttention;
import com.macro.mall.portal.repository.MemberBrandAttentionRepository;
import com.macro.mall.portal.service.UmsMemberService;
import com.macro.mall.portal.service.impl.MemberAttentionServiceImpl;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.data.domain.Page;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MemberAttentionServiceImpl_SSTest extends MemberAttentionServiceImpl_SSTest_scaffolding {
// allCoveredLines:[22, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41, 46, 47, 52, 53, 54, 59, 60, 65, 66, 67]

  @Test(timeout = 4000)
  public void test_add_0()  throws Throwable  {
      //caseID:e3fd065af38e17c62bb5849da8e5821e
      //CoveredLines: [22, 30, 31, 32, 33, 34, 35, 36, 37, 41]
      //Input_0_MemberBrandAttention: {getBrandId=(-218L), getMemberId=(-218L)}
      //Assert: assertEquals(0, method_result);
      
      MemberAttentionServiceImpl memberAttentionServiceImpl0 = new MemberAttentionServiceImpl();
      //mock memberBrandAttention0
      MemberBrandAttention memberBrandAttention0 = mock(MemberBrandAttention.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock memberBrandAttentionRepository0
      MemberBrandAttentionRepository memberBrandAttentionRepository0 = mock(MemberBrandAttentionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(memberBrandAttention0).when(memberBrandAttentionRepository0).findByMemberIdAndBrandId(anyLong() , anyLong());
      Long long0 = new Long((-218L));
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1.0").when(umsMember0).getIcon();
      doReturn(long0).when(umsMember0).getId();
      doReturn("1.0").when(umsMember0).getNickname();
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberBrandAttentionRepository", (Object) memberBrandAttentionRepository0);
      //mock memberBrandAttention1
      MemberBrandAttention memberBrandAttention1 = mock(MemberBrandAttention.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(memberBrandAttention1).getBrandId();
      doReturn(long0).when(memberBrandAttention1).getMemberId();
      
      //Call method: add
      int int0 = memberAttentionServiceImpl0.add(memberBrandAttention1);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_add_1()  throws Throwable  {
      //caseID:3a7bba6073a15554d72b876895131661
      //CoveredLines: [22, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41]
      //Input_0_MemberBrandAttention: {}
      //Assert: assertEquals(1, method_result);
      
      MemberAttentionServiceImpl memberAttentionServiceImpl0 = new MemberAttentionServiceImpl();
      //mock memberBrandAttentionRepository0
      MemberBrandAttentionRepository memberBrandAttentionRepository0 = mock(MemberBrandAttentionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberBrandAttentionRepository", (Object) memberBrandAttentionRepository0);
      //mock memberBrandAttention0
      MemberBrandAttention memberBrandAttention0 = mock(MemberBrandAttention.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: add
      int int0 = memberAttentionServiceImpl0.add(memberBrandAttention0);
      
      //Test Result Assert
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_clear_2()  throws Throwable  {
      //caseID:9abc183b405dd68d14b87ae700593ed6
      //CoveredLines: [22, 65, 66, 67]
      
      MemberAttentionServiceImpl memberAttentionServiceImpl0 = new MemberAttentionServiceImpl();
      //mock memberBrandAttentionRepository0
      MemberBrandAttentionRepository memberBrandAttentionRepository0 = mock(MemberBrandAttentionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberBrandAttentionRepository", (Object) memberBrandAttentionRepository0);
      
      //Call method: clear
      memberAttentionServiceImpl0.clear();
  }

  @Test(timeout = 4000)
  public void test_delete_3()  throws Throwable  {
      //caseID:7495b5ea753e5b4fdd53c146d4b05fa9
      //CoveredLines: [22, 46, 47]
      //Input_0_Long: 1L
      //Assert: assertEquals(0, method_result);
      
      MemberAttentionServiceImpl memberAttentionServiceImpl0 = new MemberAttentionServiceImpl();
      //mock memberBrandAttentionRepository0
      MemberBrandAttentionRepository memberBrandAttentionRepository0 = mock(MemberBrandAttentionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberBrandAttentionRepository", (Object) memberBrandAttentionRepository0);
      Long long0 = new Long(1L);
      
      //Call method: delete
      int int0 = memberAttentionServiceImpl0.delete(long0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_detail_4()  throws Throwable  {
      //caseID:83fc47e1f3d8035b16647fb76de29edf
      //CoveredLines: [22, 59, 60]
      //Input_0_Long: 1860L
      //Assert: assertNull(method_result);
      
      MemberAttentionServiceImpl memberAttentionServiceImpl0 = new MemberAttentionServiceImpl();
      //mock memberBrandAttentionRepository0
      MemberBrandAttentionRepository memberBrandAttentionRepository0 = mock(MemberBrandAttentionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberBrandAttentionRepository", (Object) memberBrandAttentionRepository0);
      Long long0 = new Long(1860L);
      
      //Call method: detail
      MemberBrandAttention memberBrandAttention0 = memberAttentionServiceImpl0.detail(long0);
      
      //Test Result Assert
      assertNull(memberBrandAttention0);
  }

  @Test(timeout = 4000)
  public void test_list_5()  throws Throwable  {
      //caseID:0c7b45300892f11f6178562675a66117
      //CoveredLines: [22, 52, 53, 54]
      //Input_0_Integer: 1110
      //Input_1_Integer: 1110
      //Assert: assertFalse(method_result.hasContent());
      
      MemberAttentionServiceImpl memberAttentionServiceImpl0 = new MemberAttentionServiceImpl();
      //mock page0
      Page<MemberBrandAttention> page0 = (Page<MemberBrandAttention>) mock(Page.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("x?L|6??SHCB").when(page0).toString();
      //mock memberBrandAttentionRepository0
      MemberBrandAttentionRepository memberBrandAttentionRepository0 = mock(MemberBrandAttentionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(page0).when(memberBrandAttentionRepository0).findByMemberId(nullable(java.lang.Long.class) , nullable(org.springframework.data.domain.Pageable.class));
      Long long0 = new Long(21L);
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(umsMember0).getId();
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberAttentionServiceImpl.class, memberAttentionServiceImpl0, "memberBrandAttentionRepository", (Object) memberBrandAttentionRepository0);
      Integer integer0 = new Integer(1110);
      
      //Call method: list
      Page<MemberBrandAttention> page1 = memberAttentionServiceImpl0.list(integer0, integer0);
      
      //Test Result Assert
      assertFalse(page1.hasContent());
  }
}
