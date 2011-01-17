package org.opentck.javaee.cdi_ejb.deployments.stateful.bothviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;

public class EarDeployedNamedAccessTest extends NamedAccessTest
{

   @Deployment
   public static EnterpriseArchive assemble()
   {
      return createEnterpriseArchive(WarDeployedNamedAccessTest.assemble().addClass(EarDeployedNamedAccessTest.class));
   }

}
