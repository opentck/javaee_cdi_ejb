package org.opentck.javaee.cdi_ejb.deployments.visibility;

import javax.inject.Inject;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateful.NoViewStatefulEJB;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateful.NoViewStatefulEJB2;

public class WarTwoJarPackedVisibilityTest extends DeploymentBase
{
   @Inject
   NoViewStatefulEJB ejb;
   
   @Inject
   NoViewStatefulEJB2 ejb_;
   
   @Deployment
   public static WebArchive assemble()
   {
      return createWebArchive(createCDIArchive("one.jar", NoViewStatefulEJB.class), createCDIArchive("two.jar", NoViewStatefulEJB2.class));
   }
   
   @Test
   public void runTest()
   {
      Assert.assertNotNull(ejb);
      Assert.assertNotNull(ejb_);
      ejb.ping();
      ejb_.ping();
      Assert.assertTrue(ejb.isPinged());
      Assert.assertTrue(ejb_.isPinged());
   }

}
