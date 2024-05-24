(ns dots.typescript.server.protocol.message
  "A TypeScript Server message"
  (:refer-clojure :exclude [seq type]))

(defn seq
  "Sequence number of the message"
  ^js [message]
  (.-seq ^js message))

(defn set-seq!
  "Sequence number of the message"
  ^js [message value]
  (set! (.-seq ^js message) value))

(defn type
  "One of \"request\", \"response\", or \"event\""
  ^js [message]
  (.-type ^js message))

(defn set-type!
  "One of \"request\", \"response\", or \"event\""
  ^js [message value]
  (set! (.-type ^js message) value))
