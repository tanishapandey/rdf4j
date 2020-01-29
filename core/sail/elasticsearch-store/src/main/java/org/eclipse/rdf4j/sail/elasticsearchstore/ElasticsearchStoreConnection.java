/*******************************************************************************
 * Copyright (c) 2019 Eclipse RDF4J contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
package org.eclipse.rdf4j.sail.elasticsearchstore;

import org.eclipse.rdf4j.common.annotation.Experimental;
import org.eclipse.rdf4j.sail.extensiblestore.ExtensibleStoreConnection;

/**
 * @author Håvard Mikkelsen Ottestad
 */

@Experimental
public class ElasticsearchStoreConnection extends ExtensibleStoreConnection<ElasticsearchStore> {

	ElasticsearchStoreConnection(ElasticsearchStore sail) {
		super(sail);
	}
}
