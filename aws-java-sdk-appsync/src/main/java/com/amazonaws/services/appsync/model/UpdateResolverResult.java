/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateResolver" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResolverResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated <code>Resolver</code> object.
     * </p>
     */
    private Resolver resolver;

    /**
     * <p>
     * The updated <code>Resolver</code> object.
     * </p>
     * 
     * @param resolver
     *        The updated <code>Resolver</code> object.
     */

    public void setResolver(Resolver resolver) {
        this.resolver = resolver;
    }

    /**
     * <p>
     * The updated <code>Resolver</code> object.
     * </p>
     * 
     * @return The updated <code>Resolver</code> object.
     */

    public Resolver getResolver() {
        return this.resolver;
    }

    /**
     * <p>
     * The updated <code>Resolver</code> object.
     * </p>
     * 
     * @param resolver
     *        The updated <code>Resolver</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverResult withResolver(Resolver resolver) {
        setResolver(resolver);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResolver() != null)
            sb.append("Resolver: ").append(getResolver());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResolverResult == false)
            return false;
        UpdateResolverResult other = (UpdateResolverResult) obj;
        if (other.getResolver() == null ^ this.getResolver() == null)
            return false;
        if (other.getResolver() != null && other.getResolver().equals(this.getResolver()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolver() == null) ? 0 : getResolver().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResolverResult clone() {
        try {
            return (UpdateResolverResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
