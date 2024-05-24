(ns dots.typescript.server.protocol.telemetry-event
  (:refer-clojure :exclude [seq type]))

(defn event
  ^js [telemetry-event]
  (.-event ^js telemetry-event))

(defn set-event!
  ^js [telemetry-event value]
  (set! (.-event ^js telemetry-event) value))

(defn body
  ^js [telemetry-event]
  (.-body ^js telemetry-event))

(defn set-body!
  ^js [telemetry-event value]
  (set! (.-body ^js telemetry-event) value))

(defn type
  ^js [telemetry-event]
  (.-type ^js telemetry-event))

(defn set-type!
  ^js [telemetry-event value]
  (set! (.-type ^js telemetry-event) value))

(defn seq
  "Sequence number of the message"
  ^js [telemetry-event]
  (.-seq ^js telemetry-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [telemetry-event value]
  (set! (.-seq ^js telemetry-event) value))
