(ns dots.typescript.server.protocol.request-completed-event
  "Event that is sent when server have finished processing request with specified id."
  (:refer-clojure :exclude [seq type]))

(defn event
  ^js [request-completed-event]
  (.-event ^js request-completed-event))

(defn set-event!
  ^js [request-completed-event value]
  (set! (.-event ^js request-completed-event) value))

(defn body
  ^js [request-completed-event]
  (.-body ^js request-completed-event))

(defn set-body!
  ^js [request-completed-event value]
  (set! (.-body ^js request-completed-event) value))

(defn type
  ^js [request-completed-event]
  (.-type ^js request-completed-event))

(defn set-type!
  ^js [request-completed-event value]
  (set! (.-type ^js request-completed-event) value))

(defn seq
  "Sequence number of the message"
  ^js [request-completed-event]
  (.-seq ^js request-completed-event))

(defn set-seq!
  "Sequence number of the message"
  ^js [request-completed-event value]
  (set! (.-seq ^js request-completed-event) value))
