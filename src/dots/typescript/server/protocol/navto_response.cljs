(ns dots.typescript.server.protocol.navto-response
  "Navto response message. Body is an array of navto items.  Each
   item gives a symbol that matched the search term."
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [navto-response]
  (.-body ^js navto-response))

(defn set-body!
  ^js [navto-response value]
  (set! (.-body ^js navto-response) value))

(defn type
  ^js [navto-response]
  (.-type ^js navto-response))

(defn set-type!
  ^js [navto-response value]
  (set! (.-type ^js navto-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [navto-response]
  (.-request_seq ^js navto-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [navto-response value]
  (set! (.-request_seq ^js navto-response) value))

(defn success?
  "Outcome of the request."
  ^js [navto-response]
  (.-success ^js navto-response))

(defn set-success!
  "Outcome of the request."
  ^js [navto-response value]
  (set! (.-success ^js navto-response) value))

(defn command
  "The command requested."
  ^js [navto-response]
  (.-command ^js navto-response))

(defn set-command!
  "The command requested."
  ^js [navto-response value]
  (set! (.-command ^js navto-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [navto-response]
  (.-message ^js navto-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [navto-response value]
  (set! (.-message ^js navto-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [navto-response]
  (.-metadata ^js navto-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [navto-response value]
  (set! (.-metadata ^js navto-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [navto-response]
  (.-performanceData ^js navto-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [navto-response value]
  (set! (.-performanceData ^js navto-response) value))

(defn seq
  "Sequence number of the message"
  ^js [navto-response]
  (.-seq ^js navto-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [navto-response value]
  (set! (.-seq ^js navto-response) value))
