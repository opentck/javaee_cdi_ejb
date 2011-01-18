package org.opentck.javaee.cdi_ejb.deployments.stateful.noviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.stateful.NoViewStatefulEJB;

public class WarDeployedBeanCDIInjectionTest extends BeanCDIInjectionBase
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(BeanCDIInjectionBase.class, NoViewStatefulEJB.class);
   }

}
