/*******************************************************************************
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Roman Grigoriadi
 ******************************************************************************/

package org.eclipse.persistence.json.bind.internal.serializer;

import org.eclipse.persistence.json.bind.internal.Unmarshaller;
import org.eclipse.persistence.json.bind.model.JsonBindingModel;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/**
 * Deserialize bigdecimal.
 * @author David Král
 */
public class BigDecimalTypeDeserializer extends AbstractNumberDeserializer<BigDecimal> {

    BigDecimalTypeDeserializer(JsonBindingModel model) {
        super(BigDecimal.class, model);
    }

    @Override
    public BigDecimal deserialize(String jsonValue, Unmarshaller unmarshaller, Type rtType) {
        return deserializeForamtted(jsonValue, false).map(num->new BigDecimal(num.toString()))
                .orElseGet(()->new BigDecimal(jsonValue));
    }
}
