(ns dots.typescript.server.protocol.open-external-project-request
  "Request to open or update external project"
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [open-external-project-request]
  (.-command ^js open-external-project-request))

(defn set-command!
  ^js [open-external-project-request value]
  (set! (.-command ^js open-external-project-request) value))

(defn arguments
  ^js [open-external-project-request]
  (.-arguments ^js open-external-project-request))

(defn set-arguments!
  ^js [open-external-project-request value]
  (set! (.-arguments ^js open-external-project-request) value))

(defn type
  ^js [open-external-project-request]
  (.-type ^js open-external-project-request))

(defn set-type!
  ^js [open-external-project-request value]
  (set! (.-type ^js open-external-project-request) value))

(defn seq
  "Sequence number of the message"
  ^js [open-external-project-request]
  (.-seq ^js open-external-project-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [open-external-project-request value]
  (set! (.-seq ^js open-external-project-request) value))
