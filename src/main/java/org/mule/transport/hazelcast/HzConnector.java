/**
 * Copyright (C) 2013 SOLENT SAS <oss@solent.fr>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mule.transport.hazelcast;

import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.transport.AbstractConnector;

/**
 * <code>HazelcastConnector</code> TODO document
 */
public class HzConnector extends AbstractConnector
{

    /* For general guidelines on writing transports see
       http://www.mulesoft.org/documentation/display/MULE3USER/Creating+Transports */

    /* IMPLEMENTATION NOTE: All configuaration for the transport should be set
       on the Connector object, this is the object that gets configured in
       MuleXml */
       
    public HzConnector(MuleContext context)
    {
        super(context);
    }
       
    @Override
    public void doInitialise() throws InitialisationException
    {
        // Optional; does not need to be implemented. Delete if not required

        /* IMPLEMENTATION NOTE: Is called once all bean properties have been
           set on the connector and can be used to validate and initialise the
           connectors state. */
    }

    @Override
    public void doConnect() throws Exception
    {
        // Optional; does not need to be implemented. Delete if not required

        /* IMPLEMENTATION NOTE: Makes a connection to the underlying
           resource. When connections are managed at the receiver/dispatcher
           level, this method may do nothing */
    }

    @Override
    public void doDisconnect() throws Exception
    {
        // Optional; does not need to be implemented. Delete if not required

        /* IMPLEMENTATION NOTE: Disconnects any connections made in the
           connect method If the connect method did not do anything then this
           method shouldn't do anything either. */
    }

    @Override
    public void doStart() throws MuleException
    {
        // Optional; does not need to be implemented. Delete if not required

        /* IMPLEMENTATION NOTE: If there is a single server instance or
           connection associated with the connector i.e. Jms Connection or Jdbc Connection, 
           this method should put the resource in a started state here. */
    }

    @Override
    public void doStop() throws MuleException
    {
        // Optional; does not need to be implemented. Delete if not required

        /* IMPLEMENTATION NOTE: Should put any associated resources into a
           stopped state. Mule will automatically call the stop() method. */
    }

    @Override
    public void doDispose()
    {
        // Optional; does not need to be implemented. Delete if not required

        /* IMPLEMENTATION NOTE: Should clean up any open resources associated
           with the connector. */
    }

    public String getProtocol()
    {
        return HzConstants.PROTOCOL_IDENTIFIER;
    }
}
