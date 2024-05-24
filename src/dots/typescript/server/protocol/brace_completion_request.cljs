(ns dots.typescript.server.protocol.brace-completion-request
  "Request to get brace completion for a location in the file."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [brace-completion-request]
  (.-command ^js brace-completion-request))

(defn set-command!
  ^js [brace-completion-request value]
  (set! (.-command ^js brace-completion-request) value))

(defn arguments
  ^js [brace-completion-request]
  (.-arguments ^js brace-completion-request))

(defn set-arguments!
  ^js [brace-completion-request value]
  (set! (.-arguments ^js brace-completion-request) value))

(defn type
  ^js [brace-completion-request]
  (.-type ^js brace-completion-request))

(defn set-type!
  ^js [brace-completion-request value]
  (set! (.-type ^js brace-completion-request) value))

(defn seq
  "Sequence number of the message"
  ^js [brace-completion-request]
  (.-seq ^js brace-completion-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [brace-completion-request value]
  (set! (.-seq ^js brace-completion-request) value))
