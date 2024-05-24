(ns dots.typescript.server.protocol.set-compiler-options-for-inferred-projects-response
  "Response to SetCompilerOptionsForInferredProjectsResponse request. This is just an acknowledgement, so
   no body field is required."
  (:refer-clojure :exclude [seq type]))

(defn type
  ^js [set-compiler-options-for-inferred-projects-response]
  (.-type ^js set-compiler-options-for-inferred-projects-response))

(defn set-type!
  ^js [set-compiler-options-for-inferred-projects-response value]
  (set! (.-type ^js set-compiler-options-for-inferred-projects-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [set-compiler-options-for-inferred-projects-response]
  (.-request_seq ^js set-compiler-options-for-inferred-projects-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [set-compiler-options-for-inferred-projects-response value]
  (set! (.-request_seq ^js set-compiler-options-for-inferred-projects-response) value))

(defn success?
  "Outcome of the request."
  ^js [set-compiler-options-for-inferred-projects-response]
  (.-success ^js set-compiler-options-for-inferred-projects-response))

(defn set-success!
  "Outcome of the request."
  ^js [set-compiler-options-for-inferred-projects-response value]
  (set! (.-success ^js set-compiler-options-for-inferred-projects-response) value))

(defn command
  "The command requested."
  ^js [set-compiler-options-for-inferred-projects-response]
  (.-command ^js set-compiler-options-for-inferred-projects-response))

(defn set-command!
  "The command requested."
  ^js [set-compiler-options-for-inferred-projects-response value]
  (set! (.-command ^js set-compiler-options-for-inferred-projects-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [set-compiler-options-for-inferred-projects-response]
  (.-message ^js set-compiler-options-for-inferred-projects-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [set-compiler-options-for-inferred-projects-response value]
  (set! (.-message ^js set-compiler-options-for-inferred-projects-response) value))

(defn body
  "Contains message body if success === true."
  ^js [set-compiler-options-for-inferred-projects-response]
  (.-body ^js set-compiler-options-for-inferred-projects-response))

(defn set-body!
  "Contains message body if success === true."
  ^js [set-compiler-options-for-inferred-projects-response value]
  (set! (.-body ^js set-compiler-options-for-inferred-projects-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [set-compiler-options-for-inferred-projects-response]
  (.-metadata ^js set-compiler-options-for-inferred-projects-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [set-compiler-options-for-inferred-projects-response value]
  (set! (.-metadata ^js set-compiler-options-for-inferred-projects-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [set-compiler-options-for-inferred-projects-response]
  (.-performanceData ^js set-compiler-options-for-inferred-projects-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [set-compiler-options-for-inferred-projects-response value]
  (set! (.-performanceData ^js set-compiler-options-for-inferred-projects-response) value))

(defn seq
  "Sequence number of the message"
  ^js [set-compiler-options-for-inferred-projects-response]
  (.-seq ^js set-compiler-options-for-inferred-projects-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [set-compiler-options-for-inferred-projects-response value]
  (set! (.-seq ^js set-compiler-options-for-inferred-projects-response) value))
