(ns dots.typescript.server.protocol.file-request
  "Request whose sole parameter is a file name."
  (:refer-clojure :exclude [seq type]))

(defn arguments
  "**Returns:** `FileRequestArgs`"
  ^js [file-request]
  (.-arguments ^js file-request))

(defn set-arguments!
  ^js [file-request value]
  (set! (.-arguments ^js file-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [file-request]
  (.-type ^js file-request))

(defn set-type!
  ^js [file-request value]
  (set! (.-type ^js file-request) value))

(defn command
  "The command to execute
   
   **Returns:** `string`"
  ^js [file-request]
  (.-command ^js file-request))

(defn set-command!
  "The command to execute"
  ^js [file-request value]
  (set! (.-command ^js file-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [file-request]
  (.-seq ^js file-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [file-request value]
  (set! (.-seq ^js file-request) value))
