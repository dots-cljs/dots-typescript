(ns dots.typescript.server.protocol.create-directory-watcher-event-body)

(defn id
  "**Returns:** `number`"
  ^js [create-directory-watcher-event-body]
  (.-id ^js create-directory-watcher-event-body))

(defn path
  "**Returns:** `string`"
  ^js [create-directory-watcher-event-body]
  (.-path ^js create-directory-watcher-event-body))

(defn recursive?
  "**Returns:** `boolean`"
  ^js [create-directory-watcher-event-body]
  (.-recursive ^js create-directory-watcher-event-body))

(defn ignore-update?
  "**Returns:** `boolean | undefined`"
  ^js [create-directory-watcher-event-body]
  (.-ignoreUpdate ^js create-directory-watcher-event-body))
