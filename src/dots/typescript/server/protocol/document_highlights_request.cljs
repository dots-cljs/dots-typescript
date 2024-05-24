(ns dots.typescript.server.protocol.document-highlights-request
  "Get document highlights request; value of command field is
   \"documentHighlights\". Return response giving spans that are relevant
   in the file at a given line and column."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [document-highlights-request]
  (.-command ^js document-highlights-request))

(defn set-command!
  ^js [document-highlights-request value]
  (set! (.-command ^js document-highlights-request) value))

(defn arguments
  ^js [document-highlights-request]
  (.-arguments ^js document-highlights-request))

(defn set-arguments!
  ^js [document-highlights-request value]
  (set! (.-arguments ^js document-highlights-request) value))

(defn type
  ^js [document-highlights-request]
  (.-type ^js document-highlights-request))

(defn set-type!
  ^js [document-highlights-request value]
  (set! (.-type ^js document-highlights-request) value))

(defn seq
  "Sequence number of the message"
  ^js [document-highlights-request]
  (.-seq ^js document-highlights-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [document-highlights-request value]
  (set! (.-seq ^js document-highlights-request) value))
