(ns dots.typescript.server.protocol.status-request
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [status-request]
  (.-command ^js status-request))

(defn set-command!
  ^js [status-request value]
  (set! (.-command ^js status-request) value))

(defn type
  ^js [status-request]
  (.-type ^js status-request))

(defn set-type!
  ^js [status-request value]
  (set! (.-type ^js status-request) value))

(defn arguments
  "Object containing arguments for the command"
  ^js [status-request]
  (.-arguments ^js status-request))

(defn set-arguments!
  "Object containing arguments for the command"
  ^js [status-request value]
  (set! (.-arguments ^js status-request) value))

(defn seq
  "Sequence number of the message"
  ^js [status-request]
  (.-seq ^js status-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [status-request value]
  (set! (.-seq ^js status-request) value))
