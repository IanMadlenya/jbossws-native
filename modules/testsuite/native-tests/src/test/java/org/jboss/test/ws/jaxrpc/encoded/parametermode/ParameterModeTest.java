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

// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, build R40)
// Generated source version: 1.1.2

package org.jboss.test.ws.jaxrpc.encoded.parametermode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.namespace.QName;
import javax.xml.rpc.holders.BigDecimalHolder;
import javax.xml.rpc.holders.BigIntegerHolder;
import javax.xml.rpc.holders.BooleanHolder;
import javax.xml.rpc.holders.BooleanWrapperHolder;
import javax.xml.rpc.holders.ByteArrayHolder;
import javax.xml.rpc.holders.ByteHolder;
import javax.xml.rpc.holders.ByteWrapperHolder;
import javax.xml.rpc.holders.CalendarHolder;
import javax.xml.rpc.holders.DoubleHolder;
import javax.xml.rpc.holders.DoubleWrapperHolder;
import javax.xml.rpc.holders.FloatHolder;
import javax.xml.rpc.holders.FloatWrapperHolder;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.IntegerWrapperHolder;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.QNameHolder;
import javax.xml.rpc.holders.ShortHolder;
import javax.xml.rpc.holders.ShortWrapperHolder;
import javax.xml.rpc.holders.StringHolder;

import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfBookHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfQNameHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfbooleanHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfbyteHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfdateTimeHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfdecimalHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfdoubleHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOffloatHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfintHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfintegerHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOflongHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfshortHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.ArrayOfstringHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.BookHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.EnumByteHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.EnumDecimalHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.EnumDoubleHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.EnumFloatHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.EnumIntHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.EnumIntegerHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.EnumLongHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.EnumShortHolder;
import org.jboss.test.ws.jaxrpc.encoded.parametermode.holders.EnumStringHolder;

public interface ParameterModeTest extends Remote
{
   public void echoIn(String varString) throws RemoteException;

   public void echoOut(StringHolder varString) throws RemoteException;

   public void echoInOut(StringHolder varString) throws RemoteException;

   public void echoInOut2(StringHolder varString) throws RemoteException;

   public String echoInOut3(String param) throws RemoteException;

   public String echoInOut4(String param) throws RemoteException;

   public void echoMix(String varInString, StringHolder varInOutString, StringHolder varOutString) throws RemoteException;

   public void echoInSimpleTypes(String varString, BigInteger varInteger, int varInt, long varLong, short varShort, BigDecimal varDecimal,
         float varFloat, double varDouble, boolean varBoolean, byte varByte, QName varQName, Calendar varDateTime, String varSoapString,
         Boolean varSoapBoolean, Float varSoapFloat, Double varSoapDouble, BigDecimal varSoapDecimal, Integer varSoapInt, Short varSoapShort,
         Byte varSoapByte, byte[] varBase64Binary, byte[] varHexBinary, byte[] varSoapBase64) throws RemoteException;

   public void echoOutSimpleTypes(StringHolder varString, BigIntegerHolder varInteger, IntHolder varInt, LongHolder varLong, ShortHolder varShort,
         BigDecimalHolder varDecimal, FloatHolder varFloat, DoubleHolder varDouble, BooleanHolder varBoolean, ByteHolder varByte, QNameHolder varQName,
         CalendarHolder varDateTime, StringHolder varSoapString, BooleanWrapperHolder varSoapBoolean, FloatWrapperHolder varSoapFloat,
         DoubleWrapperHolder varSoapDouble, BigDecimalHolder varSoapDecimal, IntegerWrapperHolder varSoapInt, ShortWrapperHolder varSoapShort,
         ByteWrapperHolder varSoapByte, ByteArrayHolder varBase64Binary, ByteArrayHolder varHexBinary, ByteArrayHolder varSoapBase64) throws RemoteException;

   public void echoInOutSimpleTypes(StringHolder varString, BigIntegerHolder varInteger, IntHolder varInt, LongHolder varLong, ShortHolder varShort,
         BigDecimalHolder varDecimal, FloatHolder varFloat, DoubleHolder varDouble, BooleanHolder varBoolean, ByteHolder varByte, QNameHolder varQName,
         CalendarHolder varDateTime, StringHolder varSoapString, BooleanWrapperHolder varSoapBoolean, FloatWrapperHolder varSoapFloat,
         DoubleWrapperHolder varSoapDouble, BigDecimalHolder varSoapDecimal, IntegerWrapperHolder varSoapInt, ShortWrapperHolder varSoapShort,
         ByteWrapperHolder varSoapByte, ByteArrayHolder varBase64Binary, ByteArrayHolder varHexBinary, ByteArrayHolder varSoapBase64) throws RemoteException;

   public void echoInEnum(EnumString varEnumString, EnumInteger varEnumInteger, EnumInt varEnumInt, EnumLong varEnumLong, EnumShort varEnumShort,
         EnumDecimal varEnumDecimal, EnumFloat varEnumFloat, EnumDouble varEnumDouble, EnumByte varEnumByte) throws RemoteException;

   public void echoOutEnum(EnumStringHolder varEnumString, EnumIntegerHolder varEnumInteger, EnumIntHolder varEnumInt, EnumLongHolder varEnumLong,
         EnumShortHolder varEnumShort, EnumDecimalHolder varEnumDecimal, EnumFloatHolder varEnumFloat, EnumDoubleHolder varEnumDouble, EnumByteHolder varEnumByte)
         throws RemoteException;

   public void echoInOutEnum(EnumStringHolder varEnumString, EnumIntegerHolder varEnumInteger, EnumIntHolder varEnumInt, EnumLongHolder varEnumLong,
         EnumShortHolder varEnumShort, EnumDecimalHolder varEnumDecimal, EnumFloatHolder varEnumFloat, EnumDoubleHolder varEnumDouble, EnumByteHolder varEnumByte)
         throws RemoteException;

   public void echoInStruct(AllStruct varStruct) throws RemoteException;

   public void echoInOutSimpleTypesArray(ArrayOfstringHolder varString, ArrayOfintegerHolder varInteger, ArrayOfintHolder varInt, ArrayOflongHolder varLong,
         ArrayOfshortHolder varShort, ArrayOfdecimalHolder varDecimal, ArrayOffloatHolder varFloat, ArrayOfdoubleHolder varDouble, ArrayOfbooleanHolder varBoolean,
         ArrayOfbyteHolder varByte, ArrayOfQNameHolder varQName, ArrayOfdateTimeHolder varDateTime) throws RemoteException;

   public void echoInOutBook(BookHolder varBook) throws RemoteException;

   public void echoInOutBookArray(ArrayOfBookHolder varBook) throws RemoteException;
}
