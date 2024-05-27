(ns dots.typescript.server.protocol.nav-bar-request
  "NavBar items request; value of command field is \"navbar\".
   Return response giving the list of navigation bar entries
   extracted from the requested file."
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.NavBar`"
  ^js [nav-bar-request]
  (.-command ^js nav-bar-request))

(defn set-command!
  ^js [nav-bar-request value]
  (set! (.-command ^js nav-bar-request) value))

(defn arguments
  "**Returns:** `FileRequestArgs`"
  ^js [nav-bar-request]
  (.-arguments ^js nav-bar-request))

(defn set-arguments!
  ^js [nav-bar-request value]
  (set! (.-arguments ^js nav-bar-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [nav-bar-request]
  (.-type ^js nav-bar-request))

(defn set-type!
  ^js [nav-bar-request value]
  (set! (.-type ^js nav-bar-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [nav-bar-request]
  (.-seq ^js nav-bar-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [nav-bar-request value]
  (set! (.-seq ^js nav-bar-request) value))
