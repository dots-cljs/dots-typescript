(ns dots.typescript.server.protocol.watch-change-request
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.WatchChange`"
  ^js [watch-change-request]
  (.-command ^js watch-change-request))

(defn set-command!
  ^js [watch-change-request value]
  (set! (.-command ^js watch-change-request) value))

(defn arguments
  "**Returns:** `WatchChangeRequestArgs | readonly WatchChangeRequestArgs[]`"
  ^js [watch-change-request]
  (.-arguments ^js watch-change-request))

(defn set-arguments!
  ^js [watch-change-request value]
  (set! (.-arguments ^js watch-change-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [watch-change-request]
  (.-type ^js watch-change-request))

(defn set-type!
  ^js [watch-change-request value]
  (set! (.-type ^js watch-change-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [watch-change-request]
  (.-seq ^js watch-change-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [watch-change-request value]
  (set! (.-seq ^js watch-change-request) value))
