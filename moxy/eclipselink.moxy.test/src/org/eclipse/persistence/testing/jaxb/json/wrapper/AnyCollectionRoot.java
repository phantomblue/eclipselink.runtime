/*******************************************************************************
 * Copyright (c) 2013, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Blaise Doughan - 2.4.2 - initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.json.wrapper;

import java.util.List;

import javax.xml.bind.annotation.*;

import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlRootElement
@XmlType(propOrder={"wrapperItems", "xmlPathItems"})
public class AnyCollectionRoot {

    private List<Object> wrapperItems;
    private List<Object> xmlPathItems;

    @XmlElementWrapper
    @XmlAnyElement(lax=true)
    public List<Object> getWrapperItems() {
        return wrapperItems;
    }

    public void setWrapperItems(List<Object> wrapperItems) {
        this.wrapperItems = wrapperItems;
    }

    @XmlPath("xmlPathItems")
    @XmlAnyElement(lax=true)
    public List<Object> getXmlPathItems() {
        return xmlPathItems;
    }

    public void setXmlPathItems(List<Object> xmlPathItems) {
        this.xmlPathItems = xmlPathItems;
    }

    @Override
    public boolean equals(Object obj) {
        if(null == obj || obj.getClass() != this.getClass()) {
            return false;
        }
        AnyCollectionRoot test = (AnyCollectionRoot) obj;
        if(!equals(wrapperItems, test.wrapperItems)) {
            return false;
        }
        if(!equals(xmlPathItems, test.xmlPathItems)) {
            return false;
        }
        return true;
    }

    private boolean equals(List<?> control, List<?> test) {
        if(control == test) {
            return true;
        }
        if(null == control || null == test) {
            return false;
        }
        if(control.size() != test.size()) {
            return false;
        }
        for(int x=0; x<control.size(); x++) {
            if(!control.get(x).equals(test.get(x))) {
                return false;
            }
        }
        return true;
    }
}
