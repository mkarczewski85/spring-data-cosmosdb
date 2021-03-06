/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.azure.spring.data.cosmosdb.repository.query;

import org.springframework.core.MethodParameter;
import org.springframework.data.repository.query.Parameters;

import java.lang.reflect.Method;
import java.util.List;

public class CosmosParameters extends Parameters<CosmosParameters, CosmosParameter> {

    public CosmosParameters(Method method) {
        super(method);
    }

    private CosmosParameters(List<CosmosParameter> parameters) {
        super(parameters);
    }

    @Override
    protected CosmosParameters createFrom(List<CosmosParameter> parameters) {
        return new CosmosParameters(parameters);
    }

    @Override
    protected CosmosParameter createParameter(MethodParameter parameter) {
        return new CosmosParameter(parameter);
    }
}
