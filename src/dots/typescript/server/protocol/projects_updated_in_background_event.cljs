(ns dots.typescript.server.protocol.projects-updated-in-background-event
  (:refer-clojure :exclude [seq type]))

(defn event
  ^js [projects-updated-in-background-event]
  (.-event ^js projects-updated-in-background-event))

(defn set-event!
  ^js [projects-updated-in-background-event value]
  (set! (.-event ^js projects-updated-in-background-event) value))

(defn body
  ^js [projects-updated-in-background-event]
  (.-body ^js projects-updated-in-background-event))

(defn set-body!
  ^js [projects-updated-in-background-event value]
  (set! (.-body ^js projects-updated-in-background-event) value))

(defn type
  ^js [projects-updated-in-background-event]
  (.-type ^js projects-updated-in-background-event))

(defn set-type!
  ^js [projects-updated-in-background-event value]
  (set! (.-type ^js projects-updated-in-background-event) value))

(defn seq
  "Sequence number of the message"
  ^js [projects-updated-in-background-event]
  (.-seq ^js projects-updated-in-background-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [projects-updated-in-background-event value]
  (set! (.-seq ^js projects-updated-in-background-event) value))
