/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by smartunit
 */

package smartunit.com.macro.mall.portal.service.impl;

import org.smartunit.runtime.annotation.SmartSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.smartunit.runtime.sandbox.Sandbox;
import org.smartunit.runtime.sandbox.Sandbox.SandboxMode;

import static org.smartunit.shaded.org.mockito.Mockito.*;
@SmartSuiteClassExclude
public class OmsPortalOrderServiceImpl_SSTest_scaffolding {

  @org.junit.Rule 
  public org.smartunit.runtime.vnet.NonFunctionalRequirementRule nfr = new org.smartunit.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private final org.smartunit.runtime.thread.ThreadStopper threadStopper =  new org.smartunit.runtime.thread.ThreadStopper (org.smartunit.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initSmartSuiteFramework() { 
    org.smartunit.runtime.RuntimeSettings.className = "com.macro.mall.portal.service.impl.OmsPortalOrderServiceImpl"; 
    org.smartunit.runtime.GuiSupport.initialize(); 
    org.smartunit.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.smartunit.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = Long.MAX_VALUE; 
    org.smartunit.runtime.RuntimeSettings.mockSystemIn = true; 
    org.smartunit.runtime.RuntimeSettings.sandboxMode = org.smartunit.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.smartunit.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.smartunit.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.smartunit.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearSmartSuiteFramework(){ 
    resetClasses(); 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.smartunit.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.smartunit.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.smartunit.runtime.GuiSupport.setHeadless(); 
    org.smartunit.runtime.Runtime.getInstance().resetRuntime(); 
    org.smartunit.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.smartunit.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.smartunit.runtime.classhandling.JDKClassResetter.reset(); 
    org.smartunit.runtime.classhandling.ClassStateSupport.resetCUT(); 
    org.smartunit.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.smartunit.runtime.agent.InstrumentingAgent.deactivate(); 
    org.smartunit.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.macro.mall.common.service.RedisService", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.mapper.OmsOrderItemMapper", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.mapper.OmsOrderMapper", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.mapper.OmsOrderSettingMapper", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.mapper.PmsSkuStockMapper", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.mapper.SmsCouponHistoryMapper", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.mapper.UmsIntegrationConsumeSettingMapper", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.OmsOrder", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.OmsOrderItem", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.OmsOrderSetting", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.PmsSkuStock", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.SmsCoupon", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.SmsCouponHistory", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.SmsCouponProductCategoryRelation", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.SmsCouponProductRelation", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.UmsIntegrationConsumeSetting", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.UmsMember", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.model.UmsMemberReceiveAddress", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.component.CancelOrderSender", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.dao.PortalOrderDao", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.dao.PortalOrderItemDao", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.domain.CartPromotionItem", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.domain.OmsOrderDetail", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.domain.OrderParam", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.domain.SmsCouponHistoryDetail", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.service.OmsCartItemService", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.service.UmsMemberCouponService", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.service.UmsMemberReceiveAddressService", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
    mock(Class.forName("com.macro.mall.portal.service.UmsMemberService", false, OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()), withSettings().stubOnly());
  }

  private static void initializeClasses() {
    org.smartunit.runtime.classhandling.ClassStateSupport.initializeClasses(OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader() , ""
    );
  } 

  private static void resetClasses() {
    org.smartunit.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OmsPortalOrderServiceImpl_SSTest_scaffolding.class.getClassLoader()); 

    org.smartunit.runtime.classhandling.ClassStateSupport.resetClasses();
  }
}
