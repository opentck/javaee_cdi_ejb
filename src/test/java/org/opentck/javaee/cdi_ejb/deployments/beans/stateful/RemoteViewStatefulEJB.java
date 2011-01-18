package org.opentck.javaee.cdi_ejb.deployments.beans.stateful;

import javax.ejb.Stateful;
import javax.inject.Named;

import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;

@Stateful
@Named
public class RemoteViewStatefulEJB implements RemoteI
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
