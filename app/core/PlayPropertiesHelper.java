package core;

import play.Play;

/**
 * Created by nue on 6.10.2015.
 */
public final class PlayPropertiesHelper {


    public static final Boolean getBigException() {
        return Play.application().configuration().getBoolean("big.exception");
    }

    public static final Boolean getSmallException() {
        return Play.application().configuration().getBoolean("small.exception");
    }

    public static final Long getBigDelay() {
        return Play.application().configuration().getLong("big.delay");
    }

    public static final Long getSmallDelay() {
        return Play.application().configuration().getLong("small.delay");
    }

}
