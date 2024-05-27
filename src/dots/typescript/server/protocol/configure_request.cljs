(ns dots.typescript.server.protocol.configure-request
  "Configure request; value of command field is \"configure\".  Specifies
   host information, such as host type, tab size, and indent size."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Configure`"
  ^js [configure-request]
  (.-command ^js configure-request))

(defn set-command!
  ^js [configure-request value]
  (set! (.-command ^js configure-request) value))

(defn arguments
  "**Returns:** `ConfigureRequestArguments`"
  ^js [configure-request]
  (.-arguments ^js configure-request))

(defn set-arguments!
  ^js [configure-request value]
  (set! (.-arguments ^js configure-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [configure-request]
  (.-type ^js configure-request))

(defn set-type!
  ^js [configure-request value]
  (set! (.-type ^js configure-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [configure-request]
  (.-seq ^js configure-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [configure-request value]
  (set! (.-seq ^js configure-request) value))
