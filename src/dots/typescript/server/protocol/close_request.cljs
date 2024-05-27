(ns dots.typescript.server.protocol.close-request
  "Close request; value of command field is \"close\". Notify the
   server that the client has closed a previously open file.  If
   file is still referenced by open files, the server will resume
   monitoring the filesystem for changes to file.  Server does not
   currently send a response to a close request."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Close`"
  ^js [close-request]
  (.-command ^js close-request))

(defn set-command!
  ^js [close-request value]
  (set! (.-command ^js close-request) value))

(defn arguments
  "**Returns:** `FileRequestArgs`"
  ^js [close-request]
  (.-arguments ^js close-request))

(defn set-arguments!
  ^js [close-request value]
  (set! (.-arguments ^js close-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [close-request]
  (.-type ^js close-request))

(defn set-type!
  ^js [close-request value]
  (set! (.-type ^js close-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [close-request]
  (.-seq ^js close-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [close-request value]
  (set! (.-seq ^js close-request) value))
