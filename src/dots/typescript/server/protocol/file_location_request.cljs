(ns dots.typescript.server.protocol.file-location-request
  "A request whose arguments specify a file location (file, line, col)."
  (:refer-clojure :exclude [seq type]))

(defn arguments
  ^js [file-location-request]
  (.-arguments ^js file-location-request))

(defn set-arguments!
  ^js [file-location-request value]
  (set! (.-arguments ^js file-location-request) value))

(defn type
  ^js [file-location-request]
  (.-type ^js file-location-request))

(defn set-type!
  ^js [file-location-request value]
  (set! (.-type ^js file-location-request) value))

(defn command
  "The command to execute"
  ^js [file-location-request]
  (.-command ^js file-location-request))

(defn set-command!
  "The command to execute"
  ^js [file-location-request value]
  (set! (.-command ^js file-location-request) value))

(defn seq
  "Sequence number of the message"
  ^js [file-location-request]
  (.-seq ^js file-location-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [file-location-request value]
  (set! (.-seq ^js file-location-request) value))
