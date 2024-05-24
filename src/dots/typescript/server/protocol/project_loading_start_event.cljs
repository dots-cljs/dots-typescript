(ns dots.typescript.server.protocol.project-loading-start-event
  (:refer-clojure :exclude [seq type]))

(defn event
  ^js [project-loading-start-event]
  (.-event ^js project-loading-start-event))

(defn set-event!
  ^js [project-loading-start-event value]
  (set! (.-event ^js project-loading-start-event) value))

(defn body
  ^js [project-loading-start-event]
  (.-body ^js project-loading-start-event))

(defn set-body!
  ^js [project-loading-start-event value]
  (set! (.-body ^js project-loading-start-event) value))

(defn type
  ^js [project-loading-start-event]
  (.-type ^js project-loading-start-event))

(defn set-type!
  ^js [project-loading-start-event value]
  (set! (.-type ^js project-loading-start-event) value))

(defn seq
  "Sequence number of the message"
  ^js [project-loading-start-event]
  (.-seq ^js project-loading-start-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [project-loading-start-event value]
  (set! (.-seq ^js project-loading-start-event) value))
