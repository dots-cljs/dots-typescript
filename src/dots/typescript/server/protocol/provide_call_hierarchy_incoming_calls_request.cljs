(ns dots.typescript.server.protocol.provide-call-hierarchy-incoming-calls-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.ProvideCallHierarchyIncomingCalls`"
  ^js [provide-call-hierarchy-incoming-calls-request]
  (.-command ^js provide-call-hierarchy-incoming-calls-request))

(defn set-command!
  ^js [provide-call-hierarchy-incoming-calls-request value]
  (set! (.-command ^js provide-call-hierarchy-incoming-calls-request) value))

(defn arguments
  "**Returns:** `FileLocationRequestArgs`"
  ^js [provide-call-hierarchy-incoming-calls-request]
  (.-arguments ^js provide-call-hierarchy-incoming-calls-request))

(defn set-arguments!
  ^js [provide-call-hierarchy-incoming-calls-request value]
  (set! (.-arguments ^js provide-call-hierarchy-incoming-calls-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [provide-call-hierarchy-incoming-calls-request]
  (.-type ^js provide-call-hierarchy-incoming-calls-request))

(defn set-type!
  ^js [provide-call-hierarchy-incoming-calls-request value]
  (set! (.-type ^js provide-call-hierarchy-incoming-calls-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [provide-call-hierarchy-incoming-calls-request]
  (.-seq ^js provide-call-hierarchy-incoming-calls-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [provide-call-hierarchy-incoming-calls-request value]
  (set! (.-seq ^js provide-call-hierarchy-incoming-calls-request) value))
