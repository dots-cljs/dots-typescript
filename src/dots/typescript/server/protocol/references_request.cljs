(ns dots.typescript.server.protocol.references-request
  "Find references request; value of command field is
   \"references\". Return response giving the file locations that
   reference the symbol found in file at location line, col."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.References`"
  ^js [references-request]
  (.-command ^js references-request))

(defn set-command!
  ^js [references-request value]
  (set! (.-command ^js references-request) value))

(defn arguments
  "**Returns:** `FileLocationRequestArgs`"
  ^js [references-request]
  (.-arguments ^js references-request))

(defn set-arguments!
  ^js [references-request value]
  (set! (.-arguments ^js references-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [references-request]
  (.-type ^js references-request))

(defn set-type!
  ^js [references-request value]
  (set! (.-type ^js references-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [references-request]
  (.-seq ^js references-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [references-request value]
  (set! (.-seq ^js references-request) value))
