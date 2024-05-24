(ns dots.typescript.server.create-directory-watcher-event)

(defn event-name
  ^js [create-directory-watcher-event]
  (.-eventName ^js create-directory-watcher-event))

(defn data
  ^js [create-directory-watcher-event]
  (.-data ^js create-directory-watcher-event))
