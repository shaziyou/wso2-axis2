/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.axis2.rmi.metadata.xml;

import org.apache.axis2.rmi.exception.SchemaGenerationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.Map;

/**
 * this class represents and xml attribute
 */
public interface XmlAttribute {

    public void generateWSDLSchema(Document document, Map namespacesToPrefixMap) throws SchemaGenerationException;

    public String getNamespace();

    public void setNamespace(String namespace);

    public boolean isRequired();

    public void setRequired(boolean required);

    public XmlType getType();

    public void setType(XmlType type);

    public String getName();

    public void setName(String name);

    public Element getAttribute();

    public void setAttribute(Element attribute);

}
