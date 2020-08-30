package com.ssithole.Aircraft;

import com.ssithole.WriteLog.log;

public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter = 0;
    /****************************/
    protected log log = new log();

    protected Aircraft(final String name, final Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
        this.id = nextId();
    }

    private long nextId() {
        return ++this.idCounter;
    }
}
