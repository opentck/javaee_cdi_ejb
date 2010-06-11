package org.jboss.weld.deployments.war.singleton;

import javax.ejb.EJB;
import javax.inject.Inject;

import junit.framework.Assert;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.weld.deployments.DeploymentTest;
import org.jboss.weld.deployments.beans.LocalI;
import org.jboss.weld.deployments.beans.RemoteI;
import org.jboss.weld.deployments.beans.singleton.BothViewsSingletonEJB;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class BothViewsAccessTest extends DeploymentTest
{
   @Inject
   LocalI local;
   
   @EJB
   LocalI local_;
   
   @EJB
   RemoteI remote;
   
   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(BothViewsSingletonEJB.class, RemoteI.class, LocalI.class);
   }
   
   @Test
   public void runTest()
   {
      Assert.assertNotNull(local);
      Assert.assertNotNull(local_);
      Assert.assertNotNull(remote);
      local.ping();
      local_.ping();
      remote.ping();
      Assert.assertTrue(local.isPinged());
      Assert.assertTrue(local_.isPinged());
      Assert.assertTrue(remote.isPinged());
      //Assert.assertTrue(getNamedBean("bothViewsSingletonEJB", BothViewsSingletonEJB.class).isPinged());
   }
   
   
}
