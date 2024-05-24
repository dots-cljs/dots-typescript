(ns dots.typescript.server.close-file-watcher-event)

(defn event-name
  ^js [close-file-watcher-event]
  (.-eventName ^js close-file-watcher-event))

(defn data
  ^js [close-file-watcher-event]
  (.-data ^js close-file-watcher-event))
