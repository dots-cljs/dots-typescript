(ns dots.typescript.server.protocol.comment-selection-request
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [comment-selection-request]
  (.-command ^js comment-selection-request))

(defn set-command!
  ^js [comment-selection-request value]
  (set! (.-command ^js comment-selection-request) value))

(defn arguments
  ^js [comment-selection-request]
  (.-arguments ^js comment-selection-request))

(defn set-arguments!
  ^js [comment-selection-request value]
  (set! (.-arguments ^js comment-selection-request) value))

(defn type
  ^js [comment-selection-request]
  (.-type ^js comment-selection-request))

(defn set-type!
  ^js [comment-selection-request value]
  (set! (.-type ^js comment-selection-request) value))

(defn seq
  "Sequence number of the message"
  ^js [comment-selection-request]
  (.-seq ^js comment-selection-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [comment-selection-request value]
  (set! (.-seq ^js comment-selection-request) value))
