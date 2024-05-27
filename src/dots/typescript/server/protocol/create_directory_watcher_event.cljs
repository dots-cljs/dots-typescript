(ns dots.typescript.server.protocol.create-directory-watcher-event
  (:refer-clojure :exclude [seq type]))

(defn event
  "**Returns:** `\"createDirectoryWatcher\"`"
  ^js [create-directory-watcher-event]
  (.-event ^js create-directory-watcher-event))

(defn body
  "**Returns:** `CreateDirectoryWatcherEventBody`"
  ^js [create-directory-watcher-event]
  (.-body ^js create-directory-watcher-event))

(defn type
  "**Returns:** `\"event\"`"
  ^js [create-directory-watcher-event]
  (.-type ^js create-directory-watcher-event))

(defn set-type!
  ^js [create-directory-watcher-event value]
  (set! (.-type ^js create-directory-watcher-event) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [create-directory-watcher-event]
  (.-seq ^js create-directory-watcher-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [create-directory-watcher-event value]
  (set! (.-seq ^js create-directory-watcher-event) value))
