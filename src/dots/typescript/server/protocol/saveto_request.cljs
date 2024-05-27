(ns dots.typescript.server.protocol.saveto-request
  "Saveto request message; value of command field is \"saveto\".
   For debugging purposes, save to a temporaryfile (named by
   argument 'tmpfile') the contents of file named by argument
   'file'.  The server does not currently send a response to a
   \"saveto\" request."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Saveto`"
  ^js [saveto-request]
  (.-command ^js saveto-request))

(defn set-command!
  ^js [saveto-request value]
  (set! (.-command ^js saveto-request) value))

(defn arguments
  "**Returns:** `SavetoRequestArgs`"
  ^js [saveto-request]
  (.-arguments ^js saveto-request))

(defn set-arguments!
  ^js [saveto-request value]
  (set! (.-arguments ^js saveto-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [saveto-request]
  (.-type ^js saveto-request))

(defn set-type!
  ^js [saveto-request value]
  (set! (.-type ^js saveto-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [saveto-request]
  (.-seq ^js saveto-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [saveto-request value]
  (set! (.-seq ^js saveto-request) value))
