(ns dots.typescript.server.protocol.types-installer-initialization-failed-event
  (:refer-clojure :exclude [seq type]))

(defn event
  ^js [types-installer-initialization-failed-event]
  (.-event ^js types-installer-initialization-failed-event))

(defn set-event!
  ^js [types-installer-initialization-failed-event value]
  (set! (.-event ^js types-installer-initialization-failed-event) value))

(defn body
  ^js [types-installer-initialization-failed-event]
  (.-body ^js types-installer-initialization-failed-event))

(defn set-body!
  ^js [types-installer-initialization-failed-event value]
  (set! (.-body ^js types-installer-initialization-failed-event) value))

(defn type
  ^js [types-installer-initialization-failed-event]
  (.-type ^js types-installer-initialization-failed-event))

(defn set-type!
  ^js [types-installer-initialization-failed-event value]
  (set! (.-type ^js types-installer-initialization-failed-event) value))

(defn seq
  "Sequence number of the message"
  ^js [types-installer-initialization-failed-event]
  (.-seq ^js types-installer-initialization-failed-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [types-installer-initialization-failed-event value]
  (set! (.-seq ^js types-installer-initialization-failed-event) value))
