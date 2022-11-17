/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.macro.mall.dto.BucketPolicyConfigDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BucketPolicyConfigDto_SSTest extends BucketPolicyConfigDto_SSTest_scaffolding {
// allCoveredLines:[13, 14, 15, 18, 19, 21, 22, 23, 25, 26, 27, 28]

  @Test(timeout = 4000)
  public void test_equals_00()  throws Throwable  {
      //caseID:eb85a3ddf78315ffcb19f67a6ee937a4
      //CoveredLines: [14, 14, 14, 15, 15, 15, 15, 15, 15, 15]
      //Input_0_Object: bucketPolicyConfigDto0
      //Assert: assertTrue(method_result);
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto bucketPolicyConfigDto0 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      //Call method: equals
      boolean boolean0 = bucketPolicyConfigDto0.equals(bucketPolicyConfigDto0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_equals_01()  throws Throwable  {
      //caseID:6ebc8e75a0c93b30164d690bf04de5cb
      //CoveredLines: [14, 14, 14, 15, 15, 15, 15, 15, 15, 15]
      //Input_0_Object: bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0
      //Assert: assertFalse(method_result);
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto bucketPolicyConfigDto0 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      //Call method: equals
      boolean boolean0 = bucketPolicyConfigDto0.equals(bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_equals_02()  throws Throwable  {
      //caseID:9c5f3e9ec2df47fd50b89434667b0e6d
      //CoveredLines: [14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 18, 19]
      //Input_0_Object: bucketPolicyConfigDto0
      //Assert: assertTrue(method_result);
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto bucketPolicyConfigDto0 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      BucketPolicyConfigDto bucketPolicyConfigDto1 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      //Call method: equals
      boolean boolean0 = bucketPolicyConfigDto1.equals(bucketPolicyConfigDto0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_equals_03()  throws Throwable  {
      //caseID:7fce4643c75ab29ad23cd62a8a1afddc
      //CoveredLines: [14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 18, 19]
      //Input_0_Object: bucketPolicyConfigDto1
      //Assert: assertTrue(method_result);
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto bucketPolicyConfigDto0 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      BucketPolicyConfigDto bucketPolicyConfigDto1 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      //Call method: equals
      boolean boolean0 = bucketPolicyConfigDto0.equals(bucketPolicyConfigDto1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_equals_04()  throws Throwable  {
      //caseID:528584cdbbcc3f1a2f156cb1fd39a1f4
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23]
      //Input_0_Object: bucketPolicyConfigDto0
      //Assert: assertFalse(method_result);
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto bucketPolicyConfigDto0 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder0 = BucketPolicyConfigDto.Statement.builder();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder1 = bucketPolicyConfigDto_Statement_StatementBuilder0.Resource("");
      
      BucketPolicyConfigDto.Statement bucketPolicyConfigDto_Statement0 = bucketPolicyConfigDto_Statement_StatementBuilder1.build();
      
      //Call method: equals
      boolean boolean0 = bucketPolicyConfigDto_Statement0.equals(bucketPolicyConfigDto0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_hashCode_05()  throws Throwable  {
      //caseID:636120c626d74a97645e584c378b57b2
      //CoveredLines: [14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 18, 19]
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto bucketPolicyConfigDto0 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      //Call method: hashCode
      bucketPolicyConfigDto0.hashCode();
  }

  @Test(timeout = 4000)
  public void test_setAction_06()  throws Throwable  {
      //caseID:25ffd20ae9b1ec3865c57df427c4c974
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 21, 21, 21, 21, 21, 23, 23, 23, 23, 23, 23, 23, 23, 23]
      //Input_0_String: 1
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      Vector<BucketPolicyConfigDto.Statement> vector0 = new Vector<BucketPolicyConfigDto.Statement>();
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder1 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.Statement(vector0);
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder2 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder1.Version("H");
      
      bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder2.build();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder0 = BucketPolicyConfigDto.Statement.builder();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder1 = bucketPolicyConfigDto_Statement_StatementBuilder0.Principal("43");
      
      BucketPolicyConfigDto.Statement bucketPolicyConfigDto_Statement0 = bucketPolicyConfigDto_Statement_StatementBuilder1.build();
      
      //Test Result Assert
      assertEquals("43", bucketPolicyConfigDto_Statement0.getPrincipal());
      
      
      //Call method: setAction
      bucketPolicyConfigDto_Statement0.setAction("1");
      
      //Test Result Assert
      assertEquals("43", bucketPolicyConfigDto_Statement0.getPrincipal());
  }

  @Test(timeout = 4000)
  public void test_setEffect_07()  throws Throwable  {
      //caseID:ff4ee6e4b3e1d2a962ccba50a11c3fca
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 21, 21, 21, 21, 21, 23, 23, 23, 23, 23, 23, 23, 23, 23]
      //Input_0_String: , Principal=
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder0 = BucketPolicyConfigDto.Statement.builder();
      
      BucketPolicyConfigDto.Statement bucketPolicyConfigDto_Statement0 = bucketPolicyConfigDto_Statement_StatementBuilder0.build();
      
      //Call method: setEffect
      bucketPolicyConfigDto_Statement0.setEffect(", Principal=");
      
      //Test Result Assert
      assertNull(bucketPolicyConfigDto_Statement0.getResource());
  }

  @Test(timeout = 4000)
  public void test_setPrincipal_08()  throws Throwable  {
      //caseID:2d899ac8861b0c6cd6521e1d2838b389
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 21, 21, 21, 21, 21, 23, 23, 23, 23, 23, 23, 23, 23, 23]
      //Input_0_String: , Principal=
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder1 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.Version("d5 p6pqLy&sN");
      Vector<BucketPolicyConfigDto.Statement> vector0 = new Vector<BucketPolicyConfigDto.Statement>();
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder2 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder1.Statement(vector0);
      
      bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder2.build();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder0 = BucketPolicyConfigDto.Statement.builder();
      
      BucketPolicyConfigDto.Statement bucketPolicyConfigDto_Statement0 = bucketPolicyConfigDto_Statement_StatementBuilder0.build();
      
      //Call method: setPrincipal
      bucketPolicyConfigDto_Statement0.setPrincipal(", Principal=");
      
      //Test Result Assert
      assertNull(bucketPolicyConfigDto_Statement0.getResource());
  }

  @Test(timeout = 4000)
  public void test_setResource_09()  throws Throwable  {
      //caseID:95923439874300bcf826baf079954f27
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 21, 21, 21, 21, 21, 23, 23, 23, 23, 23, 23, 23, 23, 23]
      //Input_0_String:  found so using endpoint default
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder1 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.Version("6]]7pCZ_#z/}^M\"/");
      
      bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder1.build();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder0 = BucketPolicyConfigDto.Statement.builder();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder1 = bucketPolicyConfigDto_Statement_StatementBuilder0.Principal("1");
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder2 = bucketPolicyConfigDto_Statement_StatementBuilder1.Action("overflowQueueSupplier");
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder3 = bucketPolicyConfigDto_Statement_StatementBuilder2.Effect("43");
      
      BucketPolicyConfigDto.Statement bucketPolicyConfigDto_Statement0 = bucketPolicyConfigDto_Statement_StatementBuilder3.build();
      
      //Call method: setResource
      bucketPolicyConfigDto_Statement0.setResource(" found so using endpoint default");
      
      //Test Result Assert
      assertEquals("43", bucketPolicyConfigDto_Statement0.getEffect());
      
      //Test Result Assert
      assertEquals("overflowQueueSupplier", bucketPolicyConfigDto_Statement0.getAction());
      
      //Test Result Assert
      assertEquals("1", bucketPolicyConfigDto_Statement0.getPrincipal());
  }

  @Test(timeout = 4000)
  public void test_setStatement_10()  throws Throwable  {
      //caseID:9b427f5d8df1337734910947e70e298f
      //CoveredLines: [13, 13, 13, 15, 15, 15, 15, 15, 15, 15]
      //Input_0_List<BucketPolicyConfigDto.Statement>: arrayList0
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto bucketPolicyConfigDto0 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      ArrayList<BucketPolicyConfigDto.Statement> arrayList0 = new ArrayList<BucketPolicyConfigDto.Statement>();
      
      //Call method: setStatement
      bucketPolicyConfigDto0.setStatement(arrayList0);
      
      //Test Result Assert
      assertTrue(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_setVersion_11()  throws Throwable  {
      //caseID:9e9f6d364a243b4e8923b7c3cef13a37
      //CoveredLines: [13, 13, 13, 15, 15, 15, 15, 15, 15, 15]
      //Input_0_String: 1.0
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      Stack<BucketPolicyConfigDto.Statement> stack0 = new Stack<BucketPolicyConfigDto.Statement>();
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder1 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.Statement(stack0);
      
      BucketPolicyConfigDto bucketPolicyConfigDto0 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder1.build();
      
      //Call method: setVersion
      bucketPolicyConfigDto0.setVersion("1.0");
      
      //Test Result Assert
      assertEquals("1.0", bucketPolicyConfigDto0.getVersion());
  }

  @Test(timeout = 4000)
  public void test_toString_12()  throws Throwable  {
      //caseID:1ad5e091305c2b58cc177e780c9a79cd
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15]
      //Assert: assertEquals("BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder(Version=null, Statement=null)", method_result);
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      //Call method: toString
      String string0 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.toString();
      
      //Test Result Assert
      assertEquals("BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder(Version=null, Statement=null)", string0);
  }

  @Test(timeout = 4000)
  public void test_toString_13()  throws Throwable  {
      //caseID:8355777d0ec2e33b705a70390d11c0cc
      //CoveredLines: [13, 13, 13, 15, 15, 15, 15, 15, 15, 15, 18, 19]
      //Assert: assertEquals("BucketPolicyConfigDto(Version=null, Statement=null)", method_result);
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto bucketPolicyConfigDto0 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      //Call method: toString
      String string0 = bucketPolicyConfigDto0.toString();
      
      //Test Result Assert
      assertEquals("BucketPolicyConfigDto(Version=null, Statement=null)", string0);
  }

  @Test(timeout = 4000)
  public void test_toString_14()  throws Throwable  {
      //caseID:de8552b39d2dfab7f3f9f6ead3d7a3d8
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 23, 23, 23, 23, 23, 23, 23, 23, 23]
      //Assert: assertEquals("BucketPolicyConfigDto.Statement.StatementBuilder(Effect=null, Principal=null, Action=null, Resource=null)", method_result);
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder0 = BucketPolicyConfigDto.Statement.builder();
      
      //Call method: toString
      String string0 = bucketPolicyConfigDto_Statement_StatementBuilder0.toString();
      
      //Test Result Assert
      assertEquals("BucketPolicyConfigDto.Statement.StatementBuilder(Effect=null, Principal=null, Action=null, Resource=null)", string0);
  }

  @Test(timeout = 4000)
  public void test_toString_15()  throws Throwable  {
      //caseID:a9715cc67c1bd69369b6e188c99cb596
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 21, 21, 21, 21, 21, 23, 23, 23, 23, 23, 23, 23, 23, 23, 25, 26, 27, 28]
      //Assert: assertEquals("BucketPolicyConfigDto.Statement(Effect=), Principal=skipOn, Action=, Resource=, Resource=com.macro.mall.dto.BucketPolicyConfigDto$BucketPolicyConfigDtoBuilder)", method_result);
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder1 = bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.Version(", Resource=");
      
      bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder1.build();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder0 = BucketPolicyConfigDto.Statement.builder();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder1 = bucketPolicyConfigDto_Statement_StatementBuilder0.Action(", Resource=");
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder2 = bucketPolicyConfigDto_Statement_StatementBuilder1.Principal("skipOn");
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder3 = bucketPolicyConfigDto_Statement_StatementBuilder2.Effect(")");
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder4 = bucketPolicyConfigDto_Statement_StatementBuilder3.Resource("com.macro.mall.dto.BucketPolicyConfigDto$BucketPolicyConfigDtoBuilder");
      
      BucketPolicyConfigDto.Statement bucketPolicyConfigDto_Statement0 = bucketPolicyConfigDto_Statement_StatementBuilder4.build();
      
      //Call method: toString
      String string0 = bucketPolicyConfigDto_Statement0.toString();
      
      //Test Result Assert
      assertEquals("BucketPolicyConfigDto.Statement(Effect=), Principal=skipOn, Action=, Resource=, Resource=com.macro.mall.dto.BucketPolicyConfigDto$BucketPolicyConfigDtoBuilder)", string0);
  }

  @Test(timeout = 4000)
  public void test_toString_16()  throws Throwable  {
      //caseID:5bf8d328f62ba10db9a28b556590c7ab
      //CoveredLines: [15, 15, 15, 15, 15, 15, 15, 21, 21, 21, 21, 21, 23, 23, 23, 23, 23, 23, 23, 23, 23, 25, 26, 27, 28]
      //Assert: assertEquals("BucketPolicyConfigDto.Statement(Effect=null, Principal=null, Action=null, Resource=null)", method_result);
      
      
      BucketPolicyConfigDto.BucketPolicyConfigDtoBuilder bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0 = BucketPolicyConfigDto.builder();
      
      bucketPolicyConfigDto_BucketPolicyConfigDtoBuilder0.build();
      
      BucketPolicyConfigDto.Statement.StatementBuilder bucketPolicyConfigDto_Statement_StatementBuilder0 = BucketPolicyConfigDto.Statement.builder();
      
      BucketPolicyConfigDto.Statement bucketPolicyConfigDto_Statement0 = bucketPolicyConfigDto_Statement_StatementBuilder0.build();
      
      //Call method: toString
      String string0 = bucketPolicyConfigDto_Statement0.toString();
      
      //Test Result Assert
      assertEquals("BucketPolicyConfigDto.Statement(Effect=null, Principal=null, Action=null, Resource=null)", string0);
  }
}
