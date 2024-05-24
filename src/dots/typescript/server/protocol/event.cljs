(ns dots.typescript.server.protocol.event
  "Server-initiated event message"
  (:refer-clojure :exclude [seq type]))

(defn type
  ^js [event]
  (.-type ^js event))

(defn set-type!
  ^js [event value]
  (set! (.-type ^js event) value))

(defn event
  "Name of event"
  ^js [event]
  (.-event ^js event))

(defn set-event!
  "Name of event"
  ^js [event value]
  (set! (.-event ^js event) value))

(defn body
  "Event-specific information"
  ^js [event]
  (.-body ^js event))

(defn set-body!
  "Event-specific information"
  ^js [event value]
  (set! (.-body ^js event) value))

(defn seq
  "Sequence number of the message"
  ^js [event]
  (.-seq ^js event))

(defn set-seq!
  "Sequence number of the message"
  ^js [event value]
  (set! (.-seq ^js event) value))
