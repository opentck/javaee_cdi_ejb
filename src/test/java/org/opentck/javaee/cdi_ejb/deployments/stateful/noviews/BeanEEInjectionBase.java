package org.opentck.javaee.cdi_ejb.deployments.stateful.noviews;

import javax.ejb.EJB;

import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateful.NoViewStatefulEJB;

public abstract class BeanEEInjectionBase extends DeploymentBase
{
   @EJB
   NoViewStatefulEJB ejb;

   @Test
   public void runTest()
   {
      Assert.assertNotNull(ejb);
      ejb.ping();
      Assert.assertTrue(ejb.isPinged());
   }

}
