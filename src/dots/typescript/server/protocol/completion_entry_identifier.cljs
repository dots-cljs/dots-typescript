(ns dots.typescript.server.protocol.completion-entry-identifier
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `string`"
  ^js [completion-entry-identifier]
  (.-name ^js completion-entry-identifier))

(defn set-name!
  ^js [completion-entry-identifier value]
  (set! (.-name ^js completion-entry-identifier) value))

(defn source
  "**Returns:** `string | undefined`"
  ^js [completion-entry-identifier]
  (.-source ^js completion-entry-identifier))

(defn set-source!
  ^js [completion-entry-identifier value]
  (set! (.-source ^js completion-entry-identifier) value))

(defn data
  "**Returns:** `unknown`"
  ^js [completion-entry-identifier]
  (.-data ^js completion-entry-identifier))

(defn set-data!
  ^js [completion-entry-identifier value]
  (set! (.-data ^js completion-entry-identifier) value))
