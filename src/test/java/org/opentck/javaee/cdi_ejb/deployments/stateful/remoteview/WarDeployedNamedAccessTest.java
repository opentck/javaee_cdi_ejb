package org.opentck.javaee.cdi_ejb.deployments.stateful.remoteview;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateful.RemoteViewStatefulEJB;

public class WarDeployedNamedAccessTest extends NamedAccessBase
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(NamedAccessBase.class, RemoteViewStatefulEJB.class, RemoteI.class);
   }

}
