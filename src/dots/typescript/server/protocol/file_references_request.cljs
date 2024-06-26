(ns dots.typescript.server.protocol.file-references-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.FileReferences`"
  ^js [file-references-request]
  (.-command ^js file-references-request))

(defn set-command!
  ^js [file-references-request value]
  (set! (.-command ^js file-references-request) value))

(defn arguments
  "**Returns:** `FileRequestArgs`"
  ^js [file-references-request]
  (.-arguments ^js file-references-request))

(defn set-arguments!
  ^js [file-references-request value]
  (set! (.-arguments ^js file-references-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [file-references-request]
  (.-type ^js file-references-request))

(defn set-type!
  ^js [file-references-request value]
  (set! (.-type ^js file-references-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [file-references-request]
  (.-seq ^js file-references-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [file-references-request value]
  (set! (.-seq ^js file-references-request) value))
