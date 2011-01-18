package org.opentck.javaee.cdi_ejb.deployments.beans.stateless;

import javax.ejb.Stateless;
import javax.inject.Named;

import org.opentck.javaee.cdi_ejb.deployments.beans.LocalI;

@Stateless
@Named
public class LocalViewStatelessEJB implements LocalI
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
