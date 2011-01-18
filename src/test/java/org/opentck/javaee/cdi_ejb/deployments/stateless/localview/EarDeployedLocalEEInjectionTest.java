package org.opentck.javaee.cdi_ejb.deployments.stateless.localview;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;

public class EarDeployedLocalEEInjectionTest extends LocalEEInjectionBase
{

   @Deployment
   public static EnterpriseArchive assemble()
   {
      return createEnterpriseArchive(WarDeployedLocalEEInjectionTest.assemble().addClass(EarDeployedLocalEEInjectionTest.class));
   }

}
