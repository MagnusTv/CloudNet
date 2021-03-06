/*
 * Copyright (c) Tarek Hosni El Alaoui 2017
 */

package de.dytanic.cloudnetcore.bootstrap;

import de.dytanic.cloudnet.lib.exception.JavaReqVersionException;

/**
 * Created by Tareko on 18.09.2017.
 */
public class CloudNetLauncher {

    public static synchronized void main(String[] args) throws Exception
    {
        if(Float.parseFloat(System.getProperty("java.class.version")) < 52D)
        {
            throw new JavaReqVersionException();
        }

        CloudBootstrap.main(args);

    }
}