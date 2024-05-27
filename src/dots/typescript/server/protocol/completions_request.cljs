(ns dots.typescript.server.protocol.completions-request
  "Completions request; value of command field is \"completions\".
   Given a file location (file, line, col) and a prefix (which may
   be the empty string), return the possible completions that
   begin with prefix."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Completions | CommandTypes.CompletionInfo`"
  ^js [completions-request]
  (.-command ^js completions-request))

(defn set-command!
  ^js [completions-request value]
  (set! (.-command ^js completions-request) value))

(defn arguments
  "**Returns:** `CompletionsRequestArgs`"
  ^js [completions-request]
  (.-arguments ^js completions-request))

(defn set-arguments!
  ^js [completions-request value]
  (set! (.-arguments ^js completions-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [completions-request]
  (.-type ^js completions-request))

(defn set-type!
  ^js [completions-request value]
  (set! (.-type ^js completions-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [completions-request]
  (.-seq ^js completions-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [completions-request value]
  (set! (.-seq ^js completions-request) value))
