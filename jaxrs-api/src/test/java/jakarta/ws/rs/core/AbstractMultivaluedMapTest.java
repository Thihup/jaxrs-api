/*
 * Copyright (c) 2013, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.ws.rs.core;

import static junit.framework.Assert.fail;

import org.junit.Test;

import jakarta.ws.rs.core.AbstractMultivaluedMap;

/**
 * AbstractMultivaluedMap unit tests.
 *
 * @author Marek Potociar (marek.potociar at oracle.com)
 */
public class AbstractMultivaluedMapTest {

    /**
     * A test to reproduce issue reported in JAX_RS_SPEC-384.
     */
    @Test
    public void testNpeThrownFromMap() {
        try {
            new AbstractMultivaluedMap<String, Object>(null) {
            };
            fail("NullPointerException expected.");
        } catch (NullPointerException npe) {
            // passed
        }
    }
}
