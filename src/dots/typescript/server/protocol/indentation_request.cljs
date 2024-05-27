(ns dots.typescript.server.protocol.indentation-request
  "A request to get indentation for a location in file"
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.Indentation`"
  ^js [indentation-request]
  (.-command ^js indentation-request))

(defn set-command!
  ^js [indentation-request value]
  (set! (.-command ^js indentation-request) value))

(defn arguments
  "**Returns:** `IndentationRequestArgs`"
  ^js [indentation-request]
  (.-arguments ^js indentation-request))

(defn set-arguments!
  ^js [indentation-request value]
  (set! (.-arguments ^js indentation-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [indentation-request]
  (.-type ^js indentation-request))

(defn set-type!
  ^js [indentation-request value]
  (set! (.-type ^js indentation-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [indentation-request]
  (.-seq ^js indentation-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [indentation-request value]
  (set! (.-seq ^js indentation-request) value))
