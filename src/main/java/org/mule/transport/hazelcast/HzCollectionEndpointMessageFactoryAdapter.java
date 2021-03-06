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

import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.transport.AbstractTransportMessageHandler;
import org.mule.transport.hazelcast.spi.HzCollectionEndpoint.MessageFactory;

import java.lang.Object;
import java.lang.Override;

public class HzCollectionEndpointMessageFactoryAdapter implements MessageFactory {

    private AbstractTransportMessageHandler adaptee;

    public HzCollectionEndpointMessageFactoryAdapter(AbstractTransportMessageHandler adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public MuleMessage createMuleMessage(Object payload) throws MuleException {
        return adaptee.createMuleMessage( payload );
    }
}
