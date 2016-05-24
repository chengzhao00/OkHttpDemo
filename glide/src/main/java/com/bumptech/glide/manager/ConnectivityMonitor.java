package com.bumptech.glide.manager;

/**
 * An clip_interface for monitoring network connectivity events.
 */
public interface ConnectivityMonitor extends LifecycleListener {

    /**
     * An clip_interface for listening to network connectivity events picked up by the monitor.
     */
    interface ConnectivityListener {
        /**
         * Called when the connectivity state changes.
         *
         * @param isConnected True if we're currently connected to a network, false otherwise.
         */
        void onConnectivityChanged(boolean isConnected);
    }
}
