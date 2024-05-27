(ns dots.typescript.server.protocol.project-language-service-state-event
  (:refer-clojure :exclude [seq type]))

(defn event
  "**Returns:** `\"projectLanguageServiceState\"`"
  ^js [project-language-service-state-event]
  (.-event ^js project-language-service-state-event))

(defn set-event!
  ^js [project-language-service-state-event value]
  (set! (.-event ^js project-language-service-state-event) value))

(defn body
  "**Returns:** `ProjectLanguageServiceStateEventBody | undefined`"
  ^js [project-language-service-state-event]
  (.-body ^js project-language-service-state-event))

(defn set-body!
  ^js [project-language-service-state-event value]
  (set! (.-body ^js project-language-service-state-event) value))

(defn type
  "**Returns:** `\"event\"`"
  ^js [project-language-service-state-event]
  (.-type ^js project-language-service-state-event))

(defn set-type!
  ^js [project-language-service-state-event value]
  (set! (.-type ^js project-language-service-state-event) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [project-language-service-state-event]
  (.-seq ^js project-language-service-state-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [project-language-service-state-event value]
  (set! (.-seq ^js project-language-service-state-event) value))
