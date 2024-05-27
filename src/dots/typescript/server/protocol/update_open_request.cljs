(ns dots.typescript.server.protocol.update-open-request
  "Request to synchronize list of open files with the client"
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.UpdateOpen`"
  ^js [update-open-request]
  (.-command ^js update-open-request))

(defn set-command!
  ^js [update-open-request value]
  (set! (.-command ^js update-open-request) value))

(defn arguments
  "**Returns:** `UpdateOpenRequestArgs`"
  ^js [update-open-request]
  (.-arguments ^js update-open-request))

(defn set-arguments!
  ^js [update-open-request value]
  (set! (.-arguments ^js update-open-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [update-open-request]
  (.-type ^js update-open-request))

(defn set-type!
  ^js [update-open-request value]
  (set! (.-type ^js update-open-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [update-open-request]
  (.-seq ^js update-open-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [update-open-request value]
  (set! (.-seq ^js update-open-request) value))
