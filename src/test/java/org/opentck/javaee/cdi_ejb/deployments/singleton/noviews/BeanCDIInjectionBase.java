package org.opentck.javaee.cdi_ejb.deployments.singleton.noviews;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;
import org.opentck.javaee.cdi_ejb.deployments.beans.singleton.NoViewSingletonEJB;

public abstract class BeanCDIInjectionBase extends DeploymentBase
{
   @Inject
   NoViewSingletonEJB ejb;

   @Test
   public void runTest()
   {
      Assert.assertNotNull(ejb);
      ejb.ping();
      Assert.assertTrue(ejb.isPinged());
   }

}
