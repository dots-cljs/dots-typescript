(ns dots.typescript.server.protocol.project-loading-finish-event
  (:refer-clojure :exclude [seq type]))

(defn event
  ^js [project-loading-finish-event]
  (.-event ^js project-loading-finish-event))

(defn set-event!
  ^js [project-loading-finish-event value]
  (set! (.-event ^js project-loading-finish-event) value))

(defn body
  ^js [project-loading-finish-event]
  (.-body ^js project-loading-finish-event))

(defn set-body!
  ^js [project-loading-finish-event value]
  (set! (.-body ^js project-loading-finish-event) value))

(defn type
  ^js [project-loading-finish-event]
  (.-type ^js project-loading-finish-event))

(defn set-type!
  ^js [project-loading-finish-event value]
  (set! (.-type ^js project-loading-finish-event) value))

(defn seq
  "Sequence number of the message"
  ^js [project-loading-finish-event]
  (.-seq ^js project-loading-finish-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [project-loading-finish-event value]
  (set! (.-seq ^js project-loading-finish-event) value))
