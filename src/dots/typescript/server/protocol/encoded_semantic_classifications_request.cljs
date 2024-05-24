(ns dots.typescript.server.protocol.encoded-semantic-classifications-request
  "A request to get encoded semantic classifications for a span in the file"
  (:refer-clojure :exclude [seq type]))

(defn arguments
  ^js [encoded-semantic-classifications-request]
  (.-arguments ^js encoded-semantic-classifications-request))

(defn set-arguments!
  ^js [encoded-semantic-classifications-request value]
  (set! (.-arguments ^js encoded-semantic-classifications-request) value))

(defn type
  ^js [encoded-semantic-classifications-request]
  (.-type ^js encoded-semantic-classifications-request))

(defn set-type!
  ^js [encoded-semantic-classifications-request value]
  (set! (.-type ^js encoded-semantic-classifications-request) value))

(defn command
  "The command to execute"
  ^js [encoded-semantic-classifications-request]
  (.-command ^js encoded-semantic-classifications-request))

(defn set-command!
  "The command to execute"
  ^js [encoded-semantic-classifications-request value]
  (set! (.-command ^js encoded-semantic-classifications-request) value))

(defn seq
  "Sequence number of the message"
  ^js [encoded-semantic-classifications-request]
  (.-seq ^js encoded-semantic-classifications-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [encoded-semantic-classifications-request value]
  (set! (.-seq ^js encoded-semantic-classifications-request) value))
