/*******************************************************************************
 * Copyright (c) 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *              ljungmann - initial implementation
 ******************************************************************************/
package org.eclipse.samples;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.eclipse.persistence.testing.tests.jpa22.metadata.LogListener;

@Entity
@EntityListeners({LogListener.class})
public @interface LoggableEmployee {

}
