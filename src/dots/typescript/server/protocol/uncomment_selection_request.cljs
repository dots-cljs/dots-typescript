(ns dots.typescript.server.protocol.uncomment-selection-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.UncommentSelection`"
  ^js [uncomment-selection-request]
  (.-command ^js uncomment-selection-request))

(defn set-command!
  ^js [uncomment-selection-request value]
  (set! (.-command ^js uncomment-selection-request) value))

(defn arguments
  "**Returns:** `FileRangeRequestArgs`"
  ^js [uncomment-selection-request]
  (.-arguments ^js uncomment-selection-request))

(defn set-arguments!
  ^js [uncomment-selection-request value]
  (set! (.-arguments ^js uncomment-selection-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [uncomment-selection-request]
  (.-type ^js uncomment-selection-request))

(defn set-type!
  ^js [uncomment-selection-request value]
  (set! (.-type ^js uncomment-selection-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [uncomment-selection-request]
  (.-seq ^js uncomment-selection-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [uncomment-selection-request value]
  (set! (.-seq ^js uncomment-selection-request) value))
