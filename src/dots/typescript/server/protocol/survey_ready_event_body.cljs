(ns dots.typescript.server.protocol.survey-ready-event-body)

(defn survey-id
  "Name of the survey. This is an internal machine- and programmer-friendly name
   
   **Returns:** `string`"
  ^js [survey-ready-event-body]
  (.-surveyId ^js survey-ready-event-body))

(defn set-survey-id!
  "Name of the survey. This is an internal machine- and programmer-friendly name"
  ^js [survey-ready-event-body value]
  (set! (.-surveyId ^js survey-ready-event-body) value))
