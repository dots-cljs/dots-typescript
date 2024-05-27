(ns dots.typescript.server.protocol.prepare-call-hierarchy-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.PrepareCallHierarchy`"
  ^js [prepare-call-hierarchy-request]
  (.-command ^js prepare-call-hierarchy-request))

(defn set-command!
  ^js [prepare-call-hierarchy-request value]
  (set! (.-command ^js prepare-call-hierarchy-request) value))

(defn arguments
  "**Returns:** `FileLocationRequestArgs`"
  ^js [prepare-call-hierarchy-request]
  (.-arguments ^js prepare-call-hierarchy-request))

(defn set-arguments!
  ^js [prepare-call-hierarchy-request value]
  (set! (.-arguments ^js prepare-call-hierarchy-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [prepare-call-hierarchy-request]
  (.-type ^js prepare-call-hierarchy-request))

(defn set-type!
  ^js [prepare-call-hierarchy-request value]
  (set! (.-type ^js prepare-call-hierarchy-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [prepare-call-hierarchy-request]
  (.-seq ^js prepare-call-hierarchy-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [prepare-call-hierarchy-request value]
  (set! (.-seq ^js prepare-call-hierarchy-request) value))
