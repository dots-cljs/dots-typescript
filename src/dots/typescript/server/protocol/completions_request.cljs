(ns dots.typescript.server.protocol.completions-request
  "Completions request; value of command field is \"completions\".
   Given a file location (file, line, col) and a prefix (which may
   be the empty string), return the possible completions that
   begin with prefix."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [completions-request]
  (.-command ^js completions-request))

(defn set-command!
  ^js [completions-request value]
  (set! (.-command ^js completions-request) value))

(defn arguments
  ^js [completions-request]
  (.-arguments ^js completions-request))

(defn set-arguments!
  ^js [completions-request value]
  (set! (.-arguments ^js completions-request) value))

(defn type
  ^js [completions-request]
  (.-type ^js completions-request))

(defn set-type!
  ^js [completions-request value]
  (set! (.-type ^js completions-request) value))

(defn seq
  "Sequence number of the message"
  ^js [completions-request]
  (.-seq ^js completions-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [completions-request value]
  (set! (.-seq ^js completions-request) value))
