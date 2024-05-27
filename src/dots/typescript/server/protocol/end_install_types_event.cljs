(ns dots.typescript.server.protocol.end-install-types-event
  (:refer-clojure :exclude [seq type]))

(defn event
  "**Returns:** `\"endInstallTypes\"`"
  ^js [end-install-types-event]
  (.-event ^js end-install-types-event))

(defn set-event!
  ^js [end-install-types-event value]
  (set! (.-event ^js end-install-types-event) value))

(defn body
  "**Returns:** `EndInstallTypesEventBody`"
  ^js [end-install-types-event]
  (.-body ^js end-install-types-event))

(defn set-body!
  ^js [end-install-types-event value]
  (set! (.-body ^js end-install-types-event) value))

(defn type
  "**Returns:** `\"event\"`"
  ^js [end-install-types-event]
  (.-type ^js end-install-types-event))

(defn set-type!
  ^js [end-install-types-event value]
  (set! (.-type ^js end-install-types-event) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [end-install-types-event]
  (.-seq ^js end-install-types-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [end-install-types-event value]
  (set! (.-seq ^js end-install-types-event) value))
