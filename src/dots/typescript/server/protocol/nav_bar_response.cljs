(ns dots.typescript.server.protocol.nav-bar-response
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [nav-bar-response]
  (.-body ^js nav-bar-response))

(defn set-body!
  ^js [nav-bar-response value]
  (set! (.-body ^js nav-bar-response) value))

(defn type
  ^js [nav-bar-response]
  (.-type ^js nav-bar-response))

(defn set-type!
  ^js [nav-bar-response value]
  (set! (.-type ^js nav-bar-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [nav-bar-response]
  (.-request_seq ^js nav-bar-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [nav-bar-response value]
  (set! (.-request_seq ^js nav-bar-response) value))

(defn success?
  "Outcome of the request."
  ^js [nav-bar-response]
  (.-success ^js nav-bar-response))

(defn set-success!
  "Outcome of the request."
  ^js [nav-bar-response value]
  (set! (.-success ^js nav-bar-response) value))

(defn command
  "The command requested."
  ^js [nav-bar-response]
  (.-command ^js nav-bar-response))

(defn set-command!
  "The command requested."
  ^js [nav-bar-response value]
  (set! (.-command ^js nav-bar-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [nav-bar-response]
  (.-message ^js nav-bar-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [nav-bar-response value]
  (set! (.-message ^js nav-bar-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [nav-bar-response]
  (.-metadata ^js nav-bar-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [nav-bar-response value]
  (set! (.-metadata ^js nav-bar-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [nav-bar-response]
  (.-performanceData ^js nav-bar-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [nav-bar-response value]
  (set! (.-performanceData ^js nav-bar-response) value))

(defn seq
  "Sequence number of the message"
  ^js [nav-bar-response]
  (.-seq ^js nav-bar-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [nav-bar-response value]
  (set! (.-seq ^js nav-bar-response) value))
