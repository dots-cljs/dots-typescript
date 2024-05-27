(ns dots.typescript.server.protocol.open-external-projects-request
  "Request to open multiple external projects"
  (:refer-clojure :exclude [seq type]))

(defn command
  "**Returns:** `CommandTypes.OpenExternalProjects`"
  ^js [open-external-projects-request]
  (.-command ^js open-external-projects-request))

(defn set-command!
  ^js [open-external-projects-request value]
  (set! (.-command ^js open-external-projects-request) value))

(defn arguments
  "**Returns:** `OpenExternalProjectsArgs`"
  ^js [open-external-projects-request]
  (.-arguments ^js open-external-projects-request))

(defn set-arguments!
  ^js [open-external-projects-request value]
  (set! (.-arguments ^js open-external-projects-request) value))

(defn type
  "**Returns:** `\"request\"`"
  ^js [open-external-projects-request]
  (.-type ^js open-external-projects-request))

(defn set-type!
  ^js [open-external-projects-request value]
  (set! (.-type ^js open-external-projects-request) value))

(defn seq
  "Sequence number of the message
   
   **Returns:** `number`"
  ^js [open-external-projects-request]
  (.-seq ^js open-external-projects-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [open-external-projects-request value]
  (set! (.-seq ^js open-external-projects-request) value))
