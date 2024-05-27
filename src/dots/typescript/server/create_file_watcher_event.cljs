(ns dots.typescript.server.create-file-watcher-event)

(defn event-name
  "**Returns:** `\"createFileWatcher\"`"
  ^js [create-file-watcher-event]
  (.-eventName ^js create-file-watcher-event))

(defn data
  "**Returns:** `CreateFileWatcherEventBody`"
  ^js [create-file-watcher-event]
  (.-data ^js create-file-watcher-event))
