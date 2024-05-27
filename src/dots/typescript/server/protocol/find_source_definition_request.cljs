(ns dots.typescript.server.protocol.find-source-definition-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.FindSourceDefinition`"
  ^js [find-source-definition-request]
  (.-command ^js find-source-definition-request))

(defn arguments
  "**Returns:** `FileLocationRequestArgs`"
  ^js [find-source-definition-request]
  (.-arguments ^js find-source-definition-request))

(defn set-arguments!
  ^js [find-source-definition-request value]
  (set! (.-arguments ^js find-source-definition-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [find-source-definition-request]
  (.-type ^js find-source-definition-request))

(defn set-type!
  ^js [find-source-definition-request value]
  (set! (.-type ^js find-source-definition-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [find-source-definition-request]
  (.-seq ^js find-source-definition-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [find-source-definition-request value]
  (set! (.-seq ^js find-source-definition-request) value))
