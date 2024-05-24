(ns dots.typescript.server.protocol.configure-plugin-response
  (:refer-clojure :exclude [seq type]))

(defn type
  ^js [configure-plugin-response]
  (.-type ^js configure-plugin-response))

(defn set-type!
  ^js [configure-plugin-response value]
  (set! (.-type ^js configure-plugin-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [configure-plugin-response]
  (.-request_seq ^js configure-plugin-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [configure-plugin-response value]
  (set! (.-request_seq ^js configure-plugin-response) value))

(defn success?
  "Outcome of the request."
  ^js [configure-plugin-response]
  (.-success ^js configure-plugin-response))

(defn set-success!
  "Outcome of the request."
  ^js [configure-plugin-response value]
  (set! (.-success ^js configure-plugin-response) value))

(defn command
  "The command requested."
  ^js [configure-plugin-response]
  (.-command ^js configure-plugin-response))

(defn set-command!
  "The command requested."
  ^js [configure-plugin-response value]
  (set! (.-command ^js configure-plugin-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [configure-plugin-response]
  (.-message ^js configure-plugin-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [configure-plugin-response value]
  (set! (.-message ^js configure-plugin-response) value))

(defn body
  "Contains message body if success === true."
  ^js [configure-plugin-response]
  (.-body ^js configure-plugin-response))

(defn set-body!
  "Contains message body if success === true."
  ^js [configure-plugin-response value]
  (set! (.-body ^js configure-plugin-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [configure-plugin-response]
  (.-metadata ^js configure-plugin-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [configure-plugin-response value]
  (set! (.-metadata ^js configure-plugin-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [configure-plugin-response]
  (.-performanceData ^js configure-plugin-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [configure-plugin-response value]
  (set! (.-performanceData ^js configure-plugin-response) value))

(defn seq
  "Sequence number of the message"
  ^js [configure-plugin-response]
  (.-seq ^js configure-plugin-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [configure-plugin-response value]
  (set! (.-seq ^js configure-plugin-response) value))
