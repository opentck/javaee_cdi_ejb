package org.opentck.javaee.cdi_ejb.deployments.stateful.remoteview;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;

public class EarDeployedLocalEEInjectionTest extends RemoteEEInjectionBase
{

   @Deployment
   public static EnterpriseArchive assemble()
   {
      return createEnterpriseArchive(WarDeployedRemoteEEInjectionTest.assemble().addClass(EarDeployedLocalEEInjectionTest.class));
   }

}
