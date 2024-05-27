(ns dots.typescript.server.protocol.definition-request
  "Go to definition request; value of command field is
   \"definition\". Return response giving the file locations that
   define the symbol found in file at location line, col."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Definition`"
  ^js [definition-request]
  (.-command ^js definition-request))

(defn set-command!
  ^js [definition-request value]
  (set! (.-command ^js definition-request) value))

(defn arguments
  "**Returns:** `FileLocationRequestArgs`"
  ^js [definition-request]
  (.-arguments ^js definition-request))

(defn set-arguments!
  ^js [definition-request value]
  (set! (.-arguments ^js definition-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [definition-request]
  (.-type ^js definition-request))

(defn set-type!
  ^js [definition-request value]
  (set! (.-type ^js definition-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [definition-request]
  (.-seq ^js definition-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [definition-request value]
  (set! (.-seq ^js definition-request) value))
