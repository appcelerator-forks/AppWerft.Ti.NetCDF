/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.netcdf;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import ucar.ma2.DataType;

@Kroll.module(name = "Netcdf", id = "de.appwerft.netcdf")
public class NetcdfModule extends KrollModule {

	public static final String LCAT = "Netcdf";

	@Kroll.constant
	public static final int DATATYPE_BYTE = 0;
	@Kroll.constant
	public static final int DATATYPE_UINT8 = 1;
	@Kroll.constant
	public static final int DATATYPE_SHORT = 2;
	@Kroll.constant
	public static final int DATATYPE_INT = 3;
	@Kroll.constant
	public static final int DATATYPE_FLOAT = 4;
	@Kroll.constant
	public static final int DATATYPE_DOUBLE = 5;
	@Kroll.constant
	public static final int DATATYPE_CHAR = 6;
	@Kroll.constant
	public static final int DATATYPE_STRING = 7;

	public NetcdfModule() {
		super();
		Context ctx = this.getActivityProxy().getActivity();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {

	}

}
