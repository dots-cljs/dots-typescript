(ns dots.typescript.server.protocol.span-of-enclosing-comment-request
  "A request to determine if the caret is inside a comment."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.GetSpanOfEnclosingComment`"
  ^js [span-of-enclosing-comment-request]
  (.-command ^js span-of-enclosing-comment-request))

(defn set-command!
  ^js [span-of-enclosing-comment-request value]
  (set! (.-command ^js span-of-enclosing-comment-request) value))

(defn arguments
  "**Returns:** `SpanOfEnclosingCommentRequestArgs`"
  ^js [span-of-enclosing-comment-request]
  (.-arguments ^js span-of-enclosing-comment-request))

(defn set-arguments!
  ^js [span-of-enclosing-comment-request value]
  (set! (.-arguments ^js span-of-enclosing-comment-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [span-of-enclosing-comment-request]
  (.-type ^js span-of-enclosing-comment-request))

(defn set-type!
  ^js [span-of-enclosing-comment-request value]
  (set! (.-type ^js span-of-enclosing-comment-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [span-of-enclosing-comment-request]
  (.-seq ^js span-of-enclosing-comment-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [span-of-enclosing-comment-request value]
  (set! (.-seq ^js span-of-enclosing-comment-request) value))
