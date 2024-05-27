(ns dots.typescript.server.protocol.get-supported-code-fixes-request
  "A request to get codes of supported code fixes."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.GetSupportedCodeFixes`"
  ^js [get-supported-code-fixes-request]
  (.-command ^js get-supported-code-fixes-request))

(defn set-command!
  ^js [get-supported-code-fixes-request value]
  (set! (.-command ^js get-supported-code-fixes-request) value))

(defn arguments
  "**Returns:** `Partial<FileRequestArgs> | undefined`"
  ^js [get-supported-code-fixes-request]
  (.-arguments ^js get-supported-code-fixes-request))

(defn set-arguments!
  ^js [get-supported-code-fixes-request value]
  (set! (.-arguments ^js get-supported-code-fixes-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [get-supported-code-fixes-request]
  (.-type ^js get-supported-code-fixes-request))

(defn set-type!
  ^js [get-supported-code-fixes-request value]
  (set! (.-type ^js get-supported-code-fixes-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [get-supported-code-fixes-request]
  (.-seq ^js get-supported-code-fixes-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-supported-code-fixes-request value]
  (set! (.-seq ^js get-supported-code-fixes-request) value))
