(ns dots.typescript.server.protocol.get-move-to-refactoring-file-suggestions
  "Response is a list of available files.
   Each refactoring exposes one or more \"Actions\"; a user selects one action to invoke a refactoring"
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [get-move-to-refactoring-file-suggestions]
  (.-body ^js get-move-to-refactoring-file-suggestions))

(defn set-body!
  ^js [get-move-to-refactoring-file-suggestions value]
  (set! (.-body ^js get-move-to-refactoring-file-suggestions) value))

(defn type
  ^js [get-move-to-refactoring-file-suggestions]
  (.-type ^js get-move-to-refactoring-file-suggestions))

(defn set-type!
  ^js [get-move-to-refactoring-file-suggestions value]
  (set! (.-type ^js get-move-to-refactoring-file-suggestions) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [get-move-to-refactoring-file-suggestions]
  (.-request_seq ^js get-move-to-refactoring-file-suggestions))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [get-move-to-refactoring-file-suggestions value]
  (set! (.-request_seq ^js get-move-to-refactoring-file-suggestions) value))

(defn success?
  "Outcome of the request."
  ^js [get-move-to-refactoring-file-suggestions]
  (.-success ^js get-move-to-refactoring-file-suggestions))

(defn set-success!
  "Outcome of the request."
  ^js [get-move-to-refactoring-file-suggestions value]
  (set! (.-success ^js get-move-to-refactoring-file-suggestions) value))

(defn command
  "The command requested."
  ^js [get-move-to-refactoring-file-suggestions]
  (.-command ^js get-move-to-refactoring-file-suggestions))

(defn set-command!
  "The command requested."
  ^js [get-move-to-refactoring-file-suggestions value]
  (set! (.-command ^js get-move-to-refactoring-file-suggestions) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [get-move-to-refactoring-file-suggestions]
  (.-message ^js get-move-to-refactoring-file-suggestions))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [get-move-to-refactoring-file-suggestions value]
  (set! (.-message ^js get-move-to-refactoring-file-suggestions) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [get-move-to-refactoring-file-suggestions]
  (.-metadata ^js get-move-to-refactoring-file-suggestions))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [get-move-to-refactoring-file-suggestions value]
  (set! (.-metadata ^js get-move-to-refactoring-file-suggestions) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [get-move-to-refactoring-file-suggestions]
  (.-performanceData ^js get-move-to-refactoring-file-suggestions))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [get-move-to-refactoring-file-suggestions value]
  (set! (.-performanceData ^js get-move-to-refactoring-file-suggestions) value))

(defn seq
  "Sequence number of the message"
  ^js [get-move-to-refactoring-file-suggestions]
  (.-seq ^js get-move-to-refactoring-file-suggestions))

(defn set-seq!
  "Sequence number of the message"
  ^js [get-move-to-refactoring-file-suggestions value]
  (set! (.-seq ^js get-move-to-refactoring-file-suggestions) value))
