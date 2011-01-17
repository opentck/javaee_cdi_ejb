package org.opentck.javaee.cdi_ejb.deployments.stateful.remoteview;

import javax.ejb.EJB;

import junit.framework.Assert;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentTest;
import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;

@RunWith(Arquillian.class)
public class RemoteEEInjectionTest extends DeploymentTest
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
