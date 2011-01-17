package org.opentck.javaee.cdi_ejb.deployments.stateful.noviews;

import javax.inject.Inject;

import junit.framework.Assert;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentTest;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateful.NoViewStatefulEJB;

@RunWith(Arquillian.class)
public class BeanCDIInjectionTest extends DeploymentTest
{
   @Inject
   NoViewStatefulEJB ejb;
   
   @Test
   public void runTest()
   {
      Assert.assertNotNull(ejb);
      ejb.ping();
      Assert.assertTrue(ejb.isPinged());
   }
   
}
