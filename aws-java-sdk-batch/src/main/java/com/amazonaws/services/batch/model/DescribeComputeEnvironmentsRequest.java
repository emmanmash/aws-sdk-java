/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeComputeEnvironmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
     * </p>
     */
    private java.util.List<String> computeEnvironments;
    /**
     * <p>
     * The maximum number of cluster results returned by <code>DescribeComputeEnvironments</code> in paginated output.
     * When this parameter is used, <code>DescribeComputeEnvironments</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeComputeEnvironments</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>DescribeComputeEnvironments</code> returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeComputeEnvironments</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @return A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
     */

    public java.util.List<String> getComputeEnvironments() {
        return computeEnvironments;
    }

    /**
     * <p>
     * A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @param computeEnvironments
     *        A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
     */

    public void setComputeEnvironments(java.util.Collection<String> computeEnvironments) {
        if (computeEnvironments == null) {
            this.computeEnvironments = null;
            return;
        }

        this.computeEnvironments = new java.util.ArrayList<String>(computeEnvironments);
    }

    /**
     * <p>
     * A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputeEnvironments(java.util.Collection)} or {@link #withComputeEnvironments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param computeEnvironments
     *        A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComputeEnvironmentsRequest withComputeEnvironments(String... computeEnvironments) {
        if (this.computeEnvironments == null) {
            setComputeEnvironments(new java.util.ArrayList<String>(computeEnvironments.length));
        }
        for (String ele : computeEnvironments) {
            this.computeEnvironments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @param computeEnvironments
     *        A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComputeEnvironmentsRequest withComputeEnvironments(java.util.Collection<String> computeEnvironments) {
        setComputeEnvironments(computeEnvironments);
        return this;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>DescribeComputeEnvironments</code> in paginated output.
     * When this parameter is used, <code>DescribeComputeEnvironments</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeComputeEnvironments</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>DescribeComputeEnvironments</code> returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cluster results returned by <code>DescribeComputeEnvironments</code> in paginated
     *        output. When this parameter is used, <code>DescribeComputeEnvironments</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>DescribeComputeEnvironments</code> request with the returned <code>nextToken</code> value. This
     *        value can be between 1 and 100. If this parameter is not used, then
     *        <code>DescribeComputeEnvironments</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>DescribeComputeEnvironments</code> in paginated output.
     * When this parameter is used, <code>DescribeComputeEnvironments</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeComputeEnvironments</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>DescribeComputeEnvironments</code> returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * 
     * @return The maximum number of cluster results returned by <code>DescribeComputeEnvironments</code> in paginated
     *         output. When this parameter is used, <code>DescribeComputeEnvironments</code> only returns
     *         <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>DescribeComputeEnvironments</code> request with the returned <code>nextToken</code> value. This
     *         value can be between 1 and 100. If this parameter is not used, then
     *         <code>DescribeComputeEnvironments</code> returns up to 100 results and a <code>nextToken</code> value if
     *         applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>DescribeComputeEnvironments</code> in paginated output.
     * When this parameter is used, <code>DescribeComputeEnvironments</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeComputeEnvironments</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>DescribeComputeEnvironments</code> returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cluster results returned by <code>DescribeComputeEnvironments</code> in paginated
     *        output. When this parameter is used, <code>DescribeComputeEnvironments</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>DescribeComputeEnvironments</code> request with the returned <code>nextToken</code> value. This
     *        value can be between 1 and 100. If this parameter is not used, then
     *        <code>DescribeComputeEnvironments</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComputeEnvironmentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeComputeEnvironments</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>DescribeComputeEnvironments</code> request where <code>maxResults</code> was used and the results
     *        exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *        returned the <code>nextToken</code> value. This value is <code>null</code> when there are no more results
     *        to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeComputeEnvironments</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated
     *         <code>DescribeComputeEnvironments</code> request where <code>maxResults</code> was used and the results
     *         exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *         returned the <code>nextToken</code> value. This value is <code>null</code> when there are no more results
     *         to return.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeComputeEnvironments</code>
     * request where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>DescribeComputeEnvironments</code> request where <code>maxResults</code> was used and the results
     *        exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *        returned the <code>nextToken</code> value. This value is <code>null</code> when there are no more results
     *        to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComputeEnvironmentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getComputeEnvironments() != null)
            sb.append("ComputeEnvironments: " + getComputeEnvironments() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeComputeEnvironmentsRequest == false)
            return false;
        DescribeComputeEnvironmentsRequest other = (DescribeComputeEnvironmentsRequest) obj;
        if (other.getComputeEnvironments() == null ^ this.getComputeEnvironments() == null)
            return false;
        if (other.getComputeEnvironments() != null && other.getComputeEnvironments().equals(this.getComputeEnvironments()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputeEnvironments() == null) ? 0 : getComputeEnvironments().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeComputeEnvironmentsRequest clone() {
        return (DescribeComputeEnvironmentsRequest) super.clone();
    }
}
