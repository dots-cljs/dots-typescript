(ns dots.typescript.server.close-file-watcher-event)

(defn event-name
  "**Returns:** `\"closeFileWatcher\"`"
  ^js [close-file-watcher-event]
  (.-eventName ^js close-file-watcher-event))

(defn data
  "**Returns:** `CloseFileWatcherEventBody`"
  ^js [close-file-watcher-event]
  (.-data ^js close-file-watcher-event))
