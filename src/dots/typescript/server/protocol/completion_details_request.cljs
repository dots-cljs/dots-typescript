(ns dots.typescript.server.protocol.completion-details-request
  "Completion entry details request; value of command field is
   \"completionEntryDetails\".  Given a file location (file, line,
   col) and an array of completion entry names return more
   detailed information for each completion entry."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [completion-details-request]
  (.-command ^js completion-details-request))

(defn set-command!
  ^js [completion-details-request value]
  (set! (.-command ^js completion-details-request) value))

(defn arguments
  ^js [completion-details-request]
  (.-arguments ^js completion-details-request))

(defn set-arguments!
  ^js [completion-details-request value]
  (set! (.-arguments ^js completion-details-request) value))

(defn type
  ^js [completion-details-request]
  (.-type ^js completion-details-request))

(defn set-type!
  ^js [completion-details-request value]
  (set! (.-type ^js completion-details-request) value))

(defn seq
  "Sequence number of the message"
  ^js [completion-details-request]
  (.-seq ^js completion-details-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [completion-details-request value]
  (set! (.-seq ^js completion-details-request) value))
