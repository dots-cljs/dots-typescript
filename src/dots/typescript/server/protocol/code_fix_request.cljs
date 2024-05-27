(ns dots.typescript.server.protocol.code-fix-request
  "Request for the available codefixes at a specific position."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.GetCodeFixes`"
  ^js [code-fix-request]
  (.-command ^js code-fix-request))

(defn set-command!
  ^js [code-fix-request value]
  (set! (.-command ^js code-fix-request) value))

(defn arguments
  "**Returns:** `CodeFixRequestArgs`"
  ^js [code-fix-request]
  (.-arguments ^js code-fix-request))

(defn set-arguments!
  ^js [code-fix-request value]
  (set! (.-arguments ^js code-fix-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [code-fix-request]
  (.-type ^js code-fix-request))

(defn set-type!
  ^js [code-fix-request value]
  (set! (.-type ^js code-fix-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [code-fix-request]
  (.-seq ^js code-fix-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [code-fix-request value]
  (set! (.-seq ^js code-fix-request) value))
