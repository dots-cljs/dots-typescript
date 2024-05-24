(ns dots.typescript.server.protocol.todo-comments-response
  "Response for TodoCommentRequest request."
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [todo-comments-response]
  (.-body ^js todo-comments-response))

(defn set-body!
  ^js [todo-comments-response value]
  (set! (.-body ^js todo-comments-response) value))

(defn type
  ^js [todo-comments-response]
  (.-type ^js todo-comments-response))

(defn set-type!
  ^js [todo-comments-response value]
  (set! (.-type ^js todo-comments-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [todo-comments-response]
  (.-request_seq ^js todo-comments-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [todo-comments-response value]
  (set! (.-request_seq ^js todo-comments-response) value))

(defn success?
  "Outcome of the request."
  ^js [todo-comments-response]
  (.-success ^js todo-comments-response))

(defn set-success!
  "Outcome of the request."
  ^js [todo-comments-response value]
  (set! (.-success ^js todo-comments-response) value))

(defn command
  "The command requested."
  ^js [todo-comments-response]
  (.-command ^js todo-comments-response))

(defn set-command!
  "The command requested."
  ^js [todo-comments-response value]
  (set! (.-command ^js todo-comments-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [todo-comments-response]
  (.-message ^js todo-comments-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [todo-comments-response value]
  (set! (.-message ^js todo-comments-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [todo-comments-response]
  (.-metadata ^js todo-comments-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [todo-comments-response value]
  (set! (.-metadata ^js todo-comments-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [todo-comments-response]
  (.-performanceData ^js todo-comments-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [todo-comments-response value]
  (set! (.-performanceData ^js todo-comments-response) value))

(defn seq
  "Sequence number of the message"
  ^js [todo-comments-response]
  (.-seq ^js todo-comments-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [todo-comments-response value]
  (set! (.-seq ^js todo-comments-response) value))
