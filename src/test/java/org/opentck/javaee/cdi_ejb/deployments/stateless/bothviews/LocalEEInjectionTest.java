package org.opentck.javaee.cdi_ejb.deployments.stateless.bothviews;

import javax.ejb.EJB;

import junit.framework.Assert;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentTest;
import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;

@RunWith(Arquillian.class)
public class LocalEEInjectionTest extends DeploymentTest
{
   
   @EJB
   LocalI local;
   @Test
   public void runTest()
   {
      Assert.assertNotNull(local);
      local.ping();
      Assert.assertTrue(local.isPinged());
   }
   
}
