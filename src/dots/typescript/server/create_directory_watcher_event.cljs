(ns dots.typescript.server.create-directory-watcher-event)

(defn event-name
  "**Returns:** `\"createDirectoryWatcher\"`"
  ^js [create-directory-watcher-event]
  (.-eventName ^js create-directory-watcher-event))

(defn data
  "**Returns:** `CreateDirectoryWatcherEventBody`"
  ^js [create-directory-watcher-event]
  (.-data ^js create-directory-watcher-event))
