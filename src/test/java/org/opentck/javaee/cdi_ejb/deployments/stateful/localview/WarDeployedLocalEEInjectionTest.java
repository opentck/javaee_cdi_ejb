package org.opentck.javaee.cdi_ejb.deployments.stateful.localview;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateful.LocalViewStatefulEJB;

public class WarDeployedLocalEEInjectionTest extends LocalEEInjectionTest
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(LocalEEInjectionTest.class, LocalViewStatefulEJB.class, LocalI.class);
   }

}
