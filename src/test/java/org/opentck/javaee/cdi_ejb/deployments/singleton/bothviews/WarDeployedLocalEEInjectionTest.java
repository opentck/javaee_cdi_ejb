package org.opentck.javaee.cdi_ejb.deployments.singleton.bothviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;
import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;
import org.opentck.javaee.cdi_ejb.deployments.beans.singleton.BothViewsSingletonEJB;

public class WarDeployedLocalEEInjectionTest extends LocalEEInjectionBase
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(LocalEEInjectionBase.class, BothViewsSingletonEJB.class, RemoteI.class, LocalI.class);
   }

}
