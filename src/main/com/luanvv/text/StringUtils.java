/*
 *
 */
package com.luanvv.text;

import com.google.common.base.Strings;

/**
 * The Class StringUtils.
 * 
 * @author luanvv
 */
public class StringUtils {

	/**
	 * Checks if is empty.
	 *
	 * @param txt
	 *            the txt
	 * @return true, if is empty
	 */
	public static boolean isEmpty(String txt) {
		return Strings.isNullOrEmpty(txt);
	}

	/**
	 * Checks if is obj toString empty.
	 *
	 * @param obj
	 *            the obj
	 * @return true, if is obj empty
	 */
	public static boolean isObjEmpty(Object obj) {
		return obj == null || isEmpty(obj.toString());
	}

	public static String trim(String txt) {
		return isEmpty(txt) ? "" : txt.trim();
	}
	
	/**
	 * Null to empty.
	 *
	 * @param txt
	 *            the txt
	 * @return the string
	 */
	public static String nullToEmpty(String txt){
		return Strings.nullToEmpty(txt);
	}
	
	/**
	 * Obj toString null to empty.
	 *
	 * @param obj
	 *            the obj
	 * @return the string
	 */
	public static String objToStringNullToEmpty(Object obj){
		return obj==null ? "": Strings.nullToEmpty(obj.toString());
	}
}
