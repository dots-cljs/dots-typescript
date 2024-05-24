(ns dots.typescript.server.protocol.reload-projects-request
  "Request to reload the project structure for all the opened files"
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [reload-projects-request]
  (.-command ^js reload-projects-request))

(defn set-command!
  ^js [reload-projects-request value]
  (set! (.-command ^js reload-projects-request) value))

(defn type
  ^js [reload-projects-request]
  (.-type ^js reload-projects-request))

(defn set-type!
  ^js [reload-projects-request value]
  (set! (.-type ^js reload-projects-request) value))

(defn arguments
  "Object containing arguments for the command"
  ^js [reload-projects-request]
  (.-arguments ^js reload-projects-request))

(defn set-arguments!
  "Object containing arguments for the command"
  ^js [reload-projects-request value]
  (set! (.-arguments ^js reload-projects-request) value))

(defn seq
  "Sequence number of the message"
  ^js [reload-projects-request]
  (.-seq ^js reload-projects-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [reload-projects-request value]
  (set! (.-seq ^js reload-projects-request) value))
