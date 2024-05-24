(ns dots.typescript.server.protocol.request
  "Client-initiated request message"
  (:refer-clojure :exclude [seq type]))

(defn type
  ^js [request]
  (.-type ^js request))

(defn set-type!
  ^js [request value]
  (set! (.-type ^js request) value))

(defn command
  "The command to execute"
  ^js [request]
  (.-command ^js request))

(defn set-command!
  "The command to execute"
  ^js [request value]
  (set! (.-command ^js request) value))

(defn arguments
  "Object containing arguments for the command"
  ^js [request]
  (.-arguments ^js request))

(defn set-arguments!
  "Object containing arguments for the command"
  ^js [request value]
  (set! (.-arguments ^js request) value))

(defn seq
  "Sequence number of the message"
  ^js [request]
  (.-seq ^js request))

(defn set-seq!
  "Sequence number of the message"
  ^js [request value]
  (set! (.-seq ^js request) value))
