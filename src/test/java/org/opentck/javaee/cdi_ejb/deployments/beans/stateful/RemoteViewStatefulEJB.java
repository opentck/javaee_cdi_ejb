package org.opentck.javaee.cdi_ejb.deployments.beans.stateful;

import javax.ejb.Stateful;
import javax.enterprise.inject.Model;

import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;

@Stateful
@Model
public class RemoteViewStatefulEJB implements RemoteI
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
