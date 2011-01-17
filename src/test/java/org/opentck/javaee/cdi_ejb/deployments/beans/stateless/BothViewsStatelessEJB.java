package org.opentck.javaee.cdi_ejb.deployments.beans.stateless;

import javax.ejb.Stateless;
import javax.inject.Named;

import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;
import org.opentck.javaee.cdi_ejb.deployments.beans.RemoteI;

@Stateless
@Named
public class BothViewsStatelessEJB implements LocalI, RemoteI
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
