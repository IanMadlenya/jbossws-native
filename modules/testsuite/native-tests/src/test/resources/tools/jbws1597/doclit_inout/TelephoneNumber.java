/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/*
 * JBossWS WS-Tools Generated Source
 *
 * Generation Date: Tue May 29 16:46:43 CEST 2007
 *
 * This generated source code represents a derivative work of the input to
 * the generator that produced it. Consult the input for the copyright and
 * terms of use that apply to this source code.
 */

package org.jboss.test.ws.jbws1597;


public class  TelephoneNumber
{

protected java.lang.String areaCode;

protected java.lang.String number;
public TelephoneNumber(){}

public TelephoneNumber(java.lang.String areaCode, java.lang.String number){
this.areaCode=areaCode;
this.number=number;
}
public java.lang.String getAreaCode() { return areaCode ;}

public void setAreaCode(java.lang.String areaCode){ this.areaCode=areaCode; }

public java.lang.String getNumber() { return number ;}

public void setNumber(java.lang.String number){ this.number=number; }

}
