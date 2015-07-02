package com.action.watcher;

public interface Watched
{
     public void addWatcher(Watcher watcher);

     public void removeWatcher(Watcher watcher);

     public void notifyWatchers();
}