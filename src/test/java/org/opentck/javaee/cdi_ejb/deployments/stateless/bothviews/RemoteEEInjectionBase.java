package org.opentck.javaee.cdi_ejb.deployments.stateless.bothviews;

import javax.ejb.EJB;

import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;
import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;

public abstract class RemoteEEInjectionBase extends DeploymentBase
{
   @EJB
   RemoteI remote;
     
   @Test
   public void runTest()
   {
      Assert.assertNotNull(remote);
      remote.ping();
      Assert.assertTrue(remote.isPinged());
   }
   
}
