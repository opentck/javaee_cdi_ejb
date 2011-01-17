package org.opentck.javaee.cdi_ejb.deployments.stateless.bothviews;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;
import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;

public abstract class LocalCDIInjectionBase extends DeploymentBase
{
   @Inject
   LocalI local;

   @Test
   public void runTest()
   {
      Assert.assertNotNull(local);
      local.ping();
      Assert.assertTrue(local.isPinged());
   }

}
