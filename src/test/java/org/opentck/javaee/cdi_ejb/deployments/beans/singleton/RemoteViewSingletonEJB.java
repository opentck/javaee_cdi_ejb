package org.opentck.javaee.cdi_ejb.deployments.beans.singleton;

import javax.ejb.Singleton;
import javax.inject.Named;

import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;

@Singleton
@Named
public class RemoteViewSingletonEJB implements RemoteI
{
   private static final long serialVersionUID = 1L;

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
