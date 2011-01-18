package org.opentck.javaee.cdi_ejb.deployments.singleton.bothviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;

public class EarDeployedRemoteEEInjectionTest extends RemoteEEInjectionBase
{

   @Deployment
   public static EnterpriseArchive assemble()
   {
      return createEnterpriseArchive(WarDeployedRemoteEEInjectionTest.assemble().addClass(EarDeployedRemoteEEInjectionTest.class));
   }

}
