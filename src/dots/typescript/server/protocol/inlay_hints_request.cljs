(ns dots.typescript.server.protocol.inlay-hints-request
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [inlay-hints-request]
  (.-command ^js inlay-hints-request))

(defn set-command!
  ^js [inlay-hints-request value]
  (set! (.-command ^js inlay-hints-request) value))

(defn arguments
  ^js [inlay-hints-request]
  (.-arguments ^js inlay-hints-request))

(defn set-arguments!
  ^js [inlay-hints-request value]
  (set! (.-arguments ^js inlay-hints-request) value))

(defn type
  ^js [inlay-hints-request]
  (.-type ^js inlay-hints-request))

(defn set-type!
  ^js [inlay-hints-request value]
  (set! (.-type ^js inlay-hints-request) value))

(defn seq
  "Sequence number of the message"
  ^js [inlay-hints-request]
  (.-seq ^js inlay-hints-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [inlay-hints-request value]
  (set! (.-seq ^js inlay-hints-request) value))
