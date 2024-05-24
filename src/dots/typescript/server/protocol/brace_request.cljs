(ns dots.typescript.server.protocol.brace-request
  "Brace matching request; value of command field is \"brace\".
   Return response giving the file locations of matching braces
   found in file at location line, offset."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [brace-request]
  (.-command ^js brace-request))

(defn set-command!
  ^js [brace-request value]
  (set! (.-command ^js brace-request) value))

(defn arguments
  ^js [brace-request]
  (.-arguments ^js brace-request))

(defn set-arguments!
  ^js [brace-request value]
  (set! (.-arguments ^js brace-request) value))

(defn type
  ^js [brace-request]
  (.-type ^js brace-request))

(defn set-type!
  ^js [brace-request value]
  (set! (.-type ^js brace-request) value))

(defn seq
  "Sequence number of the message"
  ^js [brace-request]
  (.-seq ^js brace-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [brace-request value]
  (set! (.-seq ^js brace-request) value))
