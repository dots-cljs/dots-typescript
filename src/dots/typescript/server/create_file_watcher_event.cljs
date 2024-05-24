(ns dots.typescript.server.create-file-watcher-event)

(defn event-name
  ^js [create-file-watcher-event]
  (.-eventName ^js create-file-watcher-event))

(defn data
  ^js [create-file-watcher-event]
  (.-data ^js create-file-watcher-event))
