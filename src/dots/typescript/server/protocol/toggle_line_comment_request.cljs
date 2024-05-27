(ns dots.typescript.server.protocol.toggle-line-comment-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.ToggleLineComment`"
  ^js [toggle-line-comment-request]
  (.-command ^js toggle-line-comment-request))

(defn set-command!
  ^js [toggle-line-comment-request value]
  (set! (.-command ^js toggle-line-comment-request) value))

(defn arguments
  "**Returns:** `FileRangeRequestArgs`"
  ^js [toggle-line-comment-request]
  (.-arguments ^js toggle-line-comment-request))

(defn set-arguments!
  ^js [toggle-line-comment-request value]
  (set! (.-arguments ^js toggle-line-comment-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [toggle-line-comment-request]
  (.-type ^js toggle-line-comment-request))

(defn set-type!
  ^js [toggle-line-comment-request value]
  (set! (.-type ^js toggle-line-comment-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [toggle-line-comment-request]
  (.-seq ^js toggle-line-comment-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [toggle-line-comment-request value]
  (set! (.-seq ^js toggle-line-comment-request) value))
