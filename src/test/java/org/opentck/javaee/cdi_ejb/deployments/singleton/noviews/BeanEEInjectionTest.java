package org.opentck.javaee.cdi_ejb.deployments.singleton.noviews;

import javax.ejb.EJB;

import junit.framework.Assert;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentTest;
import org.opentck.javaee.cdi_ejb.deployments.beans.singleton.NoViewSingletonEJB;

@RunWith(Arquillian.class)
public abstract class BeanEEInjectionTest extends DeploymentTest
{
   @EJB
   NoViewSingletonEJB ejb;

   @Test
   public void runTest()
   {
      Assert.assertNotNull(ejb);
      ejb.ping();
      Assert.assertTrue(ejb.isPinged());
   }

}
