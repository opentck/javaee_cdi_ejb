package org.opentck.javaee.cdi_ejb.deployments.stateful.noviews;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

import junit.framework.Assert;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opentck.javaee.cdi_ejb.deployments.DeploymentTest;

@RunWith(Arquillian.class)
public class NamedAccessTest extends DeploymentTest
{
   @Inject
   BeanManager beanManager;
   
   @Test
   public void runTest()
   {
      Assert.assertNotNull(getNamedBean("noViewStatefulEJB", Object.class));
   }
   
}
