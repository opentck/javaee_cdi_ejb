package org.opentck.javaee.cdi_ejb.deployments.stateless.noviews;

import javax.ejb.EJB;

import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateless.NoViewStatelessEJB;

public abstract class BeanEEInjectionBase extends DeploymentBase
{
   @EJB
   NoViewStatelessEJB ejb;
   
   @Test
   public void runTest()
   {
      Assert.assertNotNull(ejb);
      ejb.ping();
      Assert.assertTrue(ejb.isPinged());
   }

}
