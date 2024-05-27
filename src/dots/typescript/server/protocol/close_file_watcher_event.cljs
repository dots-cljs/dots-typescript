(ns dots.typescript.server.protocol.close-file-watcher-event
  (:refer-clojure :exclude [seq type]))

(defn event
  "**Returns:** `\"closeFileWatcher\"`"
  ^js [close-file-watcher-event]
  (.-event ^js close-file-watcher-event))

(defn body
  "**Returns:** `CloseFileWatcherEventBody`"
  ^js [close-file-watcher-event]
  (.-body ^js close-file-watcher-event))

(defn type
  "**Returns:** `\"event\"`"
  ^js [close-file-watcher-event]
  (.-type ^js close-file-watcher-event))

(defn set-type!
  ^js [close-file-watcher-event value]
  (set! (.-type ^js close-file-watcher-event) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [close-file-watcher-event]
  (.-seq ^js close-file-watcher-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [close-file-watcher-event value]
  (set! (.-seq ^js close-file-watcher-event) value))
