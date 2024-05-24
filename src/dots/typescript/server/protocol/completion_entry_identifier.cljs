(ns dots.typescript.server.protocol.completion-entry-identifier
  (:refer-clojure :exclude [name]))

(defn name
  ^js [completion-entry-identifier]
  (.-name ^js completion-entry-identifier))

(defn set-name!
  ^js [completion-entry-identifier value]
  (set! (.-name ^js completion-entry-identifier) value))

(defn source
  ^js [completion-entry-identifier]
  (.-source ^js completion-entry-identifier))

(defn set-source!
  ^js [completion-entry-identifier value]
  (set! (.-source ^js completion-entry-identifier) value))

(defn data
  ^js [completion-entry-identifier]
  (.-data ^js completion-entry-identifier))

(defn set-data!
  ^js [completion-entry-identifier value]
  (set! (.-data ^js completion-entry-identifier) value))
