package org.opentck.javaee.cdi_ejb.deployments.stateless.localview;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateless.LocalViewStatelessEJB;

public class WarDeployedLocalEEInjectionTest extends LocalEEInjectionBase
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(LocalEEInjectionBase.class, LocalViewStatelessEJB.class, LocalI.class);
   }

}
