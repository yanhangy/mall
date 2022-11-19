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
import com.macro.mall.portal.domain.MemberProductCollection;
import com.macro.mall.portal.repository.MemberProductCollectionRepository;
import com.macro.mall.portal.service.UmsMemberService;
import com.macro.mall.portal.service.impl.MemberCollectionServiceImpl;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.data.domain.Page;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MemberCollectionServiceImpl_SSTest extends MemberCollectionServiceImpl_SSTest_scaffolding {
// allCoveredLines:[21, 29, 30, 31, 32, 33, 34, 35, 36, 37, 39, 44, 45, 50, 51, 52, 57, 58, 63, 64, 65]

  @Test(timeout = 4000)
  public void test_add_0()  throws Throwable  {
      //caseID:50342e2e579146804c31d36123a8a72f
      //CoveredLines: [21, 29, 30, 31, 32, 33, 34, 35, 39]
      //Input_0_MemberProductCollection: {getMemberId=1937L, getProductId=1937L}
      //Assert: assertEquals(0, method_result);
      
      MemberCollectionServiceImpl memberCollectionServiceImpl0 = new MemberCollectionServiceImpl();
      //mock memberProductCollection0
      MemberProductCollection memberProductCollection0 = mock(MemberProductCollection.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock memberProductCollectionRepository0
      MemberProductCollectionRepository memberProductCollectionRepository0 = mock(MemberProductCollectionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(memberProductCollection0).when(memberProductCollectionRepository0).findByMemberIdAndProductId(anyLong() , anyLong());
      Long long0 = new Long(1937L);
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("com.macro.mall.portal.service.impl.MemberCollectionServiceImpl").when(umsMember0).getIcon();
      doReturn(long0).when(umsMember0).getId();
      doReturn("com.macro.mall.portal.service.impl.MemberCollectionServiceImpl").when(umsMember0).getNickname();
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "productCollectionRepository", (Object) memberProductCollectionRepository0);
      //mock memberProductCollection1
      MemberProductCollection memberProductCollection1 = mock(MemberProductCollection.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(memberProductCollection1).getMemberId();
      doReturn(long0).when(memberProductCollection1).getProductId();
      
      //Call method: add
      int int0 = memberCollectionServiceImpl0.add(memberProductCollection1);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_add_1()  throws Throwable  {
      //caseID:b6c9f95837104db10e873b7a0bd0f29d
      //CoveredLines: [21, 29, 30, 31, 32, 33, 34, 35, 36, 37, 39]
      //Input_0_MemberProductCollection: {}
      //Assert: assertEquals(1, method_result);
      
      MemberCollectionServiceImpl memberCollectionServiceImpl0 = new MemberCollectionServiceImpl();
      //mock memberProductCollectionRepository0
      MemberProductCollectionRepository memberProductCollectionRepository0 = mock(MemberProductCollectionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "productCollectionRepository", (Object) memberProductCollectionRepository0);
      //mock memberProductCollection0
      MemberProductCollection memberProductCollection0 = mock(MemberProductCollection.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: add
      int int0 = memberCollectionServiceImpl0.add(memberProductCollection0);
      
      //Test Result Assert
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_clear_2()  throws Throwable  {
      //caseID:aa053fc39f57e3029055dabb4ccbece5
      //CoveredLines: [21, 63, 64, 65]
      
      MemberCollectionServiceImpl memberCollectionServiceImpl0 = new MemberCollectionServiceImpl();
      //mock memberProductCollectionRepository0
      MemberProductCollectionRepository memberProductCollectionRepository0 = mock(MemberProductCollectionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "productCollectionRepository", (Object) memberProductCollectionRepository0);
      
      //Call method: clear
      memberCollectionServiceImpl0.clear();
  }

  @Test(timeout = 4000)
  public void test_delete_3()  throws Throwable  {
      //caseID:b281ba77aeb8c8008c9b748b0d4072ac
      //CoveredLines: [21, 44, 45]
      //Input_0_Long: 586L
      //Assert: assertEquals(0, method_result);
      
      MemberCollectionServiceImpl memberCollectionServiceImpl0 = new MemberCollectionServiceImpl();
      //mock memberProductCollectionRepository0
      MemberProductCollectionRepository memberProductCollectionRepository0 = mock(MemberProductCollectionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "productCollectionRepository", (Object) memberProductCollectionRepository0);
      Long long0 = new Long(586L);
      
      //Call method: delete
      int int0 = memberCollectionServiceImpl0.delete(long0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_detail_4()  throws Throwable  {
      //caseID:4ded08cfe547dadc66962e96a9f7942e
      //CoveredLines: [21, 57, 58]
      //Input_0_Long: 0L
      //Assert: assertNull(method_result);
      
      MemberCollectionServiceImpl memberCollectionServiceImpl0 = new MemberCollectionServiceImpl();
      //mock memberProductCollectionRepository0
      MemberProductCollectionRepository memberProductCollectionRepository0 = mock(MemberProductCollectionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "productCollectionRepository", (Object) memberProductCollectionRepository0);
      Long long0 = new Long(0L);
      
      //Call method: detail
      MemberProductCollection memberProductCollection0 = memberCollectionServiceImpl0.detail(long0);
      
      //Test Result Assert
      assertNull(memberProductCollection0);
  }

  @Test(timeout = 4000)
  public void test_list_5()  throws Throwable  {
      //caseID:931912d9efa57185e8ab9b9fb36ea1d0
      //CoveredLines: [21, 50, 51, 52]
      //Input_0_Integer: 24
      //Input_1_Integer: 24
      //Assert: assertNull(method_result);
      
      MemberCollectionServiceImpl memberCollectionServiceImpl0 = new MemberCollectionServiceImpl();
      //mock memberProductCollectionRepository0
      MemberProductCollectionRepository memberProductCollectionRepository0 = mock(MemberProductCollectionRepository.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMember0
      UmsMember umsMember0 = mock(UmsMember.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock umsMemberService0
      UmsMemberService umsMemberService0 = mock(UmsMemberService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(umsMember0).when(umsMemberService0).getCurrentMember();
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "memberService", (Object) umsMemberService0);
      
      PrivateAccess.setVariable((Class<?>) MemberCollectionServiceImpl.class, memberCollectionServiceImpl0, "productCollectionRepository", (Object) memberProductCollectionRepository0);
      Integer integer0 = new Integer(24);
      
      //Call method: list
      Page<MemberProductCollection> page0 = memberCollectionServiceImpl0.list(integer0, integer0);
      
      //Test Result Assert
      assertNull(page0);
  }
}
