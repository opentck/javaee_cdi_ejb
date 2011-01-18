package org.opentck.javaee.cdi_ejb.deployments.stateless.noviews;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateless.NoViewStatelessEJB;

public abstract class BeanCDIInjectionBase extends DeploymentBase
{
   @Inject
   NoViewStatelessEJB ejb;
   
   @Test
   public void runTest()
   {
      Assert.assertNotNull(ejb);
      ejb.ping();
      Assert.assertTrue(ejb.isPinged());
   }
   
}
