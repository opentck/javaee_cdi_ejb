package org.opentck.javaee.cdi_ejb.deployments.singleton.noviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;

public class EarDeployedBeanEEInjectionTest extends BeanEEInjectionBase
{

   @Deployment
   public static EnterpriseArchive assemble()
   {
      return createEnterpriseArchive(WarDeployedBeanEEInjectionTest.assemble().addClass(EarDeployedBeanEEInjectionTest.class));
   }

}
