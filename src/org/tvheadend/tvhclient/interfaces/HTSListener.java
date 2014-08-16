package org.tvheadend.tvhclient.interfaces;

/**
 *
 * @author john-tornblom
 * @author Robert Siebert
 */
public interface HTSListener {

    /**
     * Whenever the service has completed an action, a message is sent with the
     * name of the action and the affected object. Anyone that overrides this
     * method can listen for these messages.
     */
    public void onMessage(String action, Object obj);
}
