package io.github.orionlibs.orion_operating_system;

import org.apache.commons.lang3.SystemUtils;

public class OperatingSystemService
{
    public static boolean isWindowsSystem()
    {
        return SystemUtils.IS_OS_WINDOWS;
    }


    public static boolean isLinuxSystem()
    {
        return SystemUtils.IS_OS_LINUX;
    }


    public static boolean isMacOSXSystem()
    {
        return SystemUtils.IS_OS_MAC_OSX;
    }


    public static OperatingSystemType getOperatingSystemType()
    {
        if(isWindowsSystem())
        {
            return OperatingSystemType.Windows;
        }
        else if(isLinuxSystem())
        {
            return OperatingSystemType.Linux;
        }
        else if(isMacOSXSystem())
        {
            return OperatingSystemType.MacOSX;
        }
        return OperatingSystemType.Other;
    }
}