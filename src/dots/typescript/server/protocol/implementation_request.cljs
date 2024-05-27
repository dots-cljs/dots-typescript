(ns dots.typescript.server.protocol.implementation-request
  "Go to implementation request; value of command field is
   \"implementation\". Return response giving the file locations that
   implement the symbol found in file at location line, col."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Implementation`"
  ^js [implementation-request]
  (.-command ^js implementation-request))

(defn set-command!
  ^js [implementation-request value]
  (set! (.-command ^js implementation-request) value))

(defn arguments
  "**Returns:** `FileLocationRequestArgs`"
  ^js [implementation-request]
  (.-arguments ^js implementation-request))

(defn set-arguments!
  ^js [implementation-request value]
  (set! (.-arguments ^js implementation-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [implementation-request]
  (.-type ^js implementation-request))

(defn set-type!
  ^js [implementation-request value]
  (set! (.-type ^js implementation-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [implementation-request]
  (.-seq ^js implementation-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [implementation-request value]
  (set! (.-seq ^js implementation-request) value))
