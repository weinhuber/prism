//==============================================================================
//	
//	Copyright (c) 2002-
//	Authors:
//	* Dave Parker <david.parker@comlab.ox.ac.uk> (University of Oxford)
//	
//------------------------------------------------------------------------------
//	
//	This file is part of PRISM.
//	
//	PRISM is free software; you can redistribute it and/or modify
//	it under the terms of the GNU General Public License as published by
//	the Free Software Foundation; either version 2 of the License, or
//	(at your option) any later version.
//	
//	PRISM is distributed in the hope that it will be useful,
//	but WITHOUT ANY WARRANTY; without even the implied warranty of
//	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//	GNU General Public License for more details.
//	
//	You should have received a copy of the GNU General Public License
//	along with PRISM; if not, write to the Free Software Foundation,
//	Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//	
//==============================================================================

package parser.type;

import parser.EvaluateContext.EvalMode;
import prism.PrismLangException;

public abstract class Type 
{
	/**
	 * Returns the type corresponding to the given string.
	 * @throws PrismLangException if the string does not correspond to a type.
	 */
	public static Type valueOf(String value) throws PrismLangException {
		value = value.trim().toLowerCase();

		switch (value) {
			case "bool":
				return TypeBool.getInstance();
			case "clock":
				return TypeClock.getInstance();
			case "double":
				return TypeDouble.getInstance();
			case "int":
				return TypeInt.getInstance();
			case "void":
				return TypeVoid.getInstance();
			case "path-bool":
				return TypePathBool.getInstance();
			case "path-int":
				return TypePathInt.getInstance();
			case "path-double":
				return TypePathDouble.getInstance();
			default:
				// here we're using the representation of getTypeString() for each type

				// Handling array types
				if(value.startsWith("array of ")) {
					String subTypeString = value.substring(9); // remove "array of " prefix
					Type subType = valueOf(subTypeString); // recursive call
					return TypeArray.getInstance(subType);
				}
				// Handling interval types
				else if (value.startsWith("interval of ")) {
					String subTypeStr = value.substring(12); // remove "interval of " prefix
					return TypeInterval.getInstance(valueOf(subTypeStr));
				}
				else {
					throw new PrismLangException("Unknown type '" + value + "'");
				}
		}
	}


	/**
	 * Returns the string denoting this type, e.g. "int", "bool".
	 */
	public abstract String getTypeString();
	
	/**
	 * Is this a primitive type (bool, int, etc.)?
	 */
	public boolean isPrimitive()
	{
		// Assume true by default; override if not
		return true;
	}
	
	/**
	 * Returns the default value for this type, assuming no initialisation specified.
	 */
	public Object defaultValue()
	{
		// Play safe: assume null
		return null;
	}
	
	/**
	 * Returns true iff a variable of this type can be assigned a value that is of type {@code type}. 
	 */
	public boolean canAssign(Type type)
	{
		// Play safe: assume not possible, unless explicitly overridden.
		return false;
	}
	
	/**
	 * Make sure that a value, stored as an Object (Integer, Boolean, etc.)
	 * is the correct kind of Object for this type.
	 * Basically, implement some implicit casts (e.g. from type int to double).
	 * The evaluation mode is not changed (e.g. when casting  int to double,
	 * the conversion could be either Integer -> Double or BigInteger -> BigRational).
	 * This should only only work for combinations of types that satisfy {@code #canAssign(Type)}.
	 * If not, an exception is thrown (but such problems should have been caught earlier by type checking)
	 */
	public Object castValueTo(Object value) throws PrismLangException
	{
		// Play safe: assume error unless explicitly overridden.
		throw new PrismLangException("Cannot cast a value to type " + getTypeString());
	}

	/**
	 * Make sure that a value, stored as an Object (Integer, Boolean, etc.),
	 * is the correct kind of Object for this type, and a given evaluation mode.
	 * E.g. a "double" is stored as a Double for floating point mode (EvalMode.FP)
	 * but a BigRational for exact mode (EvalMode.EXACT).
	 * Basically, implement some implicit casts (e.g. from type int to double)
	 * and some conversions between evaluation modes (e.g. BigRational to Double).
	 * This should only only work for combinations of types that satisfy {@code #canAssign(Type)}.
	 * If not, an exception is thrown (but such problems should have been caught earlier by type checking)
	 */
	public Object castValueTo(Object value, EvalMode evalMode) throws PrismLangException
	{
		// Play safe: assume error unless explicitly overridden.
		throw new PrismLangException("Cannot cast a value to type " + getTypeString());
	}
	
	@Override
	public String toString()
	{
		return getTypeString();
	}
}
