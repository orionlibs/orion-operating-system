package io.github.orionlibs.orion_operating_system;

import io.github.orionlibs.orion_enumeration.OrionEnumeration;

public enum OperatingSystemType implements OrionEnumeration
{
    Windows,
    Linux,
    MacOSX,
    Other;


    @Override
    public String get()
    {
        return null;
    }


    @Override
    public boolean is(OrionEnumeration other)
    {
        return other instanceof OperatingSystemType && this == other;
    }


    @Override
    public boolean isNot(OrionEnumeration other)
    {
        return other instanceof OperatingSystemType && this != other;
    }


    public static boolean valueExists(String other)
    {
        OperatingSystemType[] values = values();
        for(OperatingSystemType value : values)
        {
            if(value.get().equals(other))
            {
                return true;
            }
        }
        return false;
    }


    public static OperatingSystemType getEnumForValue(String other)
    {
        throw new UnsupportedOperationException();
    }
}