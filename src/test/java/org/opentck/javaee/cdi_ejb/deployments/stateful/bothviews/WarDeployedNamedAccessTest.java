package org.opentck.javaee.cdi_ejb.deployments.stateful.bothviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;
import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateful.BothViewsStatefulEJB;

public class WarDeployedNamedAccessTest extends NamedAccessBase
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(NamedAccessBase.class, BothViewsStatefulEJB.class, RemoteI.class, LocalI.class);
   }

}
