package org.opentck.javaee.cdi_ejb.deployments.singleton.remoteview;

import javax.ejb.EJB;

import org.junit.Assert;
import org.junit.Test;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentBase;
import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;

public abstract class RemoteEEInjectionBase extends DeploymentBase
{
   @EJB
   RemoteI ejb;
   
   @Test
   public void runTest()
   {
      Assert.assertNotNull(ejb);
      ejb.ping();
      Assert.assertTrue(ejb.isPinged());
   }
}
