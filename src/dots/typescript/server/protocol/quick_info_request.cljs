(ns dots.typescript.server.protocol.quick-info-request
  "Quickinfo request; value of command field is
   \"quickinfo\". Return response giving a quick type and
   documentation string for the symbol found in file at location
   line, col."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Quickinfo`"
  ^js [quick-info-request]
  (.-command ^js quick-info-request))

(defn set-command!
  ^js [quick-info-request value]
  (set! (.-command ^js quick-info-request) value))

(defn arguments
  "**Returns:** `FileLocationRequestArgs`"
  ^js [quick-info-request]
  (.-arguments ^js quick-info-request))

(defn set-arguments!
  ^js [quick-info-request value]
  (set! (.-arguments ^js quick-info-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [quick-info-request]
  (.-type ^js quick-info-request))

(defn set-type!
  ^js [quick-info-request value]
  (set! (.-type ^js quick-info-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [quick-info-request]
  (.-seq ^js quick-info-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [quick-info-request value]
  (set! (.-seq ^js quick-info-request) value))
