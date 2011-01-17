package org.opentck.javaee.cdi_ejb.deployments.stateful.bothviews;

import javax.ejb.EJB;

import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;
import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;

public abstract class LocalEEInjectionBase extends DeploymentBase
{
   @EJB
   LocalI local;

   @Test
   public void runTest()
   {
      Assert.assertNotNull(local);
      local.ping();
      Assert.assertTrue(local.isPinged());
   }

}
