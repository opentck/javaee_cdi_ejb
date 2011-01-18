package org.opentck.javaee.cdi_ejb.deployments.beans.singleton;

import javax.ejb.Singleton;
import javax.inject.Named;

import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;

@Singleton
@Named
public class LocalViewSingletonEJB implements LocalI
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
