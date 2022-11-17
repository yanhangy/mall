/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.macro.mall.Generator;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Generator_SSTest extends Generator_SSTest_scaffolding {
// allCoveredLines:[16, 19, 21, 23, 24, 25, 26, 28, 30, 32]

  @Test(timeout = 4000)
  public void test_main_0()  throws Throwable  {
      //caseID:0a52933380cf31708d24bac658eaf05e
      //CoveredLines: [16, 19, 21, 23, 24, 25, 26, 28, 30, 32]
      //Input_0_String[]: stringArray0
      
      Generator generator0 = new Generator();
      String[] stringArray0 = new String[0];
      
      //Call method: main
      try { 
        Generator.main(stringArray0);
      } catch(Throwable e) {
         verifyException("com.mysql.cj.jdbc.exceptions.SQLError", e);
         assertEquals("com.mysql.cj.jdbc.exceptions.CommunicationsException", e.getClass().getName());
         assertEquals("Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.", e.getMessage());
      }
  }
}
