(ns dots.typescript.server.protocol.change-request
  "Change request message; value of command field is \"change\".
   Update the server's view of the file named by argument 'file'.
   Server does not currently send a response to a change request."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Change`"
  ^js [change-request]
  (.-command ^js change-request))

(defn set-command!
  ^js [change-request value]
  (set! (.-command ^js change-request) value))

(defn arguments
  "**Returns:** `ChangeRequestArgs`"
  ^js [change-request]
  (.-arguments ^js change-request))

(defn set-arguments!
  ^js [change-request value]
  (set! (.-arguments ^js change-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [change-request]
  (.-type ^js change-request))

(defn set-type!
  ^js [change-request value]
  (set! (.-type ^js change-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [change-request]
  (.-seq ^js change-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [change-request value]
  (set! (.-seq ^js change-request) value))
