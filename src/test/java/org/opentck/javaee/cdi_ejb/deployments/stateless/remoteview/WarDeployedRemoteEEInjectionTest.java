package org.opentck.javaee.cdi_ejb.deployments.stateless.remoteview;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateless.RemoteViewStatelessEJB;

public class WarDeployedRemoteEEInjectionTest extends RemoteEEInjectionBase
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(RemoteEEInjectionBase.class, RemoteViewStatelessEJB.class, RemoteI.class);
   }

}
