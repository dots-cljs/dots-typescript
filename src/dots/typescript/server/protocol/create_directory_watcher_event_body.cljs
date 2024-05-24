(ns dots.typescript.server.protocol.create-directory-watcher-event-body)

(defn id
  ^js [create-directory-watcher-event-body]
  (.-id ^js create-directory-watcher-event-body))

(defn path
  ^js [create-directory-watcher-event-body]
  (.-path ^js create-directory-watcher-event-body))

(defn recursive?
  ^js [create-directory-watcher-event-body]
  (.-recursive ^js create-directory-watcher-event-body))

(defn ignore-update?
  ^js [create-directory-watcher-event-body]
  (.-ignoreUpdate ^js create-directory-watcher-event-body))
