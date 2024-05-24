(ns dots.typescript.server.protocol.project-info-response
  "Response message for \"projectInfo\" request"
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [project-info-response]
  (.-body ^js project-info-response))

(defn set-body!
  ^js [project-info-response value]
  (set! (.-body ^js project-info-response) value))

(defn type
  ^js [project-info-response]
  (.-type ^js project-info-response))

(defn set-type!
  ^js [project-info-response value]
  (set! (.-type ^js project-info-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [project-info-response]
  (.-request_seq ^js project-info-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [project-info-response value]
  (set! (.-request_seq ^js project-info-response) value))

(defn success?
  "Outcome of the request."
  ^js [project-info-response]
  (.-success ^js project-info-response))

(defn set-success!
  "Outcome of the request."
  ^js [project-info-response value]
  (set! (.-success ^js project-info-response) value))

(defn command
  "The command requested."
  ^js [project-info-response]
  (.-command ^js project-info-response))

(defn set-command!
  "The command requested."
  ^js [project-info-response value]
  (set! (.-command ^js project-info-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [project-info-response]
  (.-message ^js project-info-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [project-info-response value]
  (set! (.-message ^js project-info-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [project-info-response]
  (.-metadata ^js project-info-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [project-info-response value]
  (set! (.-metadata ^js project-info-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [project-info-response]
  (.-performanceData ^js project-info-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [project-info-response value]
  (set! (.-performanceData ^js project-info-response) value))

(defn seq
  "Sequence number of the message"
  ^js [project-info-response]
  (.-seq ^js project-info-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [project-info-response value]
  (set! (.-seq ^js project-info-response) value))
