package org.opentck.javaee.cdi_ejb.deployments.singleton.localview;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;
import org.opentck.javaee.cdi_ejb.deployments.beans.singleton.LocalViewSingletonEJB;

public class WarDeployedLocalCDIInjectionTest extends LocalCDIInjectionTest
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(LocalCDIInjectionTest.class, LocalViewSingletonEJB.class, LocalI.class);
   }

}
