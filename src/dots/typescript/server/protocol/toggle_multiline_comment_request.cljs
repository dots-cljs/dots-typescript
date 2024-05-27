(ns dots.typescript.server.protocol.toggle-multiline-comment-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.ToggleMultilineComment`"
  ^js [toggle-multiline-comment-request]
  (.-command ^js toggle-multiline-comment-request))

(defn set-command!
  ^js [toggle-multiline-comment-request value]
  (set! (.-command ^js toggle-multiline-comment-request) value))

(defn arguments
  "**Returns:** `FileRangeRequestArgs`"
  ^js [toggle-multiline-comment-request]
  (.-arguments ^js toggle-multiline-comment-request))

(defn set-arguments!
  ^js [toggle-multiline-comment-request value]
  (set! (.-arguments ^js toggle-multiline-comment-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [toggle-multiline-comment-request]
  (.-type ^js toggle-multiline-comment-request))

(defn set-type!
  ^js [toggle-multiline-comment-request value]
  (set! (.-type ^js toggle-multiline-comment-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [toggle-multiline-comment-request]
  (.-seq ^js toggle-multiline-comment-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [toggle-multiline-comment-request value]
  (set! (.-seq ^js toggle-multiline-comment-request) value))
