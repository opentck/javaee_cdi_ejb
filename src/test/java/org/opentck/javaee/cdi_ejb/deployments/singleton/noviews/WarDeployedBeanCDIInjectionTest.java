package org.opentck.javaee.cdi_ejb.deployments.singleton.noviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.opentck.javaee.cdi_ejb.deployments.beans.singleton.NoViewSingletonEJB;

public class WarDeployedBeanCDIInjectionTest extends BeanCDIInjectionBase
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(BeanCDIInjectionBase.class, NoViewSingletonEJB.class);
   }

}
