package org.opentck.javaee.cdi_ejb.deployments.stateful.noviews;


import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;

public abstract class NamedAccessBase extends DeploymentBase
{
   @Test
   public void runTest()
   {
      Assert.assertNotNull(getNamedBean("noViewStatefulEJB", Object.class));
   }
   
}
