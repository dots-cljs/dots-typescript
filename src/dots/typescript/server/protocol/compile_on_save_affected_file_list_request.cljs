(ns dots.typescript.server.protocol.compile-on-save-affected-file-list-request
  "Request to obtain the list of files that should be regenerated if target file is recompiled.
   NOTE: this us query-only operation and does not generate any output on disk."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [compile-on-save-affected-file-list-request]
  (.-command ^js compile-on-save-affected-file-list-request))

(defn set-command!
  ^js [compile-on-save-affected-file-list-request value]
  (set! (.-command ^js compile-on-save-affected-file-list-request) value))

(defn arguments
  ^js [compile-on-save-affected-file-list-request]
  (.-arguments ^js compile-on-save-affected-file-list-request))

(defn set-arguments!
  ^js [compile-on-save-affected-file-list-request value]
  (set! (.-arguments ^js compile-on-save-affected-file-list-request) value))

(defn type
  ^js [compile-on-save-affected-file-list-request]
  (.-type ^js compile-on-save-affected-file-list-request))

(defn set-type!
  ^js [compile-on-save-affected-file-list-request value]
  (set! (.-type ^js compile-on-save-affected-file-list-request) value))

(defn seq
  "Sequence number of the message"
  ^js [compile-on-save-affected-file-list-request]
  (.-seq ^js compile-on-save-affected-file-list-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [compile-on-save-affected-file-list-request value]
  (set! (.-seq ^js compile-on-save-affected-file-list-request) value))
