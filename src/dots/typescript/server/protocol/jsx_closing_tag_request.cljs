(ns dots.typescript.server.protocol.jsx-closing-tag-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.JsxClosingTag`"
  ^js [jsx-closing-tag-request]
  (.-command ^js jsx-closing-tag-request))

(defn arguments
  "**Returns:** `JsxClosingTagRequestArgs`"
  ^js [jsx-closing-tag-request]
  (.-arguments ^js jsx-closing-tag-request))

(defn type
  "**Returns:** `\"request\"`"
  ^js [jsx-closing-tag-request]
  (.-type ^js jsx-closing-tag-request))

(defn set-type!
  ^js [jsx-closing-tag-request value]
  (set! (.-type ^js jsx-closing-tag-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [jsx-closing-tag-request]
  (.-seq ^js jsx-closing-tag-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [jsx-closing-tag-request value]
  (set! (.-seq ^js jsx-closing-tag-request) value))
