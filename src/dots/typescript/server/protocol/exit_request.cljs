(ns dots.typescript.server.protocol.exit-request
  "Exit request; value of command field is \"exit\".  Ask the server process
   to exit."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Exit`"
  ^js [exit-request]
  (.-command ^js exit-request))

(defn set-command!
  ^js [exit-request value]
  (set! (.-command ^js exit-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [exit-request]
  (.-type ^js exit-request))

(defn set-type!
  ^js [exit-request value]
  (set! (.-type ^js exit-request) value))

(defn arguments
  "Object containing arguments for the command
   
   **Returns:** `any`"
  ^js [exit-request]
  (.-arguments ^js exit-request))

(defn set-arguments!
  "Object containing arguments for the command"
  ^js [exit-request value]
  (set! (.-arguments ^js exit-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [exit-request]
  (.-seq ^js exit-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [exit-request value]
  (set! (.-seq ^js exit-request) value))
