(ns dots.typescript.server.protocol.selection-range-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.SelectionRange`"
  ^js [selection-range-request]
  (.-command ^js selection-range-request))

(defn set-command!
  ^js [selection-range-request value]
  (set! (.-command ^js selection-range-request) value))

(defn arguments
  "**Returns:** `SelectionRangeRequestArgs`"
  ^js [selection-range-request]
  (.-arguments ^js selection-range-request))

(defn set-arguments!
  ^js [selection-range-request value]
  (set! (.-arguments ^js selection-range-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [selection-range-request]
  (.-type ^js selection-range-request))

(defn set-type!
  ^js [selection-range-request value]
  (set! (.-type ^js selection-range-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [selection-range-request]
  (.-seq ^js selection-range-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [selection-range-request value]
  (set! (.-seq ^js selection-range-request) value))
