package org.opentck.javaee.cdi_ejb.deployments.beans.singleton;

import javax.ejb.Singleton;
import javax.inject.Named;

@Singleton
@Named
public class NoViewSingletonEJB
{
   boolean pinged;

   public void ping()
   {
      pinged = true;
   }

   public boolean isPinged()
   {
      return pinged;
   }

}
