(ns dots.typescript.server.protocol.close-external-project-request
  "Request to close external project."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.CloseExternalProject`"
  ^js [close-external-project-request]
  (.-command ^js close-external-project-request))

(defn set-command!
  ^js [close-external-project-request value]
  (set! (.-command ^js close-external-project-request) value))

(defn arguments
  "**Returns:** `CloseExternalProjectRequestArgs`"
  ^js [close-external-project-request]
  (.-arguments ^js close-external-project-request))

(defn set-arguments!
  ^js [close-external-project-request value]
  (set! (.-arguments ^js close-external-project-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [close-external-project-request]
  (.-type ^js close-external-project-request))

(defn set-type!
  ^js [close-external-project-request value]
  (set! (.-type ^js close-external-project-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [close-external-project-request]
  (.-seq ^js close-external-project-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [close-external-project-request value]
  (set! (.-seq ^js close-external-project-request) value))
