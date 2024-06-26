(ns dots.typescript.server.protocol.create-file-watcher-event
  (:refer-clojure :exclude [seq type]))

(defn event
  "**Returns:** `\"createFileWatcher\"`"
  ^js [create-file-watcher-event]
  (.-event ^js create-file-watcher-event))

(defn body
  "**Returns:** `CreateFileWatcherEventBody`"
  ^js [create-file-watcher-event]
  (.-body ^js create-file-watcher-event))

(defn type
  "**Returns:** `\"event\"`"
  ^js [create-file-watcher-event]
  (.-type ^js create-file-watcher-event))

(defn set-type!
  ^js [create-file-watcher-event value]
  (set! (.-type ^js create-file-watcher-event) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [create-file-watcher-event]
  (.-seq ^js create-file-watcher-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [create-file-watcher-event value]
  (set! (.-seq ^js create-file-watcher-event) value))
