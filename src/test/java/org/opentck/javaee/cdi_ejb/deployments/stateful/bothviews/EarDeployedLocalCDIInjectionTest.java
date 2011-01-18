package org.opentck.javaee.cdi_ejb.deployments.stateful.bothviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;

public class EarDeployedLocalCDIInjectionTest extends LocalCDIInjectionBase
{

   @Deployment
   public static EnterpriseArchive assemble()
   {
      return createEnterpriseArchive(WarDeployedLocalCDIInjectionTest.assemble().addClass(EarDeployedLocalCDIInjectionTest.class));
   }

}
