/**
 *  Java Page Templates
 *  Copyright (C) 2004 Christopher M Rossi
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package com.christophermrossi.jpt;

import junit.framework.*;

/**
 * TestSuite that runs all the object tests
 *
 */
public class AllTests {    
    public static void main ( String[] args ) {
        junit.textui.TestRunner.run( suite() );
    }
 
    public static Test suite ( ) {
        TestSuite suite = new TestSuite("jpt test suite");
        suite.addTest( PageTemplateImplTest.suite() );
        return suite;
    }
}
