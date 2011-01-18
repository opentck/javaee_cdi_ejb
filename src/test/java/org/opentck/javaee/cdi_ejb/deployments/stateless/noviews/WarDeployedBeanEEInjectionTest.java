package org.opentck.javaee.cdi_ejb.deployments.stateless.noviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateless.NoViewStatelessEJB;

public class WarDeployedBeanEEInjectionTest extends BeanEEInjectionBase
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(BeanEEInjectionBase.class, NoViewStatelessEJB.class);
   }

}
