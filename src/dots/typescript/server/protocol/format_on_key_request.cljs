(ns dots.typescript.server.protocol.format-on-key-request
  "Format on key request; value of command field is
   \"formatonkey\". Given file location and key typed (as string),
   return response giving zero or more edit instructions.  The
   edit instructions will be sorted in file order.  Applying the
   edit instructions in reverse to file will result in correctly
   reformatted text."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [format-on-key-request]
  (.-command ^js format-on-key-request))

(defn set-command!
  ^js [format-on-key-request value]
  (set! (.-command ^js format-on-key-request) value))

(defn arguments
  ^js [format-on-key-request]
  (.-arguments ^js format-on-key-request))

(defn set-arguments!
  ^js [format-on-key-request value]
  (set! (.-arguments ^js format-on-key-request) value))

(defn type
  ^js [format-on-key-request]
  (.-type ^js format-on-key-request))

(defn set-type!
  ^js [format-on-key-request value]
  (set! (.-type ^js format-on-key-request) value))

(defn seq
  "Sequence number of the message"
  ^js [format-on-key-request]
  (.-seq ^js format-on-key-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [format-on-key-request value]
  (set! (.-seq ^js format-on-key-request) value))
