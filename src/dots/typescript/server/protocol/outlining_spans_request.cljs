(ns dots.typescript.server.protocol.outlining-spans-request
  "Request to obtain outlining spans in file."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.GetOutliningSpans`"
  ^js [outlining-spans-request]
  (.-command ^js outlining-spans-request))

(defn set-command!
  ^js [outlining-spans-request value]
  (set! (.-command ^js outlining-spans-request) value))

(defn arguments
  "**Returns:** `FileRequestArgs`"
  ^js [outlining-spans-request]
  (.-arguments ^js outlining-spans-request))

(defn set-arguments!
  ^js [outlining-spans-request value]
  (set! (.-arguments ^js outlining-spans-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [outlining-spans-request]
  (.-type ^js outlining-spans-request))

(defn set-type!
  ^js [outlining-spans-request value]
  (set! (.-type ^js outlining-spans-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [outlining-spans-request]
  (.-seq ^js outlining-spans-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [outlining-spans-request value]
  (set! (.-seq ^js outlining-spans-request) value))
