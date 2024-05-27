(ns dots.typescript.server.protocol.linked-editing-range-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.LinkedEditingRange`"
  ^js [linked-editing-range-request]
  (.-command ^js linked-editing-range-request))

(defn arguments
  "**Returns:** `FileLocationRequestArgs`"
  ^js [linked-editing-range-request]
  (.-arguments ^js linked-editing-range-request))

(defn set-arguments!
  ^js [linked-editing-range-request value]
  (set! (.-arguments ^js linked-editing-range-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [linked-editing-range-request]
  (.-type ^js linked-editing-range-request))

(defn set-type!
  ^js [linked-editing-range-request value]
  (set! (.-type ^js linked-editing-range-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [linked-editing-range-request]
  (.-seq ^js linked-editing-range-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [linked-editing-range-request value]
  (set! (.-seq ^js linked-editing-range-request) value))
