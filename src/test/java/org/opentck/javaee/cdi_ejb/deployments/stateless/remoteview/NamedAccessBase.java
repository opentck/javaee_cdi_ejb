package org.opentck.javaee.cdi_ejb.deployments.stateless.remoteview;

import java.util.Set;

import javax.enterprise.inject.spi.Bean;

import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;


public abstract class NamedAccessBase extends DeploymentBase
{
   @Test
   public void runTest()
   {
      Set<Bean<?>> beans = getBeans("remoteViewStatelessEJB");
      
      Assert.assertEquals(
            "No beans should be found: " + beans,
            0, beans.size());
   }
   
}
