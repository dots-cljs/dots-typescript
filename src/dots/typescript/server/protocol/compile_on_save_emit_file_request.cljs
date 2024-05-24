(ns dots.typescript.server.protocol.compile-on-save-emit-file-request
  "Request to recompile the file. All generated outputs (.js, .d.ts or .js.map files) is written on disk."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [compile-on-save-emit-file-request]
  (.-command ^js compile-on-save-emit-file-request))

(defn set-command!
  ^js [compile-on-save-emit-file-request value]
  (set! (.-command ^js compile-on-save-emit-file-request) value))

(defn arguments
  ^js [compile-on-save-emit-file-request]
  (.-arguments ^js compile-on-save-emit-file-request))

(defn set-arguments!
  ^js [compile-on-save-emit-file-request value]
  (set! (.-arguments ^js compile-on-save-emit-file-request) value))

(defn type
  ^js [compile-on-save-emit-file-request]
  (.-type ^js compile-on-save-emit-file-request))

(defn set-type!
  ^js [compile-on-save-emit-file-request value]
  (set! (.-type ^js compile-on-save-emit-file-request) value))

(defn seq
  "Sequence number of the message"
  ^js [compile-on-save-emit-file-request]
  (.-seq ^js compile-on-save-emit-file-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [compile-on-save-emit-file-request value]
  (set! (.-seq ^js compile-on-save-emit-file-request) value))
