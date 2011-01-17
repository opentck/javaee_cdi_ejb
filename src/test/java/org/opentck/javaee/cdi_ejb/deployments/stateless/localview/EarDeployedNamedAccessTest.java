package org.opentck.javaee.cdi_ejb.deployments.stateless.localview;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;

public class EarDeployedNamedAccessTest extends NamedAccessBase
{

   @Deployment
   public static EnterpriseArchive assemble()
   {
      return createEnterpriseArchive(WarDeployedNamedAccessTest.assemble().addClass(EarDeployedNamedAccessTest.class));
   }

}
