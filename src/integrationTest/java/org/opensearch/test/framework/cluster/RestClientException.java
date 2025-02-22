/*
* Copyright OpenSearch Contributors
* SPDX-License-Identifier: Apache-2.0
*
* The OpenSearch Contributors require contributions made to
* this file be licensed under the Apache-2.0 license or a
* compatible open source license.
*
*/
package org.opensearch.test.framework.cluster;

class RestClientException extends RuntimeException {
	public RestClientException(String message, Throwable cause) {
		super(message, cause);
	}
}
