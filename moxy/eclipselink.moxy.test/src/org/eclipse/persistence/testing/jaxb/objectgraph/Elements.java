/*******************************************************************************
 * Copyright (c) 2014, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Martin Vojtek - 2.6.0 - initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.objectgraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Elements {
    @XmlElement
    Object element1;
    @XmlElement
    Object element2;
    @XmlElement
    Object element3;
    public Object getElement1() {
        return element1;
    }
    public void setElement1(Object element1) {
        this.element1 = element1;
    }
    public Object getElement2() {
        return element2;
    }
    public void setElement2(Object element2) {
        this.element2 = element2;
    }
    public Object getElement3() {
        return element3;
    }
    public void setElement3(Object element3) {
        this.element3 = element3;
    }
}
