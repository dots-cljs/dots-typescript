(ns dots.typescript.server.protocol.survey-ready-event
  (:refer-clojure :exclude [seq type]))

(defn event
  "**Returns:** `\"surveyReady\"`"
  ^js [survey-ready-event]
  (.-event ^js survey-ready-event))

(defn set-event!
  ^js [survey-ready-event value]
  (set! (.-event ^js survey-ready-event) value))

(defn body
  "**Returns:** `SurveyReadyEventBody`"
  ^js [survey-ready-event]
  (.-body ^js survey-ready-event))

(defn set-body!
  ^js [survey-ready-event value]
  (set! (.-body ^js survey-ready-event) value))

(defn type
  "**Returns:** `\"event\"`"
  ^js [survey-ready-event]
  (.-type ^js survey-ready-event))

(defn set-type!
  ^js [survey-ready-event value]
  (set! (.-type ^js survey-ready-event) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [survey-ready-event]
  (.-seq ^js survey-ready-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [survey-ready-event value]
  (set! (.-seq ^js survey-ready-event) value))
