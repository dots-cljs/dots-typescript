(ns dots.typescript.server.protocol.large-file-referenced-event
  (:refer-clojure :exclude [seq type]))

(defn event
  "**Returns:** `\"largeFileReferenced\"`"
  ^js [large-file-referenced-event]
  (.-event ^js large-file-referenced-event))

(defn set-event!
  ^js [large-file-referenced-event value]
  (set! (.-event ^js large-file-referenced-event) value))

(defn body
  "**Returns:** `LargeFileReferencedEventBody`"
  ^js [large-file-referenced-event]
  (.-body ^js large-file-referenced-event))

(defn set-body!
  ^js [large-file-referenced-event value]
  (set! (.-body ^js large-file-referenced-event) value))

(defn type
  "**Returns:** `\"event\"`"
  ^js [large-file-referenced-event]
  (.-type ^js large-file-referenced-event))

(defn set-type!
  ^js [large-file-referenced-event value]
  (set! (.-type ^js large-file-referenced-event) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [large-file-referenced-event]
  (.-seq ^js large-file-referenced-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [large-file-referenced-event value]
  (set! (.-seq ^js large-file-referenced-event) value))
