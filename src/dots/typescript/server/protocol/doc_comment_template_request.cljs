(ns dots.typescript.server.protocol.doc-comment-template-request
  "Requests a JS Doc comment template for a given position"
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [doc-comment-template-request]
  (.-command ^js doc-comment-template-request))

(defn set-command!
  ^js [doc-comment-template-request value]
  (set! (.-command ^js doc-comment-template-request) value))

(defn arguments
  ^js [doc-comment-template-request]
  (.-arguments ^js doc-comment-template-request))

(defn set-arguments!
  ^js [doc-comment-template-request value]
  (set! (.-arguments ^js doc-comment-template-request) value))

(defn type
  ^js [doc-comment-template-request]
  (.-type ^js doc-comment-template-request))

(defn set-type!
  ^js [doc-comment-template-request value]
  (set! (.-type ^js doc-comment-template-request) value))

(defn seq
  "Sequence number of the message"
  ^js [doc-comment-template-request]
  (.-seq ^js doc-comment-template-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [doc-comment-template-request value]
  (set! (.-seq ^js doc-comment-template-request) value))
