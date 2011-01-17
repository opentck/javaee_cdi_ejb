package org.opentck.javaee.cdi_ejb.deployments.stateless.noviews;

import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;

public abstract class NamedAccessBase extends DeploymentBase
{
   @Test
   public void runTest()
   {
      Assert.assertNotNull(getNamedBean("noViewStatelessEJB", Object.class));
   }
   
}
