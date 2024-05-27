(ns dots.typescript.server.protocol.open-request
  "Open request; value of command field is \"open\". Notify the
   server that the client has file open.  The server will not
   monitor the filesystem for changes in this file and will assume
   that the client is updating the server (using the change and/or
   reload messages) when the file changes. Server does not currently
   send a response to an open request."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Open`"
  ^js [open-request]
  (.-command ^js open-request))

(defn set-command!
  ^js [open-request value]
  (set! (.-command ^js open-request) value))

(defn arguments
  "**Returns:** `OpenRequestArgs`"
  ^js [open-request]
  (.-arguments ^js open-request))

(defn set-arguments!
  ^js [open-request value]
  (set! (.-arguments ^js open-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [open-request]
  (.-type ^js open-request))

(defn set-type!
  ^js [open-request value]
  (set! (.-type ^js open-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [open-request]
  (.-seq ^js open-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [open-request value]
  (set! (.-seq ^js open-request) value))
