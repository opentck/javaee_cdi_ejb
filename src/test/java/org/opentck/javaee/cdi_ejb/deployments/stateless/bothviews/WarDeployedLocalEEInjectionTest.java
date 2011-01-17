package org.opentck.javaee.cdi_ejb.deployments.stateless.bothviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;
import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateless.BothViewsStatelessEJB;

public class WarDeployedLocalEEInjectionTest extends LocalEEInjectionTest
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(LocalEEInjectionTest.class, BothViewsStatelessEJB.class, RemoteI.class, LocalI.class);
   }

}
